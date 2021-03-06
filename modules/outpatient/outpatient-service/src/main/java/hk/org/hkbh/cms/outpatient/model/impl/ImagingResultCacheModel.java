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

import hk.org.hkbh.cms.outpatient.model.ImagingResult;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ImagingResult in entity cache.
 *
 * @author Dave Man
 * @see ImagingResult
 * @generated
 */
@ProviderType
public class ImagingResultCacheModel implements CacheModel<ImagingResult>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImagingResultCacheModel)) {
			return false;
		}

		ImagingResultCacheModel imagingResultCacheModel = (ImagingResultCacheModel)obj;

		if (id == imagingResultCacheModel.id) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", patientId=");
		sb.append(patientId);
		sb.append(", episodeId=");
		sb.append(episodeId);
		sb.append(", orderId=");
		sb.append(orderId);
		sb.append(", labName=");
		sb.append(labName);
		sb.append(", reportName=");
		sb.append(reportName);
		sb.append(", labResultTypeCodeId=");
		sb.append(labResultTypeCodeId);
		sb.append(", severityCodeId=");
		sb.append(severityCodeId);
		sb.append(", remarks=");
		sb.append(remarks);
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
	public ImagingResult toEntityModel() {
		ImagingResultImpl imagingResultImpl = new ImagingResultImpl();

		imagingResultImpl.setId(id);
		imagingResultImpl.setPatientId(patientId);
		imagingResultImpl.setEpisodeId(episodeId);
		imagingResultImpl.setOrderId(orderId);
		imagingResultImpl.setLabName(labName);
		imagingResultImpl.setReportName(reportName);
		imagingResultImpl.setLabResultTypeCodeId(labResultTypeCodeId);
		imagingResultImpl.setSeverityCodeId(severityCodeId);

		if (remarks == null) {
			imagingResultImpl.setRemarks("");
		}
		else {
			imagingResultImpl.setRemarks(remarks);
		}

		if (createDate == Long.MIN_VALUE) {
			imagingResultImpl.setCreateDate(null);
		}
		else {
			imagingResultImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			imagingResultImpl.setUpdateDate(null);
		}
		else {
			imagingResultImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			imagingResultImpl.setCreatedBy("");
		}
		else {
			imagingResultImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			imagingResultImpl.setUpdatedBy("");
		}
		else {
			imagingResultImpl.setUpdatedBy(updatedBy);
		}

		imagingResultImpl.resetOriginalValues();

		return imagingResultImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		patientId = objectInput.readLong();

		episodeId = objectInput.readLong();

		orderId = objectInput.readLong();

		labName = objectInput.readBoolean();

		reportName = objectInput.readBoolean();

		labResultTypeCodeId = objectInput.readLong();

		severityCodeId = objectInput.readLong();
		remarks = objectInput.readUTF();
		createDate = objectInput.readLong();
		updateDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(patientId);

		objectOutput.writeLong(episodeId);

		objectOutput.writeLong(orderId);

		objectOutput.writeBoolean(labName);

		objectOutput.writeBoolean(reportName);

		objectOutput.writeLong(labResultTypeCodeId);

		objectOutput.writeLong(severityCodeId);

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
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
	public long patientId;
	public long episodeId;
	public long orderId;
	public boolean labName;
	public boolean reportName;
	public long labResultTypeCodeId;
	public long severityCodeId;
	public String remarks;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}