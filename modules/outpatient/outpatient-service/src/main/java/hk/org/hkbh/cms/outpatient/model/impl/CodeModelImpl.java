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

import hk.org.hkbh.cms.outpatient.model.Code;
import hk.org.hkbh.cms.outpatient.model.CodeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Code service. Represents a row in the &quot;code&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CodeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CodeImpl}.
 * </p>
 *
 * @author Dave Man
 * @see CodeImpl
 * @see Code
 * @see CodeModel
 * @generated
 */
@ProviderType
public class CodeModelImpl extends BaseModelImpl<Code> implements CodeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a code model instance should use the {@link Code} interface instead.
	 */
	public static final String TABLE_NAME = "code";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "master_code", Types.VARCHAR },
			{ "display_text_en", Types.VARCHAR },
			{ "display_text_chi", Types.VARCHAR },
			{ "active", Types.BOOLEAN },
			{ "subcode_enabled", Types.BOOLEAN },
			{ "remarks", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "update_date", Types.TIMESTAMP },
			{ "created_by", Types.VARCHAR },
			{ "updated_by", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("master_code", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("display_text_en", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("display_text_chi", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("active", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("subcode_enabled", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("remarks", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("create_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("update_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("created_by", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updated_by", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table code (id LONG not null primary key,master_code VARCHAR(75) null,display_text_en VARCHAR(75) null,display_text_chi VARCHAR(75) null,active BOOLEAN,subcode_enabled BOOLEAN,remarks VARCHAR(75) null,create_date DATE null,update_date DATE null,created_by VARCHAR(75) null,updated_by VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table code";
	public static final String ORDER_BY_JPQL = " ORDER BY code.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY code.id ASC";
	public static final String DATA_SOURCE = "cmsDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.hk.org.hkbh.cms.outpatient.model.Code"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.hk.org.hkbh.cms.outpatient.model.Code"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"lock.expiration.time.hk.org.hkbh.cms.outpatient.model.Code"));

	public CodeModelImpl() {
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
		return Code.class;
	}

	@Override
	public String getModelClassName() {
		return Code.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("masterCode", getMasterCode());
		attributes.put("displayTextEn", getDisplayTextEn());
		attributes.put("displayTextChi", getDisplayTextChi());
		attributes.put("active", getActive());
		attributes.put("subcodeEnabled", getSubcodeEnabled());
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

		String masterCode = (String)attributes.get("masterCode");

		if (masterCode != null) {
			setMasterCode(masterCode);
		}

		String displayTextEn = (String)attributes.get("displayTextEn");

		if (displayTextEn != null) {
			setDisplayTextEn(displayTextEn);
		}

		String displayTextChi = (String)attributes.get("displayTextChi");

		if (displayTextChi != null) {
			setDisplayTextChi(displayTextChi);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Boolean subcodeEnabled = (Boolean)attributes.get("subcodeEnabled");

		if (subcodeEnabled != null) {
			setSubcodeEnabled(subcodeEnabled);
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
		_id = id;
	}

	@Override
	public String getMasterCode() {
		if (_masterCode == null) {
			return "";
		}
		else {
			return _masterCode;
		}
	}

	@Override
	public void setMasterCode(String masterCode) {
		_masterCode = masterCode;
	}

	@Override
	public String getDisplayTextEn() {
		if (_displayTextEn == null) {
			return "";
		}
		else {
			return _displayTextEn;
		}
	}

	@Override
	public void setDisplayTextEn(String displayTextEn) {
		_displayTextEn = displayTextEn;
	}

	@Override
	public String getDisplayTextChi() {
		if (_displayTextChi == null) {
			return "";
		}
		else {
			return _displayTextChi;
		}
	}

	@Override
	public void setDisplayTextChi(String displayTextChi) {
		_displayTextChi = displayTextChi;
	}

	@Override
	public Boolean getActive() {
		return _active;
	}

	@Override
	public void setActive(Boolean active) {
		_active = active;
	}

	@Override
	public Boolean getSubcodeEnabled() {
		return _subcodeEnabled;
	}

	@Override
	public void setSubcodeEnabled(Boolean subcodeEnabled) {
		_subcodeEnabled = subcodeEnabled;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Code.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Code toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Code)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CodeImpl codeImpl = new CodeImpl();

		codeImpl.setId(getId());
		codeImpl.setMasterCode(getMasterCode());
		codeImpl.setDisplayTextEn(getDisplayTextEn());
		codeImpl.setDisplayTextChi(getDisplayTextChi());
		codeImpl.setActive(getActive());
		codeImpl.setSubcodeEnabled(getSubcodeEnabled());
		codeImpl.setRemarks(getRemarks());
		codeImpl.setCreateDate(getCreateDate());
		codeImpl.setUpdateDate(getUpdateDate());
		codeImpl.setCreatedBy(getCreatedBy());
		codeImpl.setUpdatedBy(getUpdatedBy());

		codeImpl.resetOriginalValues();

		return codeImpl;
	}

	@Override
	public int compareTo(Code code) {
		int value = 0;

		if (getId() < code.getId()) {
			value = -1;
		}
		else if (getId() > code.getId()) {
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

		if (!(obj instanceof Code)) {
			return false;
		}

		Code code = (Code)obj;

		long primaryKey = code.getPrimaryKey();

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
	}

	@Override
	public CacheModel<Code> toCacheModel() {
		CodeCacheModel codeCacheModel = new CodeCacheModel();

		codeCacheModel.id = getId();

		codeCacheModel.masterCode = getMasterCode();

		String masterCode = codeCacheModel.masterCode;

		if ((masterCode != null) && (masterCode.length() == 0)) {
			codeCacheModel.masterCode = null;
		}

		codeCacheModel.displayTextEn = getDisplayTextEn();

		String displayTextEn = codeCacheModel.displayTextEn;

		if ((displayTextEn != null) && (displayTextEn.length() == 0)) {
			codeCacheModel.displayTextEn = null;
		}

		codeCacheModel.displayTextChi = getDisplayTextChi();

		String displayTextChi = codeCacheModel.displayTextChi;

		if ((displayTextChi != null) && (displayTextChi.length() == 0)) {
			codeCacheModel.displayTextChi = null;
		}

		codeCacheModel.active = getActive();

		codeCacheModel.subcodeEnabled = getSubcodeEnabled();

		codeCacheModel.remarks = getRemarks();

		String remarks = codeCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			codeCacheModel.remarks = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			codeCacheModel.createDate = createDate.getTime();
		}
		else {
			codeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			codeCacheModel.updateDate = updateDate.getTime();
		}
		else {
			codeCacheModel.updateDate = Long.MIN_VALUE;
		}

		codeCacheModel.createdBy = getCreatedBy();

		String createdBy = codeCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			codeCacheModel.createdBy = null;
		}

		codeCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = codeCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			codeCacheModel.updatedBy = null;
		}

		return codeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", masterCode=");
		sb.append(getMasterCode());
		sb.append(", displayTextEn=");
		sb.append(getDisplayTextEn());
		sb.append(", displayTextChi=");
		sb.append(getDisplayTextChi());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", subcodeEnabled=");
		sb.append(getSubcodeEnabled());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("hk.org.hkbh.cms.outpatient.model.Code");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterCode</column-name><column-value><![CDATA[");
		sb.append(getMasterCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayTextEn</column-name><column-value><![CDATA[");
		sb.append(getDisplayTextEn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayTextChi</column-name><column-value><![CDATA[");
		sb.append(getDisplayTextChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcodeEnabled</column-name><column-value><![CDATA[");
		sb.append(getSubcodeEnabled());
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

	private static final ClassLoader _classLoader = Code.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Code.class
		};
	private long _id;
	private String _masterCode;
	private String _displayTextEn;
	private String _displayTextChi;
	private Boolean _active;
	private Boolean _subcodeEnabled;
	private String _remarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
	private Code _escapedModel;
}