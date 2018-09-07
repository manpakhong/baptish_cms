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
 * Provides a wrapper for {@link ComponentControlDtoLocalService}.
 *
 * @author Dave Man
 * @see ComponentControlDtoLocalService
 * @generated
 */
@ProviderType
public class ComponentControlDtoLocalServiceWrapper
	implements ComponentControlDtoLocalService,
		ServiceWrapper<ComponentControlDtoLocalService> {
	public ComponentControlDtoLocalServiceWrapper(
		ComponentControlDtoLocalService componentControlDtoLocalService) {
		_componentControlDtoLocalService = componentControlDtoLocalService;
	}

	/**
	* Adds the component control dto to the database. Also notifies the appropriate model listeners.
	*
	* @param componentControlDto the component control dto
	* @return the component control dto that was added
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto addComponentControlDto(
		hk.org.hkbh.cms.outpatient.model.ComponentControlDto componentControlDto) {
		return _componentControlDtoLocalService.addComponentControlDto(componentControlDto);
	}

	/**
	* Creates a new component control dto with the primary key. Does not add the component control dto to the database.
	*
	* @param id the primary key for the new component control dto
	* @return the new component control dto
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto createComponentControlDto(
		int id) {
		return _componentControlDtoLocalService.createComponentControlDto(id);
	}

	/**
	* Deletes the component control dto from the database. Also notifies the appropriate model listeners.
	*
	* @param componentControlDto the component control dto
	* @return the component control dto that was removed
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto deleteComponentControlDto(
		hk.org.hkbh.cms.outpatient.model.ComponentControlDto componentControlDto) {
		return _componentControlDtoLocalService.deleteComponentControlDto(componentControlDto);
	}

	/**
	* Deletes the component control dto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto that was removed
	* @throws PortalException if a component control dto with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto deleteComponentControlDto(
		int id) throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlDtoLocalService.deleteComponentControlDto(id);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlDtoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _componentControlDtoLocalService.dynamicQuery();
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
		return _componentControlDtoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _componentControlDtoLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _componentControlDtoLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _componentControlDtoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _componentControlDtoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto fetchComponentControlDto(
		int id) {
		return _componentControlDtoLocalService.fetchComponentControlDto(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _componentControlDtoLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the component control dto with the primary key.
	*
	* @param id the primary key of the component control dto
	* @return the component control dto
	* @throws PortalException if a component control dto with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto getComponentControlDto(
		int id) throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlDtoLocalService.getComponentControlDto(id);
	}

	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentControlDto> getComponentControlDtoList(
		java.lang.Long userRoleId, java.lang.Long userId) {
		return _componentControlDtoLocalService.getComponentControlDtoList(userRoleId,
			userId);
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
	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentControlDto> getComponentControlDtos(
		int start, int end) {
		return _componentControlDtoLocalService.getComponentControlDtos(start,
			end);
	}

	/**
	* Returns the number of component control dtos.
	*
	* @return the number of component control dtos
	*/
	@Override
	public int getComponentControlDtosCount() {
		return _componentControlDtoLocalService.getComponentControlDtosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _componentControlDtoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _componentControlDtoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlDtoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the component control dto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param componentControlDto the component control dto
	* @return the component control dto that was updated
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControlDto updateComponentControlDto(
		hk.org.hkbh.cms.outpatient.model.ComponentControlDto componentControlDto) {
		return _componentControlDtoLocalService.updateComponentControlDto(componentControlDto);
	}

	@Override
	public ComponentControlDtoLocalService getWrappedService() {
		return _componentControlDtoLocalService;
	}

	@Override
	public void setWrappedService(
		ComponentControlDtoLocalService componentControlDtoLocalService) {
		_componentControlDtoLocalService = componentControlDtoLocalService;
	}

	private ComponentControlDtoLocalService _componentControlDtoLocalService;
}