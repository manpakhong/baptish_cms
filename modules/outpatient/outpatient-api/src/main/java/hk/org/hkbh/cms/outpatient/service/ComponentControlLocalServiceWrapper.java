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
 * Provides a wrapper for {@link ComponentControlLocalService}.
 *
 * @author Dave Man
 * @see ComponentControlLocalService
 * @generated
 */
@ProviderType
public class ComponentControlLocalServiceWrapper
	implements ComponentControlLocalService,
		ServiceWrapper<ComponentControlLocalService> {
	public ComponentControlLocalServiceWrapper(
		ComponentControlLocalService componentControlLocalService) {
		_componentControlLocalService = componentControlLocalService;
	}

	/**
	* Adds the component control to the database. Also notifies the appropriate model listeners.
	*
	* @param componentControl the component control
	* @return the component control that was added
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl addComponentControl(
		hk.org.hkbh.cms.outpatient.model.ComponentControl componentControl) {
		return _componentControlLocalService.addComponentControl(componentControl);
	}

	/**
	* Creates a new component control with the primary key. Does not add the component control to the database.
	*
	* @param id the primary key for the new component control
	* @return the new component control
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl createComponentControl(
		long id) {
		return _componentControlLocalService.createComponentControl(id);
	}

	/**
	* Deletes the component control from the database. Also notifies the appropriate model listeners.
	*
	* @param componentControl the component control
	* @return the component control that was removed
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl deleteComponentControl(
		hk.org.hkbh.cms.outpatient.model.ComponentControl componentControl) {
		return _componentControlLocalService.deleteComponentControl(componentControl);
	}

	/**
	* Deletes the component control with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the component control
	* @return the component control that was removed
	* @throws PortalException if a component control with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl deleteComponentControl(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlLocalService.deleteComponentControl(id);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _componentControlLocalService.dynamicQuery();
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
		return _componentControlLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _componentControlLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _componentControlLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _componentControlLocalService.dynamicQueryCount(dynamicQuery);
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
		return _componentControlLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl fetchComponentControl(
		long id) {
		return _componentControlLocalService.fetchComponentControl(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _componentControlLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the component control with the primary key.
	*
	* @param id the primary key of the component control
	* @return the component control
	* @throws PortalException if a component control with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl getComponentControl(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlLocalService.getComponentControl(id);
	}

	/**
	* Returns a range of all the component controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of component controls
	* @param end the upper bound of the range of component controls (not inclusive)
	* @return the range of component controls
	*/
	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ComponentControl> getComponentControls(
		int start, int end) {
		return _componentControlLocalService.getComponentControls(start, end);
	}

	/**
	* Returns the number of component controls.
	*
	* @return the number of component controls
	*/
	@Override
	public int getComponentControlsCount() {
		return _componentControlLocalService.getComponentControlsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _componentControlLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _componentControlLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _componentControlLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the component control in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param componentControl the component control
	* @return the component control that was updated
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ComponentControl updateComponentControl(
		hk.org.hkbh.cms.outpatient.model.ComponentControl componentControl) {
		return _componentControlLocalService.updateComponentControl(componentControl);
	}

	@Override
	public ComponentControlLocalService getWrappedService() {
		return _componentControlLocalService;
	}

	@Override
	public void setWrappedService(
		ComponentControlLocalService componentControlLocalService) {
		_componentControlLocalService = componentControlLocalService;
	}

	private ComponentControlLocalService _componentControlLocalService;
}