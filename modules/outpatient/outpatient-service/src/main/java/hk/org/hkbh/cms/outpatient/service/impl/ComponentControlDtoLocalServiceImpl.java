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

package hk.org.hkbh.cms.outpatient.service.impl;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.service.base.ComponentControlDtoLocalServiceBaseImpl;

/**
 * The implementation of the component control dto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlDtoLocalServiceBaseImpl
 * @see hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalServiceUtil
 */
public class ComponentControlDtoLocalServiceImpl
	extends ComponentControlDtoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalServiceUtil} to access the component control dto local service.
	 */
	public List<ComponentControlDto> getComponentControlDtoList(Long userRoleId, Long userId){
		return componentControlDtoFinder.getComponentControlDtoList(userRoleId, userId);
	}

}