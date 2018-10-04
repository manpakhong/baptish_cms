package hk.org.hkbh.cms.outpatient.portlet.portlet;

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

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;
import hk.org.hkbh.cms.outpatient.model.CodeDto;
import hk.org.hkbh.cms.outpatient.portlet.constants.ClinicalNotePortletKeys;
import hk.org.hkbh.cms.outpatient.servicehub.ClinicalNoteTemplateMgr;
import hk.org.hkbh.cms.outpatient.servicehub.CodeMgr;
import hk.org.hkbh.cms.outpatient.vo.ClinicalNoteVo;

/**
 * @author manpakhong
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.requires-namespaced-parameters=true",
		"javax.portlet.display-name=clinicalnote-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ClinicalNotePortletKeys.ClinicalNote,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ClinicalNotePortlet extends MVCPortlet {
//    private ClinicalNoteTemplateLocalService _clinicalNoteTemplateLocalService;
	private static Log logger = LogFactoryUtil.getLog(ClinicalNotePortlet.class);
	private CodeMgr codeMgr;
	private ClinicalNoteTemplateMgr clinicalNoteTemplateMgr;
	public ClinicalNotePortlet() {
		codeMgr = new CodeMgr();
		clinicalNoteTemplateMgr = new ClinicalNoteTemplateMgr();
	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	    throws PortletException, IOException {

	    super.render(renderRequest, renderResponse);
	}
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException,IOException {

		ClinicalNoteVo vo = getClinicalNoteVo();
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
	
//    @Reference(unbind = "-")
//    protected void setClinicalNoteTemplateLocalService(ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
//    	_clinicalNoteTemplateLocalService = clinicalNoteTemplateLocalService;
//    }
	private ClinicalNoteVo getClinicalNoteVo() throws PortletException{
		ClinicalNoteVo vo = null;
		try {
			vo = new ClinicalNoteVo();
			List<ClinicalNoteTemplate> cntList =clinicalNoteTemplateMgr.getClinicalNoteTemplateList();
			List<CodeDto> codeDtoList = codeMgr.getCodeList("CLINICAL_NOTE_TYPE");
			vo.setClinicalNoteTemplateList(cntList);
			vo.setClinicalNoteTypeList(codeDtoList);
			logger.info("vo info:" + vo);
		} catch (Exception e) {
			logger.error(".getClinicalNoteVo() - vo=" + vo, e);
		} finally {

		}
		return vo;
	}
//	private void getClinicalNote() {
//		ClinicalNoteTemplate cnt;
//		try {
//			cnt = ClinicalNoteTemplateLocalServiceUtil.getClinicalNoteTemplate(1);
//			System.out.println(cnt);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}