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
 * This class is a wrapper for {@link ImagingResult}.
 * </p>
 *
 * @author Dave Man
 * @see ImagingResult
 * @generated
 */
@ProviderType
public class ImagingResultWrapper implements ImagingResult,
	ModelWrapper<ImagingResult> {
	public ImagingResultWrapper(ImagingResult imagingResult) {
		_imagingResult = imagingResult;
	}

	@Override
	public Class<?> getModelClass() {
		return ImagingResult.class;
	}

	@Override
	public String getModelClassName() {
		return ImagingResult.class.getName();
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
		return new ImagingResultWrapper((ImagingResult)_imagingResult.clone());
	}

	@Override
	public int compareTo(ImagingResult imagingResult) {
		return _imagingResult.compareTo(imagingResult);
	}

	/**
	* Returns the create date of this imaging result.
	*
	* @return the create date of this imaging result
	*/
	@Override
	public Date getCreateDate() {
		return _imagingResult.getCreateDate();
	}

	/**
	* Returns the created by of this imaging result.
	*
	* @return the created by of this imaging result
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _imagingResult.getCreatedBy();
	}

	/**
	* Returns the episode ID of this imaging result.
	*
	* @return the episode ID of this imaging result
	*/
	@Override
	public java.lang.Long getEpisodeId() {
		return _imagingResult.getEpisodeId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _imagingResult.getExpandoBridge();
	}

	/**
	* Returns the ID of this imaging result.
	*
	* @return the ID of this imaging result
	*/
	@Override
	public long getId() {
		return _imagingResult.getId();
	}

	/**
	* Returns the lab name of this imaging result.
	*
	* @return the lab name of this imaging result
	*/
	@Override
	public java.lang.Boolean getLabName() {
		return _imagingResult.getLabName();
	}

	/**
	* Returns the lab result type code ID of this imaging result.
	*
	* @return the lab result type code ID of this imaging result
	*/
	@Override
	public java.lang.Long getLabResultTypeCodeId() {
		return _imagingResult.getLabResultTypeCodeId();
	}

	/**
	* Returns the order ID of this imaging result.
	*
	* @return the order ID of this imaging result
	*/
	@Override
	public java.lang.Long getOrderId() {
		return _imagingResult.getOrderId();
	}

	/**
	* Returns the patient ID of this imaging result.
	*
	* @return the patient ID of this imaging result
	*/
	@Override
	public java.lang.Long getPatientId() {
		return _imagingResult.getPatientId();
	}

	/**
	* Returns the primary key of this imaging result.
	*
	* @return the primary key of this imaging result
	*/
	@Override
	public long getPrimaryKey() {
		return _imagingResult.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _imagingResult.getPrimaryKeyObj();
	}

	/**
	* Returns the remarks of this imaging result.
	*
	* @return the remarks of this imaging result
	*/
	@Override
	public java.lang.String getRemarks() {
		return _imagingResult.getRemarks();
	}

	/**
	* Returns the report name of this imaging result.
	*
	* @return the report name of this imaging result
	*/
	@Override
	public java.lang.Boolean getReportName() {
		return _imagingResult.getReportName();
	}

	/**
	* Returns the severity code ID of this imaging result.
	*
	* @return the severity code ID of this imaging result
	*/
	@Override
	public java.lang.Long getSeverityCodeId() {
		return _imagingResult.getSeverityCodeId();
	}

	/**
	* Returns the update date of this imaging result.
	*
	* @return the update date of this imaging result
	*/
	@Override
	public Date getUpdateDate() {
		return _imagingResult.getUpdateDate();
	}

	/**
	* Returns the updated by of this imaging result.
	*
	* @return the updated by of this imaging result
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _imagingResult.getUpdatedBy();
	}

	@Override
	public int hashCode() {
		return _imagingResult.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _imagingResult.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _imagingResult.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _imagingResult.isNew();
	}

	@Override
	public void persist() {
		_imagingResult.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_imagingResult.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this imaging result.
	*
	* @param createDate the create date of this imaging result
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_imagingResult.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this imaging result.
	*
	* @param createdBy the created by of this imaging result
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_imagingResult.setCreatedBy(createdBy);
	}

	/**
	* Sets the episode ID of this imaging result.
	*
	* @param episodeId the episode ID of this imaging result
	*/
	@Override
	public void setEpisodeId(java.lang.Long episodeId) {
		_imagingResult.setEpisodeId(episodeId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_imagingResult.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_imagingResult.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_imagingResult.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this imaging result.
	*
	* @param id the ID of this imaging result
	*/
	@Override
	public void setId(long id) {
		_imagingResult.setId(id);
	}

	/**
	* Sets the lab name of this imaging result.
	*
	* @param labName the lab name of this imaging result
	*/
	@Override
	public void setLabName(java.lang.Boolean labName) {
		_imagingResult.setLabName(labName);
	}

	/**
	* Sets the lab result type code ID of this imaging result.
	*
	* @param labResultTypeCodeId the lab result type code ID of this imaging result
	*/
	@Override
	public void setLabResultTypeCodeId(java.lang.Long labResultTypeCodeId) {
		_imagingResult.setLabResultTypeCodeId(labResultTypeCodeId);
	}

	@Override
	public void setNew(boolean n) {
		_imagingResult.setNew(n);
	}

	/**
	* Sets the order ID of this imaging result.
	*
	* @param orderId the order ID of this imaging result
	*/
	@Override
	public void setOrderId(java.lang.Long orderId) {
		_imagingResult.setOrderId(orderId);
	}

	/**
	* Sets the patient ID of this imaging result.
	*
	* @param patientId the patient ID of this imaging result
	*/
	@Override
	public void setPatientId(java.lang.Long patientId) {
		_imagingResult.setPatientId(patientId);
	}

	/**
	* Sets the primary key of this imaging result.
	*
	* @param primaryKey the primary key of this imaging result
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_imagingResult.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_imagingResult.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remarks of this imaging result.
	*
	* @param remarks the remarks of this imaging result
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_imagingResult.setRemarks(remarks);
	}

	/**
	* Sets the report name of this imaging result.
	*
	* @param reportName the report name of this imaging result
	*/
	@Override
	public void setReportName(java.lang.Boolean reportName) {
		_imagingResult.setReportName(reportName);
	}

	/**
	* Sets the severity code ID of this imaging result.
	*
	* @param severityCodeId the severity code ID of this imaging result
	*/
	@Override
	public void setSeverityCodeId(java.lang.Long severityCodeId) {
		_imagingResult.setSeverityCodeId(severityCodeId);
	}

	/**
	* Sets the update date of this imaging result.
	*
	* @param updateDate the update date of this imaging result
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_imagingResult.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this imaging result.
	*
	* @param updatedBy the updated by of this imaging result
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_imagingResult.setUpdatedBy(updatedBy);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ImagingResult> toCacheModel() {
		return _imagingResult.toCacheModel();
	}

	@Override
	public ImagingResult toEscapedModel() {
		return new ImagingResultWrapper(_imagingResult.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _imagingResult.toString();
	}

	@Override
	public ImagingResult toUnescapedModel() {
		return new ImagingResultWrapper(_imagingResult.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _imagingResult.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImagingResultWrapper)) {
			return false;
		}

		ImagingResultWrapper imagingResultWrapper = (ImagingResultWrapper)obj;

		if (Objects.equals(_imagingResult, imagingResultWrapper._imagingResult)) {
			return true;
		}

		return false;
	}

	@Override
	public ImagingResult getWrappedModel() {
		return _imagingResult;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _imagingResult.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _imagingResult.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_imagingResult.resetOriginalValues();
	}

	private final ImagingResult _imagingResult;
}