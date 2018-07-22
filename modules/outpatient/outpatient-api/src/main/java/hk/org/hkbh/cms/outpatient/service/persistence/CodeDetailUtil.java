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

import hk.org.hkbh.cms.outpatient.model.CodeDetail;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the code detail service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.CodeDetailPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see CodeDetailPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.CodeDetailPersistenceImpl
 * @generated
 */
@ProviderType
public class CodeDetailUtil {
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
	public static void clearCache(CodeDetail codeDetail) {
		getPersistence().clearCache(codeDetail);
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
	public static List<CodeDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CodeDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CodeDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CodeDetail> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CodeDetail update(CodeDetail codeDetail) {
		return getPersistence().update(codeDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CodeDetail update(CodeDetail codeDetail,
		ServiceContext serviceContext) {
		return getPersistence().update(codeDetail, serviceContext);
	}

	/**
	* Caches the code detail in the entity cache if it is enabled.
	*
	* @param codeDetail the code detail
	*/
	public static void cacheResult(CodeDetail codeDetail) {
		getPersistence().cacheResult(codeDetail);
	}

	/**
	* Caches the code details in the entity cache if it is enabled.
	*
	* @param codeDetails the code details
	*/
	public static void cacheResult(List<CodeDetail> codeDetails) {
		getPersistence().cacheResult(codeDetails);
	}

	/**
	* Creates a new code detail with the primary key. Does not add the code detail to the database.
	*
	* @param id the primary key for the new code detail
	* @return the new code detail
	*/
	public static CodeDetail create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the code detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the code detail
	* @return the code detail that was removed
	* @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	*/
	public static CodeDetail remove(int id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDetailException {
		return getPersistence().remove(id);
	}

	public static CodeDetail updateImpl(CodeDetail codeDetail) {
		return getPersistence().updateImpl(codeDetail);
	}

	/**
	* Returns the code detail with the primary key or throws a {@link NoSuchCodeDetailException} if it could not be found.
	*
	* @param id the primary key of the code detail
	* @return the code detail
	* @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	*/
	public static CodeDetail findByPrimaryKey(int id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDetailException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the code detail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the code detail
	* @return the code detail, or <code>null</code> if a code detail with the primary key could not be found
	*/
	public static CodeDetail fetchByPrimaryKey(int id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, CodeDetail> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the code details.
	*
	* @return the code details
	*/
	public static List<CodeDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the code details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code details
	* @param end the upper bound of the range of code details (not inclusive)
	* @return the range of code details
	*/
	public static List<CodeDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the code details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code details
	* @param end the upper bound of the range of code details (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of code details
	*/
	public static List<CodeDetail> findAll(int start, int end,
		OrderByComparator<CodeDetail> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the code details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code details
	* @param end the upper bound of the range of code details (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of code details
	*/
	public static List<CodeDetail> findAll(int start, int end,
		OrderByComparator<CodeDetail> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the code details from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of code details.
	*
	* @return the number of code details
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CodeDetailPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CodeDetailPersistence, CodeDetailPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CodeDetailPersistence.class);
}