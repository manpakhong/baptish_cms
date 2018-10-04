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
public class AuditTrailSoap implements Serializable {
	public static AuditTrailSoap toSoapModel(AuditTrail model) {
		AuditTrailSoap soapModel = new AuditTrailSoap();

		soapModel.setId(model.getId());
		soapModel.setFunctionId(model.getFunctionId());
		soapModel.setClassName(model.getClassName());
		soapModel.setUserAction(model.getUserAction());
		soapModel.setBeforeImageInJson(model.getBeforeImageInJson());
		soapModel.setAfterImageInJson(model.getAfterImageInJson());
		soapModel.setIsDeleted(model.getIsDeleted());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static AuditTrailSoap[] toSoapModels(AuditTrail[] models) {
		AuditTrailSoap[] soapModels = new AuditTrailSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AuditTrailSoap[][] toSoapModels(AuditTrail[][] models) {
		AuditTrailSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AuditTrailSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AuditTrailSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AuditTrailSoap[] toSoapModels(List<AuditTrail> models) {
		List<AuditTrailSoap> soapModels = new ArrayList<AuditTrailSoap>(models.size());

		for (AuditTrail model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AuditTrailSoap[soapModels.size()]);
	}

	public AuditTrailSoap() {
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

	public Long getFunctionId() {
		return _functionId;
	}

	public void setFunctionId(Long functionId) {
		_functionId = functionId;
	}

	public String getClassName() {
		return _className;
	}

	public void setClassName(String className) {
		_className = className;
	}

	public String getUserAction() {
		return _userAction;
	}

	public void setUserAction(String userAction) {
		_userAction = userAction;
	}

	public String getBeforeImageInJson() {
		return _beforeImageInJson;
	}

	public void setBeforeImageInJson(String beforeImageInJson) {
		_beforeImageInJson = beforeImageInJson;
	}

	public String getAfterImageInJson() {
		return _afterImageInJson;
	}

	public void setAfterImageInJson(String afterImageInJson) {
		_afterImageInJson = afterImageInJson;
	}

	public String getIsDeleted() {
		return _isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		_isDeleted = isDeleted;
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
	private Long _functionId;
	private String _className;
	private String _userAction;
	private String _beforeImageInJson;
	private String _afterImageInJson;
	private String _isDeleted;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}