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
 * This class is a wrapper for {@link Code}.
 * </p>
 *
 * @author Dave Man
 * @see Code
 * @generated
 */
@ProviderType
public class CodeWrapper implements Code, ModelWrapper<Code> {
	public CodeWrapper(Code code) {
		_code = code;
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
	public java.lang.Object clone() {
		return new CodeWrapper((Code)_code.clone());
	}

	@Override
	public int compareTo(Code code) {
		return _code.compareTo(code);
	}

	/**
	* Returns the active of this code.
	*
	* @return the active of this code
	*/
	@Override
	public java.lang.Boolean getActive() {
		return _code.getActive();
	}

	/**
	* Returns the create date of this code.
	*
	* @return the create date of this code
	*/
	@Override
	public Date getCreateDate() {
		return _code.getCreateDate();
	}

	/**
	* Returns the created by of this code.
	*
	* @return the created by of this code
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _code.getCreatedBy();
	}

	/**
	* Returns the display text chi of this code.
	*
	* @return the display text chi of this code
	*/
	@Override
	public java.lang.String getDisplayTextChi() {
		return _code.getDisplayTextChi();
	}

	/**
	* Returns the display text en of this code.
	*
	* @return the display text en of this code
	*/
	@Override
	public java.lang.String getDisplayTextEn() {
		return _code.getDisplayTextEn();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _code.getExpandoBridge();
	}

	/**
	* Returns the ID of this code.
	*
	* @return the ID of this code
	*/
	@Override
	public long getId() {
		return _code.getId();
	}

	/**
	* Returns the master code of this code.
	*
	* @return the master code of this code
	*/
	@Override
	public java.lang.String getMasterCode() {
		return _code.getMasterCode();
	}

	/**
	* Returns the primary key of this code.
	*
	* @return the primary key of this code
	*/
	@Override
	public long getPrimaryKey() {
		return _code.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _code.getPrimaryKeyObj();
	}

	/**
	* Returns the remarks of this code.
	*
	* @return the remarks of this code
	*/
	@Override
	public java.lang.String getRemarks() {
		return _code.getRemarks();
	}

	/**
	* Returns the subcode enabled of this code.
	*
	* @return the subcode enabled of this code
	*/
	@Override
	public java.lang.Boolean getSubcodeEnabled() {
		return _code.getSubcodeEnabled();
	}

	/**
	* Returns the update date of this code.
	*
	* @return the update date of this code
	*/
	@Override
	public Date getUpdateDate() {
		return _code.getUpdateDate();
	}

	/**
	* Returns the updated by of this code.
	*
	* @return the updated by of this code
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _code.getUpdatedBy();
	}

	@Override
	public int hashCode() {
		return _code.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _code.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _code.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _code.isNew();
	}

	@Override
	public void persist() {
		_code.persist();
	}

	/**
	* Sets the active of this code.
	*
	* @param active the active of this code
	*/
	@Override
	public void setActive(java.lang.Boolean active) {
		_code.setActive(active);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_code.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this code.
	*
	* @param createDate the create date of this code
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_code.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this code.
	*
	* @param createdBy the created by of this code
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_code.setCreatedBy(createdBy);
	}

	/**
	* Sets the display text chi of this code.
	*
	* @param displayTextChi the display text chi of this code
	*/
	@Override
	public void setDisplayTextChi(java.lang.String displayTextChi) {
		_code.setDisplayTextChi(displayTextChi);
	}

	/**
	* Sets the display text en of this code.
	*
	* @param displayTextEn the display text en of this code
	*/
	@Override
	public void setDisplayTextEn(java.lang.String displayTextEn) {
		_code.setDisplayTextEn(displayTextEn);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_code.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_code.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_code.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this code.
	*
	* @param id the ID of this code
	*/
	@Override
	public void setId(long id) {
		_code.setId(id);
	}

	/**
	* Sets the master code of this code.
	*
	* @param masterCode the master code of this code
	*/
	@Override
	public void setMasterCode(java.lang.String masterCode) {
		_code.setMasterCode(masterCode);
	}

	@Override
	public void setNew(boolean n) {
		_code.setNew(n);
	}

	/**
	* Sets the primary key of this code.
	*
	* @param primaryKey the primary key of this code
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_code.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_code.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remarks of this code.
	*
	* @param remarks the remarks of this code
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_code.setRemarks(remarks);
	}

	/**
	* Sets the subcode enabled of this code.
	*
	* @param subcodeEnabled the subcode enabled of this code
	*/
	@Override
	public void setSubcodeEnabled(java.lang.Boolean subcodeEnabled) {
		_code.setSubcodeEnabled(subcodeEnabled);
	}

	/**
	* Sets the update date of this code.
	*
	* @param updateDate the update date of this code
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_code.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this code.
	*
	* @param updatedBy the updated by of this code
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_code.setUpdatedBy(updatedBy);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Code> toCacheModel() {
		return _code.toCacheModel();
	}

	@Override
	public Code toEscapedModel() {
		return new CodeWrapper(_code.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _code.toString();
	}

	@Override
	public Code toUnescapedModel() {
		return new CodeWrapper(_code.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _code.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CodeWrapper)) {
			return false;
		}

		CodeWrapper codeWrapper = (CodeWrapper)obj;

		if (Objects.equals(_code, codeWrapper._code)) {
			return true;
		}

		return false;
	}

	@Override
	public Code getWrappedModel() {
		return _code;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _code.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _code.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_code.resetOriginalValues();
	}

	private final Code _code;
}