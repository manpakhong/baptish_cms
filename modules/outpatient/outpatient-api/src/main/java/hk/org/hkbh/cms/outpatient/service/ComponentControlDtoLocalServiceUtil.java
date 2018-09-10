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

package hk.org.hkbh.cms.outpatient.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ComponentControlDto. This utility wraps
 * {@link hk.org.hkbh.cms.outpatient.service.impl.ComponentControlDtoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Dave Man
 * @see ComponentControlDtoLocalService
 * @see hk.org.hkbh.cms.outpatient.service.base.ComponentControlDtoLocalServiceBaseImpl
 * @see hk.org.hkbh.cms.outpatient.service.impl.ComponentControlDtoLocalServiceImpl
 * @generated
 */
@ProviderType
public class ComponentControlDtoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link hk.org.hkbh.cms.outpatient.service.impl.ComponentControlDtoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the component control dto to the database. Also notifies the appropriate model listeners.
	*
	* @param componentControlDto the component control dto
	* @return the component control dto that was added
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto addComponentControlDto(
		hk.org.hkbh.cms.outpatient.model.ComponentControlDto componentControlDto) {
		return getService().addComponentControlDto(componentControlDto);
	}

	/**
	* Creates a new component control dto with the primary key. Does not add the component control dto to the database.
	*
	* @param id the primary key for the new component control dto
	* @return the new component control dto
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto createComponentControlDto(
		long id) {
		return getService().createComponentControlDto(id);
	}

	/**
	* Deletes the component control dto from the database. Also notifies the appropriate model listeners.
	*
	* @param componentControlDto the component control dto
	* @return the component control dto that was removed
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto deleteComponentControlDto(
		hk.org.hkbh.cms.outpatient.model.ComponentControlDto componentControlDto) {
		return getService().deleteComponentControlDto(componentControlDto);
	}

	/**
	* Deletes the component control dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto that was removed
	* @throws PortalException if a component control dto with the primary key could not be found
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto deleteComponentControlDto(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteComponentControlDto(id);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto fetchComponentControlDto(
		long id) {
		return getService().fetchComponentControlDto(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the component control dto with the primary key.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto
	* @throws PortalException if a component control dto with the primary key could not be found
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto getComponentControlDto(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getComponentControlDto(id);
	}

	public static java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentControlDto> getComponentControlDtoList(
		java.lang.Long userRoleId, java.lang.Long userId) {
		return getService().getComponentControlDtoList(userRoleId, userId);
	}

	/**
	* Returns a range of all the component control dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component control dtos
	* @param end the upper bound of the range of component control dtos (not inclusive)
	* @return the range of component control dtos
	*/
	public static java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentControlDto> getComponentControlDtos(
		int start, int end) {
		return getService().getComponentControlDtos(start, end);
	}

	/**
	* Returns the number of component control dtos.
	*
	* @return the number of component control dtos
	*/
	public static int getComponentControlDtosCount() {
		return getService().getComponentControlDtosCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the component control dto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param componentControlDto the component control dto
	* @return the component control dto that was updated
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentControlDto updateComponentControlDto(
		hk.org.hkbh.cms.outpatient.model.ComponentControlDto componentControlDto) {
		return getService().updateComponentControlDto(componentControlDto);
	}

	public static ComponentControlDtoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ComponentControlDtoLocalService, ComponentControlDtoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ComponentControlDtoLocalService.class);
}