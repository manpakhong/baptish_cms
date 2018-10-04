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
 * The extended model interface for the AuditTrail service. Represents a row in the &quot;audit_trail&quot; database table, with each column mapped to a property of this class.
 *
 * @author Dave Man
 * @see AuditTrailModel
 * @see hk.org.hkbh.cms.outpatient.model.impl.AuditTrailImpl
 * @see hk.org.hkbh.cms.outpatient.model.impl.AuditTrailModelImpl
 * @generated
 */
@ImplementationClassName("hk.org.hkbh.cms.outpatient.model.impl.AuditTrailImpl")
@ProviderType
public interface AuditTrail extends AuditTrailModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link hk.org.hkbh.cms.outpatient.model.impl.AuditTrailImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AuditTrail, Long> ID_ACCESSOR = new Accessor<AuditTrail, Long>() {
			@Override
			public Long get(AuditTrail auditTrail) {
				return auditTrail.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AuditTrail> getTypeClass() {
				return AuditTrail.class;
			}
		};
}