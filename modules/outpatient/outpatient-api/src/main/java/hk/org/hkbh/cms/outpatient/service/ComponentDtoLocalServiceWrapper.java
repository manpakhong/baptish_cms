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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ComponentDtoLocalService}.
 *
 * @author Dave Man
 * @see ComponentDtoLocalService
 * @generated
 */
@ProviderType
public class ComponentDtoLocalServiceWrapper implements ComponentDtoLocalService,
	ServiceWrapper<ComponentDtoLocalService> {
	public ComponentDtoLocalServiceWrapper(
		ComponentDtoLocalService componentDtoLocalService) {
		_componentDtoLocalService = componentDtoLocalService;
	}

	/**
	* Adds the component dto to the database. Also notifies the appropriate model listeners.
	*
	* @param componentDto the component dto
	* @return the component dto that was added
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto addComponentDto(
		hk.org.hkbh.cms.outpatient.model.ComponentDto componentDto) {
		return _componentDtoLocalService.addComponentDto(componentDto);
	}

	/**
	* Creates a new component dto with the primary key. Does not add the component dto to the database.
	*
	* @param id the primary key for the new component dto
	* @return the new component dto
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto createComponentDto(
		long id) {
		return _componentDtoLocalService.createComponentDto(id);
	}

	/**
	* Deletes the component dto from the database. Also notifies the appropriate model listeners.
	*
	* @param componentDto the component dto
	* @return the component dto that was removed
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto deleteComponentDto(
		hk.org.hkbh.cms.outpatient.model.ComponentDto componentDto) {
		return _componentDtoLocalService.deleteComponentDto(componentDto);
	}

	/**
	* Deletes the component dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component dto
	* @return the component dto that was removed
	* @throws PortalException if a component dto with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto deleteComponentDto(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _componentDtoLocalService.deleteComponentDto(id);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _componentDtoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _componentDtoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _componentDtoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _componentDtoLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _componentDtoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _componentDtoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _componentDtoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto fetchComponentDto(
		long id) {
		return _componentDtoLocalService.fetchComponentDto(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _componentDtoLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the component dto with the primary key.
	*
	* @param id the primary key of the component dto
	* @return the component dto
	* @throws PortalException if a component dto with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto getComponentDto(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _componentDtoLocalService.getComponentDto(id);
	}

	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentDto> getComponentDtoList(
		hk.org.hkbh.cms.outpatient.so.ComponentDtoSo so) {
		return _componentDtoLocalService.getComponentDtoList(so);
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
	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentDto> getComponentDtos(
		int start, int end) {
		return _componentDtoLocalService.getComponentDtos(start, end);
	}

	/**
	* Returns the number of component dtos.
	*
	* @return the number of component dtos
	*/
	@Override
	public int getComponentDtosCount() {
		return _componentDtoLocalService.getComponentDtosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _componentDtoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _componentDtoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _componentDtoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the component dto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param componentDto the component dto
	* @return the component dto that was updated
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentDto updateComponentDto(
		hk.org.hkbh.cms.outpatient.model.ComponentDto componentDto) {
		return _componentDtoLocalService.updateComponentDto(componentDto);
	}

	@Override
	public ComponentDtoLocalService getWrappedService() {
		return _componentDtoLocalService;
	}

	@Override
	public void setWrappedService(
		ComponentDtoLocalService componentDtoLocalService) {
		_componentDtoLocalService = componentDtoLocalService;
	}

	private ComponentDtoLocalService _componentDtoLocalService;
}