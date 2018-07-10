package hk.org.hkbh.cms.outpatient.portlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;
import hk.org.hkbh.cms.outpatient.portlet.constants.ClinicalNotePortletKeys;
import hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalService;
import hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalServiceUtil;

/**
 * @author manpakhong
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
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
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	    throws PortletException, IOException {
		getClinicalNote();
	    super.render(renderRequest, renderResponse);
	}
//    @Reference(unbind = "-")
//    protected void setClinicalNoteTemplateLocalService(ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
//    	_clinicalNoteTemplateLocalService = clinicalNoteTemplateLocalService;
//    }
	private void getClinicalNote() throws PortletException{
		try {
//			ClinicalNoteTemplate cnt = _clinicalNoteTemplateLocalService.getClinicalNoteTemplate(1);
//			System.out.println(cnt);
			ClinicalNoteTemplateLocalServiceUtil.getClinicalNoteTemplate(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
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