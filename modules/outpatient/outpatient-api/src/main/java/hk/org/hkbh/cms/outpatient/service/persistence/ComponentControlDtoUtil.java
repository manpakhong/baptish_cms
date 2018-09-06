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

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the component control dto service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentControlDtoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlDtoPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentControlDtoPersistenceImpl
 * @generated
 */
@ProviderType
public class ComponentControlDtoUtil {
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
	public static void clearCache(ComponentControlDto componentControlDto) {
		getPersistence().clearCache(componentControlDto);
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
	public static List<ComponentControlDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ComponentControlDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ComponentControlDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ComponentControlDto update(
		ComponentControlDto componentControlDto) {
		return getPersistence().update(componentControlDto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ComponentControlDto update(
		ComponentControlDto componentControlDto, ServiceContext serviceContext) {
		return getPersistence().update(componentControlDto, serviceContext);
	}

	/**
	* Returns all the component control dtos where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @return the matching component control dtos
	*/
	public static List<ComponentControlDto> findByUserRoleId(
		java.lang.Long userRoleId) {
		return getPersistence().findByUserRoleId(userRoleId);
	}

	/**
	* Returns a range of all the component control dtos where userRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userRoleId the user role ID
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @return the range of matching component control dtos
	*/
	public static List<ComponentControlDto> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end) {
		return getPersistence().findByUserRoleId(userRoleId, start, end);
	}

	/**
	* Returns an ordered range of all the component control dtos where userRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userRoleId the user role ID
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component control dtos
	*/
	public static List<ComponentControlDto> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator) {
		return getPersistence()
				   .findByUserRoleId(userRoleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component control dtos where userRoleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userRoleId the user role ID
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component control dtos
	*/
	public static List<ComponentControlDto> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserRoleId(userRoleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first component control dto in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control dto
	* @throws NoSuchComponentControlDtoException if a matching component control dto could not be found
	*/
	public static ComponentControlDto findByUserRoleId_First(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControlDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException {
		return getPersistence()
				   .findByUserRoleId_First(userRoleId, orderByComparator);
	}

	/**
	* Returns the first component control dto in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control dto, or <code>null</code> if a matching component control dto could not be found
	*/
	public static ComponentControlDto fetchByUserRoleId_First(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControlDto> orderByComparator) {
		return getPersistence()
				   .fetchByUserRoleId_First(userRoleId, orderByComparator);
	}

	/**
	* Returns the last component control dto in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control dto
	* @throws NoSuchComponentControlDtoException if a matching component control dto could not be found
	*/
	public static ComponentControlDto findByUserRoleId_Last(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControlDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException {
		return getPersistence()
				   .findByUserRoleId_Last(userRoleId, orderByComparator);
	}

	/**
	* Returns the last component control dto in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control dto, or <code>null</code> if a matching component control dto could not be found
	*/
	public static ComponentControlDto fetchByUserRoleId_Last(
		java.lang.Long userRoleId,
		OrderByComparator<ComponentControlDto> orderByComparator) {
		return getPersistence()
				   .fetchByUserRoleId_Last(userRoleId, orderByComparator);
	}

	/**
	* Returns the component control dtos before and after the current component control dto in the ordered set where userRoleId = &#63;.
	*
	* @param componentId the primary key of the current component control dto
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control dto
	* @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	*/
	public static ComponentControlDto[] findByUserRoleId_PrevAndNext(
		long componentId, java.lang.Long userRoleId,
		OrderByComparator<ComponentControlDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException {
		return getPersistence()
				   .findByUserRoleId_PrevAndNext(componentId, userRoleId,
			orderByComparator);
	}

	/**
	* Removes all the component control dtos where userRoleId = &#63; from the database.
	*
	* @param userRoleId the user role ID
	*/
	public static void removeByUserRoleId(java.lang.Long userRoleId) {
		getPersistence().removeByUserRoleId(userRoleId);
	}

	/**
	* Returns the number of component control dtos where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @return the number of matching component control dtos
	*/
	public static int countByUserRoleId(java.lang.Long userRoleId) {
		return getPersistence().countByUserRoleId(userRoleId);
	}

	/**
	* Caches the component control dto in the entity cache if it is enabled.
	*
	* @param componentControlDto the component control dto
	*/
	public static void cacheResult(ComponentControlDto componentControlDto) {
		getPersistence().cacheResult(componentControlDto);
	}

	/**
	* Caches the component control dtos in the entity cache if it is enabled.
	*
	* @param componentControlDtos the component control dtos
	*/
	public static void cacheResult(
		List<ComponentControlDto> componentControlDtos) {
		getPersistence().cacheResult(componentControlDtos);
	}

	/**
	* Creates a new component control dto with the primary key. Does not add the component control dto to the database.
	*
	* @param componentId the primary key for the new component control dto
	* @return the new component control dto
	*/
	public static ComponentControlDto create(long componentId) {
		return getPersistence().create(componentId);
	}

	/**
	* Removes the component control dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param componentId the primary key of the component control dto
	* @return the component control dto that was removed
	* @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	*/
	public static ComponentControlDto remove(long componentId)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException {
		return getPersistence().remove(componentId);
	}

	public static ComponentControlDto updateImpl(
		ComponentControlDto componentControlDto) {
		return getPersistence().updateImpl(componentControlDto);
	}

	/**
	* Returns the component control dto with the primary key or throws a {@link NoSuchComponentControlDtoException} if it could not be found.
	*
	* @param componentId the primary key of the component control dto
	* @return the component control dto
	* @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	*/
	public static ComponentControlDto findByPrimaryKey(long componentId)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException {
		return getPersistence().findByPrimaryKey(componentId);
	}

	/**
	* Returns the component control dto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param componentId the primary key of the component control dto
	* @return the component control dto, or <code>null</code> if a component control dto with the primary key could not be found
	*/
	public static ComponentControlDto fetchByPrimaryKey(long componentId) {
		return getPersistence().fetchByPrimaryKey(componentId);
	}

	public static java.util.Map<java.io.Serializable, ComponentControlDto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the component control dtos.
	*
	* @return the component control dtos
	*/
	public static List<ComponentControlDto> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the component control dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @return the range of component control dtos
	*/
	public static List<ComponentControlDto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the component control dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of component control dtos
	*/
	public static List<ComponentControlDto> findAll(int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component control dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of component control dtos
	*/
	public static List<ComponentControlDto> findAll(int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the component control dtos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of component control dtos.
	*
	* @return the number of component control dtos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ComponentControlDtoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ComponentControlDtoPersistence, ComponentControlDtoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ComponentControlDtoPersistence.class);
}