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

package hk.org.hkbh.cms.outpatient.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import hk.org.hkbh.cms.outpatient.model.CodeDto;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDtoPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dave Man
 * @generated
 */
public class CodeDtoFinderBaseImpl extends BasePersistenceImpl<CodeDto> {
	public CodeDtoFinderBaseImpl() {
		setModelClass(CodeDto.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "code_detail_id");
			dbColumnNames.put("masterCode", "master_code");
			dbColumnNames.put("codeDisplayTextEn", "code_display_text_en");
			dbColumnNames.put("codeDisplayTextChi", "code_display_text_chi");
			dbColumnNames.put("codeActive", "code_active");
			dbColumnNames.put("subcodeEnabled", "subcode_enabled");
			dbColumnNames.put("codeRemarks", "code_remarks");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("codeDetailDisplayTextEn",
				"code_detail_display_text_en");
			dbColumnNames.put("codeDetailDisplayTextChi",
				"code_detail_display_text_chi");
			dbColumnNames.put("codeDetailActive", "code_detail_active");
			dbColumnNames.put("upLevelId", "up_level_id");
			dbColumnNames.put("codeDetailRemarks", "code_detail_remarks");
			dbColumnNames.put("createDate", "create_date");
			dbColumnNames.put("updateDate", "update_date");
			dbColumnNames.put("createdBy", "created_by");
			dbColumnNames.put("updatedBy", "updated_by");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getCodeDtoPersistence().getBadColumnNames();
	}

	/**
	 * Returns the code dto persistence.
	 *
	 * @return the code dto persistence
	 */
	public CodeDtoPersistence getCodeDtoPersistence() {
		return codeDtoPersistence;
	}

	/**
	 * Sets the code dto persistence.
	 *
	 * @param codeDtoPersistence the code dto persistence
	 */
	public void setCodeDtoPersistence(CodeDtoPersistence codeDtoPersistence) {
		this.codeDtoPersistence = codeDtoPersistence;
	}

	@BeanReference(type = CodeDtoPersistence.class)
	protected CodeDtoPersistence codeDtoPersistence;
	private static final Log _log = LogFactoryUtil.getLog(CodeDtoFinderBaseImpl.class);
}