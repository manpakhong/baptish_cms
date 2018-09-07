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

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlDtoPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dave Man
 * @generated
 */
public class ComponentControlDtoFinderBaseImpl extends BasePersistenceImpl<ComponentControlDto> {
	public ComponentControlDtoFinderBaseImpl() {
		setModelClass(ComponentControlDto.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("componentCode", "component_code");
			dbColumnNames.put("componentName", "component_name");
			dbColumnNames.put("componentTypeCodeId", "component_type_code_id");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("detailCodeDisplayTextEn",
				"detail_code_display_text_en");
			dbColumnNames.put("detailCodeDisplayTextChi",
				"detail_code_display_text_chi");
			dbColumnNames.put("componentSeq", "component_seq");
			dbColumnNames.put("isMenuItem", "is_menu_item");
			dbColumnNames.put("componentDesc", "component_desc");
			dbColumnNames.put("componentLevel", "component_level");
			dbColumnNames.put("upComponentId", "up_component_id");
			dbColumnNames.put("componentControlId", "component_control_id");
			dbColumnNames.put("userId", "user_id");
			dbColumnNames.put("userRoleId", "user_role_id");
			dbColumnNames.put("componentId", "component_id");
			dbColumnNames.put("controlDesc", "control_desc");
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
		return getComponentControlDtoPersistence().getBadColumnNames();
	}

	/**
	 * Returns the component control dto persistence.
	 *
	 * @return the component control dto persistence
	 */
	public ComponentControlDtoPersistence getComponentControlDtoPersistence() {
		return componentControlDtoPersistence;
	}

	/**
	 * Sets the component control dto persistence.
	 *
	 * @param componentControlDtoPersistence the component control dto persistence
	 */
	public void setComponentControlDtoPersistence(
		ComponentControlDtoPersistence componentControlDtoPersistence) {
		this.componentControlDtoPersistence = componentControlDtoPersistence;
	}

	@BeanReference(type = ComponentControlDtoPersistence.class)
	protected ComponentControlDtoPersistence componentControlDtoPersistence;
	private static final Log _log = LogFactoryUtil.getLog(ComponentControlDtoFinderBaseImpl.class);
}