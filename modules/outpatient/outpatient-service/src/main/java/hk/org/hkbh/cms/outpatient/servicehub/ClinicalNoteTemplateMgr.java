package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;
import hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalServiceUtil;

public class ClinicalNoteTemplateMgr {
	private static Log logger = LogFactoryUtil.getLog(ClinicalNoteTemplateMgr.class);
	public List<ClinicalNoteTemplate> getClinicalNoteTemplateList() throws Exception{
		List<ClinicalNoteTemplate> clinicalNoteTemplateList;
		try {
			clinicalNoteTemplateList = new ArrayList<ClinicalNoteTemplate>();
			ClinicalNoteTemplate cnt =ClinicalNoteTemplateLocalServiceUtil.getClinicalNoteTemplate(1);
			clinicalNoteTemplateList.add(cnt);
		} catch (Exception e) {
//			logger.error(".getCodeList() - masterCode=" + masterCode, e);
			throw e;
		}
		return clinicalNoteTemplateList;
	}
	
}
