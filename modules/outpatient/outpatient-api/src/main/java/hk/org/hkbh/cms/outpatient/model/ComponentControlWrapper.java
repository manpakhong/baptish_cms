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
 * This class is a wrapper for {@link ComponentControl}.
 * </p>
 *
 * @author Dave Man
 * @see ComponentControl
 * @generated
 */
@ProviderType
public class ComponentControlWrapper implements ComponentControl,
	ModelWrapper<ComponentControl> {
	public ComponentControlWrapper(ComponentControl componentControl) {
		_componentControl = componentControl;
	}

	@Override
	public Class<?> getModelClass() {
		return ComponentControl.class;
	}

	@Override
	public String getModelClassName() {
		return ComponentControl.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
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
		attributes.put("control_desc", getControl_desc());
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

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long userRoleId = (Long)attributes.get("userRoleId");

		if (userRoleId != null) {
			setUserRoleId(userRoleId);
		}

		Long componentId = (Long)attributes.get("componentId");

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

		String control_desc = (String)attributes.get("control_desc");

		if (control_desc != null) {
			setControl_desc(control_desc);
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
		return new ComponentControlWrapper((ComponentControl)_componentControl.clone());
	}

	@Override
	public int compareTo(ComponentControl componentControl) {
		return _componentControl.compareTo(componentControl);
	}

	/**
	* Returns the component ID of this component control.
	*
	* @return the component ID of this component control
	*/
	@Override
	public java.lang.Long getComponentId() {
		return _componentControl.getComponentId();
	}

	/**
	* Returns the control_desc of this component control.
	*
	* @return the control_desc of this component control
	*/
	@Override
	public java.lang.String getControl_desc() {
		return _componentControl.getControl_desc();
	}

	/**
	* Returns the create of this component control.
	*
	* @return the create of this component control
	*/
	@Override
	public java.lang.Boolean getCreate() {
		return _componentControl.getCreate();
	}

	/**
	* Returns the create date of this component control.
	*
	* @return the create date of this component control
	*/
	@Override
	public Date getCreateDate() {
		return _componentControl.getCreateDate();
	}

	/**
	* Returns the created by of this component control.
	*
	* @return the created by of this component control
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _componentControl.getCreatedBy();
	}

	/**
	* Returns the delete of this component control.
	*
	* @return the delete of this component control
	*/
	@Override
	public java.lang.Boolean getDelete() {
		return _componentControl.getDelete();
	}

	/**
	* Returns the deny of this component control.
	*
	* @return the deny of this component control
	*/
	@Override
	public java.lang.Boolean getDeny() {
		return _componentControl.getDeny();
	}

	/**
	* Returns the enable of this component control.
	*
	* @return the enable of this component control
	*/
	@Override
	public java.lang.Boolean getEnable() {
		return _componentControl.getEnable();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _componentControl.getExpandoBridge();
	}

	/**
	* Returns the ID of this component control.
	*
	* @return the ID of this component control
	*/
	@Override
	public long getId() {
		return _componentControl.getId();
	}

	/**
	* Returns the primary key of this component control.
	*
	* @return the primary key of this component control
	*/
	@Override
	public long getPrimaryKey() {
		return _componentControl.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _componentControl.getPrimaryKeyObj();
	}

	/**
	* Returns the read of this component control.
	*
	* @return the read of this component control
	*/
	@Override
	public java.lang.Boolean getRead() {
		return _componentControl.getRead();
	}

	/**
	* Returns the update of this component control.
	*
	* @return the update of this component control
	*/
	@Override
	public java.lang.Boolean getUpdate() {
		return _componentControl.getUpdate();
	}

	/**
	* Returns the update date of this component control.
	*
	* @return the update date of this component control
	*/
	@Override
	public Date getUpdateDate() {
		return _componentControl.getUpdateDate();
	}

	/**
	* Returns the updated by of this component control.
	*
	* @return the updated by of this component control
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _componentControl.getUpdatedBy();
	}

	/**
	* Returns the user ID of this component control.
	*
	* @return the user ID of this component control
	*/
	@Override
	public java.lang.Long getUserId() {
		return _componentControl.getUserId();
	}

	/**
	* Returns the user role ID of this component control.
	*
	* @return the user role ID of this component control
	*/
	@Override
	public java.lang.Long getUserRoleId() {
		return _componentControl.getUserRoleId();
	}

	/**
	* Returns the visible of this component control.
	*
	* @return the visible of this component control
	*/
	@Override
	public java.lang.Boolean getVisible() {
		return _componentControl.getVisible();
	}

	@Override
	public int hashCode() {
		return _componentControl.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _componentControl.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _componentControl.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _componentControl.isNew();
	}

	@Override
	public void persist() {
		_componentControl.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_componentControl.setCachedModel(cachedModel);
	}

	/**
	* Sets the component ID of this component control.
	*
	* @param componentId the component ID of this component control
	*/
	@Override
	public void setComponentId(java.lang.Long componentId) {
		_componentControl.setComponentId(componentId);
	}

	/**
	* Sets the control_desc of this component control.
	*
	* @param control_desc the control_desc of this component control
	*/
	@Override
	public void setControl_desc(java.lang.String control_desc) {
		_componentControl.setControl_desc(control_desc);
	}

	/**
	* Sets the create of this component control.
	*
	* @param create the create of this component control
	*/
	@Override
	public void setCreate(java.lang.Boolean create) {
		_componentControl.setCreate(create);
	}

	/**
	* Sets the create date of this component control.
	*
	* @param createDate the create date of this component control
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_componentControl.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this component control.
	*
	* @param createdBy the created by of this component control
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_componentControl.setCreatedBy(createdBy);
	}

	/**
	* Sets the delete of this component control.
	*
	* @param delete the delete of this component control
	*/
	@Override
	public void setDelete(java.lang.Boolean delete) {
		_componentControl.setDelete(delete);
	}

	/**
	* Sets the deny of this component control.
	*
	* @param deny the deny of this component control
	*/
	@Override
	public void setDeny(java.lang.Boolean deny) {
		_componentControl.setDeny(deny);
	}

	/**
	* Sets the enable of this component control.
	*
	* @param enable the enable of this component control
	*/
	@Override
	public void setEnable(java.lang.Boolean enable) {
		_componentControl.setEnable(enable);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_componentControl.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_componentControl.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_componentControl.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this component control.
	*
	* @param id the ID of this component control
	*/
	@Override
	public void setId(long id) {
		_componentControl.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_componentControl.setNew(n);
	}

	/**
	* Sets the primary key of this component control.
	*
	* @param primaryKey the primary key of this component control
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_componentControl.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_componentControl.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the read of this component control.
	*
	* @param read the read of this component control
	*/
	@Override
	public void setRead(java.lang.Boolean read) {
		_componentControl.setRead(read);
	}

	/**
	* Sets the update of this component control.
	*
	* @param update the update of this component control
	*/
	@Override
	public void setUpdate(java.lang.Boolean update) {
		_componentControl.setUpdate(update);
	}

	/**
	* Sets the update date of this component control.
	*
	* @param updateDate the update date of this component control
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_componentControl.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this component control.
	*
	* @param updatedBy the updated by of this component control
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_componentControl.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the user ID of this component control.
	*
	* @param userId the user ID of this component control
	*/
	@Override
	public void setUserId(java.lang.Long userId) {
		_componentControl.setUserId(userId);
	}

	/**
	* Sets the user role ID of this component control.
	*
	* @param userRoleId the user role ID of this component control
	*/
	@Override
	public void setUserRoleId(java.lang.Long userRoleId) {
		_componentControl.setUserRoleId(userRoleId);
	}

	/**
	* Sets the visible of this component control.
	*
	* @param visible the visible of this component control
	*/
	@Override
	public void setVisible(java.lang.Boolean visible) {
		_componentControl.setVisible(visible);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ComponentControl> toCacheModel() {
		return _componentControl.toCacheModel();
	}

	@Override
	public ComponentControl toEscapedModel() {
		return new ComponentControlWrapper(_componentControl.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _componentControl.toString();
	}

	@Override
	public ComponentControl toUnescapedModel() {
		return new ComponentControlWrapper(_componentControl.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _componentControl.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentControlWrapper)) {
			return false;
		}

		ComponentControlWrapper componentControlWrapper = (ComponentControlWrapper)obj;

		if (Objects.equals(_componentControl,
					componentControlWrapper._componentControl)) {
			return true;
		}

		return false;
	}

	@Override
	public ComponentControl getWrappedModel() {
		return _componentControl;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _componentControl.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _componentControl.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_componentControl.resetOriginalValues();
	}

	private final ComponentControl _componentControl;
}