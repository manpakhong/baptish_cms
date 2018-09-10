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
 * The extended model interface for the Code service. Represents a row in the &quot;code&quot; database table, with each column mapped to a property of this class.
 *
 * @author Dave Man
 * @see CodeModel
 * @see hk.org.hkbh.cms.outpatient.model.impl.CodeImpl
 * @see hk.org.hkbh.cms.outpatient.model.impl.CodeModelImpl
 * @generated
 */
@ImplementationClassName("hk.org.hkbh.cms.outpatient.model.impl.CodeImpl")
@ProviderType
public interface Code extends CodeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link hk.org.hkbh.cms.outpatient.model.impl.CodeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Code, Long> ID_ACCESSOR = new Accessor<Code, Long>() {
			@Override
			public Long get(Code code) {
				return code.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Code> getTypeClass() {
				return Code.class;
			}
		};
}