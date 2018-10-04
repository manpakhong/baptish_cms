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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import hk.org.hkbh.cms.outpatient.exception.NoSuchAuditTrailException;
import hk.org.hkbh.cms.outpatient.model.AuditTrail;

/**
 * The persistence interface for the audit trail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.AuditTrailPersistenceImpl
 * @see AuditTrailUtil
 * @generated
 */
@ProviderType
public interface AuditTrailPersistence extends BasePersistence<AuditTrail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuditTrailUtil} to access the audit trail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the audit trail in the entity cache if it is enabled.
	*
	* @param auditTrail the audit trail
	*/
	public void cacheResult(AuditTrail auditTrail);

	/**
	* Caches the audit trails in the entity cache if it is enabled.
	*
	* @param auditTrails the audit trails
	*/
	public void cacheResult(java.util.List<AuditTrail> auditTrails);

	/**
	* Creates a new audit trail with the primary key. Does not add the audit trail to the database.
	*
	* @param id the primary key for the new audit trail
	* @return the new audit trail
	*/
	public AuditTrail create(long id);

	/**
	* Removes the audit trail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail that was removed
	* @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	*/
	public AuditTrail remove(long id) throws NoSuchAuditTrailException;

	public AuditTrail updateImpl(AuditTrail auditTrail);

	/**
	* Returns the audit trail with the primary key or throws a {@link NoSuchAuditTrailException} if it could not be found.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail
	* @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	*/
	public AuditTrail findByPrimaryKey(long id)
		throws NoSuchAuditTrailException;

	/**
	* Returns the audit trail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail, or <code>null</code> if a audit trail with the primary key could not be found
	*/
	public AuditTrail fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, AuditTrail> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the audit trails.
	*
	* @return the audit trails
	*/
	public java.util.List<AuditTrail> findAll();

	/**
	* Returns a range of all the audit trails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audit trails
	* @param end the upper bound of the range of audit trails (not inclusive)
	* @return the range of audit trails
	*/
	public java.util.List<AuditTrail> findAll(int start, int end);

	/**
	* Returns an ordered range of all the audit trails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audit trails
	* @param end the upper bound of the range of audit trails (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of audit trails
	*/
	public java.util.List<AuditTrail> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AuditTrail> orderByComparator);

	/**
	* Returns an ordered range of all the audit trails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audit trails
	* @param end the upper bound of the range of audit trails (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of audit trails
	*/
	public java.util.List<AuditTrail> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AuditTrail> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the audit trails from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of audit trails.
	*
	* @return the number of audit trails
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}