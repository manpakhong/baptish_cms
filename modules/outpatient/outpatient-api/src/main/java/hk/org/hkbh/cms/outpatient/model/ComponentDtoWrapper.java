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
 * This class is a wrapper for {@link ComponentDto}.
 * </p>
 *
 * @author Dave Man
 * @see ComponentDto
 * @generated
 */
@ProviderType
public class ComponentDtoWrapper implements ComponentDto,
	ModelWrapper<ComponentDto> {
	public ComponentDtoWrapper(ComponentDto componentDto) {
		_componentDto = componentDto;
	}

	@Override
	public Class<?> getModelClass() {
		return ComponentDto.class;
	}

	@Override
	public String getModelClassName() {
		return ComponentDto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("componentCode", getComponentCode());
		attributes.put("componentName", getComponentName());
		attributes.put("componentTypeCodeId", getComponentTypeCodeId());
		attributes.put("detailCode", getDetailCode());
		attributes.put("codeDetailSeq", getCodeDetailSeq());
		attributes.put("codeDetailDisplayTextEn", getCodeDetailDisplayTextEn());
		attributes.put("codeDetailDisplayTextChi", getCodeDetailDisplayTextChi());
		attributes.put("componentSeq", getComponentSeq());
		attributes.put("isMenuItem", getIsMenuItem());
		attributes.put("componentDesc", getComponentDesc());
		attributes.put("url", getUrl());
		attributes.put("componentLevel", getComponentLevel());
		attributes.put("upComponentId", getUpComponentId());
		attributes.put("createDate", getCreateDate());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String componentCode = (String)attributes.get("componentCode");

		if (componentCode != null) {
			setComponentCode(componentCode);
		}

		String componentName = (String)attributes.get("componentName");

		if (componentName != null) {
			setComponentName(componentName);
		}

		Long componentTypeCodeId = (Long)attributes.get("componentTypeCodeId");

		if (componentTypeCodeId != null) {
			setComponentTypeCodeId(componentTypeCodeId);
		}

		String detailCode = (String)attributes.get("detailCode");

		if (detailCode != null) {
			setDetailCode(detailCode);
		}

		Integer codeDetailSeq = (Integer)attributes.get("codeDetailSeq");

		if (codeDetailSeq != null) {
			setCodeDetailSeq(codeDetailSeq);
		}

		String codeDetailDisplayTextEn = (String)attributes.get(
				"codeDetailDisplayTextEn");

		if (codeDetailDisplayTextEn != null) {
			setCodeDetailDisplayTextEn(codeDetailDisplayTextEn);
		}

		String codeDetailDisplayTextChi = (String)attributes.get(
				"codeDetailDisplayTextChi");

		if (codeDetailDisplayTextChi != null) {
			setCodeDetailDisplayTextChi(codeDetailDisplayTextChi);
		}

		Integer componentSeq = (Integer)attributes.get("componentSeq");

		if (componentSeq != null) {
			setComponentSeq(componentSeq);
		}

		Boolean isMenuItem = (Boolean)attributes.get("isMenuItem");

		if (isMenuItem != null) {
			setIsMenuItem(isMenuItem);
		}

		String componentDesc = (String)attributes.get("componentDesc");

		if (componentDesc != null) {
			setComponentDesc(componentDesc);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Integer componentLevel = (Integer)attributes.get("componentLevel");

		if (componentLevel != null) {
			setComponentLevel(componentLevel);
		}

		Long upComponentId = (Long)attributes.get("upComponentId");

		if (upComponentId != null) {
			setUpComponentId(upComponentId);
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
		return new ComponentDtoWrapper((ComponentDto)_componentDto.clone());
	}

	@Override
	public int compareTo(ComponentDto componentDto) {
		return _componentDto.compareTo(componentDto);
	}

	/**
	* Returns the code detail display text chi of this component dto.
	*
	* @return the code detail display text chi of this component dto
	*/
	@Override
	public java.lang.String getCodeDetailDisplayTextChi() {
		return _componentDto.getCodeDetailDisplayTextChi();
	}

	/**
	* Returns the code detail display text en of this component dto.
	*
	* @return the code detail display text en of this component dto
	*/
	@Override
	public java.lang.String getCodeDetailDisplayTextEn() {
		return _componentDto.getCodeDetailDisplayTextEn();
	}

	/**
	* Returns the code detail seq of this component dto.
	*
	* @return the code detail seq of this component dto
	*/
	@Override
	public java.lang.Integer getCodeDetailSeq() {
		return _componentDto.getCodeDetailSeq();
	}

	/**
	* Returns the component code of this component dto.
	*
	* @return the component code of this component dto
	*/
	@Override
	public java.lang.String getComponentCode() {
		return _componentDto.getComponentCode();
	}

	/**
	* Returns the component desc of this component dto.
	*
	* @return the component desc of this component dto
	*/
	@Override
	public java.lang.String getComponentDesc() {
		return _componentDto.getComponentDesc();
	}

	/**
	* Returns the component level of this component dto.
	*
	* @return the component level of this component dto
	*/
	@Override
	public java.lang.Integer getComponentLevel() {
		return _componentDto.getComponentLevel();
	}

	/**
	* Returns the component name of this component dto.
	*
	* @return the component name of this component dto
	*/
	@Override
	public java.lang.String getComponentName() {
		return _componentDto.getComponentName();
	}

	/**
	* Returns the component seq of this component dto.
	*
	* @return the component seq of this component dto
	*/
	@Override
	public java.lang.Integer getComponentSeq() {
		return _componentDto.getComponentSeq();
	}

	/**
	* Returns the component type code ID of this component dto.
	*
	* @return the component type code ID of this component dto
	*/
	@Override
	public java.lang.Long getComponentTypeCodeId() {
		return _componentDto.getComponentTypeCodeId();
	}

	/**
	* Returns the create date of this component dto.
	*
	* @return the create date of this component dto
	*/
	@Override
	public Date getCreateDate() {
		return _componentDto.getCreateDate();
	}

	/**
	* Returns the created by of this component dto.
	*
	* @return the created by of this component dto
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _componentDto.getCreatedBy();
	}

	/**
	* Returns the detail code of this component dto.
	*
	* @return the detail code of this component dto
	*/
	@Override
	public java.lang.String getDetailCode() {
		return _componentDto.getDetailCode();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _componentDto.getExpandoBridge();
	}

	/**
	* Returns the ID of this component dto.
	*
	* @return the ID of this component dto
	*/
	@Override
	public long getId() {
		return _componentDto.getId();
	}

	/**
	* Returns the is menu item of this component dto.
	*
	* @return the is menu item of this component dto
	*/
	@Override
	public java.lang.Boolean getIsMenuItem() {
		return _componentDto.getIsMenuItem();
	}

	/**
	* Returns the primary key of this component dto.
	*
	* @return the primary key of this component dto
	*/
	@Override
	public long getPrimaryKey() {
		return _componentDto.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _componentDto.getPrimaryKeyObj();
	}

	/**
	* Returns the up component ID of this component dto.
	*
	* @return the up component ID of this component dto
	*/
	@Override
	public java.lang.Long getUpComponentId() {
		return _componentDto.getUpComponentId();
	}

	/**
	* Returns the update date of this component dto.
	*
	* @return the update date of this component dto
	*/
	@Override
	public Date getUpdateDate() {
		return _componentDto.getUpdateDate();
	}

	/**
	* Returns the updated by of this component dto.
	*
	* @return the updated by of this component dto
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _componentDto.getUpdatedBy();
	}

	/**
	* Returns the url of this component dto.
	*
	* @return the url of this component dto
	*/
	@Override
	public java.lang.String getUrl() {
		return _componentDto.getUrl();
	}

	@Override
	public int hashCode() {
		return _componentDto.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _componentDto.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _componentDto.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _componentDto.isNew();
	}

	@Override
	public void persist() {
		_componentDto.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_componentDto.setCachedModel(cachedModel);
	}

	/**
	* Sets the code detail display text chi of this component dto.
	*
	* @param codeDetailDisplayTextChi the code detail display text chi of this component dto
	*/
	@Override
	public void setCodeDetailDisplayTextChi(
		java.lang.String codeDetailDisplayTextChi) {
		_componentDto.setCodeDetailDisplayTextChi(codeDetailDisplayTextChi);
	}

	/**
	* Sets the code detail display text en of this component dto.
	*
	* @param codeDetailDisplayTextEn the code detail display text en of this component dto
	*/
	@Override
	public void setCodeDetailDisplayTextEn(
		java.lang.String codeDetailDisplayTextEn) {
		_componentDto.setCodeDetailDisplayTextEn(codeDetailDisplayTextEn);
	}

	/**
	* Sets the code detail seq of this component dto.
	*
	* @param codeDetailSeq the code detail seq of this component dto
	*/
	@Override
	public void setCodeDetailSeq(java.lang.Integer codeDetailSeq) {
		_componentDto.setCodeDetailSeq(codeDetailSeq);
	}

	/**
	* Sets the component code of this component dto.
	*
	* @param componentCode the component code of this component dto
	*/
	@Override
	public void setComponentCode(java.lang.String componentCode) {
		_componentDto.setComponentCode(componentCode);
	}

	/**
	* Sets the component desc of this component dto.
	*
	* @param componentDesc the component desc of this component dto
	*/
	@Override
	public void setComponentDesc(java.lang.String componentDesc) {
		_componentDto.setComponentDesc(componentDesc);
	}

	/**
	* Sets the component level of this component dto.
	*
	* @param componentLevel the component level of this component dto
	*/
	@Override
	public void setComponentLevel(java.lang.Integer componentLevel) {
		_componentDto.setComponentLevel(componentLevel);
	}

	/**
	* Sets the component name of this component dto.
	*
	* @param componentName the component name of this component dto
	*/
	@Override
	public void setComponentName(java.lang.String componentName) {
		_componentDto.setComponentName(componentName);
	}

	/**
	* Sets the component seq of this component dto.
	*
	* @param componentSeq the component seq of this component dto
	*/
	@Override
	public void setComponentSeq(java.lang.Integer componentSeq) {
		_componentDto.setComponentSeq(componentSeq);
	}

	/**
	* Sets the component type code ID of this component dto.
	*
	* @param componentTypeCodeId the component type code ID of this component dto
	*/
	@Override
	public void setComponentTypeCodeId(java.lang.Long componentTypeCodeId) {
		_componentDto.setComponentTypeCodeId(componentTypeCodeId);
	}

	/**
	* Sets the create date of this component dto.
	*
	* @param createDate the create date of this component dto
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_componentDto.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this component dto.
	*
	* @param createdBy the created by of this component dto
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_componentDto.setCreatedBy(createdBy);
	}

	/**
	* Sets the detail code of this component dto.
	*
	* @param detailCode the detail code of this component dto
	*/
	@Override
	public void setDetailCode(java.lang.String detailCode) {
		_componentDto.setDetailCode(detailCode);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_componentDto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_componentDto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_componentDto.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this component dto.
	*
	* @param id the ID of this component dto
	*/
	@Override
	public void setId(long id) {
		_componentDto.setId(id);
	}

	/**
	* Sets the is menu item of this component dto.
	*
	* @param isMenuItem the is menu item of this component dto
	*/
	@Override
	public void setIsMenuItem(java.lang.Boolean isMenuItem) {
		_componentDto.setIsMenuItem(isMenuItem);
	}

	@Override
	public void setNew(boolean n) {
		_componentDto.setNew(n);
	}

	/**
	* Sets the primary key of this component dto.
	*
	* @param primaryKey the primary key of this component dto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_componentDto.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_componentDto.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the up component ID of this component dto.
	*
	* @param upComponentId the up component ID of this component dto
	*/
	@Override
	public void setUpComponentId(java.lang.Long upComponentId) {
		_componentDto.setUpComponentId(upComponentId);
	}

	/**
	* Sets the update date of this component dto.
	*
	* @param updateDate the update date of this component dto
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_componentDto.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this component dto.
	*
	* @param updatedBy the updated by of this component dto
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_componentDto.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the url of this component dto.
	*
	* @param url the url of this component dto
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_componentDto.setUrl(url);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ComponentDto> toCacheModel() {
		return _componentDto.toCacheModel();
	}

	@Override
	public ComponentDto toEscapedModel() {
		return new ComponentDtoWrapper(_componentDto.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _componentDto.toString();
	}

	@Override
	public ComponentDto toUnescapedModel() {
		return new ComponentDtoWrapper(_componentDto.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _componentDto.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentDtoWrapper)) {
			return false;
		}

		ComponentDtoWrapper componentDtoWrapper = (ComponentDtoWrapper)obj;

		if (Objects.equals(_componentDto, componentDtoWrapper._componentDto)) {
			return true;
		}

		return false;
	}

	@Override
	public ComponentDto getWrappedModel() {
		return _componentDto;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _componentDto.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _componentDto.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_componentDto.resetOriginalValues();
	}

	private final ComponentDto _componentDto;
}