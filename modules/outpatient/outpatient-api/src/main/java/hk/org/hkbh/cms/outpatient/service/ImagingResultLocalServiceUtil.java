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
 * Provides the local service utility for ImagingResult. This utility wraps
 * {@link hk.org.hkbh.cms.outpatient.service.impl.ImagingResultLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Dave Man
 * @see ImagingResultLocalService
 * @see hk.org.hkbh.cms.outpatient.service.base.ImagingResultLocalServiceBaseImpl
 * @see hk.org.hkbh.cms.outpatient.service.impl.ImagingResultLocalServiceImpl
 * @generated
 */
@ProviderType
public class ImagingResultLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link hk.org.hkbh.cms.outpatient.service.impl.ImagingResultLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the imaging result to the database. Also notifies the appropriate model listeners.
	*
	* @param imagingResult the imaging result
	* @return the imaging result that was added
	*/
	public static hk.org.hkbh.cms.outpatient.model.ImagingResult addImagingResult(
		hk.org.hkbh.cms.outpatient.model.ImagingResult imagingResult) {
		return getService().addImagingResult(imagingResult);
	}

	/**
	* Creates a new imaging result with the primary key. Does not add the imaging result to the database.
	*
	* @param id the primary key for the new imaging result
	* @return the new imaging result
	*/
	public static hk.org.hkbh.cms.outpatient.model.ImagingResult createImagingResult(
		long id) {
		return getService().createImagingResult(id);
	}

	/**
	* Deletes the imaging result from the database. Also notifies the appropriate model listeners.
	*
	* @param imagingResult the imaging result
	* @return the imaging result that was removed
	*/
	public static hk.org.hkbh.cms.outpatient.model.ImagingResult deleteImagingResult(
		hk.org.hkbh.cms.outpatient.model.ImagingResult imagingResult) {
		return getService().deleteImagingResult(imagingResult);
	}

	/**
	* Deletes the imaging result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imaging result
	* @return the imaging result that was removed
	* @throws PortalException if a imaging result with the primary key could not be found
	*/
	public static hk.org.hkbh.cms.outpatient.model.ImagingResult deleteImagingResult(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteImagingResult(id);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static hk.org.hkbh.cms.outpatient.model.ImagingResult fetchImagingResult(
		long id) {
		return getService().fetchImagingResult(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the imaging result with the primary key.
	*
	* @param id the primary key of the imaging result
	* @return the imaging result
	* @throws PortalException if a imaging result with the primary key could not be found
	*/
	public static hk.org.hkbh.cms.outpatient.model.ImagingResult getImagingResult(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getImagingResult(id);
	}

	/**
	* Returns a range of all the imaging results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @return the range of imaging results
	*/
	public static java.util.List<hk.org.hkbh.cms.outpatient.model.ImagingResult> getImagingResults(
		int start, int end) {
		return getService().getImagingResults(start, end);
	}

	/**
	* Returns the number of imaging results.
	*
	* @return the number of imaging results
	*/
	public static int getImagingResultsCount() {
		return getService().getImagingResultsCount();
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
	* Updates the imaging result in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param imagingResult the imaging result
	* @return the imaging result that was updated
	*/
	public static hk.org.hkbh.cms.outpatient.model.ImagingResult updateImagingResult(
		hk.org.hkbh.cms.outpatient.model.ImagingResult imagingResult) {
		return getService().updateImagingResult(imagingResult);
	}

	public static ImagingResultLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ImagingResultLocalService, ImagingResultLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ImagingResultLocalService.class);
}