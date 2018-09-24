package hk.org.hkbh.cms.web.portlet;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.servicehub.ComponentControlMgr;
import hk.org.hkbh.cms.outpatient.servicehub.ComponentMgr;
import hk.org.hkbh.cms.outpatient.so.ComponentDtoSo;
import hk.org.hkbh.cms.outpatient.util.BundleUtils;
import hk.org.hkbh.cms.outpatient.vo.OutpatientWebVo;
import hk.org.hkbh.cms.web.constants.OutpatientWebPortletKeys;
import hk.org.hkbh.cms.web.helper.OutpatientWebPortletHelper;

/**
 * @author manpakhong
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=outpatient-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + OutpatientWebPortletKeys.OutpatientWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OutpatientWebPortlet extends MVCPortlet {
	
	
//  private ClinicalNoteTemplateLocalService _clinicalNoteTemplateLocalService;
	private static Log logger = LogFactoryUtil.getLog(OutpatientWebPortlet.class);
	private ComponentControlMgr componentControlMgr;
	private OutpatientWebPortletHelper helper;
	public OutpatientWebPortlet() {
		componentControlMgr = new ComponentControlMgr();
		helper = new OutpatientWebPortletHelper();
	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	    throws PortletException, IOException {
		tester();
	    super.render(renderRequest, renderResponse);
	}
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException,IOException {

		OutpatientWebVo vo = getOutpatientWebVo();
//	    JSONObject json = JSONFactoryUtil.createJSONObject();
		String jsonString = JSONFactoryUtil.serialize(vo);
//	    json.put("vo", jsonString);
		FieldNamingStrategy customPolicy = new FieldNamingStrategy() {  
		    @Override
		    public String translateName(Field f) {
		        return f.getName().replace("_", "");
		    }
		};

		GsonBuilder gsonBuilder = new GsonBuilder();  
		gsonBuilder.setFieldNamingStrategy(customPolicy);  
		Gson gson = gsonBuilder.create();

		jsonString = gson.toJson(vo);
	    resourceResponse.getWriter().write(jsonString);
//	    resourceResponse.setProperty("voJson", json.toString());
	}
	
//  @Reference(unbind = "-")
//  protected void setClinicalNoteTemplateLocalService(ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
//  	_clinicalNoteTemplateLocalService = clinicalNoteTemplateLocalService;
//  }
	private OutpatientWebVo getOutpatientWebVo() throws PortletException{
		OutpatientWebVo vo = null;
		try {
			vo = new OutpatientWebVo();
			Long userId = null;
			Long userRoleId = null;
			userId = null;
			userRoleId = 5L;
			List<ComponentControlDto> componentControlDtoList = componentControlMgr.getComponentControlList(userId, userRoleId);
			
			vo.setComponentControlDtoList(componentControlDtoList);
			logger.info("vo info:" + vo);
		} catch (Exception e) {
			logger.error(".getOutpatientWebVo() - vo=" + vo, e);
		} finally {

		}
		return vo;
	}
	private void tester() {
		try {
//			BundleUtils bundleUtils = BundleUtils.getInstance();
//			bundleUtils.getConfiguration("portlet");
			testComponentDto();
		} catch (Exception e) {
			logger.error(".tester() ", e);
		} finally {

		}
	}
	
	private void testComponentDto() {
		try {
		ComponentMgr componentMgr = new ComponentMgr();
		ComponentDtoSo so = new ComponentDtoSo();
		so.setIsMenuItem(true);
		List<ComponentDto> componentDtoList = componentMgr.getComponentDtoList(so);
		helper.createMenu(componentDtoList);
		} catch (Exception e) {
			logger.error(".testComponentDto() ", e);
		}
	}
}