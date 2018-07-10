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

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ClinicalNoteTemplate in entity cache.
 *
 * @author Dave Man
 * @see ClinicalNoteTemplate
 * @generated
 */
@ProviderType
public class ClinicalNoteTemplateCacheModel implements CacheModel<ClinicalNoteTemplate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClinicalNoteTemplateCacheModel)) {
			return false;
		}

		ClinicalNoteTemplateCacheModel clinicalNoteTemplateCacheModel = (ClinicalNoteTemplateCacheModel)obj;

		if (id == clinicalNoteTemplateCacheModel.id) {
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
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", templateTypeCodeId=");
		sb.append(templateTypeCodeId);
		sb.append(", templateName=");
		sb.append(templateName);
		sb.append(", templateContent=");
		sb.append(templateContent);
		sb.append(", templateContentHtml=");
		sb.append(templateContentHtml);
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
	public ClinicalNoteTemplate toEntityModel() {
		ClinicalNoteTemplateImpl clinicalNoteTemplateImpl = new ClinicalNoteTemplateImpl();

		clinicalNoteTemplateImpl.setId(id);
		clinicalNoteTemplateImpl.setUserId(userId);
		clinicalNoteTemplateImpl.setTemplateTypeCodeId(templateTypeCodeId);

		if (templateName == null) {
			clinicalNoteTemplateImpl.setTemplateName("");
		}
		else {
			clinicalNoteTemplateImpl.setTemplateName(templateName);
		}

		if (templateContent == null) {
			clinicalNoteTemplateImpl.setTemplateContent("");
		}
		else {
			clinicalNoteTemplateImpl.setTemplateContent(templateContent);
		}

		if (templateContentHtml == null) {
			clinicalNoteTemplateImpl.setTemplateContentHtml("");
		}
		else {
			clinicalNoteTemplateImpl.setTemplateContentHtml(templateContentHtml);
		}

		if (createDate == Long.MIN_VALUE) {
			clinicalNoteTemplateImpl.setCreateDate(null);
		}
		else {
			clinicalNoteTemplateImpl.setCreateDate(new Date(createDate));
		}

		if (updateDate == Long.MIN_VALUE) {
			clinicalNoteTemplateImpl.setUpdateDate(null);
		}
		else {
			clinicalNoteTemplateImpl.setUpdateDate(new Date(updateDate));
		}

		if (createdBy == null) {
			clinicalNoteTemplateImpl.setCreatedBy("");
		}
		else {
			clinicalNoteTemplateImpl.setCreatedBy(createdBy);
		}

		if (updatedBy == null) {
			clinicalNoteTemplateImpl.setUpdatedBy("");
		}
		else {
			clinicalNoteTemplateImpl.setUpdatedBy(updatedBy);
		}

		clinicalNoteTemplateImpl.resetOriginalValues();

		return clinicalNoteTemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();

		userId = objectInput.readInt();

		templateTypeCodeId = objectInput.readInt();
		templateName = objectInput.readUTF();
		templateContent = objectInput.readUTF();
		templateContentHtml = objectInput.readUTF();
		createDate = objectInput.readLong();
		updateDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		objectOutput.writeInt(userId);

		objectOutput.writeInt(templateTypeCodeId);

		if (templateName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(templateName);
		}

		if (templateContent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(templateContent);
		}

		if (templateContentHtml == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(templateContentHtml);
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
	public int userId;
	public int templateTypeCodeId;
	public String templateName;
	public String templateContent;
	public String templateContentHtml;
	public long createDate;
	public long updateDate;
	public String createdBy;
	public String updatedBy;
}