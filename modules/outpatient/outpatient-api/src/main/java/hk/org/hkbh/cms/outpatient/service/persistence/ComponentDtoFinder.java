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

package hk.org.hkbh.cms.outpatient.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author Dave Man
 * @generated
 */
@ProviderType
public interface ComponentDtoFinder {
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentDto> getComponentDtoList(
		hk.org.hkbh.cms.outpatient.so.ComponentDtoSo so);
}