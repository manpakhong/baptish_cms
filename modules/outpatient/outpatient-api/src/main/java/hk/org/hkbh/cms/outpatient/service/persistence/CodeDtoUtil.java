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

import hk.org.hkbh.cms.outpatient.model.CodeDto;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the code dto service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.CodeDtoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see CodeDtoPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.CodeDtoPersistenceImpl
 * @generated
 */
@ProviderType
public class CodeDtoUtil {
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
	public static void clearCache(CodeDto codeDto) {
		getPersistence().clearCache(codeDto);
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
	public static List<CodeDto> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CodeDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CodeDto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CodeDto> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CodeDto update(CodeDto codeDto) {
		return getPersistence().update(codeDto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CodeDto update(CodeDto codeDto, ServiceContext serviceContext) {
		return getPersistence().update(codeDto, serviceContext);
	}

	/**
	* Returns all the code dtos where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @return the matching code dtos
	*/
	public static List<CodeDto> findByMasterCode(java.lang.String masterCode) {
		return getPersistence().findByMasterCode(masterCode);
	}

	/**
	* Returns a range of all the code dtos where masterCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masterCode the master code
	* @param start the lower bound of the range of code dtos
	* @param end the upper bound of the range of code dtos (not inclusive)
	* @return the range of matching code dtos
	*/
	public static List<CodeDto> findByMasterCode(java.lang.String masterCode,
		int start, int end) {
		return getPersistence().findByMasterCode(masterCode, start, end);
	}

	/**
	* Returns an ordered range of all the code dtos where masterCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masterCode the master code
	* @param start the lower bound of the range of code dtos
	* @param end the upper bound of the range of code dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching code dtos
	*/
	public static List<CodeDto> findByMasterCode(java.lang.String masterCode,
		int start, int end, OrderByComparator<CodeDto> orderByComparator) {
		return getPersistence()
				   .findByMasterCode(masterCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the code dtos where masterCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masterCode the master code
	* @param start the lower bound of the range of code dtos
	* @param end the upper bound of the range of code dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching code dtos
	*/
	public static List<CodeDto> findByMasterCode(java.lang.String masterCode,
		int start, int end, OrderByComparator<CodeDto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMasterCode(masterCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching code dto
	* @throws NoSuchCodeDtoException if a matching code dto could not be found
	*/
	public static CodeDto findByMasterCode_First(java.lang.String masterCode,
		OrderByComparator<CodeDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException {
		return getPersistence()
				   .findByMasterCode_First(masterCode, orderByComparator);
	}

	/**
	* Returns the first code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching code dto, or <code>null</code> if a matching code dto could not be found
	*/
	public static CodeDto fetchByMasterCode_First(java.lang.String masterCode,
		OrderByComparator<CodeDto> orderByComparator) {
		return getPersistence()
				   .fetchByMasterCode_First(masterCode, orderByComparator);
	}

	/**
	* Returns the last code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching code dto
	* @throws NoSuchCodeDtoException if a matching code dto could not be found
	*/
	public static CodeDto findByMasterCode_Last(java.lang.String masterCode,
		OrderByComparator<CodeDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException {
		return getPersistence()
				   .findByMasterCode_Last(masterCode, orderByComparator);
	}

	/**
	* Returns the last code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching code dto, or <code>null</code> if a matching code dto could not be found
	*/
	public static CodeDto fetchByMasterCode_Last(java.lang.String masterCode,
		OrderByComparator<CodeDto> orderByComparator) {
		return getPersistence()
				   .fetchByMasterCode_Last(masterCode, orderByComparator);
	}

	/**
	* Returns the code dtos before and after the current code dto in the ordered set where masterCode = &#63;.
	*
	* @param id the primary key of the current code dto
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next code dto
	* @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	*/
	public static CodeDto[] findByMasterCode_PrevAndNext(int id,
		java.lang.String masterCode,
		OrderByComparator<CodeDto> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException {
		return getPersistence()
				   .findByMasterCode_PrevAndNext(id, masterCode,
			orderByComparator);
	}

	/**
	* Removes all the code dtos where masterCode = &#63; from the database.
	*
	* @param masterCode the master code
	*/
	public static void removeByMasterCode(java.lang.String masterCode) {
		getPersistence().removeByMasterCode(masterCode);
	}

	/**
	* Returns the number of code dtos where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @return the number of matching code dtos
	*/
	public static int countByMasterCode(java.lang.String masterCode) {
		return getPersistence().countByMasterCode(masterCode);
	}

	/**
	* Caches the code dto in the entity cache if it is enabled.
	*
	* @param codeDto the code dto
	*/
	public static void cacheResult(CodeDto codeDto) {
		getPersistence().cacheResult(codeDto);
	}

	/**
	* Caches the code dtos in the entity cache if it is enabled.
	*
	* @param codeDtos the code dtos
	*/
	public static void cacheResult(List<CodeDto> codeDtos) {
		getPersistence().cacheResult(codeDtos);
	}

	/**
	* Creates a new code dto with the primary key. Does not add the code dto to the database.
	*
	* @param id the primary key for the new code dto
	* @return the new code dto
	*/
	public static CodeDto create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the code dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the code dto
	* @return the code dto that was removed
	* @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	*/
	public static CodeDto remove(int id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException {
		return getPersistence().remove(id);
	}

	public static CodeDto updateImpl(CodeDto codeDto) {
		return getPersistence().updateImpl(codeDto);
	}

	/**
	* Returns the code dto with the primary key or throws a {@link NoSuchCodeDtoException} if it could not be found.
	*
	* @param id the primary key of the code dto
	* @return the code dto
	* @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	*/
	public static CodeDto findByPrimaryKey(int id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the code dto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the code dto
	* @return the code dto, or <code>null</code> if a code dto with the primary key could not be found
	*/
	public static CodeDto fetchByPrimaryKey(int id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, CodeDto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the code dtos.
	*
	* @return the code dtos
	*/
	public static List<CodeDto> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the code dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code dtos
	* @param end the upper bound of the range of code dtos (not inclusive)
	* @return the range of code dtos
	*/
	public static List<CodeDto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the code dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code dtos
	* @param end the upper bound of the range of code dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of code dtos
	*/
	public static List<CodeDto> findAll(int start, int end,
		OrderByComparator<CodeDto> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the code dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code dtos
	* @param end the upper bound of the range of code dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of code dtos
	*/
	public static List<CodeDto> findAll(int start, int end,
		OrderByComparator<CodeDto> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the code dtos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of code dtos.
	*
	* @return the number of code dtos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CodeDtoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CodeDtoPersistence, CodeDtoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CodeDtoPersistence.class);
}