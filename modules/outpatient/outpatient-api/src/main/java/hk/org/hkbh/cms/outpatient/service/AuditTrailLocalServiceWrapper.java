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
 * Provides a wrapper for {@link AuditTrailLocalService}.
 *
 * @author Dave Man
 * @see AuditTrailLocalService
 * @generated
 */
@ProviderType
public class AuditTrailLocalServiceWrapper implements AuditTrailLocalService,
	ServiceWrapper<AuditTrailLocalService> {
	public AuditTrailLocalServiceWrapper(
		AuditTrailLocalService auditTrailLocalService) {
		_auditTrailLocalService = auditTrailLocalService;
	}

	/**
	* Adds the audit trail to the database. Also notifies the appropriate model listeners.
	*
	* @param auditTrail the audit trail
	* @return the audit trail that was added
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail addAuditTrail(
		hk.org.hkbh.cms.outpatient.model.AuditTrail auditTrail) {
		return _auditTrailLocalService.addAuditTrail(auditTrail);
	}

	/**
	* Creates a new audit trail with the primary key. Does not add the audit trail to the database.
	*
	* @param id the primary key for the new audit trail
	* @return the new audit trail
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail createAuditTrail(long id) {
		return _auditTrailLocalService.createAuditTrail(id);
	}

	/**
	* Deletes the audit trail from the database. Also notifies the appropriate model listeners.
	*
	* @param auditTrail the audit trail
	* @return the audit trail that was removed
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail deleteAuditTrail(
		hk.org.hkbh.cms.outpatient.model.AuditTrail auditTrail) {
		return _auditTrailLocalService.deleteAuditTrail(auditTrail);
	}

	/**
	* Deletes the audit trail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail that was removed
	* @throws PortalException if a audit trail with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail deleteAuditTrail(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _auditTrailLocalService.deleteAuditTrail(id);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _auditTrailLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _auditTrailLocalService.dynamicQuery();
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
		return _auditTrailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _auditTrailLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _auditTrailLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _auditTrailLocalService.dynamicQueryCount(dynamicQuery);
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
		return _auditTrailLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail fetchAuditTrail(long id) {
		return _auditTrailLocalService.fetchAuditTrail(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _auditTrailLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the audit trail with the primary key.
	*
	* @param id the primary key of the audit trail
	* @return the audit trail
	* @throws PortalException if a audit trail with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail getAuditTrail(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _auditTrailLocalService.getAuditTrail(id);
	}

	/**
	* Returns a range of all the audit trails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of audit trails
	* @param end the upper bound of the range of audit trails (not inclusive)
	* @return the range of audit trails
	*/
	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.AuditTrail> getAuditTrails(
		int start, int end) {
		return _auditTrailLocalService.getAuditTrails(start, end);
	}

	/**
	* Returns the number of audit trails.
	*
	* @return the number of audit trails
	*/
	@Override
	public int getAuditTrailsCount() {
		return _auditTrailLocalService.getAuditTrailsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _auditTrailLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _auditTrailLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _auditTrailLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the audit trail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param auditTrail the audit trail
	* @return the audit trail that was updated
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.AuditTrail updateAuditTrail(
		hk.org.hkbh.cms.outpatient.model.AuditTrail auditTrail) {
		return _auditTrailLocalService.updateAuditTrail(auditTrail);
	}

	@Override
	public AuditTrailLocalService getWrappedService() {
		return _auditTrailLocalService;
	}

	@Override
	public void setWrappedService(AuditTrailLocalService auditTrailLocalService) {
		_auditTrailLocalService = auditTrailLocalService;
	}

	private AuditTrailLocalService _auditTrailLocalService;
}