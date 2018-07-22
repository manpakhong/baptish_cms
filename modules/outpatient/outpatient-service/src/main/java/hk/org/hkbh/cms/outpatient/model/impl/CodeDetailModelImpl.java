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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import hk.org.hkbh.cms.outpatient.model.CodeDetail;
import hk.org.hkbh.cms.outpatient.model.CodeDetailModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CodeDetail service. Represents a row in the &quot;code_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CodeDetailModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CodeDetailImpl}.
 * </p>
 *
 * @author Dave Man
 * @see CodeDetailImpl
 * @see CodeDetail
 * @see CodeDetailModel
 * @generated
 */
@ProviderType
public class CodeDetailModelImpl extends BaseModelImpl<CodeDetail>
	implements CodeDetailModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a code detail model instance should use the {@link CodeDetail} interface instead.
	 */
	public static final String TABLE_NAME = "code_detail";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "code_id", Types.VARCHAR },
			{ "detail_code", Types.INTEGER },
			{ "seq", Types.INTEGER },
			{ "display_text", Types.VARCHAR },
			{ "active", Types.BOOLEAN },
			{ "level", Types.INTEGER },
			{ "up_level_id", Types.INTEGER },
			{ "remarks", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "update_date", Types.TIMESTAMP },
			{ "created_by", Types.VARCHAR },
			{ "updated_by", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("code_id", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("detail_code", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("seq", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("display_text", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("active", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("level", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("up_level_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("remarks", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("create_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("update_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("created_by", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updated_by", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table code_detail (id INTEGER not null primary key,code_id VARCHAR(75) null,detail_code INTEGER,seq INTEGER,display_text VARCHAR(75) null,active BOOLEAN,level INTEGER,up_level_id INTEGER,remarks VARCHAR(75) null,create_date DATE null,update_date DATE null,created_by VARCHAR(75) null,updated_by VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table code_detail";
	public static final String ORDER_BY_JPQL = " ORDER BY codeDetail.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY code_detail.id ASC";
	public static final String DATA_SOURCE = "cmsDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.hk.org.hkbh.cms.outpatient.model.CodeDetail"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.hk.org.hkbh.cms.outpatient.model.CodeDetail"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"lock.expiration.time.hk.org.hkbh.cms.outpatient.model.CodeDetail"));

	public CodeDetailModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CodeDetail.class;
	}

	@Override
	public String getModelClassName() {
		return CodeDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("codeId", getCodeId());
		attributes.put("detailCode", getDetailCode());
		attributes.put("seq", getSeq());
		attributes.put("displayText", getDisplayText());
		attributes.put("active", getActive());
		attributes.put("level", getLevel());
		attributes.put("upLevelId", getUpLevelId());
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
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String codeId = (String)attributes.get("codeId");

		if (codeId != null) {
			setCodeId(codeId);
		}

		Integer detailCode = (Integer)attributes.get("detailCode");

		if (detailCode != null) {
			setDetailCode(detailCode);
		}

		Integer seq = (Integer)attributes.get("seq");

		if (seq != null) {
			setSeq(seq);
		}

		String displayText = (String)attributes.get("displayText");

		if (displayText != null) {
			setDisplayText(displayText);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Integer upLevelId = (Integer)attributes.get("upLevelId");

		if (upLevelId != null) {
			setUpLevelId(upLevelId);
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
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;
	}

	@Override
	public String getCodeId() {
		if (_codeId == null) {
			return "";
		}
		else {
			return _codeId;
		}
	}

	@Override
	public void setCodeId(String codeId) {
		_codeId = codeId;
	}

	@Override
	public Integer getDetailCode() {
		return _detailCode;
	}

	@Override
	public void setDetailCode(Integer detailCode) {
		_detailCode = detailCode;
	}

	@Override
	public Integer getSeq() {
		return _seq;
	}

	@Override
	public void setSeq(Integer seq) {
		_seq = seq;
	}

	@Override
	public String getDisplayText() {
		if (_displayText == null) {
			return "";
		}
		else {
			return _displayText;
		}
	}

	@Override
	public void setDisplayText(String displayText) {
		_displayText = displayText;
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
	public Integer getLevel() {
		return _level;
	}

	@Override
	public void setLevel(Integer level) {
		_level = level;
	}

	@Override
	public Integer getUpLevelId() {
		return _upLevelId;
	}

	@Override
	public void setUpLevelId(Integer upLevelId) {
		_upLevelId = upLevelId;
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
	public CodeDetail toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CodeDetail)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CodeDetailImpl codeDetailImpl = new CodeDetailImpl();

		codeDetailImpl.setId(getId());
		codeDetailImpl.setCodeId(getCodeId());
		codeDetailImpl.setDetailCode(getDetailCode());
		codeDetailImpl.setSeq(getSeq());
		codeDetailImpl.setDisplayText(getDisplayText());
		codeDetailImpl.setActive(getActive());
		codeDetailImpl.setLevel(getLevel());
		codeDetailImpl.setUpLevelId(getUpLevelId());
		codeDetailImpl.setRemarks(getRemarks());
		codeDetailImpl.setCreateDate(getCreateDate());
		codeDetailImpl.setUpdateDate(getUpdateDate());
		codeDetailImpl.setCreatedBy(getCreatedBy());
		codeDetailImpl.setUpdatedBy(getUpdatedBy());

		codeDetailImpl.resetOriginalValues();

		return codeDetailImpl;
	}

	@Override
	public int compareTo(CodeDetail codeDetail) {
		int value = 0;

		if (getId() < codeDetail.getId()) {
			value = -1;
		}
		else if (getId() > codeDetail.getId()) {
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

		if (!(obj instanceof CodeDetail)) {
			return false;
		}

		CodeDetail codeDetail = (CodeDetail)obj;

		int primaryKey = codeDetail.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
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
	public CacheModel<CodeDetail> toCacheModel() {
		CodeDetailCacheModel codeDetailCacheModel = new CodeDetailCacheModel();

		codeDetailCacheModel.id = getId();

		codeDetailCacheModel.codeId = getCodeId();

		String codeId = codeDetailCacheModel.codeId;

		if ((codeId != null) && (codeId.length() == 0)) {
			codeDetailCacheModel.codeId = null;
		}

		codeDetailCacheModel.detailCode = getDetailCode();

		codeDetailCacheModel.seq = getSeq();

		codeDetailCacheModel.displayText = getDisplayText();

		String displayText = codeDetailCacheModel.displayText;

		if ((displayText != null) && (displayText.length() == 0)) {
			codeDetailCacheModel.displayText = null;
		}

		codeDetailCacheModel.active = getActive();

		codeDetailCacheModel.level = getLevel();

		codeDetailCacheModel.upLevelId = getUpLevelId();

		codeDetailCacheModel.remarks = getRemarks();

		String remarks = codeDetailCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			codeDetailCacheModel.remarks = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			codeDetailCacheModel.createDate = createDate.getTime();
		}
		else {
			codeDetailCacheModel.createDate = Long.MIN_VALUE;
		}

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			codeDetailCacheModel.updateDate = updateDate.getTime();
		}
		else {
			codeDetailCacheModel.updateDate = Long.MIN_VALUE;
		}

		codeDetailCacheModel.createdBy = getCreatedBy();

		String createdBy = codeDetailCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			codeDetailCacheModel.createdBy = null;
		}

		codeDetailCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = codeDetailCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			codeDetailCacheModel.updatedBy = null;
		}

		return codeDetailCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", codeId=");
		sb.append(getCodeId());
		sb.append(", detailCode=");
		sb.append(getDetailCode());
		sb.append(", seq=");
		sb.append(getSeq());
		sb.append(", displayText=");
		sb.append(getDisplayText());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", upLevelId=");
		sb.append(getUpLevelId());
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
		sb.append("hk.org.hkbh.cms.outpatient.model.CodeDetail");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeId</column-name><column-value><![CDATA[");
		sb.append(getCodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>detailCode</column-name><column-value><![CDATA[");
		sb.append(getDetailCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>seq</column-name><column-value><![CDATA[");
		sb.append(getSeq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayText</column-name><column-value><![CDATA[");
		sb.append(getDisplayText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upLevelId</column-name><column-value><![CDATA[");
		sb.append(getUpLevelId());
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

	private static final ClassLoader _classLoader = CodeDetail.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CodeDetail.class
		};
	private int _id;
	private String _codeId;
	private Integer _detailCode;
	private Integer _seq;
	private String _displayText;
	private Boolean _active;
	private Integer _level;
	private Integer _upLevelId;
	private String _remarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
	private CodeDetail _escapedModel;
}