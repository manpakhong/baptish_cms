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

import hk.org.hkbh.cms.outpatient.model.AuditTrail;
import hk.org.hkbh.cms.outpatient.model.AuditTrailModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AuditTrail service. Represents a row in the &quot;audit_trail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AuditTrailModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuditTrailImpl}.
 * </p>
 *
 * @author Dave Man
 * @see AuditTrailImpl
 * @see AuditTrail
 * @see AuditTrailModel
 * @generated
 */
@ProviderType
public class AuditTrailModelImpl extends BaseModelImpl<AuditTrail>
	implements AuditTrailModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a audit trail model instance should use the {@link AuditTrail} interface instead.
	 */
	public static final String TABLE_NAME = "audit_trail";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "function_id", Types.BIGINT },
			{ "class_name", Types.VARCHAR },
			{ "user_action", Types.VARCHAR },
			{ "before_image_in_json", Types.VARCHAR },
			{ "after_image_in_json", Types.VARCHAR },
			{ "is_deleted", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "update_date", Types.TIMESTAMP },
			{ "created_by", Types.VARCHAR },
			{ "updated_by", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("function_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("class_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("user_action", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("before_image_in_json", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("after_image_in_json", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("is_deleted", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("create_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("update_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("created_by", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updated_by", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table audit_trail (id LONG not null primary key,function_id LONG,class_name VARCHAR(75) null,user_action VARCHAR(75) null,before_image_in_json VARCHAR(75) null,after_image_in_json VARCHAR(75) null,is_deleted VARCHAR(75) null,create_date DATE null,update_date DATE null,created_by VARCHAR(75) null,updated_by VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table audit_trail";
	public static final String ORDER_BY_JPQL = " ORDER BY auditTrail.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY audit_trail.id ASC";
	public static final String DATA_SOURCE = "cmsDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.hk.org.hkbh.cms.outpatient.model.AuditTrail"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.hk.org.hkbh.cms.outpatient.model.AuditTrail"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"lock.expiration.time.hk.org.hkbh.cms.outpatient.model.AuditTrail"));

	public AuditTrailModelImpl() {
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
		return AuditTrail.class;
	}

	@Override
	public String getModelClassName() {
		return AuditTrail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("functionId", getFunctionId());
		attributes.put("className", getClassName());
		attributes.put("userAction", getUserAction());
		attributes.put("beforeImageInJson", getBeforeImageInJson());
		attributes.put("afterImageInJson", getAfterImageInJson());
		attributes.put("isDeleted", getIsDeleted());
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

		Long functionId = (Long)attributes.get("functionId");

		if (functionId != null) {
			setFunctionId(functionId);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		String userAction = (String)attributes.get("userAction");

		if (userAction != null) {
			setUserAction(userAction);
		}

		String beforeImageInJson = (String)attributes.get("beforeImageInJson");

		if (beforeImageInJson != null) {
			setBeforeImageInJson(beforeImageInJson);
		}

		String afterImageInJson = (String)attributes.get("afterImageInJson");

		if (afterImageInJson != null) {
			setAfterImageInJson(afterImageInJson);
		}

		String isDeleted = (String)attributes.get("isDeleted");

		if (isDeleted != null) {
			setIsDeleted(isDeleted);
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
	public Long getFunctionId() {
		return _functionId;
	}

	@Override
	public void setFunctionId(Long functionId) {
		_functionId = functionId;
	}

	@Override
	public String getClassName() {
		if (_className == null) {
			return "";
		}
		else {
			return _className;
		}
	}

	@Override
	public void setClassName(String className) {
		_className = className;
	}

	@Override
	public String getUserAction() {
		if (_userAction == null) {
			return "";
		}
		else {
			return _userAction;
		}
	}

	@Override
	public void setUserAction(String userAction) {
		_userAction = userAction;
	}

	@Override
	public String getBeforeImageInJson() {
		if (_beforeImageInJson == null) {
			return "";
		}
		else {
			return _beforeImageInJson;
		}
	}

	@Override
	public void setBeforeImageInJson(String beforeImageInJson) {
		_beforeImageInJson = beforeImageInJson;
	}

	@Override
	public String getAfterImageInJson() {
		if (_afterImageInJson == null) {
			return "";
		}
		else {
			return _afterImageInJson;
		}
	}

	@Override
	public void setAfterImageInJson(String afterImageInJson) {
		_afterImageInJson = afterImageInJson;
	}

	@Override
	public String getIsDeleted() {
		if (_isDeleted == null) {
			return "";
		}
		else {
			return _isDeleted;
		}
	}

	@Override
	public void setIsDeleted(String isDeleted) {
		_isDeleted = isDeleted;
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
			AuditTrail.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AuditTrail toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AuditTrail)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AuditTrailImpl auditTrailImpl = new AuditTrailImpl();

		auditTrailImpl.setId(getId());
		auditTrailImpl.setFunctionId(getFunctionId());
		auditTrailImpl.setClassName(getClassName());
		auditTrailImpl.setUserAction(getUserAction());
		auditTrailImpl.setBeforeImageInJson(getBeforeImageInJson());
		auditTrailImpl.setAfterImageInJson(getAfterImageInJson());
		auditTrailImpl.setIsDeleted(getIsDeleted());
		auditTrailImpl.setCreateDate(getCreateDate());
		auditTrailImpl.setUpdateDate(getUpdateDate());
		auditTrailImpl.setCreatedBy(getCreatedBy());
		auditTrailImpl.setUpdatedBy(getUpdatedBy());

		auditTrailImpl.resetOriginalValues();

		return auditTrailImpl;
	}

	@Override
	public int compareTo(AuditTrail auditTrail) {
		int value = 0;

		if (getId() < auditTrail.getId()) {
			value = -1;
		}
		else if (getId() > auditTrail.getId()) {
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

		if (!(obj instanceof AuditTrail)) {
			return false;
		}

		AuditTrail auditTrail = (AuditTrail)obj;

		long primaryKey = auditTrail.getPrimaryKey();

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
	public CacheModel<AuditTrail> toCacheModel() {
		AuditTrailCacheModel auditTrailCacheModel = new AuditTrailCacheModel();

		auditTrailCacheModel.id = getId();

		auditTrailCacheModel.functionId = getFunctionId();

		auditTrailCacheModel.className = getClassName();

		String className = auditTrailCacheModel.className;

		if ((className != null) && (className.length() == 0)) {
			auditTrailCacheModel.className = null;
		}

		auditTrailCacheModel.userAction = getUserAction();

		String userAction = auditTrailCacheModel.userAction;

		if ((userAction != null) && (userAction.length() == 0)) {
			auditTrailCacheModel.userAction = null;
		}

		auditTrailCacheModel.beforeImageInJson = getBeforeImageInJson();

		String beforeImageInJson = auditTrailCacheModel.beforeImageInJson;

		if ((beforeImageInJson != null) && (beforeImageInJson.length() == 0)) {
			auditTrailCacheModel.beforeImageInJson = null;
		}

		auditTrailCacheModel.afterImageInJson = getAfterImageInJson();

		String afterImageInJson = auditTrailCacheModel.afterImageInJson;

		if ((afterImageInJson != null) && (afterImageInJson.length() == 0)) {
			auditTrailCacheModel.afterImageInJson = null;
		}

		auditTrailCacheModel.isDeleted = getIsDeleted();

		String isDeleted = auditTrailCacheModel.isDeleted;

		if ((isDeleted != null) && (isDeleted.length() == 0)) {
			auditTrailCacheModel.isDeleted = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			auditTrailCacheModel.createDate = createDate.getTime();
		}
		else {
			auditTrailCacheModel.createDate = Long.MIN_VALUE;
		}

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			auditTrailCacheModel.updateDate = updateDate.getTime();
		}
		else {
			auditTrailCacheModel.updateDate = Long.MIN_VALUE;
		}

		auditTrailCacheModel.createdBy = getCreatedBy();

		String createdBy = auditTrailCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			auditTrailCacheModel.createdBy = null;
		}

		auditTrailCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = auditTrailCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			auditTrailCacheModel.updatedBy = null;
		}

		return auditTrailCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", functionId=");
		sb.append(getFunctionId());
		sb.append(", className=");
		sb.append(getClassName());
		sb.append(", userAction=");
		sb.append(getUserAction());
		sb.append(", beforeImageInJson=");
		sb.append(getBeforeImageInJson());
		sb.append(", afterImageInJson=");
		sb.append(getAfterImageInJson());
		sb.append(", isDeleted=");
		sb.append(getIsDeleted());
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
		sb.append("hk.org.hkbh.cms.outpatient.model.AuditTrail");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionId</column-name><column-value><![CDATA[");
		sb.append(getFunctionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>className</column-name><column-value><![CDATA[");
		sb.append(getClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAction</column-name><column-value><![CDATA[");
		sb.append(getUserAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>beforeImageInJson</column-name><column-value><![CDATA[");
		sb.append(getBeforeImageInJson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>afterImageInJson</column-name><column-value><![CDATA[");
		sb.append(getAfterImageInJson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDeleted</column-name><column-value><![CDATA[");
		sb.append(getIsDeleted());
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

	private static final ClassLoader _classLoader = AuditTrail.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AuditTrail.class
		};
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
	private AuditTrail _escapedModel;
}