package hk.org.hkbh.cms.outpatient.vo;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;
import hk.org.hkbh.cms.outpatient.model.CodeDto;

public class ClinicalNoteVo {
	private List<ClinicalNoteTemplate> clinicalNoteTemplateList;
	private List<CodeDto> clinicalNoteTypeList;
	public List<ClinicalNoteTemplate> getClinicalNoteTemplateList() {
		return clinicalNoteTemplateList;
	}
	public void setClinicalNoteTemplateList(List<ClinicalNoteTemplate> clinicalNoteTemplateList) {
		this.clinicalNoteTemplateList = clinicalNoteTemplateList;
	}
	public List<CodeDto> getClinicalNoteTypeList() {
		return clinicalNoteTypeList;
	}
	public void setClinicalNoteTypeList(List<CodeDto> clinicalNoteTypeList) {
		this.clinicalNoteTypeList = clinicalNoteTypeList;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClinicalNoteVo [clinicalNoteTemplateList=");
		builder.append(clinicalNoteTemplateList);
		builder.append(", clinicalNoteTypeList=");
		builder.append(clinicalNoteTypeList);
		builder.append("]");
		return builder.toString();
	}

}
