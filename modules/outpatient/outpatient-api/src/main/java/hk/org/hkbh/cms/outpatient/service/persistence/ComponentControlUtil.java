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

import hk.org.hkbh.cms.outpatient.model.ComponentControl;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the component control service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentControlPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentControlPersistenceImpl
 * @generated
 */
@ProviderType
public class ComponentControlUtil {
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
	public static void clearCache(ComponentControl componentControl) {
		getPersistence().clearCache(componentControl);
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
	public static List<ComponentControl> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ComponentControl> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ComponentControl> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ComponentControl update(ComponentControl componentControl) {
		return getPersistence().update(componentControl);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ComponentControl update(ComponentControl componentControl,
		ServiceContext serviceContext) {
		return getPersistence().update(componentControl, serviceContext);
	}

	/**
	* Returns all the component controls where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching component controls
	*/
	public static List<ComponentControl> findByUserId(java.lang.Long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the component controls where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @return the range of matching component controls
	*/
	public static List<ComponentControl> findByUserId(java.lang.Long userId,
		int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the component controls where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component controls
	*/
	public static List<ComponentControl> findByUserId(java.lang.Long userId,
		int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component controls where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component controls
	*/
	public static List<ComponentControl> findByUserId(java.lang.Long userId,
		int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public static ComponentControl findByUserId_First(java.lang.Long userId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public static ComponentControl fetchByUserId_First(java.lang.Long userId,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public static ComponentControl findByUserId_Last(java.lang.Long userId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public static ComponentControl fetchByUserId_Last(java.lang.Long userId,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the component controls before and after the current component control in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current component control
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public static ComponentControl[] findByUserId_PrevAndNext(long id,
		java.lang.Long userId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByUserId_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the component controls where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(java.lang.Long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of component controls where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching component controls
	*/
	public static int countByUserId(java.lang.Long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the component controls where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @return the matching component controls
	*/
	public static List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId) {
		return getPersistence().findByUserRoleId(userRoleId);
	}

	/**
	* Returns a range of all the component controls where userRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userRoleId the user role ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @return the range of matching component controls
	*/
	public static List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end) {
		return getPersistence().findByUserRoleId(userRoleId, start, end);
	}

	/**
	* Returns an ordered range of all the component controls where userRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userRoleId the user role ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component controls
	*/
	public static List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .findByUserRoleId(userRoleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component controls where userRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userRoleId the user role ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component controls
	*/
	public static List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserRoleId(userRoleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public static ComponentControl findByUserRoleId_First(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByUserRoleId_First(userRoleId, orderByComparator);
	}

	/**
	* Returns the first component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public static ComponentControl fetchByUserRoleId_First(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .fetchByUserRoleId_First(userRoleId, orderByComparator);
	}

	/**
	* Returns the last component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public static ComponentControl findByUserRoleId_Last(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByUserRoleId_Last(userRoleId, orderByComparator);
	}

	/**
	* Returns the last component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public static ComponentControl fetchByUserRoleId_Last(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .fetchByUserRoleId_Last(userRoleId, orderByComparator);
	}

	/**
	* Returns the component controls before and after the current component control in the ordered set where userRoleId = &#63;.
	*
	* @param id the primary key of the current component control
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public static ComponentControl[] findByUserRoleId_PrevAndNext(long id,
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByUserRoleId_PrevAndNext(id, userRoleId,
			orderByComparator);
	}

	/**
	* Removes all the component controls where userRoleId = &#63; from the database.
	*
	* @param userRoleId the user role ID
	*/
	public static void removeByUserRoleId(java.lang.Long userRoleId) {
		getPersistence().removeByUserRoleId(userRoleId);
	}

	/**
	* Returns the number of component controls where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @return the number of matching component controls
	*/
	public static int countByUserRoleId(java.lang.Long userRoleId) {
		return getPersistence().countByUserRoleId(userRoleId);
	}

	/**
	* Returns all the component controls where componentId = &#63;.
	*
	* @param componentId the component ID
	* @return the matching component controls
	*/
	public static List<ComponentControl> findByComponentId(
		java.lang.Long componentId) {
		return getPersistence().findByComponentId(componentId);
	}

	/**
	* Returns a range of all the component controls where componentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentId the component ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @return the range of matching component controls
	*/
	public static List<ComponentControl> findByComponentId(
		java.lang.Long componentId, int start, int end) {
		return getPersistence().findByComponentId(componentId, start, end);
	}

	/**
	* Returns an ordered range of all the component controls where componentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentId the component ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component controls
	*/
	public static List<ComponentControl> findByComponentId(
		java.lang.Long componentId, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .findByComponentId(componentId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component controls where componentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentId the component ID
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component controls
	*/
	public static List<ComponentControl> findByComponentId(
		java.lang.Long componentId, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByComponentId(componentId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public static ComponentControl findByComponentId_First(
		java.lang.Long componentId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByComponentId_First(componentId, orderByComparator);
	}

	/**
	* Returns the first component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public static ComponentControl fetchByComponentId_First(
		java.lang.Long componentId,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .fetchByComponentId_First(componentId, orderByComparator);
	}

	/**
	* Returns the last component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public static ComponentControl findByComponentId_Last(
		java.lang.Long componentId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByComponentId_Last(componentId, orderByComparator);
	}

	/**
	* Returns the last component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public static ComponentControl fetchByComponentId_Last(
		java.lang.Long componentId,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence()
				   .fetchByComponentId_Last(componentId, orderByComparator);
	}

	/**
	* Returns the component controls before and after the current component control in the ordered set where componentId = &#63;.
	*
	* @param id the primary key of the current component control
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public static ComponentControl[] findByComponentId_PrevAndNext(long id,
		java.lang.Long componentId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence()
				   .findByComponentId_PrevAndNext(id, componentId,
			orderByComparator);
	}

	/**
	* Removes all the component controls where componentId = &#63; from the database.
	*
	* @param componentId the component ID
	*/
	public static void removeByComponentId(java.lang.Long componentId) {
		getPersistence().removeByComponentId(componentId);
	}

	/**
	* Returns the number of component controls where componentId = &#63;.
	*
	* @param componentId the component ID
	* @return the number of matching component controls
	*/
	public static int countByComponentId(java.lang.Long componentId) {
		return getPersistence().countByComponentId(componentId);
	}

	/**
	* Caches the component control in the entity cache if it is enabled.
	*
	* @param componentControl the component control
	*/
	public static void cacheResult(ComponentControl componentControl) {
		getPersistence().cacheResult(componentControl);
	}

	/**
	* Caches the component controls in the entity cache if it is enabled.
	*
	* @param componentControls the component controls
	*/
	public static void cacheResult(List<ComponentControl> componentControls) {
		getPersistence().cacheResult(componentControls);
	}

	/**
	* Creates a new component control with the primary key. Does not add the component control to the database.
	*
	* @param id the primary key for the new component control
	* @return the new component control
	*/
	public static ComponentControl create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the component control with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component control
	* @return the component control that was removed
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public static ComponentControl remove(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence().remove(id);
	}

	public static ComponentControl updateImpl(ComponentControl componentControl) {
		return getPersistence().updateImpl(componentControl);
	}

	/**
	* Returns the component control with the primary key or throws a {@link NoSuchComponentControlException} if it could not be found.
	*
	* @param id the primary key of the component control
	* @return the component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public static ComponentControl findByPrimaryKey(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the component control with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the component control
	* @return the component control, or <code>null</code> if a component control with the primary key could not be found
	*/
	public static ComponentControl fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ComponentControl> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the component controls.
	*
	* @return the component controls
	*/
	public static List<ComponentControl> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the component controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @return the range of component controls
	*/
	public static List<ComponentControl> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the component controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of component controls
	*/
	public static List<ComponentControl> findAll(int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of component controls
	*/
	public static List<ComponentControl> findAll(int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the component controls from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of component controls.
	*
	* @return the number of component controls
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ComponentControlPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ComponentControlPersistence, ComponentControlPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ComponentControlPersistence.class);
}