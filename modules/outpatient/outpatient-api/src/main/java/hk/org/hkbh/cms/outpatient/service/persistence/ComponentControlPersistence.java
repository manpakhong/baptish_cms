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

import hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException;
import hk.org.hkbh.cms.outpatient.model.ComponentControl;

/**
 * The persistence interface for the component control service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ComponentControlPersistenceImpl
 * @see ComponentControlUtil
 * @generated
 */
@ProviderType
public interface ComponentControlPersistence extends BasePersistence<ComponentControl> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComponentControlUtil} to access the component control persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the component controls where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching component controls
	*/
	public java.util.List<ComponentControl> findByUserId(java.lang.Long userId);

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
	public java.util.List<ComponentControl> findByUserId(
		java.lang.Long userId, int start, int end);

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
	public java.util.List<ComponentControl> findByUserId(
		java.lang.Long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

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
	public java.util.List<ComponentControl> findByUserId(
		java.lang.Long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public ComponentControl findByUserId_First(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Returns the first component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public ComponentControl fetchByUserId_First(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

	/**
	* Returns the last component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public ComponentControl findByUserId_Last(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Returns the last component control in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public ComponentControl fetchByUserId_Last(java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

	/**
	* Returns the component controls before and after the current component control in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current component control
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public ComponentControl[] findByUserId_PrevAndNext(long id,
		java.lang.Long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Removes all the component controls where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(java.lang.Long userId);

	/**
	* Returns the number of component controls where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching component controls
	*/
	public int countByUserId(java.lang.Long userId);

	/**
	* Returns all the component controls where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @return the matching component controls
	*/
	public java.util.List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId);

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
	public java.util.List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end);

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
	public java.util.List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

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
	public java.util.List<ComponentControl> findByUserRoleId(
		java.lang.Long userRoleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public ComponentControl findByUserRoleId_First(java.lang.Long userRoleId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Returns the first component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public ComponentControl fetchByUserRoleId_First(java.lang.Long userRoleId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

	/**
	* Returns the last component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public ComponentControl findByUserRoleId_Last(java.lang.Long userRoleId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Returns the last component control in the ordered set where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public ComponentControl fetchByUserRoleId_Last(java.lang.Long userRoleId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

	/**
	* Returns the component controls before and after the current component control in the ordered set where userRoleId = &#63;.
	*
	* @param id the primary key of the current component control
	* @param userRoleId the user role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public ComponentControl[] findByUserRoleId_PrevAndNext(long id,
		java.lang.Long userRoleId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Removes all the component controls where userRoleId = &#63; from the database.
	*
	* @param userRoleId the user role ID
	*/
	public void removeByUserRoleId(java.lang.Long userRoleId);

	/**
	* Returns the number of component controls where userRoleId = &#63;.
	*
	* @param userRoleId the user role ID
	* @return the number of matching component controls
	*/
	public int countByUserRoleId(java.lang.Long userRoleId);

	/**
	* Returns all the component controls where componentId = &#63;.
	*
	* @param componentId the component ID
	* @return the matching component controls
	*/
	public java.util.List<ComponentControl> findByComponentId(
		java.lang.Long componentId);

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
	public java.util.List<ComponentControl> findByComponentId(
		java.lang.Long componentId, int start, int end);

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
	public java.util.List<ComponentControl> findByComponentId(
		java.lang.Long componentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

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
	public java.util.List<ComponentControl> findByComponentId(
		java.lang.Long componentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public ComponentControl findByComponentId_First(
		java.lang.Long componentId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Returns the first component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public ComponentControl fetchByComponentId_First(
		java.lang.Long componentId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

	/**
	* Returns the last component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control
	* @throws NoSuchComponentControlException if a matching component control could not be found
	*/
	public ComponentControl findByComponentId_Last(java.lang.Long componentId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Returns the last component control in the ordered set where componentId = &#63;.
	*
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching component control, or <code>null</code> if a matching component control could not be found
	*/
	public ComponentControl fetchByComponentId_Last(
		java.lang.Long componentId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

	/**
	* Returns the component controls before and after the current component control in the ordered set where componentId = &#63;.
	*
	* @param id the primary key of the current component control
	* @param componentId the component ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public ComponentControl[] findByComponentId_PrevAndNext(long id,
		java.lang.Long componentId,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException;

	/**
	* Removes all the component controls where componentId = &#63; from the database.
	*
	* @param componentId the component ID
	*/
	public void removeByComponentId(java.lang.Long componentId);

	/**
	* Returns the number of component controls where componentId = &#63;.
	*
	* @param componentId the component ID
	* @return the number of matching component controls
	*/
	public int countByComponentId(java.lang.Long componentId);

	/**
	* Caches the component control in the entity cache if it is enabled.
	*
	* @param componentControl the component control
	*/
	public void cacheResult(ComponentControl componentControl);

	/**
	* Caches the component controls in the entity cache if it is enabled.
	*
	* @param componentControls the component controls
	*/
	public void cacheResult(java.util.List<ComponentControl> componentControls);

	/**
	* Creates a new component control with the primary key. Does not add the component control to the database.
	*
	* @param id the primary key for the new component control
	* @return the new component control
	*/
	public ComponentControl create(long id);

	/**
	* Removes the component control with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component control
	* @return the component control that was removed
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public ComponentControl remove(long id)
		throws NoSuchComponentControlException;

	public ComponentControl updateImpl(ComponentControl componentControl);

	/**
	* Returns the component control with the primary key or throws a {@link NoSuchComponentControlException} if it could not be found.
	*
	* @param id the primary key of the component control
	* @return the component control
	* @throws NoSuchComponentControlException if a component control with the primary key could not be found
	*/
	public ComponentControl findByPrimaryKey(long id)
		throws NoSuchComponentControlException;

	/**
	* Returns the component control with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the component control
	* @return the component control, or <code>null</code> if a component control with the primary key could not be found
	*/
	public ComponentControl fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ComponentControl> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the component controls.
	*
	* @return the component controls
	*/
	public java.util.List<ComponentControl> findAll();

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
	public java.util.List<ComponentControl> findAll(int start, int end);

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
	public java.util.List<ComponentControl> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator);

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
	public java.util.List<ComponentControl> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the component controls from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of component controls.
	*
	* @return the number of component controls
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}