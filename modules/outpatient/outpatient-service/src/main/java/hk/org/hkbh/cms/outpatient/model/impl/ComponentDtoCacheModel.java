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

import hk.org.hkbh.cms.outpatient.model.ComponentDto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ComponentDto in entity cache.
 *
 * @author Dave Man
 * @see ComponentDto
 * @generated
 */
@ProviderType
public class ComponentDtoCacheModel implements CacheModel<ComponentDto>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentDtoCacheModel)) {
			return false;
		}

		ComponentDtoCacheModel componentDtoCacheModel = (ComponentDtoCacheModel)obj;

		if (id == componentDtoCacheModel.id) {
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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", componentCode=");
		sb.append(componentCode);
		sb.append(", componentName=");
		sb.append(componentName);
		sb.append(", componentTypeCodeId=");
		sb.append(componentTypeCodeId);
		sb.append(", detailCode=");
		sb.append(detailCode);
		sb.append(", codeDetailSeq=");
		sb.append(codeDetailSeq);
		sb.append(", codeDetailDisplayTextEn=");
		sb.append(codeDetailDisplayTextEn);
		sb.append(", codeDetailDisplayTextChi=");
		sb.append(codeDetailDisplayTextChi);
		sb.append(", componentSeq=");
		sb.append(componentSeq);
		sb.append(", isMenuItem=");
		sb.append(isMenuItem);
		sb.append(", componentDesc=");
		sb.append(componentDesc);
		sb.append(", url=");
		sb.append(url);
		sb.append(", componentLevel=");
		sb.append(componentLevel);
		sb.append(", upComponentId=");
		sb.append(upComponentId);
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
	public ComponentDto toEntityModel() {
		ComponentDtoImpl componentDtoImpl = new ComponentDtoImpl();

		componentDtoImpl.setId(id);

		if (componentCode == null) {
			componentDtoImpl.setComponentCode("");
		}
		else {
			componentDtoImpl.setComponentCode(componentCode);
		}

		if (componentName == null) {
			componentDtoImpl.setComponentName("");
		}
		else {
			componentDtoImpl.setComponentName(componentName);
		}

		componentDtoImpl.setComponentTypeCodeId(componentTypeCodeId);

		if (detailCode == null) {
			componentDtoImpl.setDetailCode("");
		}
		else {
			componentDtoImpl.setDetailCode(detailCode);
		}

		componentDtoImpl.setCodeDetailSeq(codeDetailSeq);

		if (codeDetailDisplayTextEn == null) {
			componentDtoImpl.setCodeDetailDisplayTextEn("");
		}
		else {
			componentDtoImpl.setCodeDetailDisplayTextEn(codeDetailDisplayTextEn);
		}

		if (codeDetailDisplayTextChi == null) {
			componentDtoImpl.setCodeDetailDisplayTextChi("");
		}
		else {
			componentDtoImpl.setCodeDetailDisplayTextChi(codeDetailDisplayTextChi);
		}

		componentDtoImpl.setComponentSeq(componentSeq);
		componentDtoImpl.setIsMenuItem(isMenuItem);

		if (componentDesc == null) {
			componentDtoImpl.setComponentDesc("");
		}
		else {
			componentDtoImpl.setComponentDesc(componentDesc);
		}

		if (url == null) {
			componentDtoImpl.setUrl("");
		}
		else {
			componentDtoImpl.setUrl(url);
		}

		componentDtoImpl.setComponentLevel(componentLevel);
		componentDtoImpl.setUpComponentId(upComponentId);

		if (createDate == Long.MIN_VALUE) {
			componentDtoImpl.setCreateDate(null);
		}
		else {
			componentDtoImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			componentDtoImpl.setUpdateDate(null);
		}
		else {
			componentDtoImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			componentDtoImpl.setCreatedBy("");
		}
		else {
			componentDtoImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			componentDtoImpl.setUpdatedBy("");
		}
		else {
			componentDtoImpl.setUpdatedBy(updatedBy);
		}

		componentDtoImpl.resetOriginalValues();

		return componentDtoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		componentCode = objectInput.readUTF();
		componentName = objectInput.readUTF();

		componentTypeCodeId = objectInput.readLong();
		detailCode = objectInput.readUTF();

		codeDetailSeq = objectInput.readInt();
		codeDetailDisplayTextEn = objectInput.readUTF();
		codeDetailDisplayTextChi = objectInput.readUTF();

		componentSeq = objectInput.readInt();

		isMenuItem = objectInput.readBoolean();
		componentDesc = objectInput.readUTF();
		url = objectInput.readUTF();

		componentLevel = objectInput.readInt();

		upComponentId = objectInput.readLong();
		createDate = objectInput.readLong();
		updateDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (componentCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(componentCode);
		}

		if (componentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(componentName);
		}

		objectOutput.writeLong(componentTypeCodeId);

		if (detailCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(detailCode);
		}

		objectOutput.writeInt(codeDetailSeq);

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

		objectOutput.writeInt(componentSeq);

		objectOutput.writeBoolean(isMenuItem);

		if (componentDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(componentDesc);
		}

		if (url == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeInt(componentLevel);

		objectOutput.writeLong(upComponentId);
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
	public String componentCode;
	public String componentName;
	public long componentTypeCodeId;
	public String detailCode;
	public int codeDetailSeq;
	public String codeDetailDisplayTextEn;
	public String codeDetailDisplayTextChi;
	public int componentSeq;
	public boolean isMenuItem;
	public String componentDesc;
	public String url;
	public int componentLevel;
	public long upComponentId;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}