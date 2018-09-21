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

package hk.org.hkbh.cms.outpatient.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import hk.org.hkbh.cms.outpatient.model.LabResult;
import hk.org.hkbh.cms.outpatient.model.LabResultModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LabResult service. Represents a row in the &quot;lab_result&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link LabResultModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LabResultImpl}.
 * </p>
 *
 * @author Dave Man
 * @see LabResultImpl
 * @see LabResult
 * @see LabResultModel
 * @generated
 */
@ProviderType
public class LabResultModelImpl extends BaseModelImpl<LabResult>
	implements LabResultModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lab result model instance should use the {@link LabResult} interface instead.
	 */
	public static final String TABLE_NAME = "lab_result";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "patient_id", Types.BIGINT },
			{ "episode_id", Types.BIGINT },
			{ "order_id", Types.BIGINT },
			{ "lab_name", Types.BOOLEAN },
			{ "report_name", Types.BOOLEAN },
			{ "lab_result_type_code_id", Types.BIGINT },
			{ "severity_code_id", Types.BIGINT },
			{ "remarks", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "update_date", Types.TIMESTAMP },
			{ "created_by", Types.VARCHAR },
			{ "updated_by", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("patient_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("episode_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("order_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("lab_name", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("report_name", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("lab_result_type_code_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("severity_code_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("remarks", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("create_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("update_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("created_by", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updated_by", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table lab_result (id LONG not null primary key,patient_id LONG,episode_id LONG,order_id LONG,lab_name BOOLEAN,report_name BOOLEAN,lab_result_type_code_id LONG,severity_code_id LONG,remarks VARCHAR(75) null,create_date DATE null,update_date DATE null,created_by VARCHAR(75) null,updated_by VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table lab_result";
	public static final String ORDER_BY_JPQL = " ORDER BY labResult.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY lab_result.id ASC";
	public static final String DATA_SOURCE = "cmsDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.hk.org.hkbh.cms.outpatient.model.LabResult"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.hk.org.hkbh.cms.outpatient.model.LabResult"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.hk.org.hkbh.cms.outpatient.model.LabResult"),
			true);
	public static final long EPISODEID_COLUMN_BITMASK = 1L;
	public static final long ID_COLUMN_BITMASK = 2L;
	public static final long ORDERID_COLUMN_BITMASK = 4L;
	public static final long PATIENTID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"lock.expiration.time.hk.org.hkbh.cms.outpatient.model.LabResult"));

	public LabResultModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		if (!_setOriginalId) {
			_setOriginalId = true;

			_originalId = _id;
		}

		_id = id;
	}

	public long getOriginalId() {
		return _originalId;
	}

	@Override
	public Long getPatientId() {
		return _patientId;
	}

	@Override
	public void setPatientId(Long patientId) {
		_columnBitmask |= PATIENTID_COLUMN_BITMASK;

		if (!_setOriginalPatientId) {
			_setOriginalPatientId = true;

			_originalPatientId = _patientId;
		}

		_patientId = patientId;
	}

	public Long getOriginalPatientId() {
		return _originalPatientId;
	}

	@Override
	public Long getEpisodeId() {
		return _episodeId;
	}

	@Override
	public void setEpisodeId(Long episodeId) {
		_columnBitmask |= EPISODEID_COLUMN_BITMASK;

		if (!_setOriginalEpisodeId) {
			_setOriginalEpisodeId = true;

			_originalEpisodeId = _episodeId;
		}

		_episodeId = episodeId;
	}

	public Long getOriginalEpisodeId() {
		return _originalEpisodeId;
	}

	@Override
	public Long getOrderId() {
		return _orderId;
	}

	@Override
	public void setOrderId(Long orderId) {
		_columnBitmask |= ORDERID_COLUMN_BITMASK;

		if (!_setOriginalOrderId) {
			_setOriginalOrderId = true;

			_originalOrderId = _orderId;
		}

		_orderId = orderId;
	}

	public Long getOriginalOrderId() {
		return _originalOrderId;
	}

	@Override
	public Boolean getLabName() {
		return _labName;
	}

	@Override
	public void setLabName(Boolean labName) {
		_labName = labName;
	}

	@Override
	public Boolean getReportName() {
		return _reportName;
	}

	@Override
	public void setReportName(Boolean reportName) {
		_reportName = reportName;
	}

	@Override
	public Long getLabResultTypeCodeId() {
		return _labResultTypeCodeId;
	}

	@Override
	public void setLabResultTypeCodeId(Long labResultTypeCodeId) {
		_labResultTypeCodeId = labResultTypeCodeId;
	}

	@Override
	public Long getSeverityCodeId() {
		return _severityCodeId;
	}

	@Override
	public void setSeverityCodeId(Long severityCodeId) {
		_severityCodeId = severityCodeId;
	}

	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return "";
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	@Override
	public String getCreatedBy() {
		if (_createdBy == null) {
			return "";
		}
		else {
			return _createdBy;
		}
	}

	@Override
	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	@Override
	public String getUpdatedBy() {
		if (_updatedBy == null) {
			return "";
		}
		else {
			return _updatedBy;
		}
	}

	@Override
	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LabResult.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LabResult toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LabResult)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LabResultImpl labResultImpl = new LabResultImpl();

		labResultImpl.setId(getId());
		labResultImpl.setPatientId(getPatientId());
		labResultImpl.setEpisodeId(getEpisodeId());
		labResultImpl.setOrderId(getOrderId());
		labResultImpl.setLabName(getLabName());
		labResultImpl.setReportName(getReportName());
		labResultImpl.setLabResultTypeCodeId(getLabResultTypeCodeId());
		labResultImpl.setSeverityCodeId(getSeverityCodeId());
		labResultImpl.setRemarks(getRemarks());
		labResultImpl.setCreateDate(getCreateDate());
		labResultImpl.setUpdateDate(getUpdateDate());
		labResultImpl.setCreatedBy(getCreatedBy());
		labResultImpl.setUpdatedBy(getUpdatedBy());

		labResultImpl.resetOriginalValues();

		return labResultImpl;
	}

	@Override
	public int compareTo(LabResult labResult) {
		int value = 0;

		if (getId() < labResult.getId()) {
			value = -1;
		}
		else if (getId() > labResult.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LabResult)) {
			return false;
		}

		LabResult labResult = (LabResult)obj;

		long primaryKey = labResult.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		LabResultModelImpl labResultModelImpl = this;

		labResultModelImpl._originalId = labResultModelImpl._id;

		labResultModelImpl._setOriginalId = false;

		labResultModelImpl._originalPatientId = labResultModelImpl._patientId;

		labResultModelImpl._setOriginalPatientId = false;

		labResultModelImpl._originalEpisodeId = labResultModelImpl._episodeId;

		labResultModelImpl._setOriginalEpisodeId = false;

		labResultModelImpl._originalOrderId = labResultModelImpl._orderId;

		labResultModelImpl._setOriginalOrderId = false;

		labResultModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LabResult> toCacheModel() {
		LabResultCacheModel labResultCacheModel = new LabResultCacheModel();

		labResultCacheModel.id = getId();

		labResultCacheModel.patientId = getPatientId();

		labResultCacheModel.episodeId = getEpisodeId();

		labResultCacheModel.orderId = getOrderId();

		labResultCacheModel.labName = getLabName();

		labResultCacheModel.reportName = getReportName();

		labResultCacheModel.labResultTypeCodeId = getLabResultTypeCodeId();

		labResultCacheModel.severityCodeId = getSeverityCodeId();

		labResultCacheModel.remarks = getRemarks();

		String remarks = labResultCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			labResultCacheModel.remarks = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			labResultCacheModel.createDate = createDate.getTime();
		}
		else {
			labResultCacheModel.createDate = Long.MIN_VALUE;
		}

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			labResultCacheModel.updateDate = updateDate.getTime();
		}
		else {
			labResultCacheModel.updateDate = Long.MIN_VALUE;
		}

		labResultCacheModel.createdBy = getCreatedBy();

		String createdBy = labResultCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			labResultCacheModel.createdBy = null;
		}

		labResultCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = labResultCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			labResultCacheModel.updatedBy = null;
		}

		return labResultCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", episodeId=");
		sb.append(getEpisodeId());
		sb.append(", orderId=");
		sb.append(getOrderId());
		sb.append(", labName=");
		sb.append(getLabName());
		sb.append(", reportName=");
		sb.append(getReportName());
		sb.append(", labResultTypeCodeId=");
		sb.append(getLabResultTypeCodeId());
		sb.append(", severityCodeId=");
		sb.append(getSeverityCodeId());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("hk.org.hkbh.cms.outpatient.model.LabResult");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>episodeId</column-name><column-value><![CDATA[");
		sb.append(getEpisodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orderId</column-name><column-value><![CDATA[");
		sb.append(getOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>labName</column-name><column-value><![CDATA[");
		sb.append(getLabName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportName</column-name><column-value><![CDATA[");
		sb.append(getReportName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>labResultTypeCodeId</column-name><column-value><![CDATA[");
		sb.append(getLabResultTypeCodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>severityCodeId</column-name><column-value><![CDATA[");
		sb.append(getSeverityCodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = LabResult.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			LabResult.class
		};
	private long _id;
	private long _originalId;
	private boolean _setOriginalId;
	private Long _patientId;
	private Long _originalPatientId;
	private boolean _setOriginalPatientId;
	private Long _episodeId;
	private Long _originalEpisodeId;
	private boolean _setOriginalEpisodeId;
	private Long _orderId;
	private Long _originalOrderId;
	private boolean _setOriginalOrderId;
	private Boolean _labName;
	private Boolean _reportName;
	private Long _labResultTypeCodeId;
	private Long _severityCodeId;
	private String _remarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
	private long _columnBitmask;
	private LabResult _escapedModel;
}