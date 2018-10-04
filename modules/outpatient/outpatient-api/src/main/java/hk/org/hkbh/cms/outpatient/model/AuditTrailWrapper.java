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
 * This class is a wrapper for {@link AuditTrail}.
 * </p>
 *
 * @author Dave Man
 * @see AuditTrail
 * @generated
 */
@ProviderType
public class AuditTrailWrapper implements AuditTrail, ModelWrapper<AuditTrail> {
	public AuditTrailWrapper(AuditTrail auditTrail) {
		_auditTrail = auditTrail;
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
	public java.lang.Object clone() {
		return new AuditTrailWrapper((AuditTrail)_auditTrail.clone());
	}

	@Override
	public int compareTo(AuditTrail auditTrail) {
		return _auditTrail.compareTo(auditTrail);
	}

	/**
	* Returns the after image in json of this audit trail.
	*
	* @return the after image in json of this audit trail
	*/
	@Override
	public java.lang.String getAfterImageInJson() {
		return _auditTrail.getAfterImageInJson();
	}

	/**
	* Returns the before image in json of this audit trail.
	*
	* @return the before image in json of this audit trail
	*/
	@Override
	public java.lang.String getBeforeImageInJson() {
		return _auditTrail.getBeforeImageInJson();
	}

	/**
	* Returns the class name of this audit trail.
	*
	* @return the class name of this audit trail
	*/
	@Override
	public java.lang.String getClassName() {
		return _auditTrail.getClassName();
	}

	/**
	* Returns the create date of this audit trail.
	*
	* @return the create date of this audit trail
	*/
	@Override
	public Date getCreateDate() {
		return _auditTrail.getCreateDate();
	}

	/**
	* Returns the created by of this audit trail.
	*
	* @return the created by of this audit trail
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _auditTrail.getCreatedBy();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _auditTrail.getExpandoBridge();
	}

	/**
	* Returns the function ID of this audit trail.
	*
	* @return the function ID of this audit trail
	*/
	@Override
	public java.lang.Long getFunctionId() {
		return _auditTrail.getFunctionId();
	}

	/**
	* Returns the ID of this audit trail.
	*
	* @return the ID of this audit trail
	*/
	@Override
	public long getId() {
		return _auditTrail.getId();
	}

	/**
	* Returns the is deleted of this audit trail.
	*
	* @return the is deleted of this audit trail
	*/
	@Override
	public java.lang.String getIsDeleted() {
		return _auditTrail.getIsDeleted();
	}

	/**
	* Returns the primary key of this audit trail.
	*
	* @return the primary key of this audit trail
	*/
	@Override
	public long getPrimaryKey() {
		return _auditTrail.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _auditTrail.getPrimaryKeyObj();
	}

	/**
	* Returns the update date of this audit trail.
	*
	* @return the update date of this audit trail
	*/
	@Override
	public Date getUpdateDate() {
		return _auditTrail.getUpdateDate();
	}

	/**
	* Returns the updated by of this audit trail.
	*
	* @return the updated by of this audit trail
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _auditTrail.getUpdatedBy();
	}

	/**
	* Returns the user action of this audit trail.
	*
	* @return the user action of this audit trail
	*/
	@Override
	public java.lang.String getUserAction() {
		return _auditTrail.getUserAction();
	}

	@Override
	public int hashCode() {
		return _auditTrail.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _auditTrail.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _auditTrail.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _auditTrail.isNew();
	}

	@Override
	public void persist() {
		_auditTrail.persist();
	}

	/**
	* Sets the after image in json of this audit trail.
	*
	* @param afterImageInJson the after image in json of this audit trail
	*/
	@Override
	public void setAfterImageInJson(java.lang.String afterImageInJson) {
		_auditTrail.setAfterImageInJson(afterImageInJson);
	}

	/**
	* Sets the before image in json of this audit trail.
	*
	* @param beforeImageInJson the before image in json of this audit trail
	*/
	@Override
	public void setBeforeImageInJson(java.lang.String beforeImageInJson) {
		_auditTrail.setBeforeImageInJson(beforeImageInJson);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_auditTrail.setCachedModel(cachedModel);
	}

	/**
	* Sets the class name of this audit trail.
	*
	* @param className the class name of this audit trail
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_auditTrail.setClassName(className);
	}

	/**
	* Sets the create date of this audit trail.
	*
	* @param createDate the create date of this audit trail
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_auditTrail.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this audit trail.
	*
	* @param createdBy the created by of this audit trail
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_auditTrail.setCreatedBy(createdBy);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_auditTrail.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_auditTrail.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_auditTrail.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the function ID of this audit trail.
	*
	* @param functionId the function ID of this audit trail
	*/
	@Override
	public void setFunctionId(java.lang.Long functionId) {
		_auditTrail.setFunctionId(functionId);
	}

	/**
	* Sets the ID of this audit trail.
	*
	* @param id the ID of this audit trail
	*/
	@Override
	public void setId(long id) {
		_auditTrail.setId(id);
	}

	/**
	* Sets the is deleted of this audit trail.
	*
	* @param isDeleted the is deleted of this audit trail
	*/
	@Override
	public void setIsDeleted(java.lang.String isDeleted) {
		_auditTrail.setIsDeleted(isDeleted);
	}

	@Override
	public void setNew(boolean n) {
		_auditTrail.setNew(n);
	}

	/**
	* Sets the primary key of this audit trail.
	*
	* @param primaryKey the primary key of this audit trail
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_auditTrail.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_auditTrail.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the update date of this audit trail.
	*
	* @param updateDate the update date of this audit trail
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_auditTrail.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this audit trail.
	*
	* @param updatedBy the updated by of this audit trail
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_auditTrail.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the user action of this audit trail.
	*
	* @param userAction the user action of this audit trail
	*/
	@Override
	public void setUserAction(java.lang.String userAction) {
		_auditTrail.setUserAction(userAction);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AuditTrail> toCacheModel() {
		return _auditTrail.toCacheModel();
	}

	@Override
	public AuditTrail toEscapedModel() {
		return new AuditTrailWrapper(_auditTrail.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _auditTrail.toString();
	}

	@Override
	public AuditTrail toUnescapedModel() {
		return new AuditTrailWrapper(_auditTrail.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _auditTrail.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuditTrailWrapper)) {
			return false;
		}

		AuditTrailWrapper auditTrailWrapper = (AuditTrailWrapper)obj;

		if (Objects.equals(_auditTrail, auditTrailWrapper._auditTrail)) {
			return true;
		}

		return false;
	}

	@Override
	public AuditTrail getWrappedModel() {
		return _auditTrail;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _auditTrail.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _auditTrail.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_auditTrail.resetOriginalValues();
	}

	private final AuditTrail _auditTrail;
}