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
public class CodeSoap implements Serializable {
	public static CodeSoap toSoapModel(Code model) {
		CodeSoap soapModel = new CodeSoap();

		soapModel.setId(model.getId());
		soapModel.setMasterCode(model.getMasterCode());
		soapModel.setDisplay_text(model.getDisplay_text());
		soapModel.setActive(model.getActive());
		soapModel.setSubcodeEnabled(model.getSubcodeEnabled());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static CodeSoap[] toSoapModels(Code[] models) {
		CodeSoap[] soapModels = new CodeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CodeSoap[][] toSoapModels(Code[][] models) {
		CodeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CodeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CodeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CodeSoap[] toSoapModels(List<Code> models) {
		List<CodeSoap> soapModels = new ArrayList<CodeSoap>(models.size());

		for (Code model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CodeSoap[soapModels.size()]);
	}

	public CodeSoap() {
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

	public String getMasterCode() {
		return _masterCode;
	}

	public void setMasterCode(String masterCode) {
		_masterCode = masterCode;
	}

	public Integer getDisplay_text() {
		return _display_text;
	}

	public void setDisplay_text(Integer display_text) {
		_display_text = display_text;
	}

	public Boolean getActive() {
		return _active;
	}

	public void setActive(Boolean active) {
		_active = active;
	}

	public Boolean getSubcodeEnabled() {
		return _subcodeEnabled;
	}

	public void setSubcodeEnabled(Boolean subcodeEnabled) {
		_subcodeEnabled = subcodeEnabled;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
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
	private String _masterCode;
	private Integer _display_text;
	private Boolean _active;
	private Boolean _subcodeEnabled;
	private String _remarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}