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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ClinicalNoteTemplate}.
 * </p>
 *
 * @author Dave Man
 * @see ClinicalNoteTemplate
 * @generated
 */
@ProviderType
public class ClinicalNoteTemplateWrapper implements ClinicalNoteTemplate,
	ModelWrapper<ClinicalNoteTemplate> {
	public ClinicalNoteTemplateWrapper(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		_clinicalNoteTemplate = clinicalNoteTemplate;
	}

	@Override
	public Class<?> getModelClass() {
		return ClinicalNoteTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return ClinicalNoteTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("templateTypeCodeId", getTemplateTypeCodeId());
		attributes.put("templateName", getTemplateName());
		attributes.put("templateContent", getTemplateContent());
		attributes.put("templateContentHtml", getTemplateContentHtml());
		attributes.put("createDate", getCreateDate());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer groupId = (Integer)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Integer userId = (Integer)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer templateTypeCodeId = (Integer)attributes.get(
				"templateTypeCodeId");

		if (templateTypeCodeId != null) {
			setTemplateTypeCodeId(templateTypeCodeId);
		}

		String templateName = (String)attributes.get("templateName");

		if (templateName != null) {
			setTemplateName(templateName);
		}

		String templateContent = (String)attributes.get("templateContent");

		if (templateContent != null) {
			setTemplateContent(templateContent);
		}

		String templateContentHtml = (String)attributes.get(
				"templateContentHtml");

		if (templateContentHtml != null) {
			setTemplateContentHtml(templateContentHtml);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new ClinicalNoteTemplateWrapper((ClinicalNoteTemplate)_clinicalNoteTemplate.clone());
	}

	@Override
	public int compareTo(ClinicalNoteTemplate clinicalNoteTemplate) {
		return _clinicalNoteTemplate.compareTo(clinicalNoteTemplate);
	}

	/**
	* Returns the create date of this clinical note template.
	*
	* @return the create date of this clinical note template
	*/
	@Override
	public Date getCreateDate() {
		return _clinicalNoteTemplate.getCreateDate();
	}

	/**
	* Returns the created by of this clinical note template.
	*
	* @return the created by of this clinical note template
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _clinicalNoteTemplate.getCreatedBy();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _clinicalNoteTemplate.getExpandoBridge();
	}

	/**
	* Returns the group ID of this clinical note template.
	*
	* @return the group ID of this clinical note template
	*/
	@Override
	public int getGroupId() {
		return _clinicalNoteTemplate.getGroupId();
	}

	/**
	* Returns the ID of this clinical note template.
	*
	* @return the ID of this clinical note template
	*/
	@Override
	public int getId() {
		return _clinicalNoteTemplate.getId();
	}

	/**
	* Returns the primary key of this clinical note template.
	*
	* @return the primary key of this clinical note template
	*/
	@Override
	public int getPrimaryKey() {
		return _clinicalNoteTemplate.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clinicalNoteTemplate.getPrimaryKeyObj();
	}

	/**
	* Returns the template content of this clinical note template.
	*
	* @return the template content of this clinical note template
	*/
	@Override
	public java.lang.String getTemplateContent() {
		return _clinicalNoteTemplate.getTemplateContent();
	}

	/**
	* Returns the template content html of this clinical note template.
	*
	* @return the template content html of this clinical note template
	*/
	@Override
	public java.lang.String getTemplateContentHtml() {
		return _clinicalNoteTemplate.getTemplateContentHtml();
	}

	/**
	* Returns the template name of this clinical note template.
	*
	* @return the template name of this clinical note template
	*/
	@Override
	public java.lang.String getTemplateName() {
		return _clinicalNoteTemplate.getTemplateName();
	}

	/**
	* Returns the template type code ID of this clinical note template.
	*
	* @return the template type code ID of this clinical note template
	*/
	@Override
	public int getTemplateTypeCodeId() {
		return _clinicalNoteTemplate.getTemplateTypeCodeId();
	}

	/**
	* Returns the update date of this clinical note template.
	*
	* @return the update date of this clinical note template
	*/
	@Override
	public Date getUpdateDate() {
		return _clinicalNoteTemplate.getUpdateDate();
	}

	/**
	* Returns the updated by of this clinical note template.
	*
	* @return the updated by of this clinical note template
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _clinicalNoteTemplate.getUpdatedBy();
	}

	/**
	* Returns the user ID of this clinical note template.
	*
	* @return the user ID of this clinical note template
	*/
	@Override
	public int getUserId() {
		return _clinicalNoteTemplate.getUserId();
	}

	@Override
	public int hashCode() {
		return _clinicalNoteTemplate.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _clinicalNoteTemplate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _clinicalNoteTemplate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _clinicalNoteTemplate.isNew();
	}

	@Override
	public void persist() {
		_clinicalNoteTemplate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_clinicalNoteTemplate.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this clinical note template.
	*
	* @param createDate the create date of this clinical note template
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_clinicalNoteTemplate.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this clinical note template.
	*
	* @param createdBy the created by of this clinical note template
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_clinicalNoteTemplate.setCreatedBy(createdBy);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_clinicalNoteTemplate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_clinicalNoteTemplate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_clinicalNoteTemplate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this clinical note template.
	*
	* @param groupId the group ID of this clinical note template
	*/
	@Override
	public void setGroupId(int groupId) {
		_clinicalNoteTemplate.setGroupId(groupId);
	}

	/**
	* Sets the ID of this clinical note template.
	*
	* @param id the ID of this clinical note template
	*/
	@Override
	public void setId(int id) {
		_clinicalNoteTemplate.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_clinicalNoteTemplate.setNew(n);
	}

	/**
	* Sets the primary key of this clinical note template.
	*
	* @param primaryKey the primary key of this clinical note template
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_clinicalNoteTemplate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_clinicalNoteTemplate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the template content of this clinical note template.
	*
	* @param templateContent the template content of this clinical note template
	*/
	@Override
	public void setTemplateContent(java.lang.String templateContent) {
		_clinicalNoteTemplate.setTemplateContent(templateContent);
	}

	/**
	* Sets the template content html of this clinical note template.
	*
	* @param templateContentHtml the template content html of this clinical note template
	*/
	@Override
	public void setTemplateContentHtml(java.lang.String templateContentHtml) {
		_clinicalNoteTemplate.setTemplateContentHtml(templateContentHtml);
	}

	/**
	* Sets the template name of this clinical note template.
	*
	* @param templateName the template name of this clinical note template
	*/
	@Override
	public void setTemplateName(java.lang.String templateName) {
		_clinicalNoteTemplate.setTemplateName(templateName);
	}

	/**
	* Sets the template type code ID of this clinical note template.
	*
	* @param templateTypeCodeId the template type code ID of this clinical note template
	*/
	@Override
	public void setTemplateTypeCodeId(int templateTypeCodeId) {
		_clinicalNoteTemplate.setTemplateTypeCodeId(templateTypeCodeId);
	}

	/**
	* Sets the update date of this clinical note template.
	*
	* @param updateDate the update date of this clinical note template
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_clinicalNoteTemplate.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this clinical note template.
	*
	* @param updatedBy the updated by of this clinical note template
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_clinicalNoteTemplate.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the user ID of this clinical note template.
	*
	* @param userId the user ID of this clinical note template
	*/
	@Override
	public void setUserId(int userId) {
		_clinicalNoteTemplate.setUserId(userId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ClinicalNoteTemplate> toCacheModel() {
		return _clinicalNoteTemplate.toCacheModel();
	}

	@Override
	public ClinicalNoteTemplate toEscapedModel() {
		return new ClinicalNoteTemplateWrapper(_clinicalNoteTemplate.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _clinicalNoteTemplate.toString();
	}

	@Override
	public ClinicalNoteTemplate toUnescapedModel() {
		return new ClinicalNoteTemplateWrapper(_clinicalNoteTemplate.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _clinicalNoteTemplate.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClinicalNoteTemplateWrapper)) {
			return false;
		}

		ClinicalNoteTemplateWrapper clinicalNoteTemplateWrapper = (ClinicalNoteTemplateWrapper)obj;

		if (Objects.equals(_clinicalNoteTemplate,
					clinicalNoteTemplateWrapper._clinicalNoteTemplate)) {
			return true;
		}

		return false;
	}

	@Override
	public ClinicalNoteTemplate getWrappedModel() {
		return _clinicalNoteTemplate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _clinicalNoteTemplate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _clinicalNoteTemplate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_clinicalNoteTemplate.resetOriginalValues();
	}

	private final ClinicalNoteTemplate _clinicalNoteTemplate;
}