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

import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentDtoPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dave Man
 * @generated
 */
public class ComponentDtoFinderBaseImpl extends BasePersistenceImpl<ComponentDto> {
	public ComponentDtoFinderBaseImpl() {
		setModelClass(ComponentDto.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("componentCode", "component_code");
			dbColumnNames.put("componentName", "component_name");
			dbColumnNames.put("componentTypeCodeId", "component_type_code_id");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("codeDetailSeq", "code_detail_seq");
			dbColumnNames.put("codeDetailDisplayTextEn",
				"code_detail_display_text_en");
			dbColumnNames.put("codeDetailDisplayTextChi",
				"code_detail_display_text_chi");
			dbColumnNames.put("componentSeq", "component_seq");
			dbColumnNames.put("isMenuItem", "is_menu_item");
			dbColumnNames.put("componentDesc", "component_desc");
			dbColumnNames.put("componentLevel", "component_level");
			dbColumnNames.put("upComponentId", "up_component_id");
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
		return getComponentDtoPersistence().getBadColumnNames();
	}

	/**
	 * Returns the component dto persistence.
	 *
	 * @return the component dto persistence
	 */
	public ComponentDtoPersistence getComponentDtoPersistence() {
		return componentDtoPersistence;
	}

	/**
	 * Sets the component dto persistence.
	 *
	 * @param componentDtoPersistence the component dto persistence
	 */
	public void setComponentDtoPersistence(
		ComponentDtoPersistence componentDtoPersistence) {
		this.componentDtoPersistence = componentDtoPersistence;
	}

	@BeanReference(type = ComponentDtoPersistence.class)
	protected ComponentDtoPersistence componentDtoPersistence;
	private static final Log _log = LogFactoryUtil.getLog(ComponentDtoFinderBaseImpl.class);
}