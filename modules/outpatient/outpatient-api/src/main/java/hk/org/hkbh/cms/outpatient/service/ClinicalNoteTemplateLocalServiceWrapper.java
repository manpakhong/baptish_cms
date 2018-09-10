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
 * Provides a wrapper for {@link ClinicalNoteTemplateLocalService}.
 *
 * @author Dave Man
 * @see ClinicalNoteTemplateLocalService
 * @generated
 */
@ProviderType
public class ClinicalNoteTemplateLocalServiceWrapper
	implements ClinicalNoteTemplateLocalService,
		ServiceWrapper<ClinicalNoteTemplateLocalService> {
	public ClinicalNoteTemplateLocalServiceWrapper(
		ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
		_clinicalNoteTemplateLocalService = clinicalNoteTemplateLocalService;
	}

	/**
	* Adds the clinical note template to the database. Also notifies the appropriate model listeners.
	*
	* @param clinicalNoteTemplate the clinical note template
	* @return the clinical note template that was added
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate addClinicalNoteTemplate(
		hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate clinicalNoteTemplate) {
		return _clinicalNoteTemplateLocalService.addClinicalNoteTemplate(clinicalNoteTemplate);
	}

	/**
	* Creates a new clinical note template with the primary key. Does not add the clinical note template to the database.
	*
	* @param id the primary key for the new clinical note template
	* @return the new clinical note template
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate createClinicalNoteTemplate(
		long id) {
		return _clinicalNoteTemplateLocalService.createClinicalNoteTemplate(id);
	}

	/**
	* Deletes the clinical note template from the database. Also notifies the appropriate model listeners.
	*
	* @param clinicalNoteTemplate the clinical note template
	* @return the clinical note template that was removed
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate deleteClinicalNoteTemplate(
		hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate clinicalNoteTemplate) {
		return _clinicalNoteTemplateLocalService.deleteClinicalNoteTemplate(clinicalNoteTemplate);
	}

	/**
	* Deletes the clinical note template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template that was removed
	* @throws PortalException if a clinical note template with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate deleteClinicalNoteTemplate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _clinicalNoteTemplateLocalService.deleteClinicalNoteTemplate(id);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clinicalNoteTemplateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _clinicalNoteTemplateLocalService.dynamicQuery();
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
		return _clinicalNoteTemplateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _clinicalNoteTemplateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _clinicalNoteTemplateLocalService.dynamicQuery(dynamicQuery,
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
		return _clinicalNoteTemplateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _clinicalNoteTemplateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate fetchClinicalNoteTemplate(
		long id) {
		return _clinicalNoteTemplateLocalService.fetchClinicalNoteTemplate(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _clinicalNoteTemplateLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the clinical note template with the primary key.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template
	* @throws PortalException if a clinical note template with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate getClinicalNoteTemplate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _clinicalNoteTemplateLocalService.getClinicalNoteTemplate(id);
	}

	/**
	* Returns a range of all the clinical note templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clinical note templates
	* @param end the upper bound of the range of clinical note templates (not inclusive)
	* @return the range of clinical note templates
	*/
	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate> getClinicalNoteTemplates(
		int start, int end) {
		return _clinicalNoteTemplateLocalService.getClinicalNoteTemplates(start,
			end);
	}

	/**
	* Returns the number of clinical note templates.
	*
	* @return the number of clinical note templates
	*/
	@Override
	public int getClinicalNoteTemplatesCount() {
		return _clinicalNoteTemplateLocalService.getClinicalNoteTemplatesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _clinicalNoteTemplateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _clinicalNoteTemplateLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clinicalNoteTemplateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the clinical note template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clinicalNoteTemplate the clinical note template
	* @return the clinical note template that was updated
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate updateClinicalNoteTemplate(
		hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate clinicalNoteTemplate) {
		return _clinicalNoteTemplateLocalService.updateClinicalNoteTemplate(clinicalNoteTemplate);
	}

	@Override
	public ClinicalNoteTemplateLocalService getWrappedService() {
		return _clinicalNoteTemplateLocalService;
	}

	@Override
	public void setWrappedService(
		ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
		_clinicalNoteTemplateLocalService = clinicalNoteTemplateLocalService;
	}

	private ClinicalNoteTemplateLocalService _clinicalNoteTemplateLocalService;
}