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

import hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException;
import hk.org.hkbh.cms.outpatient.model.CodeDto;

/**
 * The persistence interface for the code dto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.CodeDtoPersistenceImpl
 * @see CodeDtoUtil
 * @generated
 */
@ProviderType
public interface CodeDtoPersistence extends BasePersistence<CodeDto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CodeDtoUtil} to access the code dto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the code dtos where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @return the matching code dtos
	*/
	public java.util.List<CodeDto> findByMasterCode(java.lang.String masterCode);

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
	public java.util.List<CodeDto> findByMasterCode(
		java.lang.String masterCode, int start, int end);

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
	public java.util.List<CodeDto> findByMasterCode(
		java.lang.String masterCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator);

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
	public java.util.List<CodeDto> findByMasterCode(
		java.lang.String masterCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching code dto
	* @throws NoSuchCodeDtoException if a matching code dto could not be found
	*/
	public CodeDto findByMasterCode_First(java.lang.String masterCode,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator)
		throws NoSuchCodeDtoException;

	/**
	* Returns the first code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching code dto, or <code>null</code> if a matching code dto could not be found
	*/
	public CodeDto fetchByMasterCode_First(java.lang.String masterCode,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator);

	/**
	* Returns the last code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching code dto
	* @throws NoSuchCodeDtoException if a matching code dto could not be found
	*/
	public CodeDto findByMasterCode_Last(java.lang.String masterCode,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator)
		throws NoSuchCodeDtoException;

	/**
	* Returns the last code dto in the ordered set where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching code dto, or <code>null</code> if a matching code dto could not be found
	*/
	public CodeDto fetchByMasterCode_Last(java.lang.String masterCode,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator);

	/**
	* Returns the code dtos before and after the current code dto in the ordered set where masterCode = &#63;.
	*
	* @param id the primary key of the current code dto
	* @param masterCode the master code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next code dto
	* @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	*/
	public CodeDto[] findByMasterCode_PrevAndNext(int id,
		java.lang.String masterCode,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator)
		throws NoSuchCodeDtoException;

	/**
	* Removes all the code dtos where masterCode = &#63; from the database.
	*
	* @param masterCode the master code
	*/
	public void removeByMasterCode(java.lang.String masterCode);

	/**
	* Returns the number of code dtos where masterCode = &#63;.
	*
	* @param masterCode the master code
	* @return the number of matching code dtos
	*/
	public int countByMasterCode(java.lang.String masterCode);

	/**
	* Caches the code dto in the entity cache if it is enabled.
	*
	* @param codeDto the code dto
	*/
	public void cacheResult(CodeDto codeDto);

	/**
	* Caches the code dtos in the entity cache if it is enabled.
	*
	* @param codeDtos the code dtos
	*/
	public void cacheResult(java.util.List<CodeDto> codeDtos);

	/**
	* Creates a new code dto with the primary key. Does not add the code dto to the database.
	*
	* @param id the primary key for the new code dto
	* @return the new code dto
	*/
	public CodeDto create(int id);

	/**
	* Removes the code dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the code dto
	* @return the code dto that was removed
	* @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	*/
	public CodeDto remove(int id) throws NoSuchCodeDtoException;

	public CodeDto updateImpl(CodeDto codeDto);

	/**
	* Returns the code dto with the primary key or throws a {@link NoSuchCodeDtoException} if it could not be found.
	*
	* @param id the primary key of the code dto
	* @return the code dto
	* @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	*/
	public CodeDto findByPrimaryKey(int id) throws NoSuchCodeDtoException;

	/**
	* Returns the code dto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the code dto
	* @return the code dto, or <code>null</code> if a code dto with the primary key could not be found
	*/
	public CodeDto fetchByPrimaryKey(int id);

	@Override
	public java.util.Map<java.io.Serializable, CodeDto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the code dtos.
	*
	* @return the code dtos
	*/
	public java.util.List<CodeDto> findAll();

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
	public java.util.List<CodeDto> findAll(int start, int end);

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
	public java.util.List<CodeDto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator);

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
	public java.util.List<CodeDto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the code dtos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of code dtos.
	*
	* @return the number of code dtos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}