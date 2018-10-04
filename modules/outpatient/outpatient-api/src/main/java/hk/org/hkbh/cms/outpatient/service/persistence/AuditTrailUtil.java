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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import hk.org.hkbh.cms.outpatient.model.AuditTrail;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the audit trail service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.AuditTrailPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see AuditTrailPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.AuditTrailPersistenceImpl
 * @generated
 */
@ProviderType
public class AuditTrailUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AuditTrail auditTrail) {
		getPersistence().clearCache(auditTrail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AuditTrail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AuditTrail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AuditTrail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AuditTrail> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AuditTrail update(AuditTrail auditTrail) {
		return getPersistence().update(auditTrail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AuditTrail update(AuditTrail auditTrail,
		ServiceContext serviceContext) {
		return getPersistence().update(auditTrail, serviceContext);
	}

	/**
	* Caches the audit trail in the entity cache if it is enabled.
	*
	* @param auditTrail the audit trail
	*/
	public static void cacheResult(AuditTrail auditTrail) {
		getPersistence().cacheResult(auditTrail);
	}

	/**
	* Caches the audit trails in the entity cache if it is enabled.
	*
	* @param auditTrails the audit trails
	*/
	public static void cacheResult(List<AuditTrail> auditTrails) {
		getPersistence().cacheResult(auditTrails);
	}

	/**
	* Creates a new audit trail with the primary key. Does not add the audit trail to the database.
	*
	* @param id the primary key for the new audit trail
	* @return the new audit trail
	*/
	public static AuditTrail create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the audit trail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail that was removed
	* @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	*/
	public static AuditTrail remove(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchAuditTrailException {
		return getPersistence().remove(id);
	}

	public static AuditTrail updateImpl(AuditTrail auditTrail) {
		return getPersistence().updateImpl(auditTrail);
	}

	/**
	* Returns the audit trail with the primary key or throws a {@link NoSuchAuditTrailException} if it could not be found.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail
	* @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	*/
	public static AuditTrail findByPrimaryKey(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchAuditTrailException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the audit trail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail, or <code>null</code> if a audit trail with the primary key could not be found
	*/
	public static AuditTrail fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, AuditTrail> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the audit trails.
	*
	* @return the audit trails
	*/
	public static List<AuditTrail> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<AuditTrail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<AuditTrail> findAll(int start, int end,
		OrderByComparator<AuditTrail> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<AuditTrail> findAll(int start, int end,
		OrderByComparator<AuditTrail> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the audit trails from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of audit trails.
	*
	* @return the number of audit trails
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AuditTrailPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AuditTrailPersistence, AuditTrailPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AuditTrailPersistence.class);
}