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

import hk.org.hkbh.cms.outpatient.model.ComponentDto;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the component dto service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentDtoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ComponentDtoPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentDtoPersistenceImpl
 * @generated
 */
@ProviderType
public class ComponentDtoUtil {
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
	public static void clearCache(ComponentDto componentDto) {
		getPersistence().clearCache(componentDto);
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
	public static List<ComponentDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ComponentDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ComponentDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ComponentDto update(ComponentDto componentDto) {
		return getPersistence().update(componentDto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ComponentDto update(ComponentDto componentDto,
		ServiceContext serviceContext) {
		return getPersistence().update(componentDto, serviceContext);
	}

	/**
	* Returns all the component dtos where id = &#63;.
	*
	* @param id the ID
	* @return the matching component dtos
	*/
	public static List<ComponentDto> findById(long id) {
		return getPersistence().findById(id);
	}

	/**
	* Returns a range of all the component dtos where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @return the range of matching component dtos
	*/
	public static List<ComponentDto> findById(long id, int start, int end) {
		return getPersistence().findById(id, start, end);
	}

	/**
	* Returns an ordered range of all the component dtos where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findById(long id, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence().findById(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component dtos where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findById(long id, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findById(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findById_First(long id,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence().findById_First(id, orderByComparator);
	}

	/**
	* Returns the first component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchById_First(long id,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence().fetchById_First(id, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findById_Last(long id,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence().findById_Last(id, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchById_Last(long id,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence().fetchById_Last(id, orderByComparator);
	}

	/**
	* Removes all the component dtos where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeById(long id) {
		getPersistence().removeById(id);
	}

	/**
	* Returns the number of component dtos where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching component dtos
	*/
	public static int countById(long id) {
		return getPersistence().countById(id);
	}

	/**
	* Returns all the component dtos where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @return the matching component dtos
	*/
	public static List<ComponentDto> findByComponentCode(
		java.lang.String componentCode) {
		return getPersistence().findByComponentCode(componentCode);
	}

	/**
	* Returns a range of all the component dtos where componentCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentCode the component code
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @return the range of matching component dtos
	*/
	public static List<ComponentDto> findByComponentCode(
		java.lang.String componentCode, int start, int end) {
		return getPersistence().findByComponentCode(componentCode, start, end);
	}

	/**
	* Returns an ordered range of all the component dtos where componentCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentCode the component code
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findByComponentCode(
		java.lang.String componentCode, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .findByComponentCode(componentCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the component dtos where componentCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentCode the component code
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findByComponentCode(
		java.lang.String componentCode, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByComponentCode(componentCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findByComponentCode_First(
		java.lang.String componentCode,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByComponentCode_First(componentCode, orderByComparator);
	}

	/**
	* Returns the first component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchByComponentCode_First(
		java.lang.String componentCode,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .fetchByComponentCode_First(componentCode, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findByComponentCode_Last(
		java.lang.String componentCode,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByComponentCode_Last(componentCode, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchByComponentCode_Last(
		java.lang.String componentCode,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .fetchByComponentCode_Last(componentCode, orderByComparator);
	}

	/**
	* Returns the component dtos before and after the current component dto in the ordered set where componentCode = &#63;.
	*
	* @param id the primary key of the current component dto
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public static ComponentDto[] findByComponentCode_PrevAndNext(long id,
		java.lang.String componentCode,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByComponentCode_PrevAndNext(id, componentCode,
			orderByComparator);
	}

	/**
	* Removes all the component dtos where componentCode = &#63; from the database.
	*
	* @param componentCode the component code
	*/
	public static void removeByComponentCode(java.lang.String componentCode) {
		getPersistence().removeByComponentCode(componentCode);
	}

	/**
	* Returns the number of component dtos where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @return the number of matching component dtos
	*/
	public static int countByComponentCode(java.lang.String componentCode) {
		return getPersistence().countByComponentCode(componentCode);
	}

	/**
	* Returns all the component dtos where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @return the matching component dtos
	*/
	public static List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel) {
		return getPersistence().findByComponentLevel(componentLevel);
	}

	/**
	* Returns a range of all the component dtos where componentLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentLevel the component level
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @return the range of matching component dtos
	*/
	public static List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel, int start, int end) {
		return getPersistence().findByComponentLevel(componentLevel, start, end);
	}

	/**
	* Returns an ordered range of all the component dtos where componentLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentLevel the component level
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .findByComponentLevel(componentLevel, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the component dtos where componentLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param componentLevel the component level
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByComponentLevel(componentLevel, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findByComponentLevel_First(
		java.lang.Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByComponentLevel_First(componentLevel, orderByComparator);
	}

	/**
	* Returns the first component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchByComponentLevel_First(
		java.lang.Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .fetchByComponentLevel_First(componentLevel,
			orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findByComponentLevel_Last(
		java.lang.Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByComponentLevel_Last(componentLevel, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchByComponentLevel_Last(
		java.lang.Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .fetchByComponentLevel_Last(componentLevel, orderByComparator);
	}

	/**
	* Returns the component dtos before and after the current component dto in the ordered set where componentLevel = &#63;.
	*
	* @param id the primary key of the current component dto
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public static ComponentDto[] findByComponentLevel_PrevAndNext(long id,
		java.lang.Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByComponentLevel_PrevAndNext(id, componentLevel,
			orderByComparator);
	}

	/**
	* Removes all the component dtos where componentLevel = &#63; from the database.
	*
	* @param componentLevel the component level
	*/
	public static void removeByComponentLevel(java.lang.Integer componentLevel) {
		getPersistence().removeByComponentLevel(componentLevel);
	}

	/**
	* Returns the number of component dtos where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @return the number of matching component dtos
	*/
	public static int countByComponentLevel(java.lang.Integer componentLevel) {
		return getPersistence().countByComponentLevel(componentLevel);
	}

	/**
	* Returns all the component dtos where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @return the matching component dtos
	*/
	public static List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem) {
		return getPersistence().findByIsMenuItem(isMenuItem);
	}

	/**
	* Returns a range of all the component dtos where isMenuItem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isMenuItem the is menu item
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @return the range of matching component dtos
	*/
	public static List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem, int start, int end) {
		return getPersistence().findByIsMenuItem(isMenuItem, start, end);
	}

	/**
	* Returns an ordered range of all the component dtos where isMenuItem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isMenuItem the is menu item
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .findByIsMenuItem(isMenuItem, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component dtos where isMenuItem = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isMenuItem the is menu item
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component dtos
	*/
	public static List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIsMenuItem(isMenuItem, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findByIsMenuItem_First(
		java.lang.Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByIsMenuItem_First(isMenuItem, orderByComparator);
	}

	/**
	* Returns the first component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchByIsMenuItem_First(
		java.lang.Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .fetchByIsMenuItem_First(isMenuItem, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public static ComponentDto findByIsMenuItem_Last(
		java.lang.Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByIsMenuItem_Last(isMenuItem, orderByComparator);
	}

	/**
	* Returns the last component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public static ComponentDto fetchByIsMenuItem_Last(
		java.lang.Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence()
				   .fetchByIsMenuItem_Last(isMenuItem, orderByComparator);
	}

	/**
	* Returns the component dtos before and after the current component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param id the primary key of the current component dto
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public static ComponentDto[] findByIsMenuItem_PrevAndNext(long id,
		java.lang.Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence()
				   .findByIsMenuItem_PrevAndNext(id, isMenuItem,
			orderByComparator);
	}

	/**
	* Removes all the component dtos where isMenuItem = &#63; from the database.
	*
	* @param isMenuItem the is menu item
	*/
	public static void removeByIsMenuItem(java.lang.Boolean isMenuItem) {
		getPersistence().removeByIsMenuItem(isMenuItem);
	}

	/**
	* Returns the number of component dtos where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @return the number of matching component dtos
	*/
	public static int countByIsMenuItem(java.lang.Boolean isMenuItem) {
		return getPersistence().countByIsMenuItem(isMenuItem);
	}

	/**
	* Caches the component dto in the entity cache if it is enabled.
	*
	* @param componentDto the component dto
	*/
	public static void cacheResult(ComponentDto componentDto) {
		getPersistence().cacheResult(componentDto);
	}

	/**
	* Caches the component dtos in the entity cache if it is enabled.
	*
	* @param componentDtos the component dtos
	*/
	public static void cacheResult(List<ComponentDto> componentDtos) {
		getPersistence().cacheResult(componentDtos);
	}

	/**
	* Creates a new component dto with the primary key. Does not add the component dto to the database.
	*
	* @param id the primary key for the new component dto
	* @return the new component dto
	*/
	public static ComponentDto create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the component dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component dto
	* @return the component dto that was removed
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public static ComponentDto remove(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence().remove(id);
	}

	public static ComponentDto updateImpl(ComponentDto componentDto) {
		return getPersistence().updateImpl(componentDto);
	}

	/**
	* Returns the component dto with the primary key or throws a {@link NoSuchComponentDtoException} if it could not be found.
	*
	* @param id the primary key of the component dto
	* @return the component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public static ComponentDto findByPrimaryKey(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the component dto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the component dto
	* @return the component dto, or <code>null</code> if a component dto with the primary key could not be found
	*/
	public static ComponentDto fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ComponentDto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the component dtos.
	*
	* @return the component dtos
	*/
	public static List<ComponentDto> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the component dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @return the range of component dtos
	*/
	public static List<ComponentDto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the component dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of component dtos
	*/
	public static List<ComponentDto> findAll(int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the component dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of component dtos
	*/
	public static List<ComponentDto> findAll(int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the component dtos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of component dtos.
	*
	* @return the number of component dtos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ComponentDtoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ComponentDtoPersistence, ComponentDtoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ComponentDtoPersistence.class);
}