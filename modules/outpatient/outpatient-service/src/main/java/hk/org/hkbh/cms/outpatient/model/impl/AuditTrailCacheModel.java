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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import hk.org.hkbh.cms.outpatient.model.AuditTrail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AuditTrail in entity cache.
 *
 * @author Dave Man
 * @see AuditTrail
 * @generated
 */
@ProviderType
public class AuditTrailCacheModel implements CacheModel<AuditTrail>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuditTrailCacheModel)) {
			return false;
		}

		AuditTrailCacheModel auditTrailCacheModel = (AuditTrailCacheModel)obj;

		if (id == auditTrailCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", functionId=");
		sb.append(functionId);
		sb.append(", patientId=");
		sb.append(patientId);
		sb.append(", episodeId=");
		sb.append(episodeId);
		sb.append(", className=");
		sb.append(className);
		sb.append(", userAction=");
		sb.append(userAction);
		sb.append(", beforeImageInJson=");
		sb.append(beforeImageInJson);
		sb.append(", afterImageInJson=");
		sb.append(afterImageInJson);
		sb.append(", isDeleted=");
		sb.append(isDeleted);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", updateDate=");
		sb.append(updateDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AuditTrail toEntityModel() {
		AuditTrailImpl auditTrailImpl = new AuditTrailImpl();

		auditTrailImpl.setId(id);
		auditTrailImpl.setUserId(userId);
		auditTrailImpl.setFunctionId(functionId);
		auditTrailImpl.setPatientId(patientId);
		auditTrailImpl.setEpisodeId(episodeId);

		if (className == null) {
			auditTrailImpl.setClassName("");
		}
		else {
			auditTrailImpl.setClassName(className);
		}

		if (userAction == null) {
			auditTrailImpl.setUserAction("");
		}
		else {
			auditTrailImpl.setUserAction(userAction);
		}

		if (beforeImageInJson == null) {
			auditTrailImpl.setBeforeImageInJson("");
		}
		else {
			auditTrailImpl.setBeforeImageInJson(beforeImageInJson);
		}

		if (afterImageInJson == null) {
			auditTrailImpl.setAfterImageInJson("");
		}
		else {
			auditTrailImpl.setAfterImageInJson(afterImageInJson);
		}

		if (isDeleted == null) {
			auditTrailImpl.setIsDeleted("");
		}
		else {
			auditTrailImpl.setIsDeleted(isDeleted);
		}

		if (createDate == Long.MIN_VALUE) {
			auditTrailImpl.setCreateDate(null);
		}
		else {
			auditTrailImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			auditTrailImpl.setUpdateDate(null);
		}
		else {
			auditTrailImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			auditTrailImpl.setCreatedBy("");
		}
		else {
			auditTrailImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			auditTrailImpl.setUpdatedBy("");
		}
		else {
			auditTrailImpl.setUpdatedBy(updatedBy);
		}

		auditTrailImpl.resetOriginalValues();

		return auditTrailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		userId = objectInput.readLong();

		functionId = objectInput.readLong();

		patientId = objectInput.readLong();

		episodeId = objectInput.readLong();
		className = objectInput.readUTF();
		userAction = objectInput.readUTF();
		beforeImageInJson = objectInput.readUTF();
		afterImageInJson = objectInput.readUTF();
		isDeleted = objectInput.readUTF();
		createDate = objectInput.readLong();
		updateDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(functionId);

		objectOutput.writeLong(patientId);

		objectOutput.writeLong(episodeId);

		if (className == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(className);
		}

		if (userAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userAction);
		}

		if (beforeImageInJson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(beforeImageInJson);
		}

		if (afterImageInJson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(afterImageInJson);
		}

		if (isDeleted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isDeleted);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(updateDate);

		if (createdBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		if (updatedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBy);
		}
	}

	public long id;
	public long userId;
	public long functionId;
	public long patientId;
	public long episodeId;
	public String className;
	public String userAction;
	public String beforeImageInJson;
	public String afterImageInJson;
	public String isDeleted;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}