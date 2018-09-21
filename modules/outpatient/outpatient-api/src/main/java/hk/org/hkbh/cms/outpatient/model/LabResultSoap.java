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
public class LabResultSoap implements Serializable {
	public static LabResultSoap toSoapModel(LabResult model) {
		LabResultSoap soapModel = new LabResultSoap();

		soapModel.setId(model.getId());
		soapModel.setPatientId(model.getPatientId());
		soapModel.setEpisodeId(model.getEpisodeId());
		soapModel.setOrderId(model.getOrderId());
		soapModel.setLabName(model.getLabName());
		soapModel.setReportName(model.getReportName());
		soapModel.setLabResultTypeCodeId(model.getLabResultTypeCodeId());
		soapModel.setSeverityCodeId(model.getSeverityCodeId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static LabResultSoap[] toSoapModels(LabResult[] models) {
		LabResultSoap[] soapModels = new LabResultSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LabResultSoap[][] toSoapModels(LabResult[][] models) {
		LabResultSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LabResultSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LabResultSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LabResultSoap[] toSoapModels(List<LabResult> models) {
		List<LabResultSoap> soapModels = new ArrayList<LabResultSoap>(models.size());

		for (LabResult model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LabResultSoap[soapModels.size()]);
	}

	public LabResultSoap() {
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

	public Long getPatientId() {
		return _patientId;
	}

	public void setPatientId(Long patientId) {
		_patientId = patientId;
	}

	public Long getEpisodeId() {
		return _episodeId;
	}

	public void setEpisodeId(Long episodeId) {
		_episodeId = episodeId;
	}

	public Long getOrderId() {
		return _orderId;
	}

	public void setOrderId(Long orderId) {
		_orderId = orderId;
	}

	public Boolean getLabName() {
		return _labName;
	}

	public void setLabName(Boolean labName) {
		_labName = labName;
	}

	public Boolean getReportName() {
		return _reportName;
	}

	public void setReportName(Boolean reportName) {
		_reportName = reportName;
	}

	public Long getLabResultTypeCodeId() {
		return _labResultTypeCodeId;
	}

	public void setLabResultTypeCodeId(Long labResultTypeCodeId) {
		_labResultTypeCodeId = labResultTypeCodeId;
	}

	public Long getSeverityCodeId() {
		return _severityCodeId;
	}

	public void setSeverityCodeId(Long severityCodeId) {
		_severityCodeId = severityCodeId;
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

	private long _id;
	private Long _patientId;
	private Long _episodeId;
	private Long _orderId;
	private Boolean _labName;
	private Boolean _reportName;
	private Long _labResultTypeCodeId;
	private Long _severityCodeId;
	private String _remarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}