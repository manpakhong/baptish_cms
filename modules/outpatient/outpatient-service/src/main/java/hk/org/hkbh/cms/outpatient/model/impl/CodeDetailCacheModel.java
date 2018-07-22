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

import hk.org.hkbh.cms.outpatient.model.CodeDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CodeDetail in entity cache.
 *
 * @author Dave Man
 * @see CodeDetail
 * @generated
 */
@ProviderType
public class CodeDetailCacheModel implements CacheModel<CodeDetail>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CodeDetailCacheModel)) {
			return false;
		}

		CodeDetailCacheModel codeDetailCacheModel = (CodeDetailCacheModel)obj;

		if (id == codeDetailCacheModel.id) {
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
		sb.append(", codeId=");
		sb.append(codeId);
		sb.append(", detailCode=");
		sb.append(detailCode);
		sb.append(", seq=");
		sb.append(seq);
		sb.append(", displayText=");
		sb.append(displayText);
		sb.append(", active=");
		sb.append(active);
		sb.append(", level=");
		sb.append(level);
		sb.append(", upLevelId=");
		sb.append(upLevelId);
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
	public CodeDetail toEntityModel() {
		CodeDetailImpl codeDetailImpl = new CodeDetailImpl();

		codeDetailImpl.setId(id);

		if (codeId == null) {
			codeDetailImpl.setCodeId("");
		}
		else {
			codeDetailImpl.setCodeId(codeId);
		}

		codeDetailImpl.setDetailCode(detailCode);
		codeDetailImpl.setSeq(seq);

		if (displayText == null) {
			codeDetailImpl.setDisplayText("");
		}
		else {
			codeDetailImpl.setDisplayText(displayText);
		}

		codeDetailImpl.setActive(active);
		codeDetailImpl.setLevel(level);
		codeDetailImpl.setUpLevelId(upLevelId);

		if (remarks == null) {
			codeDetailImpl.setRemarks("");
		}
		else {
			codeDetailImpl.setRemarks(remarks);
		}

		if (createDate == Long.MIN_VALUE) {
			codeDetailImpl.setCreateDate(null);
		}
		else {
			codeDetailImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			codeDetailImpl.setUpdateDate(null);
		}
		else {
			codeDetailImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			codeDetailImpl.setCreatedBy("");
		}
		else {
			codeDetailImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			codeDetailImpl.setUpdatedBy("");
		}
		else {
			codeDetailImpl.setUpdatedBy(updatedBy);
		}

		codeDetailImpl.resetOriginalValues();

		return codeDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		codeId = objectInput.readUTF();

		detailCode = objectInput.readInt();

		seq = objectInput.readInt();
		displayText = objectInput.readUTF();

		active = objectInput.readBoolean();

		level = objectInput.readInt();

		upLevelId = objectInput.readInt();
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

		if (codeId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeId);
		}

		objectOutput.writeInt(detailCode);

		objectOutput.writeInt(seq);

		if (displayText == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(displayText);
		}

		objectOutput.writeBoolean(active);

		objectOutput.writeInt(level);

		objectOutput.writeInt(upLevelId);

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
	public String codeId;
	public int detailCode;
	public int seq;
	public String displayText;
	public boolean active;
	public int level;
	public int upLevelId;
	public String remarks;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}