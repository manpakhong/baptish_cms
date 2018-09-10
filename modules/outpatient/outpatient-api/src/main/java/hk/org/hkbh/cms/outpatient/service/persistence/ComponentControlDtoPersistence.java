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

import hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException;
import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;

/**
 * The persistence interface for the component control dto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentControlDtoPersistenceImpl
 * @see ComponentControlDtoUtil
 * @generated
 */
@ProviderType
public interface ComponentControlDtoPersistence extends BasePersistence<ComponentControlDto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComponentControlDtoUtil} to access the component control dto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the component control dtos where id = &#63;.
	*
	* @param id the ID
	* @return the matching component control dtos
	*/
	public java.util.List<ComponentControlDto> findById(long id);

	/**
	* Returns a range of all the component control dtos where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @return the range of matching component control dtos
	*/
	public java.util.List<ComponentControlDto> findById(long id, int start,
		int end);

	/**
	* Returns an ordered range of all the component control dtos where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching component control dtos
	*/
	public java.util.List<ComponentControlDto> findById(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator);

	/**
	* Returns an ordered range of all the component control dtos where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching component control dtos
	*/
	public java.util.List<ComponentControlDto> findById(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component control dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control dto
	* @throws NoSuchComponentControlDtoException if a matching component control dto could not be found
	*/
	public ComponentControlDto findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator)
		throws NoSuchComponentControlDtoException;

	/**
	* Returns the first component control dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control dto, or <code>null</code> if a matching component control dto could not be found
	*/
	public ComponentControlDto fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator);

	/**
	* Returns the last component control dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control dto
	* @throws NoSuchComponentControlDtoException if a matching component control dto could not be found
	*/
	public ComponentControlDto findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator)
		throws NoSuchComponentControlDtoException;

	/**
	* Returns the last component control dto in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control dto, or <code>null</code> if a matching component control dto could not be found
	*/
	public ComponentControlDto fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator);

	/**
	* Removes all the component control dtos where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeById(long id);

	/**
	* Returns the number of component control dtos where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching component control dtos
	*/
	public int countById(long id);

	/**
	* Caches the component control dto in the entity cache if it is enabled.
	*
	* @param componentControlDto the component control dto
	*/
	public void cacheResult(ComponentControlDto componentControlDto);

	/**
	* Caches the component control dtos in the entity cache if it is enabled.
	*
	* @param componentControlDtos the component control dtos
	*/
	public void cacheResult(
		java.util.List<ComponentControlDto> componentControlDtos);

	/**
	* Creates a new component control dto with the primary key. Does not add the component control dto to the database.
	*
	* @param id the primary key for the new component control dto
	* @return the new component control dto
	*/
	public ComponentControlDto create(long id);

	/**
	* Removes the component control dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto that was removed
	* @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	*/
	public ComponentControlDto remove(long id)
		throws NoSuchComponentControlDtoException;

	public ComponentControlDto updateImpl(
		ComponentControlDto componentControlDto);

	/**
	* Returns the component control dto with the primary key or throws a {@link NoSuchComponentControlDtoException} if it could not be found.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto
	* @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	*/
	public ComponentControlDto findByPrimaryKey(long id)
		throws NoSuchComponentControlDtoException;

	/**
	* Returns the component control dto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto, or <code>null</code> if a component control dto with the primary key could not be found
	*/
	public ComponentControlDto fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ComponentControlDto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the component control dtos.
	*
	* @return the component control dtos
	*/
	public java.util.List<ComponentControlDto> findAll();

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
	public java.util.List<ComponentControlDto> findAll(int start, int end);

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
	public java.util.List<ComponentControlDto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator);

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
	public java.util.List<ComponentControlDto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControlDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the component control dtos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of component control dtos.
	*
	* @return the number of component control dtos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}