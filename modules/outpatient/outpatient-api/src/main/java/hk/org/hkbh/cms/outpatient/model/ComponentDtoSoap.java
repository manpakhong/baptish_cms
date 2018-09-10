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
public class ComponentDtoSoap implements Serializable {
	public static ComponentDtoSoap toSoapModel(ComponentDto model) {
		ComponentDtoSoap soapModel = new ComponentDtoSoap();

		soapModel.setId(model.getId());
		soapModel.setComponentCode(model.getComponentCode());
		soapModel.setComponentName(model.getComponentName());
		soapModel.setComponentTypeCodeId(model.getComponentTypeCodeId());
		soapModel.setDetailCode(model.getDetailCode());
		soapModel.setCodeDetailSeq(model.getCodeDetailSeq());
		soapModel.setCodeDetailDisplayTextEn(model.getCodeDetailDisplayTextEn());
		soapModel.setCodeDetailDisplayTextChi(model.getCodeDetailDisplayTextChi());
		soapModel.setComponentSeq(model.getComponentSeq());
		soapModel.setIsMenuItem(model.getIsMenuItem());
		soapModel.setComponentDesc(model.getComponentDesc());
		soapModel.setUrl(model.getUrl());
		soapModel.setComponentLevel(model.getComponentLevel());
		soapModel.setUpComponentId(model.getUpComponentId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static ComponentDtoSoap[] toSoapModels(ComponentDto[] models) {
		ComponentDtoSoap[] soapModels = new ComponentDtoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ComponentDtoSoap[][] toSoapModels(ComponentDto[][] models) {
		ComponentDtoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ComponentDtoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ComponentDtoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ComponentDtoSoap[] toSoapModels(List<ComponentDto> models) {
		List<ComponentDtoSoap> soapModels = new ArrayList<ComponentDtoSoap>(models.size());

		for (ComponentDto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ComponentDtoSoap[soapModels.size()]);
	}

	public ComponentDtoSoap() {
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

	public Long getComponentTypeCodeId() {
		return _componentTypeCodeId;
	}

	public void setComponentTypeCodeId(Long componentTypeCodeId) {
		_componentTypeCodeId = componentTypeCodeId;
	}

	public String getDetailCode() {
		return _detailCode;
	}

	public void setDetailCode(String detailCode) {
		_detailCode = detailCode;
	}

	public Integer getCodeDetailSeq() {
		return _codeDetailSeq;
	}

	public void setCodeDetailSeq(Integer codeDetailSeq) {
		_codeDetailSeq = codeDetailSeq;
	}

	public String getCodeDetailDisplayTextEn() {
		return _codeDetailDisplayTextEn;
	}

	public void setCodeDetailDisplayTextEn(String codeDetailDisplayTextEn) {
		_codeDetailDisplayTextEn = codeDetailDisplayTextEn;
	}

	public String getCodeDetailDisplayTextChi() {
		return _codeDetailDisplayTextChi;
	}

	public void setCodeDetailDisplayTextChi(String codeDetailDisplayTextChi) {
		_codeDetailDisplayTextChi = codeDetailDisplayTextChi;
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

	public Long getUpComponentId() {
		return _upComponentId;
	}

	public void setUpComponentId(Long upComponentId) {
		_upComponentId = upComponentId;
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
	private String _componentCode;
	private String _componentName;
	private Long _componentTypeCodeId;
	private String _detailCode;
	private Integer _codeDetailSeq;
	private String _codeDetailDisplayTextEn;
	private String _codeDetailDisplayTextChi;
	private Integer _componentSeq;
	private Boolean _isMenuItem;
	private String _componentDesc;
	private String _url;
	private Integer _componentLevel;
	private Long _upComponentId;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}