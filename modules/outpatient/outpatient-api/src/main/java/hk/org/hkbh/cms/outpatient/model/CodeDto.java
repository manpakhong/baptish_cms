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
 * The extended model interface for the CodeDto service. Represents a row in the &quot;Op_CodeDto&quot; database table, with each column mapped to a property of this class.
 *
 * @author Dave Man
 * @see CodeDtoModel
 * @see hk.org.hkbh.cms.outpatient.model.impl.CodeDtoImpl
 * @see hk.org.hkbh.cms.outpatient.model.impl.CodeDtoModelImpl
 * @generated
 */
@ImplementationClassName("hk.org.hkbh.cms.outpatient.model.impl.CodeDtoImpl")
@ProviderType
public interface CodeDto extends CodeDtoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link hk.org.hkbh.cms.outpatient.model.impl.CodeDtoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CodeDto, Long> ID_ACCESSOR = new Accessor<CodeDto, Long>() {
			@Override
			public Long get(CodeDto codeDto) {
				return codeDto.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CodeDto> getTypeClass() {
				return CodeDto.class;
			}
		};
}