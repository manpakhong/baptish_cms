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
 * This class is a wrapper for {@link LabResult}.
 * </p>
 *
 * @author Dave Man
 * @see LabResult
 * @generated
 */
@ProviderType
public class LabResultWrapper implements LabResult, ModelWrapper<LabResult> {
	public LabResultWrapper(LabResult labResult) {
		_labResult = labResult;
	}

	@Override
	public Class<?> getModelClass() {
		return LabResult.class;
	}

	@Override
	public String getModelClassName() {
		return LabResult.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("patientId", getPatientId());
		attributes.put("episodeId", getEpisodeId());
		attributes.put("orderId", getOrderId());
		attributes.put("labName", getLabName());
		attributes.put("reportName", getReportName());
		attributes.put("labResultTypeCodeId", getLabResultTypeCodeId());
		attributes.put("severityCodeId", getSeverityCodeId());
		attributes.put("remarks", getRemarks());
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

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Long episodeId = (Long)attributes.get("episodeId");

		if (episodeId != null) {
			setEpisodeId(episodeId);
		}

		Long orderId = (Long)attributes.get("orderId");

		if (orderId != null) {
			setOrderId(orderId);
		}

		Boolean labName = (Boolean)attributes.get("labName");

		if (labName != null) {
			setLabName(labName);
		}

		Boolean reportName = (Boolean)attributes.get("reportName");

		if (reportName != null) {
			setReportName(reportName);
		}

		Long labResultTypeCodeId = (Long)attributes.get("labResultTypeCodeId");

		if (labResultTypeCodeId != null) {
			setLabResultTypeCodeId(labResultTypeCodeId);
		}

		Long severityCodeId = (Long)attributes.get("severityCodeId");

		if (severityCodeId != null) {
			setSeverityCodeId(severityCodeId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
		return new LabResultWrapper((LabResult)_labResult.clone());
	}

	@Override
	public int compareTo(LabResult labResult) {
		return _labResult.compareTo(labResult);
	}

	/**
	* Returns the create date of this lab result.
	*
	* @return the create date of this lab result
	*/
	@Override
	public Date getCreateDate() {
		return _labResult.getCreateDate();
	}

	/**
	* Returns the created by of this lab result.
	*
	* @return the created by of this lab result
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _labResult.getCreatedBy();
	}

	/**
	* Returns the episode ID of this lab result.
	*
	* @return the episode ID of this lab result
	*/
	@Override
	public java.lang.Long getEpisodeId() {
		return _labResult.getEpisodeId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _labResult.getExpandoBridge();
	}

	/**
	* Returns the ID of this lab result.
	*
	* @return the ID of this lab result
	*/
	@Override
	public long getId() {
		return _labResult.getId();
	}

	/**
	* Returns the lab name of this lab result.
	*
	* @return the lab name of this lab result
	*/
	@Override
	public java.lang.Boolean getLabName() {
		return _labResult.getLabName();
	}

	/**
	* Returns the lab result type code ID of this lab result.
	*
	* @return the lab result type code ID of this lab result
	*/
	@Override
	public java.lang.Long getLabResultTypeCodeId() {
		return _labResult.getLabResultTypeCodeId();
	}

	/**
	* Returns the order ID of this lab result.
	*
	* @return the order ID of this lab result
	*/
	@Override
	public java.lang.Long getOrderId() {
		return _labResult.getOrderId();
	}

	/**
	* Returns the patient ID of this lab result.
	*
	* @return the patient ID of this lab result
	*/
	@Override
	public java.lang.Long getPatientId() {
		return _labResult.getPatientId();
	}

	/**
	* Returns the primary key of this lab result.
	*
	* @return the primary key of this lab result
	*/
	@Override
	public long getPrimaryKey() {
		return _labResult.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _labResult.getPrimaryKeyObj();
	}

	/**
	* Returns the remarks of this lab result.
	*
	* @return the remarks of this lab result
	*/
	@Override
	public java.lang.String getRemarks() {
		return _labResult.getRemarks();
	}

	/**
	* Returns the report name of this lab result.
	*
	* @return the report name of this lab result
	*/
	@Override
	public java.lang.Boolean getReportName() {
		return _labResult.getReportName();
	}

	/**
	* Returns the severity code ID of this lab result.
	*
	* @return the severity code ID of this lab result
	*/
	@Override
	public java.lang.Long getSeverityCodeId() {
		return _labResult.getSeverityCodeId();
	}

	/**
	* Returns the update date of this lab result.
	*
	* @return the update date of this lab result
	*/
	@Override
	public Date getUpdateDate() {
		return _labResult.getUpdateDate();
	}

	/**
	* Returns the updated by of this lab result.
	*
	* @return the updated by of this lab result
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _labResult.getUpdatedBy();
	}

	@Override
	public int hashCode() {
		return _labResult.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _labResult.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _labResult.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _labResult.isNew();
	}

	@Override
	public void persist() {
		_labResult.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_labResult.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this lab result.
	*
	* @param createDate the create date of this lab result
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_labResult.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this lab result.
	*
	* @param createdBy the created by of this lab result
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_labResult.setCreatedBy(createdBy);
	}

	/**
	* Sets the episode ID of this lab result.
	*
	* @param episodeId the episode ID of this lab result
	*/
	@Override
	public void setEpisodeId(java.lang.Long episodeId) {
		_labResult.setEpisodeId(episodeId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_labResult.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_labResult.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_labResult.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this lab result.
	*
	* @param id the ID of this lab result
	*/
	@Override
	public void setId(long id) {
		_labResult.setId(id);
	}

	/**
	* Sets the lab name of this lab result.
	*
	* @param labName the lab name of this lab result
	*/
	@Override
	public void setLabName(java.lang.Boolean labName) {
		_labResult.setLabName(labName);
	}

	/**
	* Sets the lab result type code ID of this lab result.
	*
	* @param labResultTypeCodeId the lab result type code ID of this lab result
	*/
	@Override
	public void setLabResultTypeCodeId(java.lang.Long labResultTypeCodeId) {
		_labResult.setLabResultTypeCodeId(labResultTypeCodeId);
	}

	@Override
	public void setNew(boolean n) {
		_labResult.setNew(n);
	}

	/**
	* Sets the order ID of this lab result.
	*
	* @param orderId the order ID of this lab result
	*/
	@Override
	public void setOrderId(java.lang.Long orderId) {
		_labResult.setOrderId(orderId);
	}

	/**
	* Sets the patient ID of this lab result.
	*
	* @param patientId the patient ID of this lab result
	*/
	@Override
	public void setPatientId(java.lang.Long patientId) {
		_labResult.setPatientId(patientId);
	}

	/**
	* Sets the primary key of this lab result.
	*
	* @param primaryKey the primary key of this lab result
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_labResult.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_labResult.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remarks of this lab result.
	*
	* @param remarks the remarks of this lab result
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_labResult.setRemarks(remarks);
	}

	/**
	* Sets the report name of this lab result.
	*
	* @param reportName the report name of this lab result
	*/
	@Override
	public void setReportName(java.lang.Boolean reportName) {
		_labResult.setReportName(reportName);
	}

	/**
	* Sets the severity code ID of this lab result.
	*
	* @param severityCodeId the severity code ID of this lab result
	*/
	@Override
	public void setSeverityCodeId(java.lang.Long severityCodeId) {
		_labResult.setSeverityCodeId(severityCodeId);
	}

	/**
	* Sets the update date of this lab result.
	*
	* @param updateDate the update date of this lab result
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_labResult.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this lab result.
	*
	* @param updatedBy the updated by of this lab result
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_labResult.setUpdatedBy(updatedBy);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<LabResult> toCacheModel() {
		return _labResult.toCacheModel();
	}

	@Override
	public LabResult toEscapedModel() {
		return new LabResultWrapper(_labResult.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _labResult.toString();
	}

	@Override
	public LabResult toUnescapedModel() {
		return new LabResultWrapper(_labResult.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _labResult.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LabResultWrapper)) {
			return false;
		}

		LabResultWrapper labResultWrapper = (LabResultWrapper)obj;

		if (Objects.equals(_labResult, labResultWrapper._labResult)) {
			return true;
		}

		return false;
	}

	@Override
	public LabResult getWrappedModel() {
		return _labResult;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _labResult.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _labResult.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_labResult.resetOriginalValues();
	}

	private final LabResult _labResult;
}