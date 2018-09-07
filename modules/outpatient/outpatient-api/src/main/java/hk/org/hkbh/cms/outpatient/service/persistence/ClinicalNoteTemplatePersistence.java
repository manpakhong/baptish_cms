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

import hk.org.hkbh.cms.outpatient.exception.NoSuchClinicalNoteTemplateException;
import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;

/**
 * The persistence interface for the clinical note template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ClinicalNoteTemplatePersistenceImpl
 * @see ClinicalNoteTemplateUtil
 * @generated
 */
@ProviderType
public interface ClinicalNoteTemplatePersistence extends BasePersistence<ClinicalNoteTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClinicalNoteTemplateUtil} to access the clinical note template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the clinical note template in the entity cache if it is enabled.
	*
	* @param clinicalNoteTemplate the clinical note template
	*/
	public void cacheResult(ClinicalNoteTemplate clinicalNoteTemplate);

	/**
	* Caches the clinical note templates in the entity cache if it is enabled.
	*
	* @param clinicalNoteTemplates the clinical note templates
	*/
	public void cacheResult(
		java.util.List<ClinicalNoteTemplate> clinicalNoteTemplates);

	/**
	* Creates a new clinical note template with the primary key. Does not add the clinical note template to the database.
	*
	* @param id the primary key for the new clinical note template
	* @return the new clinical note template
	*/
	public ClinicalNoteTemplate create(int id);

	/**
	* Removes the clinical note template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template that was removed
	* @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	*/
	public ClinicalNoteTemplate remove(int id)
		throws NoSuchClinicalNoteTemplateException;

	public ClinicalNoteTemplate updateImpl(
		ClinicalNoteTemplate clinicalNoteTemplate);

	/**
	* Returns the clinical note template with the primary key or throws a {@link NoSuchClinicalNoteTemplateException} if it could not be found.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template
	* @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	*/
	public ClinicalNoteTemplate findByPrimaryKey(int id)
		throws NoSuchClinicalNoteTemplateException;

	/**
	* Returns the clinical note template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clinical note template
	* @return the clinical note template, or <code>null</code> if a clinical note template with the primary key could not be found
	*/
	public ClinicalNoteTemplate fetchByPrimaryKey(int id);

	@Override
	public java.util.Map<java.io.Serializable, ClinicalNoteTemplate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the clinical note templates.
	*
	* @return the clinical note templates
	*/
	public java.util.List<ClinicalNoteTemplate> findAll();

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
	public java.util.List<ClinicalNoteTemplate> findAll(int start, int end);

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
	public java.util.List<ClinicalNoteTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClinicalNoteTemplate> orderByComparator);

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
	public java.util.List<ClinicalNoteTemplate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClinicalNoteTemplate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the clinical note templates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of clinical note templates.
	*
	* @return the number of clinical note templates
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}