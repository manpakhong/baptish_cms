/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package hk.org.hkbh.cms.outpatient.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Dave Man
 * @generated
 */
@ProviderType
public class ClinicalNoteTemplateSoap implements Serializable {
	public static ClinicalNoteTemplateSoap toSoapModel(
		ClinicalNoteTemplate model) {
		ClinicalNoteTemplateSoap soapModel = new ClinicalNoteTemplateSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setTemplateTypeCodeId(model.getTemplateTypeCodeId());
		soapModel.setTemplateName(model.getTemplateName());
		soapModel.setTemplateContent(model.getTemplateContent());
		soapModel.setTemplateContentHtml(model.getTemplateContentHtml());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static ClinicalNoteTemplateSoap[] toSoapModels(
		ClinicalNoteTemplate[] models) {
		ClinicalNoteTemplateSoap[] soapModels = new ClinicalNoteTemplateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ClinicalNoteTemplateSoap[][] toSoapModels(
		ClinicalNoteTemplate[][] models) {
		ClinicalNoteTemplateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ClinicalNoteTemplateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ClinicalNoteTemplateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ClinicalNoteTemplateSoap[] toSoapModels(
		List<ClinicalNoteTemplate> models) {
		List<ClinicalNoteTemplateSoap> soapModels = new ArrayList<ClinicalNoteTemplateSoap>(models.size());

		for (ClinicalNoteTemplate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ClinicalNoteTemplateSoap[soapModels.size()]);
	}

	public ClinicalNoteTemplateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Long getUserId() {
		return _userId;
	}

	public void setUserId(Long userId) {
		_userId = userId;
	}

	public Long getTemplateTypeCodeId() {
		return _templateTypeCodeId;
	}

	public void setTemplateTypeCodeId(Long templateTypeCodeId) {
		_templateTypeCodeId = templateTypeCodeId;
	}

	public String getTemplateName() {
		return _templateName;
	}

	public void setTemplateName(String templateName) {
		_templateName = templateName;
	}

	public String getTemplateContent() {
		return _templateContent;
	}

	public void setTemplateContent(String templateContent) {
		_templateContent = templateContent;
	}

	public String getTemplateContentHtml() {
		return _templateContentHtml;
	}

	public void setTemplateContentHtml(String templateContentHtml) {
		_templateContentHtml = templateContentHtml;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getUpdateDate() {
		return _updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	private long _id;
	private Long _userId;
	private Long _templateTypeCodeId;
	private String _templateName;
	private String _templateContent;
	private String _templateContentHtml;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}