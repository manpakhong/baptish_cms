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
 * Provides the local service utility for ComponentDto. This utility wraps
 * {@link hk.org.hkbh.cms.outpatient.service.impl.ComponentDtoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Dave Man
 * @see ComponentDtoLocalService
 * @see hk.org.hkbh.cms.outpatient.service.base.ComponentDtoLocalServiceBaseImpl
 * @see hk.org.hkbh.cms.outpatient.service.impl.ComponentDtoLocalServiceImpl
 * @generated
 */
@ProviderType
public class ComponentDtoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link hk.org.hkbh.cms.outpatient.service.impl.ComponentDtoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the component dto to the database. Also notifies the appropriate model listeners.
	*
	* @param componentDto the component dto
	* @return the component dto that was added
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentDto addComponentDto(
		hk.org.hkbh.cms.outpatient.model.ComponentDto componentDto) {
		return getService().addComponentDto(componentDto);
	}

	/**
	* Creates a new component dto with the primary key. Does not add the component dto to the database.
	*
	* @param id the primary key for the new component dto
	* @return the new component dto
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentDto createComponentDto(
		long id) {
		return getService().createComponentDto(id);
	}

	/**
	* Deletes the component dto from the database. Also notifies the appropriate model listeners.
	*
	* @param componentDto the component dto
	* @return the component dto that was removed
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentDto deleteComponentDto(
		hk.org.hkbh.cms.outpatient.model.ComponentDto componentDto) {
		return getService().deleteComponentDto(componentDto);
	}

	/**
	* Deletes the component dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component dto
	* @return the component dto that was removed
	* @throws PortalException if a component dto with the primary key could not be found
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentDto deleteComponentDto(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteComponentDto(id);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static hk.org.hkbh.cms.outpatient.model.ComponentDto fetchComponentDto(
		long id) {
		return getService().fetchComponentDto(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the component dto with the primary key.
	*
	* @param id the primary key of the component dto
	* @return the component dto
	* @throws PortalException if a component dto with the primary key could not be found
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentDto getComponentDto(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getComponentDto(id);
	}

	public static java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentDto> getComponentDtoList(
		hk.org.hkbh.cms.outpatient.so.ComponentDtoSo so) {
		return getService().getComponentDtoList(so);
	}

	/**
	* Returns a range of all the component dtos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component dtos
	* @param end the upper bound of the range of component dtos (not inclusive)
	* @return the range of component dtos
	*/
	public static java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentDto> getComponentDtos(
		int start, int end) {
		return getService().getComponentDtos(start, end);
	}

	/**
	* Returns the number of component dtos.
	*
	* @return the number of component dtos
	*/
	public static int getComponentDtosCount() {
		return getService().getComponentDtosCount();
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
	* Updates the component dto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param componentDto the component dto
	* @return the component dto that was updated
	*/
	public static hk.org.hkbh.cms.outpatient.model.ComponentDto updateComponentDto(
		hk.org.hkbh.cms.outpatient.model.ComponentDto componentDto) {
		return getService().updateComponentDto(componentDto);
	}

	public static ComponentDtoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ComponentDtoLocalService, ComponentDtoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ComponentDtoLocalService.class);
}