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

import hk.org.hkbh.cms.outpatient.model.Code;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Code in entity cache.
 *
 * @author Dave Man
 * @see Code
 * @generated
 */
@ProviderType
public class CodeCacheModel implements CacheModel<Code>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CodeCacheModel)) {
			return false;
		}

		CodeCacheModel codeCacheModel = (CodeCacheModel)obj;

		if (id == codeCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", masterCode=");
		sb.append(masterCode);
		sb.append(", display_text=");
		sb.append(display_text);
		sb.append(", active=");
		sb.append(active);
		sb.append(", subcodeEnabled=");
		sb.append(subcodeEnabled);
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
	public Code toEntityModel() {
		CodeImpl codeImpl = new CodeImpl();

		codeImpl.setId(id);

		if (masterCode == null) {
			codeImpl.setMasterCode("");
		}
		else {
			codeImpl.setMasterCode(masterCode);
		}

		codeImpl.setDisplay_text(display_text);
		codeImpl.setActive(active);
		codeImpl.setSubcodeEnabled(subcodeEnabled);

		if (remarks == null) {
			codeImpl.setRemarks("");
		}
		else {
			codeImpl.setRemarks(remarks);
		}

		if (createDate == Long.MIN_VALUE) {
			codeImpl.setCreateDate(null);
		}
		else {
			codeImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			codeImpl.setUpdateDate(null);
		}
		else {
			codeImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			codeImpl.setCreatedBy("");
		}
		else {
			codeImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			codeImpl.setUpdatedBy("");
		}
		else {
			codeImpl.setUpdatedBy(updatedBy);
		}

		codeImpl.resetOriginalValues();

		return codeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		masterCode = objectInput.readUTF();

		display_text = objectInput.readInt();

		active = objectInput.readBoolean();

		subcodeEnabled = objectInput.readBoolean();
		remarks = objectInput.readUTF();
		createDate = objectInput.readLong();
		updateDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (masterCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(masterCode);
		}

		objectOutput.writeInt(display_text);

		objectOutput.writeBoolean(active);

		objectOutput.writeBoolean(subcodeEnabled);

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

	public int id;
	public String masterCode;
	public int display_text;
	public boolean active;
	public boolean subcodeEnabled;
	public String remarks;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}