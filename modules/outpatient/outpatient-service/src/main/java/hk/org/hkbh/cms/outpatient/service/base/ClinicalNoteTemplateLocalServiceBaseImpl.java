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

package hk.org.hkbh.cms.outpatient.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;
import hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalService;
import hk.org.hkbh.cms.outpatient.service.persistence.ClinicalNoteTemplatePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the clinical note template local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link hk.org.hkbh.cms.outpatient.service.impl.ClinicalNoteTemplateLocalServiceImpl}.
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.impl.ClinicalNoteTemplateLocalServiceImpl
 * @see hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class ClinicalNoteTemplateLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ClinicalNoteTemplateLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalServiceUtil} to access the clinical note template local service.
	 */

	/**
	 * Adds the clinical note template to the database. Also notifies the appropriate model listeners.
	 *
	 * @param clinicalNoteTemplate the clinical note template
	 * @return the clinical note template that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ClinicalNoteTemplate addClinicalNoteTemplate(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		clinicalNoteTemplate.setNew(true);

		return clinicalNoteTemplatePersistence.update(clinicalNoteTemplate);
	}

	/**
	 * Creates a new clinical note template with the primary key. Does not add the clinical note template to the database.
	 *
	 * @param id the primary key for the new clinical note template
	 * @return the new clinical note template
	 */
	@Override
	public ClinicalNoteTemplate createClinicalNoteTemplate(int id) {
		return clinicalNoteTemplatePersistence.create(id);
	}

	/**
	 * Deletes the clinical note template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clinical note template
	 * @return the clinical note template that was removed
	 * @throws PortalException if a clinical note template with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ClinicalNoteTemplate deleteClinicalNoteTemplate(int id)
		throws PortalException {
		return clinicalNoteTemplatePersistence.remove(id);
	}

	/**
	 * Deletes the clinical note template from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clinicalNoteTemplate the clinical note template
	 * @return the clinical note template that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ClinicalNoteTemplate deleteClinicalNoteTemplate(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		return clinicalNoteTemplatePersistence.remove(clinicalNoteTemplate);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(ClinicalNoteTemplate.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return clinicalNoteTemplatePersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return clinicalNoteTemplatePersistence.findWithDynamicQuery(dynamicQuery,
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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return clinicalNoteTemplatePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return clinicalNoteTemplatePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return clinicalNoteTemplatePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public ClinicalNoteTemplate fetchClinicalNoteTemplate(int id) {
		return clinicalNoteTemplatePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the clinical note template with the primary key.
	 *
	 * @param id the primary key of the clinical note template
	 * @return the clinical note template
	 * @throws PortalException if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate getClinicalNoteTemplate(int id)
		throws PortalException {
		return clinicalNoteTemplatePersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(clinicalNoteTemplateLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ClinicalNoteTemplate.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(clinicalNoteTemplateLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(ClinicalNoteTemplate.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(clinicalNoteTemplateLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ClinicalNoteTemplate.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return clinicalNoteTemplateLocalService.deleteClinicalNoteTemplate((ClinicalNoteTemplate)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return clinicalNoteTemplatePersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<ClinicalNoteTemplate> getClinicalNoteTemplates(int start,
		int end) {
		return clinicalNoteTemplatePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of clinical note templates.
	 *
	 * @return the number of clinical note templates
	 */
	@Override
	public int getClinicalNoteTemplatesCount() {
		return clinicalNoteTemplatePersistence.countAll();
	}

	/**
	 * Updates the clinical note template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param clinicalNoteTemplate the clinical note template
	 * @return the clinical note template that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ClinicalNoteTemplate updateClinicalNoteTemplate(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		return clinicalNoteTemplatePersistence.update(clinicalNoteTemplate);
	}

	/**
	 * Returns the clinical note template local service.
	 *
	 * @return the clinical note template local service
	 */
	public ClinicalNoteTemplateLocalService getClinicalNoteTemplateLocalService() {
		return clinicalNoteTemplateLocalService;
	}

	/**
	 * Sets the clinical note template local service.
	 *
	 * @param clinicalNoteTemplateLocalService the clinical note template local service
	 */
	public void setClinicalNoteTemplateLocalService(
		ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
		this.clinicalNoteTemplateLocalService = clinicalNoteTemplateLocalService;
	}

	/**
	 * Returns the clinical note template persistence.
	 *
	 * @return the clinical note template persistence
	 */
	public ClinicalNoteTemplatePersistence getClinicalNoteTemplatePersistence() {
		return clinicalNoteTemplatePersistence;
	}

	/**
	 * Sets the clinical note template persistence.
	 *
	 * @param clinicalNoteTemplatePersistence the clinical note template persistence
	 */
	public void setClinicalNoteTemplatePersistence(
		ClinicalNoteTemplatePersistence clinicalNoteTemplatePersistence) {
		this.clinicalNoteTemplatePersistence = clinicalNoteTemplatePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate",
			clinicalNoteTemplateLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ClinicalNoteTemplateLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ClinicalNoteTemplate.class;
	}

	protected String getModelClassName() {
		return ClinicalNoteTemplate.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = clinicalNoteTemplatePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ClinicalNoteTemplateLocalService.class)
	protected ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService;
	@BeanReference(type = ClinicalNoteTemplatePersistence.class)
	protected ClinicalNoteTemplatePersistence clinicalNoteTemplatePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}