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

import hk.org.hkbh.cms.outpatient.model.CodeDto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CodeDto in entity cache.
 *
 * @author Dave Man
 * @see CodeDto
 * @generated
 */
@ProviderType
public class CodeDtoCacheModel implements CacheModel<CodeDto>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CodeDtoCacheModel)) {
			return false;
		}

		CodeDtoCacheModel codeDtoCacheModel = (CodeDtoCacheModel)obj;

		if (id == codeDtoCacheModel.id) {
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
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(id);
		sb.append(", masterCode=");
		sb.append(masterCode);
		sb.append(", codeDisplayTextEn=");
		sb.append(codeDisplayTextEn);
		sb.append(", codeDisplayTextChi=");
		sb.append(codeDisplayTextChi);
		sb.append(", codeActive=");
		sb.append(codeActive);
		sb.append(", subcodeEnabled=");
		sb.append(subcodeEnabled);
		sb.append(", codeRemarks=");
		sb.append(codeRemarks);
		sb.append(", detailCode=");
		sb.append(detailCode);
		sb.append(", seq=");
		sb.append(seq);
		sb.append(", codeDetailDisplayTextEn=");
		sb.append(codeDetailDisplayTextEn);
		sb.append(", codeDetailDisplayTextChi=");
		sb.append(codeDetailDisplayTextChi);
		sb.append(", codeDetailActive=");
		sb.append(codeDetailActive);
		sb.append(", level=");
		sb.append(level);
		sb.append(", upLevelId=");
		sb.append(upLevelId);
		sb.append(", codeDetailRemarks=");
		sb.append(codeDetailRemarks);
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
	public CodeDto toEntityModel() {
		CodeDtoImpl codeDtoImpl = new CodeDtoImpl();

		codeDtoImpl.setId(id);

		if (masterCode == null) {
			codeDtoImpl.setMasterCode("");
		}
		else {
			codeDtoImpl.setMasterCode(masterCode);
		}

		if (codeDisplayTextEn == null) {
			codeDtoImpl.setCodeDisplayTextEn("");
		}
		else {
			codeDtoImpl.setCodeDisplayTextEn(codeDisplayTextEn);
		}

		if (codeDisplayTextChi == null) {
			codeDtoImpl.setCodeDisplayTextChi("");
		}
		else {
			codeDtoImpl.setCodeDisplayTextChi(codeDisplayTextChi);
		}

		codeDtoImpl.setCodeActive(codeActive);
		codeDtoImpl.setSubcodeEnabled(subcodeEnabled);

		if (codeRemarks == null) {
			codeDtoImpl.setCodeRemarks("");
		}
		else {
			codeDtoImpl.setCodeRemarks(codeRemarks);
		}

		if (detailCode == null) {
			codeDtoImpl.setDetailCode("");
		}
		else {
			codeDtoImpl.setDetailCode(detailCode);
		}

		codeDtoImpl.setSeq(seq);

		if (codeDetailDisplayTextEn == null) {
			codeDtoImpl.setCodeDetailDisplayTextEn("");
		}
		else {
			codeDtoImpl.setCodeDetailDisplayTextEn(codeDetailDisplayTextEn);
		}

		if (codeDetailDisplayTextChi == null) {
			codeDtoImpl.setCodeDetailDisplayTextChi("");
		}
		else {
			codeDtoImpl.setCodeDetailDisplayTextChi(codeDetailDisplayTextChi);
		}

		codeDtoImpl.setCodeDetailActive(codeDetailActive);
		codeDtoImpl.setLevel(level);
		codeDtoImpl.setUpLevelId(upLevelId);

		if (codeDetailRemarks == null) {
			codeDtoImpl.setCodeDetailRemarks("");
		}
		else {
			codeDtoImpl.setCodeDetailRemarks(codeDetailRemarks);
		}

		if (createDate == Long.MIN_VALUE) {
			codeDtoImpl.setCreateDate(null);
		}
		else {
			codeDtoImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			codeDtoImpl.setUpdateDate(null);
		}
		else {
			codeDtoImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			codeDtoImpl.setCreatedBy("");
		}
		else {
			codeDtoImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			codeDtoImpl.setUpdatedBy("");
		}
		else {
			codeDtoImpl.setUpdatedBy(updatedBy);
		}

		codeDtoImpl.resetOriginalValues();

		return codeDtoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		masterCode = objectInput.readUTF();
		codeDisplayTextEn = objectInput.readUTF();
		codeDisplayTextChi = objectInput.readUTF();

		codeActive = objectInput.readBoolean();

		subcodeEnabled = objectInput.readBoolean();
		codeRemarks = objectInput.readUTF();
		detailCode = objectInput.readUTF();

		seq = objectInput.readInt();
		codeDetailDisplayTextEn = objectInput.readUTF();
		codeDetailDisplayTextChi = objectInput.readUTF();

		codeDetailActive = objectInput.readBoolean();

		level = objectInput.readInt();

		upLevelId = objectInput.readInt();
		codeDetailRemarks = objectInput.readUTF();
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

		if (codeDisplayTextEn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeDisplayTextEn);
		}

		if (codeDisplayTextChi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeDisplayTextChi);
		}

		objectOutput.writeBoolean(codeActive);

		objectOutput.writeBoolean(subcodeEnabled);

		if (codeRemarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeRemarks);
		}

		if (detailCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(detailCode);
		}

		objectOutput.writeInt(seq);

		if (codeDetailDisplayTextEn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeDetailDisplayTextEn);
		}

		if (codeDetailDisplayTextChi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeDetailDisplayTextChi);
		}

		objectOutput.writeBoolean(codeDetailActive);

		objectOutput.writeInt(level);

		objectOutput.writeInt(upLevelId);

		if (codeDetailRemarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codeDetailRemarks);
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
	public String codeDisplayTextEn;
	public String codeDisplayTextChi;
	public boolean codeActive;
	public boolean subcodeEnabled;
	public String codeRemarks;
	public String detailCode;
	public int seq;
	public String codeDetailDisplayTextEn;
	public String codeDetailDisplayTextChi;
	public boolean codeDetailActive;
	public int level;
	public int upLevelId;
	public String codeDetailRemarks;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}