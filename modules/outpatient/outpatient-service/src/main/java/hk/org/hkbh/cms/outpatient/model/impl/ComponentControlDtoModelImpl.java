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

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.model.ComponentControlDtoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ComponentControlDto service. Represents a row in the &quot;Op_ComponentControlDto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ComponentControlDtoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ComponentControlDtoImpl}.
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlDtoImpl
 * @see ComponentControlDto
 * @see ComponentControlDtoModel
 * @generated
 */
@ProviderType
public class ComponentControlDtoModelImpl extends BaseModelImpl<ComponentControlDto>
	implements ComponentControlDtoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a component control dto model instance should use the {@link ComponentControlDto} interface instead.
	 */
	public static final String TABLE_NAME = "Op_ComponentControlDto";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "component_code", Types.VARCHAR },
			{ "component_name", Types.VARCHAR },
			{ "component_type_code_id", Types.INTEGER },
			{ "detail_code", Types.INTEGER },
			{ "detail_code_display_text_en", Types.VARCHAR },
			{ "detail_code_display_text_chi", Types.VARCHAR },
			{ "component_seq", Types.INTEGER },
			{ "is_menu_item", Types.BOOLEAN },
			{ "component_desc", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "component_level", Types.INTEGER },
			{ "up_component_id", Types.INTEGER },
			{ "component_control_id", Types.INTEGER },
			{ "user_id", Types.INTEGER },
			{ "user_role_id", Types.INTEGER },
			{ "component_id", Types.INTEGER },
			{ "create", Types.BOOLEAN },
			{ "read", Types.BOOLEAN },
			{ "update", Types.BOOLEAN },
			{ "delete", Types.BOOLEAN },
			{ "deny", Types.BOOLEAN },
			{ "visible", Types.BOOLEAN },
			{ "enable", Types.BOOLEAN },
			{ "control_desc", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "update_date", Types.TIMESTAMP },
			{ "created_by", Types.VARCHAR },
			{ "updated_by", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("component_code", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("component_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("component_type_code_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("detail_code", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("detail_code_display_text_en", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("detail_code_display_text_chi", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("component_seq", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("is_menu_item", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("component_desc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("component_level", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("up_component_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("component_control_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("user_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("user_role_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("component_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("create", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("read", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("update", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("delete", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("deny", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("visible", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("enable", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("control_desc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("create_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("update_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("created_by", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updated_by", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Op_ComponentControlDto (id INTEGER not null primary key,component_code VARCHAR(75) null,component_name VARCHAR(75) null,component_type_code_id INTEGER,detail_code INTEGER,detail_code_display_text_en VARCHAR(75) null,detail_code_display_text_chi VARCHAR(75) null,component_seq INTEGER,is_menu_item BOOLEAN,component_desc VARCHAR(75) null,url VARCHAR(75) null,component_level INTEGER,up_component_id INTEGER,component_control_id INTEGER,user_id INTEGER,user_role_id INTEGER,component_id INTEGER,create BOOLEAN,read BOOLEAN,update BOOLEAN,delete BOOLEAN,deny BOOLEAN,visible BOOLEAN,enable BOOLEAN,control_desc VARCHAR(75) null,create_date DATE null,update_date DATE null,created_by VARCHAR(75) null,updated_by VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Op_ComponentControlDto";
	public static final String ORDER_BY_JPQL = " ORDER BY componentControlDto.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Op_ComponentControlDto.id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.hk.org.hkbh.cms.outpatient.model.ComponentControlDto"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.hk.org.hkbh.cms.outpatient.model.ComponentControlDto"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(hk.org.hkbh.cms.outpatient.service.util.ServiceProps.get(
				"lock.expiration.time.hk.org.hkbh.cms.outpatient.model.ComponentControlDto"));

	public ComponentControlDtoModelImpl() {
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
		return ComponentControlDto.class;
	}

	@Override
	public String getModelClassName() {
		return ComponentControlDto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("componentCode", getComponentCode());
		attributes.put("componentName", getComponentName());
		attributes.put("componentTypeCodeId", getComponentTypeCodeId());
		attributes.put("detailCode", getDetailCode());
		attributes.put("detailCodeDisplayTextEn", getDetailCodeDisplayTextEn());
		attributes.put("detailCodeDisplayTextChi", getDetailCodeDisplayTextChi());
		attributes.put("componentSeq", getComponentSeq());
		attributes.put("isMenuItem", getIsMenuItem());
		attributes.put("componentDesc", getComponentDesc());
		attributes.put("url", getUrl());
		attributes.put("componentLevel", getComponentLevel());
		attributes.put("upComponentId", getUpComponentId());
		attributes.put("componentControlId", getComponentControlId());
		attributes.put("userId", getUserId());
		attributes.put("userRoleId", getUserRoleId());
		attributes.put("componentId", getComponentId());
		attributes.put("create", getCreate());
		attributes.put("read", getRead());
		attributes.put("update", getUpdate());
		attributes.put("delete", getDelete());
		attributes.put("deny", getDeny());
		attributes.put("visible", getVisible());
		attributes.put("enable", getEnable());
		attributes.put("controlDesc", getControlDesc());
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

		String componentCode = (String)attributes.get("componentCode");

		if (componentCode != null) {
			setComponentCode(componentCode);
		}

		String componentName = (String)attributes.get("componentName");

		if (componentName != null) {
			setComponentName(componentName);
		}

		Integer componentTypeCodeId = (Integer)attributes.get(
				"componentTypeCodeId");

		if (componentTypeCodeId != null) {
			setComponentTypeCodeId(componentTypeCodeId);
		}

		Integer detailCode = (Integer)attributes.get("detailCode");

		if (detailCode != null) {
			setDetailCode(detailCode);
		}

		String detailCodeDisplayTextEn = (String)attributes.get(
				"detailCodeDisplayTextEn");

		if (detailCodeDisplayTextEn != null) {
			setDetailCodeDisplayTextEn(detailCodeDisplayTextEn);
		}

		String detailCodeDisplayTextChi = (String)attributes.get(
				"detailCodeDisplayTextChi");

		if (detailCodeDisplayTextChi != null) {
			setDetailCodeDisplayTextChi(detailCodeDisplayTextChi);
		}

		Integer componentSeq = (Integer)attributes.get("componentSeq");

		if (componentSeq != null) {
			setComponentSeq(componentSeq);
		}

		Boolean isMenuItem = (Boolean)attributes.get("isMenuItem");

		if (isMenuItem != null) {
			setIsMenuItem(isMenuItem);
		}

		String componentDesc = (String)attributes.get("componentDesc");

		if (componentDesc != null) {
			setComponentDesc(componentDesc);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Integer componentLevel = (Integer)attributes.get("componentLevel");

		if (componentLevel != null) {
			setComponentLevel(componentLevel);
		}

		Integer upComponentId = (Integer)attributes.get("upComponentId");

		if (upComponentId != null) {
			setUpComponentId(upComponentId);
		}

		Integer componentControlId = (Integer)attributes.get(
				"componentControlId");

		if (componentControlId != null) {
			setComponentControlId(componentControlId);
		}

		Integer userId = (Integer)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer userRoleId = (Integer)attributes.get("userRoleId");

		if (userRoleId != null) {
			setUserRoleId(userRoleId);
		}

		Integer componentId = (Integer)attributes.get("componentId");

		if (componentId != null) {
			setComponentId(componentId);
		}

		Boolean create = (Boolean)attributes.get("create");

		if (create != null) {
			setCreate(create);
		}

		Boolean read = (Boolean)attributes.get("read");

		if (read != null) {
			setRead(read);
		}

		Boolean update = (Boolean)attributes.get("update");

		if (update != null) {
			setUpdate(update);
		}

		Boolean delete = (Boolean)attributes.get("delete");

		if (delete != null) {
			setDelete(delete);
		}

		Boolean deny = (Boolean)attributes.get("deny");

		if (deny != null) {
			setDeny(deny);
		}

		Boolean visible = (Boolean)attributes.get("visible");

		if (visible != null) {
			setVisible(visible);
		}

		Boolean enable = (Boolean)attributes.get("enable");

		if (enable != null) {
			setEnable(enable);
		}

		String controlDesc = (String)attributes.get("controlDesc");

		if (controlDesc != null) {
			setControlDesc(controlDesc);
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
	public String getComponentCode() {
		if (_componentCode == null) {
			return "";
		}
		else {
			return _componentCode;
		}
	}

	@Override
	public void setComponentCode(String componentCode) {
		_componentCode = componentCode;
	}

	@Override
	public String getComponentName() {
		if (_componentName == null) {
			return "";
		}
		else {
			return _componentName;
		}
	}

	@Override
	public void setComponentName(String componentName) {
		_componentName = componentName;
	}

	@Override
	public Integer getComponentTypeCodeId() {
		return _componentTypeCodeId;
	}

	@Override
	public void setComponentTypeCodeId(Integer componentTypeCodeId) {
		_componentTypeCodeId = componentTypeCodeId;
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
	public String getDetailCodeDisplayTextEn() {
		if (_detailCodeDisplayTextEn == null) {
			return "";
		}
		else {
			return _detailCodeDisplayTextEn;
		}
	}

	@Override
	public void setDetailCodeDisplayTextEn(String detailCodeDisplayTextEn) {
		_detailCodeDisplayTextEn = detailCodeDisplayTextEn;
	}

	@Override
	public String getDetailCodeDisplayTextChi() {
		if (_detailCodeDisplayTextChi == null) {
			return "";
		}
		else {
			return _detailCodeDisplayTextChi;
		}
	}

	@Override
	public void setDetailCodeDisplayTextChi(String detailCodeDisplayTextChi) {
		_detailCodeDisplayTextChi = detailCodeDisplayTextChi;
	}

	@Override
	public Integer getComponentSeq() {
		return _componentSeq;
	}

	@Override
	public void setComponentSeq(Integer componentSeq) {
		_componentSeq = componentSeq;
	}

	@Override
	public Boolean getIsMenuItem() {
		return _isMenuItem;
	}

	@Override
	public void setIsMenuItem(Boolean isMenuItem) {
		_isMenuItem = isMenuItem;
	}

	@Override
	public String getComponentDesc() {
		if (_componentDesc == null) {
			return "";
		}
		else {
			return _componentDesc;
		}
	}

	@Override
	public void setComponentDesc(String componentDesc) {
		_componentDesc = componentDesc;
	}

	@Override
	public String getUrl() {
		if (_url == null) {
			return "";
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@Override
	public Integer getComponentLevel() {
		return _componentLevel;
	}

	@Override
	public void setComponentLevel(Integer componentLevel) {
		_componentLevel = componentLevel;
	}

	@Override
	public Integer getUpComponentId() {
		return _upComponentId;
	}

	@Override
	public void setUpComponentId(Integer upComponentId) {
		_upComponentId = upComponentId;
	}

	@Override
	public Integer getComponentControlId() {
		return _componentControlId;
	}

	@Override
	public void setComponentControlId(Integer componentControlId) {
		_componentControlId = componentControlId;
	}

	@Override
	public Integer getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(Integer userId) {
		_userId = userId;
	}

	@Override
	public Integer getUserRoleId() {
		return _userRoleId;
	}

	@Override
	public void setUserRoleId(Integer userRoleId) {
		_userRoleId = userRoleId;
	}

	@Override
	public Integer getComponentId() {
		return _componentId;
	}

	@Override
	public void setComponentId(Integer componentId) {
		_componentId = componentId;
	}

	@Override
	public Boolean getCreate() {
		return _create;
	}

	@Override
	public void setCreate(Boolean create) {
		_create = create;
	}

	@Override
	public Boolean getRead() {
		return _read;
	}

	@Override
	public void setRead(Boolean read) {
		_read = read;
	}

	@Override
	public Boolean getUpdate() {
		return _update;
	}

	@Override
	public void setUpdate(Boolean update) {
		_update = update;
	}

	@Override
	public Boolean getDelete() {
		return _delete;
	}

	@Override
	public void setDelete(Boolean delete) {
		_delete = delete;
	}

	@Override
	public Boolean getDeny() {
		return _deny;
	}

	@Override
	public void setDeny(Boolean deny) {
		_deny = deny;
	}

	@Override
	public Boolean getVisible() {
		return _visible;
	}

	@Override
	public void setVisible(Boolean visible) {
		_visible = visible;
	}

	@Override
	public Boolean getEnable() {
		return _enable;
	}

	@Override
	public void setEnable(Boolean enable) {
		_enable = enable;
	}

	@Override
	public String getControlDesc() {
		if (_controlDesc == null) {
			return "";
		}
		else {
			return _controlDesc;
		}
	}

	@Override
	public void setControlDesc(String controlDesc) {
		_controlDesc = controlDesc;
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
	public ComponentControlDto toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ComponentControlDto)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ComponentControlDtoImpl componentControlDtoImpl = new ComponentControlDtoImpl();

		componentControlDtoImpl.setId(getId());
		componentControlDtoImpl.setComponentCode(getComponentCode());
		componentControlDtoImpl.setComponentName(getComponentName());
		componentControlDtoImpl.setComponentTypeCodeId(getComponentTypeCodeId());
		componentControlDtoImpl.setDetailCode(getDetailCode());
		componentControlDtoImpl.setDetailCodeDisplayTextEn(getDetailCodeDisplayTextEn());
		componentControlDtoImpl.setDetailCodeDisplayTextChi(getDetailCodeDisplayTextChi());
		componentControlDtoImpl.setComponentSeq(getComponentSeq());
		componentControlDtoImpl.setIsMenuItem(getIsMenuItem());
		componentControlDtoImpl.setComponentDesc(getComponentDesc());
		componentControlDtoImpl.setUrl(getUrl());
		componentControlDtoImpl.setComponentLevel(getComponentLevel());
		componentControlDtoImpl.setUpComponentId(getUpComponentId());
		componentControlDtoImpl.setComponentControlId(getComponentControlId());
		componentControlDtoImpl.setUserId(getUserId());
		componentControlDtoImpl.setUserRoleId(getUserRoleId());
		componentControlDtoImpl.setComponentId(getComponentId());
		componentControlDtoImpl.setCreate(getCreate());
		componentControlDtoImpl.setRead(getRead());
		componentControlDtoImpl.setUpdate(getUpdate());
		componentControlDtoImpl.setDelete(getDelete());
		componentControlDtoImpl.setDeny(getDeny());
		componentControlDtoImpl.setVisible(getVisible());
		componentControlDtoImpl.setEnable(getEnable());
		componentControlDtoImpl.setControlDesc(getControlDesc());
		componentControlDtoImpl.setCreateDate(getCreateDate());
		componentControlDtoImpl.setUpdateDate(getUpdateDate());
		componentControlDtoImpl.setCreatedBy(getCreatedBy());
		componentControlDtoImpl.setUpdatedBy(getUpdatedBy());

		componentControlDtoImpl.resetOriginalValues();

		return componentControlDtoImpl;
	}

	@Override
	public int compareTo(ComponentControlDto componentControlDto) {
		int primaryKey = componentControlDto.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentControlDto)) {
			return false;
		}

		ComponentControlDto componentControlDto = (ComponentControlDto)obj;

		int primaryKey = componentControlDto.getPrimaryKey();

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
	public CacheModel<ComponentControlDto> toCacheModel() {
		ComponentControlDtoCacheModel componentControlDtoCacheModel = new ComponentControlDtoCacheModel();

		componentControlDtoCacheModel.id = getId();

		componentControlDtoCacheModel.componentCode = getComponentCode();

		String componentCode = componentControlDtoCacheModel.componentCode;

		if ((componentCode != null) && (componentCode.length() == 0)) {
			componentControlDtoCacheModel.componentCode = null;
		}

		componentControlDtoCacheModel.componentName = getComponentName();

		String componentName = componentControlDtoCacheModel.componentName;

		if ((componentName != null) && (componentName.length() == 0)) {
			componentControlDtoCacheModel.componentName = null;
		}

		componentControlDtoCacheModel.componentTypeCodeId = getComponentTypeCodeId();

		componentControlDtoCacheModel.detailCode = getDetailCode();

		componentControlDtoCacheModel.detailCodeDisplayTextEn = getDetailCodeDisplayTextEn();

		String detailCodeDisplayTextEn = componentControlDtoCacheModel.detailCodeDisplayTextEn;

		if ((detailCodeDisplayTextEn != null) &&
				(detailCodeDisplayTextEn.length() == 0)) {
			componentControlDtoCacheModel.detailCodeDisplayTextEn = null;
		}

		componentControlDtoCacheModel.detailCodeDisplayTextChi = getDetailCodeDisplayTextChi();

		String detailCodeDisplayTextChi = componentControlDtoCacheModel.detailCodeDisplayTextChi;

		if ((detailCodeDisplayTextChi != null) &&
				(detailCodeDisplayTextChi.length() == 0)) {
			componentControlDtoCacheModel.detailCodeDisplayTextChi = null;
		}

		componentControlDtoCacheModel.componentSeq = getComponentSeq();

		componentControlDtoCacheModel.isMenuItem = getIsMenuItem();

		componentControlDtoCacheModel.componentDesc = getComponentDesc();

		String componentDesc = componentControlDtoCacheModel.componentDesc;

		if ((componentDesc != null) && (componentDesc.length() == 0)) {
			componentControlDtoCacheModel.componentDesc = null;
		}

		componentControlDtoCacheModel.url = getUrl();

		String url = componentControlDtoCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			componentControlDtoCacheModel.url = null;
		}

		componentControlDtoCacheModel.componentLevel = getComponentLevel();

		componentControlDtoCacheModel.upComponentId = getUpComponentId();

		componentControlDtoCacheModel.componentControlId = getComponentControlId();

		componentControlDtoCacheModel.userId = getUserId();

		componentControlDtoCacheModel.userRoleId = getUserRoleId();

		componentControlDtoCacheModel.componentId = getComponentId();

		componentControlDtoCacheModel.create = getCreate();

		componentControlDtoCacheModel.read = getRead();

		componentControlDtoCacheModel.update = getUpdate();

		componentControlDtoCacheModel.delete = getDelete();

		componentControlDtoCacheModel.deny = getDeny();

		componentControlDtoCacheModel.visible = getVisible();

		componentControlDtoCacheModel.enable = getEnable();

		componentControlDtoCacheModel.controlDesc = getControlDesc();

		String controlDesc = componentControlDtoCacheModel.controlDesc;

		if ((controlDesc != null) && (controlDesc.length() == 0)) {
			componentControlDtoCacheModel.controlDesc = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			componentControlDtoCacheModel.createDate = createDate.getTime();
		}
		else {
			componentControlDtoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			componentControlDtoCacheModel.updateDate = updateDate.getTime();
		}
		else {
			componentControlDtoCacheModel.updateDate = Long.MIN_VALUE;
		}

		componentControlDtoCacheModel.createdBy = getCreatedBy();

		String createdBy = componentControlDtoCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			componentControlDtoCacheModel.createdBy = null;
		}

		componentControlDtoCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = componentControlDtoCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			componentControlDtoCacheModel.updatedBy = null;
		}

		return componentControlDtoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", componentCode=");
		sb.append(getComponentCode());
		sb.append(", componentName=");
		sb.append(getComponentName());
		sb.append(", componentTypeCodeId=");
		sb.append(getComponentTypeCodeId());
		sb.append(", detailCode=");
		sb.append(getDetailCode());
		sb.append(", detailCodeDisplayTextEn=");
		sb.append(getDetailCodeDisplayTextEn());
		sb.append(", detailCodeDisplayTextChi=");
		sb.append(getDetailCodeDisplayTextChi());
		sb.append(", componentSeq=");
		sb.append(getComponentSeq());
		sb.append(", isMenuItem=");
		sb.append(getIsMenuItem());
		sb.append(", componentDesc=");
		sb.append(getComponentDesc());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", componentLevel=");
		sb.append(getComponentLevel());
		sb.append(", upComponentId=");
		sb.append(getUpComponentId());
		sb.append(", componentControlId=");
		sb.append(getComponentControlId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userRoleId=");
		sb.append(getUserRoleId());
		sb.append(", componentId=");
		sb.append(getComponentId());
		sb.append(", create=");
		sb.append(getCreate());
		sb.append(", read=");
		sb.append(getRead());
		sb.append(", update=");
		sb.append(getUpdate());
		sb.append(", delete=");
		sb.append(getDelete());
		sb.append(", deny=");
		sb.append(getDeny());
		sb.append(", visible=");
		sb.append(getVisible());
		sb.append(", enable=");
		sb.append(getEnable());
		sb.append(", controlDesc=");
		sb.append(getControlDesc());
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
		StringBundler sb = new StringBundler(91);

		sb.append("<model><model-name>");
		sb.append("hk.org.hkbh.cms.outpatient.model.ComponentControlDto");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentCode</column-name><column-value><![CDATA[");
		sb.append(getComponentCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentName</column-name><column-value><![CDATA[");
		sb.append(getComponentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentTypeCodeId</column-name><column-value><![CDATA[");
		sb.append(getComponentTypeCodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>detailCode</column-name><column-value><![CDATA[");
		sb.append(getDetailCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>detailCodeDisplayTextEn</column-name><column-value><![CDATA[");
		sb.append(getDetailCodeDisplayTextEn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>detailCodeDisplayTextChi</column-name><column-value><![CDATA[");
		sb.append(getDetailCodeDisplayTextChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentSeq</column-name><column-value><![CDATA[");
		sb.append(getComponentSeq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMenuItem</column-name><column-value><![CDATA[");
		sb.append(getIsMenuItem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentDesc</column-name><column-value><![CDATA[");
		sb.append(getComponentDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentLevel</column-name><column-value><![CDATA[");
		sb.append(getComponentLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upComponentId</column-name><column-value><![CDATA[");
		sb.append(getUpComponentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentControlId</column-name><column-value><![CDATA[");
		sb.append(getComponentControlId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userRoleId</column-name><column-value><![CDATA[");
		sb.append(getUserRoleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>componentId</column-name><column-value><![CDATA[");
		sb.append(getComponentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>create</column-name><column-value><![CDATA[");
		sb.append(getCreate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>read</column-name><column-value><![CDATA[");
		sb.append(getRead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>update</column-name><column-value><![CDATA[");
		sb.append(getUpdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>delete</column-name><column-value><![CDATA[");
		sb.append(getDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deny</column-name><column-value><![CDATA[");
		sb.append(getDeny());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visible</column-name><column-value><![CDATA[");
		sb.append(getVisible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enable</column-name><column-value><![CDATA[");
		sb.append(getEnable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>controlDesc</column-name><column-value><![CDATA[");
		sb.append(getControlDesc());
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

	private static final ClassLoader _classLoader = ComponentControlDto.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ComponentControlDto.class
		};
	private int _id;
	private String _componentCode;
	private String _componentName;
	private Integer _componentTypeCodeId;
	private Integer _detailCode;
	private String _detailCodeDisplayTextEn;
	private String _detailCodeDisplayTextChi;
	private Integer _componentSeq;
	private Boolean _isMenuItem;
	private String _componentDesc;
	private String _url;
	private Integer _componentLevel;
	private Integer _upComponentId;
	private Integer _componentControlId;
	private Integer _userId;
	private Integer _userRoleId;
	private Integer _componentId;
	private Boolean _create;
	private Boolean _read;
	private Boolean _update;
	private Boolean _delete;
	private Boolean _deny;
	private Boolean _visible;
	private Boolean _enable;
	private String _controlDesc;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
	private ComponentControlDto _escapedModel;
}