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

import hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException;
import hk.org.hkbh.cms.outpatient.model.ComponentDto;

/**
 * The persistence interface for the component dto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentDtoPersistenceImpl
 * @see ComponentDtoUtil
 * @generated
 */
@ProviderType
public interface ComponentDtoPersistence extends BasePersistence<ComponentDto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComponentDtoUtil} to access the component dto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the component dtos where id = &#63;.
	*
	* @param id the ID
	* @return the matching component dtos
	*/
	public java.util.List<ComponentDto> findById(long id);

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
	public java.util.List<ComponentDto> findById(long id, int start, int end);

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
	public java.util.List<ComponentDto> findById(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

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
	public java.util.List<ComponentDto> findById(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the first component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the last component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the last component dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Removes all the component dtos where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeById(long id);

	/**
	* Returns the number of component dtos where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching component dtos
	*/
	public int countById(long id);

	/**
	* Returns all the component dtos where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @return the matching component dtos
	*/
	public java.util.List<ComponentDto> findByComponentCode(
		java.lang.String componentCode);

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
	public java.util.List<ComponentDto> findByComponentCode(
		java.lang.String componentCode, int start, int end);

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
	public java.util.List<ComponentDto> findByComponentCode(
		java.lang.String componentCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

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
	public java.util.List<ComponentDto> findByComponentCode(
		java.lang.String componentCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findByComponentCode_First(
		java.lang.String componentCode,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the first component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchByComponentCode_First(
		java.lang.String componentCode,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the last component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findByComponentCode_Last(
		java.lang.String componentCode,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the last component dto in the ordered set where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchByComponentCode_Last(
		java.lang.String componentCode,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the component dtos before and after the current component dto in the ordered set where componentCode = &#63;.
	*
	* @param id the primary key of the current component dto
	* @param componentCode the component code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public ComponentDto[] findByComponentCode_PrevAndNext(long id,
		java.lang.String componentCode,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Removes all the component dtos where componentCode = &#63; from the database.
	*
	* @param componentCode the component code
	*/
	public void removeByComponentCode(java.lang.String componentCode);

	/**
	* Returns the number of component dtos where componentCode = &#63;.
	*
	* @param componentCode the component code
	* @return the number of matching component dtos
	*/
	public int countByComponentCode(java.lang.String componentCode);

	/**
	* Returns all the component dtos where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @return the matching component dtos
	*/
	public java.util.List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel);

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
	public java.util.List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel, int start, int end);

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
	public java.util.List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

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
	public java.util.List<ComponentDto> findByComponentLevel(
		java.lang.Integer componentLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findByComponentLevel_First(
		java.lang.Integer componentLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the first component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchByComponentLevel_First(
		java.lang.Integer componentLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the last component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findByComponentLevel_Last(
		java.lang.Integer componentLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the last component dto in the ordered set where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchByComponentLevel_Last(
		java.lang.Integer componentLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the component dtos before and after the current component dto in the ordered set where componentLevel = &#63;.
	*
	* @param id the primary key of the current component dto
	* @param componentLevel the component level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public ComponentDto[] findByComponentLevel_PrevAndNext(long id,
		java.lang.Integer componentLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Removes all the component dtos where componentLevel = &#63; from the database.
	*
	* @param componentLevel the component level
	*/
	public void removeByComponentLevel(java.lang.Integer componentLevel);

	/**
	* Returns the number of component dtos where componentLevel = &#63;.
	*
	* @param componentLevel the component level
	* @return the number of matching component dtos
	*/
	public int countByComponentLevel(java.lang.Integer componentLevel);

	/**
	* Returns all the component dtos where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @return the matching component dtos
	*/
	public java.util.List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem);

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
	public java.util.List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem, int start, int end);

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
	public java.util.List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

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
	public java.util.List<ComponentDto> findByIsMenuItem(
		java.lang.Boolean isMenuItem, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findByIsMenuItem_First(java.lang.Boolean isMenuItem,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the first component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchByIsMenuItem_First(java.lang.Boolean isMenuItem,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the last component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto
	* @throws NoSuchComponentDtoException if a matching component dto could not be found
	*/
	public ComponentDto findByIsMenuItem_Last(java.lang.Boolean isMenuItem,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Returns the last component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	*/
	public ComponentDto fetchByIsMenuItem_Last(java.lang.Boolean isMenuItem,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

	/**
	* Returns the component dtos before and after the current component dto in the ordered set where isMenuItem = &#63;.
	*
	* @param id the primary key of the current component dto
	* @param isMenuItem the is menu item
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public ComponentDto[] findByIsMenuItem_PrevAndNext(long id,
		java.lang.Boolean isMenuItem,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException;

	/**
	* Removes all the component dtos where isMenuItem = &#63; from the database.
	*
	* @param isMenuItem the is menu item
	*/
	public void removeByIsMenuItem(java.lang.Boolean isMenuItem);

	/**
	* Returns the number of component dtos where isMenuItem = &#63;.
	*
	* @param isMenuItem the is menu item
	* @return the number of matching component dtos
	*/
	public int countByIsMenuItem(java.lang.Boolean isMenuItem);

	/**
	* Caches the component dto in the entity cache if it is enabled.
	*
	* @param componentDto the component dto
	*/
	public void cacheResult(ComponentDto componentDto);

	/**
	* Caches the component dtos in the entity cache if it is enabled.
	*
	* @param componentDtos the component dtos
	*/
	public void cacheResult(java.util.List<ComponentDto> componentDtos);

	/**
	* Creates a new component dto with the primary key. Does not add the component dto to the database.
	*
	* @param id the primary key for the new component dto
	* @return the new component dto
	*/
	public ComponentDto create(long id);

	/**
	* Removes the component dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component dto
	* @return the component dto that was removed
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public ComponentDto remove(long id) throws NoSuchComponentDtoException;

	public ComponentDto updateImpl(ComponentDto componentDto);

	/**
	* Returns the component dto with the primary key or throws a {@link NoSuchComponentDtoException} if it could not be found.
	*
	* @param id the primary key of the component dto
	* @return the component dto
	* @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	*/
	public ComponentDto findByPrimaryKey(long id)
		throws NoSuchComponentDtoException;

	/**
	* Returns the component dto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the component dto
	* @return the component dto, or <code>null</code> if a component dto with the primary key could not be found
	*/
	public ComponentDto fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ComponentDto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the component dtos.
	*
	* @return the component dtos
	*/
	public java.util.List<ComponentDto> findAll();

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
	public java.util.List<ComponentDto> findAll(int start, int end);

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
	public java.util.List<ComponentDto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator);

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
	public java.util.List<ComponentDto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the component dtos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of component dtos.
	*
	* @return the number of component dtos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}