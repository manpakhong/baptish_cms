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

import hk.org.hkbh.cms.outpatient.model.ComponentControl;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ComponentControl in entity cache.
 *
 * @author Dave Man
 * @see ComponentControl
 * @generated
 */
@ProviderType
public class ComponentControlCacheModel implements CacheModel<ComponentControl>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentControlCacheModel)) {
			return false;
		}

		ComponentControlCacheModel componentControlCacheModel = (ComponentControlCacheModel)obj;

		if (id == componentControlCacheModel.id) {
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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
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
		sb.append(", control_desc=");
		sb.append(control_desc);
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
	public ComponentControl toEntityModel() {
		ComponentControlImpl componentControlImpl = new ComponentControlImpl();

		componentControlImpl.setId(id);
		componentControlImpl.setUserId(userId);
		componentControlImpl.setUserRoleId(userRoleId);
		componentControlImpl.setComponentId(componentId);
		componentControlImpl.setCreate(create);
		componentControlImpl.setRead(read);
		componentControlImpl.setUpdate(update);
		componentControlImpl.setDelete(delete);
		componentControlImpl.setDeny(deny);
		componentControlImpl.setVisible(visible);
		componentControlImpl.setEnable(enable);

		if (control_desc == null) {
			componentControlImpl.setControl_desc("");
		}
		else {
			componentControlImpl.setControl_desc(control_desc);
		}

		if (createDate == Long.MIN_VALUE) {
			componentControlImpl.setCreateDate(null);
		}
		else {
			componentControlImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			componentControlImpl.setUpdateDate(null);
		}
		else {
			componentControlImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			componentControlImpl.setCreatedBy("");
		}
		else {
			componentControlImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			componentControlImpl.setUpdatedBy("");
		}
		else {
			componentControlImpl.setUpdatedBy(updatedBy);
		}

		componentControlImpl.resetOriginalValues();

		return componentControlImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

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
		control_desc = objectInput.readUTF();
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

		objectOutput.writeLong(userRoleId);

		objectOutput.writeLong(componentId);

		objectOutput.writeBoolean(create);

		objectOutput.writeBoolean(read);

		objectOutput.writeBoolean(update);

		objectOutput.writeBoolean(delete);

		objectOutput.writeBoolean(deny);

		objectOutput.writeBoolean(visible);

		objectOutput.writeBoolean(enable);

		if (control_desc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(control_desc);
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
	public long userRoleId;
	public long componentId;
	public boolean create;
	public boolean read;
	public boolean update;
	public boolean delete;
	public boolean deny;
	public boolean visible;
	public boolean enable;
	public String control_desc;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}