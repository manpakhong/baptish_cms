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
public class ComponentControlDtoSoap implements Serializable {
	public static ComponentControlDtoSoap toSoapModel(ComponentControlDto model) {
		ComponentControlDtoSoap soapModel = new ComponentControlDtoSoap();

		soapModel.setId(model.getId());
		soapModel.setComponentCode(model.getComponentCode());
		soapModel.setComponentName(model.getComponentName());
		soapModel.setComponentTypeCodeId(model.getComponentTypeCodeId());
		soapModel.setDetailCode(model.getDetailCode());
		soapModel.setDetailCodeDisplayTextEn(model.getDetailCodeDisplayTextEn());
		soapModel.setDetailCodeDisplayTextChi(model.getDetailCodeDisplayTextChi());
		soapModel.setComponentSeq(model.getComponentSeq());
		soapModel.setIsMenuItem(model.getIsMenuItem());
		soapModel.setComponentDesc(model.getComponentDesc());
		soapModel.setUrl(model.getUrl());
		soapModel.setComponentLevel(model.getComponentLevel());
		soapModel.setUpComponentId(model.getUpComponentId());
		soapModel.setComponentControlId(model.getComponentControlId());
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
		soapModel.setControlDesc(model.getControlDesc());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static ComponentControlDtoSoap[] toSoapModels(
		ComponentControlDto[] models) {
		ComponentControlDtoSoap[] soapModels = new ComponentControlDtoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ComponentControlDtoSoap[][] toSoapModels(
		ComponentControlDto[][] models) {
		ComponentControlDtoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ComponentControlDtoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ComponentControlDtoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ComponentControlDtoSoap[] toSoapModels(
		List<ComponentControlDto> models) {
		List<ComponentControlDtoSoap> soapModels = new ArrayList<ComponentControlDtoSoap>(models.size());

		for (ComponentControlDto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ComponentControlDtoSoap[soapModels.size()]);
	}

	public ComponentControlDtoSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getComponentCode() {
		return _componentCode;
	}

	public void setComponentCode(String componentCode) {
		_componentCode = componentCode;
	}

	public String getComponentName() {
		return _componentName;
	}

	public void setComponentName(String componentName) {
		_componentName = componentName;
	}

	public Integer getComponentTypeCodeId() {
		return _componentTypeCodeId;
	}

	public void setComponentTypeCodeId(Integer componentTypeCodeId) {
		_componentTypeCodeId = componentTypeCodeId;
	}

	public Integer getDetailCode() {
		return _detailCode;
	}

	public void setDetailCode(Integer detailCode) {
		_detailCode = detailCode;
	}

	public String getDetailCodeDisplayTextEn() {
		return _detailCodeDisplayTextEn;
	}

	public void setDetailCodeDisplayTextEn(String detailCodeDisplayTextEn) {
		_detailCodeDisplayTextEn = detailCodeDisplayTextEn;
	}

	public String getDetailCodeDisplayTextChi() {
		return _detailCodeDisplayTextChi;
	}

	public void setDetailCodeDisplayTextChi(String detailCodeDisplayTextChi) {
		_detailCodeDisplayTextChi = detailCodeDisplayTextChi;
	}

	public Integer getComponentSeq() {
		return _componentSeq;
	}

	public void setComponentSeq(Integer componentSeq) {
		_componentSeq = componentSeq;
	}

	public Boolean getIsMenuItem() {
		return _isMenuItem;
	}

	public void setIsMenuItem(Boolean isMenuItem) {
		_isMenuItem = isMenuItem;
	}

	public String getComponentDesc() {
		return _componentDesc;
	}

	public void setComponentDesc(String componentDesc) {
		_componentDesc = componentDesc;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public Integer getComponentLevel() {
		return _componentLevel;
	}

	public void setComponentLevel(Integer componentLevel) {
		_componentLevel = componentLevel;
	}

	public Integer getUpComponentId() {
		return _upComponentId;
	}

	public void setUpComponentId(Integer upComponentId) {
		_upComponentId = upComponentId;
	}

	public Integer getComponentControlId() {
		return _componentControlId;
	}

	public void setComponentControlId(Integer componentControlId) {
		_componentControlId = componentControlId;
	}

	public Integer getUserId() {
		return _userId;
	}

	public void setUserId(Integer userId) {
		_userId = userId;
	}

	public Integer getUserRoleId() {
		return _userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		_userRoleId = userRoleId;
	}

	public Integer getComponentId() {
		return _componentId;
	}

	public void setComponentId(Integer componentId) {
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

	public String getControlDesc() {
		return _controlDesc;
	}

	public void setControlDesc(String controlDesc) {
		_controlDesc = controlDesc;
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

	private int _id;
	private String _componentCode;
	private String _componentName;
	private Integer _componentTypeCodeId;
	private Integer _detailCode;
	private String _detailCodeDisplayTextEn;
	private String _detailCodeDisplayTextChi;
	private Integer _componentSeq;
	private Boolean _isMenuItem;
	private String _componentDesc;
	private String _url;
	private Integer _componentLevel;
	private Integer _upComponentId;
	private Integer _componentControlId;
	private Integer _userId;
	private Integer _userRoleId;
	private Integer _componentId;
	private Boolean _create;
	private Boolean _read;
	private Boolean _update;
	private Boolean _delete;
	private Boolean _deny;
	private Boolean _visible;
	private Boolean _enable;
	private String _controlDesc;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}