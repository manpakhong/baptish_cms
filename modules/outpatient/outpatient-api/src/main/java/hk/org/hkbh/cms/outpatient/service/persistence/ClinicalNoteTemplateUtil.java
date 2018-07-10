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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the clinical note template service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.ClinicalNoteTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ClinicalNoteTemplatePersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ClinicalNoteTemplatePersistenceImpl
 * @generated
 */
@ProviderType
public class ClinicalNoteTemplateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ClinicalNoteTemplate clinicalNoteTemplate) {
		getPersistence().clearCache(clinicalNoteTemplate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ClinicalNoteTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ClinicalNoteTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ClinicalNoteTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ClinicalNoteTemplate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ClinicalNoteTemplate update(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		return getPersistence().update(clinicalNoteTemplate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ClinicalNoteTemplate update(
		ClinicalNoteTemplate clinicalNoteTemplate, ServiceContext serviceContext) {
		return getPersistence().update(clinicalNoteTemplate, serviceContext);
	}

	/**
	* Caches the clinical note template in the entity cache if it is enabled.
	*
	* @param clinicalNoteTemplate the clinical note template
	*/
	public static void cacheResult(ClinicalNoteTemplate clinicalNoteTemplate) {
		getPersistence().cacheResult(clinicalNoteTemplate);
	}

	/**
	* Caches the clinical note templates in the entity cache if it is enabled.
	*
	* @param clinicalNoteTemplates the clinical note templates
	*/
	public static void cacheResult(
		List<ClinicalNoteTemplate> clinicalNoteTemplates) {
		getPersistence().cacheResult(clinicalNoteTemplates);
	}

	/**
	* Creates a new clinical note template with the primary key. Does not add the clinical note template to the database.
	*
	* @param id the primary key for the new clinical note template
	* @return the new clinical note template
	*/
	public static ClinicalNoteTemplate create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the clinical note template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template that was removed
	* @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	*/
	public static ClinicalNoteTemplate remove(int id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchClinicalNoteTemplateException {
		return getPersistence().remove(id);
	}

	public static ClinicalNoteTemplate updateImpl(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		return getPersistence().updateImpl(clinicalNoteTemplate);
	}

	/**
	* Returns the clinical note template with the primary key or throws a {@link NoSuchClinicalNoteTemplateException} if it could not be found.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template
	* @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	*/
	public static ClinicalNoteTemplate findByPrimaryKey(int id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchClinicalNoteTemplateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the clinical note template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template, or <code>null</code> if a clinical note template with the primary key could not be found
	*/
	public static ClinicalNoteTemplate fetchByPrimaryKey(int id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ClinicalNoteTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the clinical note templates.
	*
	* @return the clinical note templates
	*/
	public static List<ClinicalNoteTemplate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the clinical note templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clinical note templates
	* @param end the upper bound of the range of clinical note templates (not inclusive)
	* @return the range of clinical note templates
	*/
	public static List<ClinicalNoteTemplate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the clinical note templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clinical note templates
	* @param end the upper bound of the range of clinical note templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clinical note templates
	*/
	public static List<ClinicalNoteTemplate> findAll(int start, int end,
		OrderByComparator<ClinicalNoteTemplate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clinical note templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clinical note templates
	* @param end the upper bound of the range of clinical note templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of clinical note templates
	*/
	public static List<ClinicalNoteTemplate> findAll(int start, int end,
		OrderByComparator<ClinicalNoteTemplate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the clinical note templates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of clinical note templates.
	*
	* @return the number of clinical note templates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ClinicalNoteTemplatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClinicalNoteTemplatePersistence, ClinicalNoteTemplatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ClinicalNoteTemplatePersistence.class);
}