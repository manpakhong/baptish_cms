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
 * This class is a wrapper for {@link ComponentControlDto}.
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlDto
 * @generated
 */
@ProviderType
public class ComponentControlDtoWrapper implements ComponentControlDto,
	ModelWrapper<ComponentControlDto> {
	public ComponentControlDtoWrapper(ComponentControlDto componentControlDto) {
		_componentControlDto = componentControlDto;
	}

	@Override
	public Class<?> getModelClass() {
		return ComponentControlDto.class;
	}

	@Override
	public String getModelClassName() {
		return ComponentControlDto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("componentCode", getComponentCode());
		attributes.put("componentName", getComponentName());
		attributes.put("componentTypeCodeId", getComponentTypeCodeId());
		attributes.put("detailCode", getDetailCode());
		attributes.put("detailCodeDisplayTextEn", getDetailCodeDisplayTextEn());
		attributes.put("detailCodeDisplayTextChi", getDetailCodeDisplayTextChi());
		attributes.put("componentSeq", getComponentSeq());
		attributes.put("isMenuItem", getIsMenuItem());
		attributes.put("componentDesc", getComponentDesc());
		attributes.put("url", getUrl());
		attributes.put("componentLevel", getComponentLevel());
		attributes.put("upComponentId", getUpComponentId());
		attributes.put("componentControlId", getComponentControlId());
		attributes.put("userId", getUserId());
		attributes.put("userRoleId", getUserRoleId());
		attributes.put("componentId", getComponentId());
		attributes.put("create", getCreate());
		attributes.put("read", getRead());
		attributes.put("update", getUpdate());
		attributes.put("delete", getDelete());
		attributes.put("deny", getDeny());
		attributes.put("visible", getVisible());
		attributes.put("enable", getEnable());
		attributes.put("controlDesc", getControlDesc());
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

		String componentCode = (String)attributes.get("componentCode");

		if (componentCode != null) {
			setComponentCode(componentCode);
		}

		String componentName = (String)attributes.get("componentName");

		if (componentName != null) {
			setComponentName(componentName);
		}

		Integer componentTypeCodeId = (Integer)attributes.get(
				"componentTypeCodeId");

		if (componentTypeCodeId != null) {
			setComponentTypeCodeId(componentTypeCodeId);
		}

		Integer detailCode = (Integer)attributes.get("detailCode");

		if (detailCode != null) {
			setDetailCode(detailCode);
		}

		String detailCodeDisplayTextEn = (String)attributes.get(
				"detailCodeDisplayTextEn");

		if (detailCodeDisplayTextEn != null) {
			setDetailCodeDisplayTextEn(detailCodeDisplayTextEn);
		}

		String detailCodeDisplayTextChi = (String)attributes.get(
				"detailCodeDisplayTextChi");

		if (detailCodeDisplayTextChi != null) {
			setDetailCodeDisplayTextChi(detailCodeDisplayTextChi);
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

		Integer upComponentId = (Integer)attributes.get("upComponentId");

		if (upComponentId != null) {
			setUpComponentId(upComponentId);
		}

		Integer componentControlId = (Integer)attributes.get(
				"componentControlId");

		if (componentControlId != null) {
			setComponentControlId(componentControlId);
		}

		Integer userId = (Integer)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer userRoleId = (Integer)attributes.get("userRoleId");

		if (userRoleId != null) {
			setUserRoleId(userRoleId);
		}

		Integer componentId = (Integer)attributes.get("componentId");

		if (componentId != null) {
			setComponentId(componentId);
		}

		Boolean create = (Boolean)attributes.get("create");

		if (create != null) {
			setCreate(create);
		}

		Boolean read = (Boolean)attributes.get("read");

		if (read != null) {
			setRead(read);
		}

		Boolean update = (Boolean)attributes.get("update");

		if (update != null) {
			setUpdate(update);
		}

		Boolean delete = (Boolean)attributes.get("delete");

		if (delete != null) {
			setDelete(delete);
		}

		Boolean deny = (Boolean)attributes.get("deny");

		if (deny != null) {
			setDeny(deny);
		}

		Boolean visible = (Boolean)attributes.get("visible");

		if (visible != null) {
			setVisible(visible);
		}

		Boolean enable = (Boolean)attributes.get("enable");

		if (enable != null) {
			setEnable(enable);
		}

		String controlDesc = (String)attributes.get("controlDesc");

		if (controlDesc != null) {
			setControlDesc(controlDesc);
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
		return new ComponentControlDtoWrapper((ComponentControlDto)_componentControlDto.clone());
	}

	@Override
	public int compareTo(ComponentControlDto componentControlDto) {
		return _componentControlDto.compareTo(componentControlDto);
	}

	/**
	* Returns the component code of this component control dto.
	*
	* @return the component code of this component control dto
	*/
	@Override
	public java.lang.String getComponentCode() {
		return _componentControlDto.getComponentCode();
	}

	/**
	* Returns the component control ID of this component control dto.
	*
	* @return the component control ID of this component control dto
	*/
	@Override
	public java.lang.Integer getComponentControlId() {
		return _componentControlDto.getComponentControlId();
	}

	/**
	* Returns the component desc of this component control dto.
	*
	* @return the component desc of this component control dto
	*/
	@Override
	public java.lang.String getComponentDesc() {
		return _componentControlDto.getComponentDesc();
	}

	/**
	* Returns the component ID of this component control dto.
	*
	* @return the component ID of this component control dto
	*/
	@Override
	public java.lang.Integer getComponentId() {
		return _componentControlDto.getComponentId();
	}

	/**
	* Returns the component level of this component control dto.
	*
	* @return the component level of this component control dto
	*/
	@Override
	public java.lang.Integer getComponentLevel() {
		return _componentControlDto.getComponentLevel();
	}

	/**
	* Returns the component name of this component control dto.
	*
	* @return the component name of this component control dto
	*/
	@Override
	public java.lang.String getComponentName() {
		return _componentControlDto.getComponentName();
	}

	/**
	* Returns the component seq of this component control dto.
	*
	* @return the component seq of this component control dto
	*/
	@Override
	public java.lang.Integer getComponentSeq() {
		return _componentControlDto.getComponentSeq();
	}

	/**
	* Returns the component type code ID of this component control dto.
	*
	* @return the component type code ID of this component control dto
	*/
	@Override
	public java.lang.Integer getComponentTypeCodeId() {
		return _componentControlDto.getComponentTypeCodeId();
	}

	/**
	* Returns the control desc of this component control dto.
	*
	* @return the control desc of this component control dto
	*/
	@Override
	public java.lang.String getControlDesc() {
		return _componentControlDto.getControlDesc();
	}

	/**
	* Returns the create of this component control dto.
	*
	* @return the create of this component control dto
	*/
	@Override
	public java.lang.Boolean getCreate() {
		return _componentControlDto.getCreate();
	}

	/**
	* Returns the create date of this component control dto.
	*
	* @return the create date of this component control dto
	*/
	@Override
	public Date getCreateDate() {
		return _componentControlDto.getCreateDate();
	}

	/**
	* Returns the created by of this component control dto.
	*
	* @return the created by of this component control dto
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _componentControlDto.getCreatedBy();
	}

	/**
	* Returns the delete of this component control dto.
	*
	* @return the delete of this component control dto
	*/
	@Override
	public java.lang.Boolean getDelete() {
		return _componentControlDto.getDelete();
	}

	/**
	* Returns the deny of this component control dto.
	*
	* @return the deny of this component control dto
	*/
	@Override
	public java.lang.Boolean getDeny() {
		return _componentControlDto.getDeny();
	}

	/**
	* Returns the detail code of this component control dto.
	*
	* @return the detail code of this component control dto
	*/
	@Override
	public java.lang.Integer getDetailCode() {
		return _componentControlDto.getDetailCode();
	}

	/**
	* Returns the detail code display text chi of this component control dto.
	*
	* @return the detail code display text chi of this component control dto
	*/
	@Override
	public java.lang.String getDetailCodeDisplayTextChi() {
		return _componentControlDto.getDetailCodeDisplayTextChi();
	}

	/**
	* Returns the detail code display text en of this component control dto.
	*
	* @return the detail code display text en of this component control dto
	*/
	@Override
	public java.lang.String getDetailCodeDisplayTextEn() {
		return _componentControlDto.getDetailCodeDisplayTextEn();
	}

	/**
	* Returns the enable of this component control dto.
	*
	* @return the enable of this component control dto
	*/
	@Override
	public java.lang.Boolean getEnable() {
		return _componentControlDto.getEnable();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _componentControlDto.getExpandoBridge();
	}

	/**
	* Returns the ID of this component control dto.
	*
	* @return the ID of this component control dto
	*/
	@Override
	public int getId() {
		return _componentControlDto.getId();
	}

	/**
	* Returns the is menu item of this component control dto.
	*
	* @return the is menu item of this component control dto
	*/
	@Override
	public java.lang.Boolean getIsMenuItem() {
		return _componentControlDto.getIsMenuItem();
	}

	/**
	* Returns the primary key of this component control dto.
	*
	* @return the primary key of this component control dto
	*/
	@Override
	public int getPrimaryKey() {
		return _componentControlDto.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _componentControlDto.getPrimaryKeyObj();
	}

	/**
	* Returns the read of this component control dto.
	*
	* @return the read of this component control dto
	*/
	@Override
	public java.lang.Boolean getRead() {
		return _componentControlDto.getRead();
	}

	/**
	* Returns the up component ID of this component control dto.
	*
	* @return the up component ID of this component control dto
	*/
	@Override
	public java.lang.Integer getUpComponentId() {
		return _componentControlDto.getUpComponentId();
	}

	/**
	* Returns the update of this component control dto.
	*
	* @return the update of this component control dto
	*/
	@Override
	public java.lang.Boolean getUpdate() {
		return _componentControlDto.getUpdate();
	}

	/**
	* Returns the update date of this component control dto.
	*
	* @return the update date of this component control dto
	*/
	@Override
	public Date getUpdateDate() {
		return _componentControlDto.getUpdateDate();
	}

	/**
	* Returns the updated by of this component control dto.
	*
	* @return the updated by of this component control dto
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _componentControlDto.getUpdatedBy();
	}

	/**
	* Returns the url of this component control dto.
	*
	* @return the url of this component control dto
	*/
	@Override
	public java.lang.String getUrl() {
		return _componentControlDto.getUrl();
	}

	/**
	* Returns the user ID of this component control dto.
	*
	* @return the user ID of this component control dto
	*/
	@Override
	public java.lang.Integer getUserId() {
		return _componentControlDto.getUserId();
	}

	/**
	* Returns the user role ID of this component control dto.
	*
	* @return the user role ID of this component control dto
	*/
	@Override
	public java.lang.Integer getUserRoleId() {
		return _componentControlDto.getUserRoleId();
	}

	/**
	* Returns the visible of this component control dto.
	*
	* @return the visible of this component control dto
	*/
	@Override
	public java.lang.Boolean getVisible() {
		return _componentControlDto.getVisible();
	}

	@Override
	public int hashCode() {
		return _componentControlDto.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _componentControlDto.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _componentControlDto.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _componentControlDto.isNew();
	}

	@Override
	public void persist() {
		_componentControlDto.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_componentControlDto.setCachedModel(cachedModel);
	}

	/**
	* Sets the component code of this component control dto.
	*
	* @param componentCode the component code of this component control dto
	*/
	@Override
	public void setComponentCode(java.lang.String componentCode) {
		_componentControlDto.setComponentCode(componentCode);
	}

	/**
	* Sets the component control ID of this component control dto.
	*
	* @param componentControlId the component control ID of this component control dto
	*/
	@Override
	public void setComponentControlId(java.lang.Integer componentControlId) {
		_componentControlDto.setComponentControlId(componentControlId);
	}

	/**
	* Sets the component desc of this component control dto.
	*
	* @param componentDesc the component desc of this component control dto
	*/
	@Override
	public void setComponentDesc(java.lang.String componentDesc) {
		_componentControlDto.setComponentDesc(componentDesc);
	}

	/**
	* Sets the component ID of this component control dto.
	*
	* @param componentId the component ID of this component control dto
	*/
	@Override
	public void setComponentId(java.lang.Integer componentId) {
		_componentControlDto.setComponentId(componentId);
	}

	/**
	* Sets the component level of this component control dto.
	*
	* @param componentLevel the component level of this component control dto
	*/
	@Override
	public void setComponentLevel(java.lang.Integer componentLevel) {
		_componentControlDto.setComponentLevel(componentLevel);
	}

	/**
	* Sets the component name of this component control dto.
	*
	* @param componentName the component name of this component control dto
	*/
	@Override
	public void setComponentName(java.lang.String componentName) {
		_componentControlDto.setComponentName(componentName);
	}

	/**
	* Sets the component seq of this component control dto.
	*
	* @param componentSeq the component seq of this component control dto
	*/
	@Override
	public void setComponentSeq(java.lang.Integer componentSeq) {
		_componentControlDto.setComponentSeq(componentSeq);
	}

	/**
	* Sets the component type code ID of this component control dto.
	*
	* @param componentTypeCodeId the component type code ID of this component control dto
	*/
	@Override
	public void setComponentTypeCodeId(java.lang.Integer componentTypeCodeId) {
		_componentControlDto.setComponentTypeCodeId(componentTypeCodeId);
	}

	/**
	* Sets the control desc of this component control dto.
	*
	* @param controlDesc the control desc of this component control dto
	*/
	@Override
	public void setControlDesc(java.lang.String controlDesc) {
		_componentControlDto.setControlDesc(controlDesc);
	}

	/**
	* Sets the create of this component control dto.
	*
	* @param create the create of this component control dto
	*/
	@Override
	public void setCreate(java.lang.Boolean create) {
		_componentControlDto.setCreate(create);
	}

	/**
	* Sets the create date of this component control dto.
	*
	* @param createDate the create date of this component control dto
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_componentControlDto.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this component control dto.
	*
	* @param createdBy the created by of this component control dto
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_componentControlDto.setCreatedBy(createdBy);
	}

	/**
	* Sets the delete of this component control dto.
	*
	* @param delete the delete of this component control dto
	*/
	@Override
	public void setDelete(java.lang.Boolean delete) {
		_componentControlDto.setDelete(delete);
	}

	/**
	* Sets the deny of this component control dto.
	*
	* @param deny the deny of this component control dto
	*/
	@Override
	public void setDeny(java.lang.Boolean deny) {
		_componentControlDto.setDeny(deny);
	}

	/**
	* Sets the detail code of this component control dto.
	*
	* @param detailCode the detail code of this component control dto
	*/
	@Override
	public void setDetailCode(java.lang.Integer detailCode) {
		_componentControlDto.setDetailCode(detailCode);
	}

	/**
	* Sets the detail code display text chi of this component control dto.
	*
	* @param detailCodeDisplayTextChi the detail code display text chi of this component control dto
	*/
	@Override
	public void setDetailCodeDisplayTextChi(
		java.lang.String detailCodeDisplayTextChi) {
		_componentControlDto.setDetailCodeDisplayTextChi(detailCodeDisplayTextChi);
	}

	/**
	* Sets the detail code display text en of this component control dto.
	*
	* @param detailCodeDisplayTextEn the detail code display text en of this component control dto
	*/
	@Override
	public void setDetailCodeDisplayTextEn(
		java.lang.String detailCodeDisplayTextEn) {
		_componentControlDto.setDetailCodeDisplayTextEn(detailCodeDisplayTextEn);
	}

	/**
	* Sets the enable of this component control dto.
	*
	* @param enable the enable of this component control dto
	*/
	@Override
	public void setEnable(java.lang.Boolean enable) {
		_componentControlDto.setEnable(enable);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_componentControlDto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_componentControlDto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_componentControlDto.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this component control dto.
	*
	* @param id the ID of this component control dto
	*/
	@Override
	public void setId(int id) {
		_componentControlDto.setId(id);
	}

	/**
	* Sets the is menu item of this component control dto.
	*
	* @param isMenuItem the is menu item of this component control dto
	*/
	@Override
	public void setIsMenuItem(java.lang.Boolean isMenuItem) {
		_componentControlDto.setIsMenuItem(isMenuItem);
	}

	@Override
	public void setNew(boolean n) {
		_componentControlDto.setNew(n);
	}

	/**
	* Sets the primary key of this component control dto.
	*
	* @param primaryKey the primary key of this component control dto
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_componentControlDto.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_componentControlDto.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the read of this component control dto.
	*
	* @param read the read of this component control dto
	*/
	@Override
	public void setRead(java.lang.Boolean read) {
		_componentControlDto.setRead(read);
	}

	/**
	* Sets the up component ID of this component control dto.
	*
	* @param upComponentId the up component ID of this component control dto
	*/
	@Override
	public void setUpComponentId(java.lang.Integer upComponentId) {
		_componentControlDto.setUpComponentId(upComponentId);
	}

	/**
	* Sets the update of this component control dto.
	*
	* @param update the update of this component control dto
	*/
	@Override
	public void setUpdate(java.lang.Boolean update) {
		_componentControlDto.setUpdate(update);
	}

	/**
	* Sets the update date of this component control dto.
	*
	* @param updateDate the update date of this component control dto
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_componentControlDto.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this component control dto.
	*
	* @param updatedBy the updated by of this component control dto
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_componentControlDto.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the url of this component control dto.
	*
	* @param url the url of this component control dto
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_componentControlDto.setUrl(url);
	}

	/**
	* Sets the user ID of this component control dto.
	*
	* @param userId the user ID of this component control dto
	*/
	@Override
	public void setUserId(java.lang.Integer userId) {
		_componentControlDto.setUserId(userId);
	}

	/**
	* Sets the user role ID of this component control dto.
	*
	* @param userRoleId the user role ID of this component control dto
	*/
	@Override
	public void setUserRoleId(java.lang.Integer userRoleId) {
		_componentControlDto.setUserRoleId(userRoleId);
	}

	/**
	* Sets the visible of this component control dto.
	*
	* @param visible the visible of this component control dto
	*/
	@Override
	public void setVisible(java.lang.Boolean visible) {
		_componentControlDto.setVisible(visible);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ComponentControlDto> toCacheModel() {
		return _componentControlDto.toCacheModel();
	}

	@Override
	public ComponentControlDto toEscapedModel() {
		return new ComponentControlDtoWrapper(_componentControlDto.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _componentControlDto.toString();
	}

	@Override
	public ComponentControlDto toUnescapedModel() {
		return new ComponentControlDtoWrapper(_componentControlDto.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _componentControlDto.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentControlDtoWrapper)) {
			return false;
		}

		ComponentControlDtoWrapper componentControlDtoWrapper = (ComponentControlDtoWrapper)obj;

		if (Objects.equals(_componentControlDto,
					componentControlDtoWrapper._componentControlDto)) {
			return true;
		}

		return false;
	}

	@Override
	public ComponentControlDto getWrappedModel() {
		return _componentControlDto;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _componentControlDto.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _componentControlDto.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_componentControlDto.resetOriginalValues();
	}

	private final ComponentControlDto _componentControlDto;
}