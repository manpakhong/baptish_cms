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

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ComponentControlDto in entity cache.
 *
 * @author Dave Man
 * @see ComponentControlDto
 * @generated
 */
@ProviderType
public class ComponentControlDtoCacheModel implements CacheModel<ComponentControlDto>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentControlDtoCacheModel)) {
			return false;
		}

		ComponentControlDtoCacheModel componentControlDtoCacheModel = (ComponentControlDtoCacheModel)obj;

		if (id == componentControlDtoCacheModel.id) {
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
		StringBundler sb = new StringBundler(59);

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
		sb.append(", detailCodeDisplayTextEn=");
		sb.append(detailCodeDisplayTextEn);
		sb.append(", detailCodeDisplayTextChi=");
		sb.append(detailCodeDisplayTextChi);
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
		sb.append(", componentControlId=");
		sb.append(componentControlId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userRoleId=");
		sb.append(userRoleId);
		sb.append(", componentId=");
		sb.append(componentId);
		sb.append(", create=");
		sb.append(create);
		sb.append(", read=");
		sb.append(read);
		sb.append(", update=");
		sb.append(update);
		sb.append(", delete=");
		sb.append(delete);
		sb.append(", deny=");
		sb.append(deny);
		sb.append(", visible=");
		sb.append(visible);
		sb.append(", enable=");
		sb.append(enable);
		sb.append(", controlDesc=");
		sb.append(controlDesc);
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
	public ComponentControlDto toEntityModel() {
		ComponentControlDtoImpl componentControlDtoImpl = new ComponentControlDtoImpl();

		componentControlDtoImpl.setId(id);

		if (componentCode == null) {
			componentControlDtoImpl.setComponentCode("");
		}
		else {
			componentControlDtoImpl.setComponentCode(componentCode);
		}

		if (componentName == null) {
			componentControlDtoImpl.setComponentName("");
		}
		else {
			componentControlDtoImpl.setComponentName(componentName);
		}

		componentControlDtoImpl.setComponentTypeCodeId(componentTypeCodeId);

		if (detailCode == null) {
			componentControlDtoImpl.setDetailCode("");
		}
		else {
			componentControlDtoImpl.setDetailCode(detailCode);
		}

		if (detailCodeDisplayTextEn == null) {
			componentControlDtoImpl.setDetailCodeDisplayTextEn("");
		}
		else {
			componentControlDtoImpl.setDetailCodeDisplayTextEn(detailCodeDisplayTextEn);
		}

		if (detailCodeDisplayTextChi == null) {
			componentControlDtoImpl.setDetailCodeDisplayTextChi("");
		}
		else {
			componentControlDtoImpl.setDetailCodeDisplayTextChi(detailCodeDisplayTextChi);
		}

		componentControlDtoImpl.setComponentSeq(componentSeq);
		componentControlDtoImpl.setIsMenuItem(isMenuItem);

		if (componentDesc == null) {
			componentControlDtoImpl.setComponentDesc("");
		}
		else {
			componentControlDtoImpl.setComponentDesc(componentDesc);
		}

		if (url == null) {
			componentControlDtoImpl.setUrl("");
		}
		else {
			componentControlDtoImpl.setUrl(url);
		}

		componentControlDtoImpl.setComponentLevel(componentLevel);
		componentControlDtoImpl.setUpComponentId(upComponentId);
		componentControlDtoImpl.setComponentControlId(componentControlId);
		componentControlDtoImpl.setUserId(userId);
		componentControlDtoImpl.setUserRoleId(userRoleId);
		componentControlDtoImpl.setComponentId(componentId);
		componentControlDtoImpl.setCreate(create);
		componentControlDtoImpl.setRead(read);
		componentControlDtoImpl.setUpdate(update);
		componentControlDtoImpl.setDelete(delete);
		componentControlDtoImpl.setDeny(deny);
		componentControlDtoImpl.setVisible(visible);
		componentControlDtoImpl.setEnable(enable);

		if (controlDesc == null) {
			componentControlDtoImpl.setControlDesc("");
		}
		else {
			componentControlDtoImpl.setControlDesc(controlDesc);
		}

		if (createDate == Long.MIN_VALUE) {
			componentControlDtoImpl.setCreateDate(null);
		}
		else {
			componentControlDtoImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			componentControlDtoImpl.setUpdateDate(null);
		}
		else {
			componentControlDtoImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			componentControlDtoImpl.setCreatedBy("");
		}
		else {
			componentControlDtoImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			componentControlDtoImpl.setUpdatedBy("");
		}
		else {
			componentControlDtoImpl.setUpdatedBy(updatedBy);
		}

		componentControlDtoImpl.resetOriginalValues();

		return componentControlDtoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		componentCode = objectInput.readUTF();
		componentName = objectInput.readUTF();

		componentTypeCodeId = objectInput.readLong();
		detailCode = objectInput.readUTF();
		detailCodeDisplayTextEn = objectInput.readUTF();
		detailCodeDisplayTextChi = objectInput.readUTF();

		componentSeq = objectInput.readInt();

		isMenuItem = objectInput.readBoolean();
		componentDesc = objectInput.readUTF();
		url = objectInput.readUTF();

		componentLevel = objectInput.readInt();

		upComponentId = objectInput.readLong();

		componentControlId = objectInput.readLong();

		userId = objectInput.readLong();

		userRoleId = objectInput.readLong();

		componentId = objectInput.readLong();

		create = objectInput.readBoolean();

		read = objectInput.readBoolean();

		update = objectInput.readBoolean();

		delete = objectInput.readBoolean();

		deny = objectInput.readBoolean();

		visible = objectInput.readBoolean();

		enable = objectInput.readBoolean();
		controlDesc = objectInput.readUTF();
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

		if (detailCodeDisplayTextEn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(detailCodeDisplayTextEn);
		}

		if (detailCodeDisplayTextChi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(detailCodeDisplayTextChi);
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

		objectOutput.writeLong(componentControlId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(userRoleId);

		objectOutput.writeLong(componentId);

		objectOutput.writeBoolean(create);

		objectOutput.writeBoolean(read);

		objectOutput.writeBoolean(update);

		objectOutput.writeBoolean(delete);

		objectOutput.writeBoolean(deny);

		objectOutput.writeBoolean(visible);

		objectOutput.writeBoolean(enable);

		if (controlDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlDesc);
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
	public String componentCode;
	public String componentName;
	public long componentTypeCodeId;
	public String detailCode;
	public String detailCodeDisplayTextEn;
	public String detailCodeDisplayTextChi;
	public int componentSeq;
	public boolean isMenuItem;
	public String componentDesc;
	public String url;
	public int componentLevel;
	public long upComponentId;
	public long componentControlId;
	public long userId;
	public long userRoleId;
	public long componentId;
	public boolean create;
	public boolean read;
	public boolean update;
	public boolean delete;
	public boolean deny;
	public boolean visible;
	public boolean enable;
	public String controlDesc;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}