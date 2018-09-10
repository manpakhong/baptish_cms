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

import hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDetailException;
import hk.org.hkbh.cms.outpatient.model.CodeDetail;

/**
 * The persistence interface for the code detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.CodeDetailPersistenceImpl
 * @see CodeDetailUtil
 * @generated
 */
@ProviderType
public interface CodeDetailPersistence extends BasePersistence<CodeDetail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CodeDetailUtil} to access the code detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the code detail in the entity cache if it is enabled.
	*
	* @param codeDetail the code detail
	*/
	public void cacheResult(CodeDetail codeDetail);

	/**
	* Caches the code details in the entity cache if it is enabled.
	*
	* @param codeDetails the code details
	*/
	public void cacheResult(java.util.List<CodeDetail> codeDetails);

	/**
	* Creates a new code detail with the primary key. Does not add the code detail to the database.
	*
	* @param id the primary key for the new code detail
	* @return the new code detail
	*/
	public CodeDetail create(long id);

	/**
	* Removes the code detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the code detail
	* @return the code detail that was removed
	* @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	*/
	public CodeDetail remove(long id) throws NoSuchCodeDetailException;

	public CodeDetail updateImpl(CodeDetail codeDetail);

	/**
	* Returns the code detail with the primary key or throws a {@link NoSuchCodeDetailException} if it could not be found.
	*
	* @param id the primary key of the code detail
	* @return the code detail
	* @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	*/
	public CodeDetail findByPrimaryKey(long id)
		throws NoSuchCodeDetailException;

	/**
	* Returns the code detail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the code detail
	* @return the code detail, or <code>null</code> if a code detail with the primary key could not be found
	*/
	public CodeDetail fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, CodeDetail> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the code details.
	*
	* @return the code details
	*/
	public java.util.List<CodeDetail> findAll();

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
	public java.util.List<CodeDetail> findAll(int start, int end);

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
	public java.util.List<CodeDetail> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDetail> orderByComparator);

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
	public java.util.List<CodeDetail> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CodeDetail> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the code details from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of code details.
	*
	* @return the number of code details
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}