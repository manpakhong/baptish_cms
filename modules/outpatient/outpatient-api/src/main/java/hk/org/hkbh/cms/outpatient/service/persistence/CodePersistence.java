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

import hk.org.hkbh.cms.outpatient.exception.NoSuchCodeException;
import hk.org.hkbh.cms.outpatient.model.Code;

/**
 * The persistence interface for the code service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.CodePersistenceImpl
 * @see CodeUtil
 * @generated
 */
@ProviderType
public interface CodePersistence extends BasePersistence<Code> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CodeUtil} to access the code persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the code in the entity cache if it is enabled.
	*
	* @param code the code
	*/
	public void cacheResult(Code code);

	/**
	* Caches the codes in the entity cache if it is enabled.
	*
	* @param codes the codes
	*/
	public void cacheResult(java.util.List<Code> codes);

	/**
	* Creates a new code with the primary key. Does not add the code to the database.
	*
	* @param id the primary key for the new code
	* @return the new code
	*/
	public Code create(long id);

	/**
	* Removes the code with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the code
	* @return the code that was removed
	* @throws NoSuchCodeException if a code with the primary key could not be found
	*/
	public Code remove(long id) throws NoSuchCodeException;

	public Code updateImpl(Code code);

	/**
	* Returns the code with the primary key or throws a {@link NoSuchCodeException} if it could not be found.
	*
	* @param id the primary key of the code
	* @return the code
	* @throws NoSuchCodeException if a code with the primary key could not be found
	*/
	public Code findByPrimaryKey(long id) throws NoSuchCodeException;

	/**
	* Returns the code with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the code
	* @return the code, or <code>null</code> if a code with the primary key could not be found
	*/
	public Code fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, Code> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the codes.
	*
	* @return the codes
	*/
	public java.util.List<Code> findAll();

	/**
	* Returns a range of all the codes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of codes
	* @param end the upper bound of the range of codes (not inclusive)
	* @return the range of codes
	*/
	public java.util.List<Code> findAll(int start, int end);

	/**
	* Returns an ordered range of all the codes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of codes
	* @param end the upper bound of the range of codes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of codes
	*/
	public java.util.List<Code> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Code> orderByComparator);

	/**
	* Returns an ordered range of all the codes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of codes
	* @param end the upper bound of the range of codes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of codes
	*/
	public java.util.List<Code> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Code> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the codes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of codes.
	*
	* @return the number of codes
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}