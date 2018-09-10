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
public class ComponentControlSoap implements Serializable {
	public static ComponentControlSoap toSoapModel(ComponentControl model) {
		ComponentControlSoap soapModel = new ComponentControlSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserRoleId(model.getUserRoleId());
		soapModel.setComponentId(model.getComponentId());
		soapModel.setCreate(model.getCreate());
		soapModel.setRead(model.getRead());
		soapModel.setUpdate(model.getUpdate());
		soapModel.setDelete(model.getDelete());
		soapModel.setDeny(model.getDeny());
		soapModel.setVisible(model.getVisible());
		soapModel.setEnable(model.getEnable());
		soapModel.setControl_desc(model.getControl_desc());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static ComponentControlSoap[] toSoapModels(ComponentControl[] models) {
		ComponentControlSoap[] soapModels = new ComponentControlSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ComponentControlSoap[][] toSoapModels(
		ComponentControl[][] models) {
		ComponentControlSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ComponentControlSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ComponentControlSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ComponentControlSoap[] toSoapModels(
		List<ComponentControl> models) {
		List<ComponentControlSoap> soapModels = new ArrayList<ComponentControlSoap>(models.size());

		for (ComponentControl model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ComponentControlSoap[soapModels.size()]);
	}

	public ComponentControlSoap() {
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

	public Long getUserRoleId() {
		return _userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		_userRoleId = userRoleId;
	}

	public Long getComponentId() {
		return _componentId;
	}

	public void setComponentId(Long componentId) {
		_componentId = componentId;
	}

	public Boolean getCreate() {
		return _create;
	}

	public void setCreate(Boolean create) {
		_create = create;
	}

	public Boolean getRead() {
		return _read;
	}

	public void setRead(Boolean read) {
		_read = read;
	}

	public Boolean getUpdate() {
		return _update;
	}

	public void setUpdate(Boolean update) {
		_update = update;
	}

	public Boolean getDelete() {
		return _delete;
	}

	public void setDelete(Boolean delete) {
		_delete = delete;
	}

	public Boolean getDeny() {
		return _deny;
	}

	public void setDeny(Boolean deny) {
		_deny = deny;
	}

	public Boolean getVisible() {
		return _visible;
	}

	public void setVisible(Boolean visible) {
		_visible = visible;
	}

	public Boolean getEnable() {
		return _enable;
	}

	public void setEnable(Boolean enable) {
		_enable = enable;
	}

	public String getControl_desc() {
		return _control_desc;
	}

	public void setControl_desc(String control_desc) {
		_control_desc = control_desc;
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
	private Long _userRoleId;
	private Long _componentId;
	private Boolean _create;
	private Boolean _read;
	private Boolean _update;
	private Boolean _delete;
	private Boolean _deny;
	private Boolean _visible;
	private Boolean _enable;
	private String _control_desc;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}