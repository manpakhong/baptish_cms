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

package hk.org.hkbh.cms.outpatient.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ComponentControlDto service. Represents a row in the &quot;Op_ComponentControlDto&quot; database table, with each column mapped to a property of this class.
 *
 * @author Dave Man
 * @see ComponentControlDtoModel
 * @see hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoImpl
 * @see hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoModelImpl
 * @generated
 */
@ImplementationClassName("hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoImpl")
@ProviderType
public interface ComponentControlDto extends ComponentControlDtoModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ComponentControlDto, Long> ID_ACCESSOR = new Accessor<ComponentControlDto, Long>() {
			@Override
			public Long get(ComponentControlDto componentControlDto) {
				return componentControlDto.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ComponentControlDto> getTypeClass() {
				return ComponentControlDto.class;
			}
		};
}