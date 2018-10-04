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

import hk.org.hkbh.cms.outpatient.model.LabResult;
import hk.org.hkbh.cms.outpatient.service.LabResultLocalService;
import hk.org.hkbh.cms.outpatient.service.persistence.AuditTrailPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.ClinicalNoteTemplatePersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDetailPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDtoFinder;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDtoPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.CodePersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlDtoFinder;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlDtoPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentDtoFinder;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentDtoPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.ImagingResultPersistence;
import hk.org.hkbh.cms.outpatient.service.persistence.LabResultPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the lab result local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link hk.org.hkbh.cms.outpatient.service.impl.LabResultLocalServiceImpl}.
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.impl.LabResultLocalServiceImpl
 * @see hk.org.hkbh.cms.outpatient.service.LabResultLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class LabResultLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements LabResultLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link hk.org.hkbh.cms.outpatient.service.LabResultLocalServiceUtil} to access the lab result local service.
	 */

	/**
	 * Adds the lab result to the database. Also notifies the appropriate model listeners.
	 *
	 * @param labResult the lab result
	 * @return the lab result that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public LabResult addLabResult(LabResult labResult) {
		labResult.setNew(true);

		return labResultPersistence.update(labResult);
	}

	/**
	 * Creates a new lab result with the primary key. Does not add the lab result to the database.
	 *
	 * @param id the primary key for the new lab result
	 * @return the new lab result
	 */
	@Override
	public LabResult createLabResult(long id) {
		return labResultPersistence.create(id);
	}

	/**
	 * Deletes the lab result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the lab result
	 * @return the lab result that was removed
	 * @throws PortalException if a lab result with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public LabResult deleteLabResult(long id) throws PortalException {
		return labResultPersistence.remove(id);
	}

	/**
	 * Deletes the lab result from the database. Also notifies the appropriate model listeners.
	 *
	 * @param labResult the lab result
	 * @return the lab result that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public LabResult deleteLabResult(LabResult labResult) {
		return labResultPersistence.remove(labResult);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(LabResult.class,
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
		return labResultPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return labResultPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return labResultPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return labResultPersistence.countWithDynamicQuery(dynamicQuery);
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
		return labResultPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public LabResult fetchLabResult(long id) {
		return labResultPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the lab result with the primary key.
	 *
	 * @param id the primary key of the lab result
	 * @return the lab result
	 * @throws PortalException if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult getLabResult(long id) throws PortalException {
		return labResultPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(labResultLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(LabResult.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(labResultLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(LabResult.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(labResultLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(LabResult.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return labResultLocalService.deleteLabResult((LabResult)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return labResultPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the lab results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lab results
	 * @param end the upper bound of the range of lab results (not inclusive)
	 * @return the range of lab results
	 */
	@Override
	public List<LabResult> getLabResults(int start, int end) {
		return labResultPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of lab results.
	 *
	 * @return the number of lab results
	 */
	@Override
	public int getLabResultsCount() {
		return labResultPersistence.countAll();
	}

	/**
	 * Updates the lab result in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param labResult the lab result
	 * @return the lab result that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public LabResult updateLabResult(LabResult labResult) {
		return labResultPersistence.update(labResult);
	}

	/**
	 * Returns the audit trail local service.
	 *
	 * @return the audit trail local service
	 */
	public hk.org.hkbh.cms.outpatient.service.AuditTrailLocalService getAuditTrailLocalService() {
		return auditTrailLocalService;
	}

	/**
	 * Sets the audit trail local service.
	 *
	 * @param auditTrailLocalService the audit trail local service
	 */
	public void setAuditTrailLocalService(
		hk.org.hkbh.cms.outpatient.service.AuditTrailLocalService auditTrailLocalService) {
		this.auditTrailLocalService = auditTrailLocalService;
	}

	/**
	 * Returns the audit trail persistence.
	 *
	 * @return the audit trail persistence
	 */
	public AuditTrailPersistence getAuditTrailPersistence() {
		return auditTrailPersistence;
	}

	/**
	 * Sets the audit trail persistence.
	 *
	 * @param auditTrailPersistence the audit trail persistence
	 */
	public void setAuditTrailPersistence(
		AuditTrailPersistence auditTrailPersistence) {
		this.auditTrailPersistence = auditTrailPersistence;
	}

	/**
	 * Returns the clinical note template local service.
	 *
	 * @return the clinical note template local service
	 */
	public hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalService getClinicalNoteTemplateLocalService() {
		return clinicalNoteTemplateLocalService;
	}

	/**
	 * Sets the clinical note template local service.
	 *
	 * @param clinicalNoteTemplateLocalService the clinical note template local service
	 */
	public void setClinicalNoteTemplateLocalService(
		hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService) {
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
	 * Returns the code local service.
	 *
	 * @return the code local service
	 */
	public hk.org.hkbh.cms.outpatient.service.CodeLocalService getCodeLocalService() {
		return codeLocalService;
	}

	/**
	 * Sets the code local service.
	 *
	 * @param codeLocalService the code local service
	 */
	public void setCodeLocalService(
		hk.org.hkbh.cms.outpatient.service.CodeLocalService codeLocalService) {
		this.codeLocalService = codeLocalService;
	}

	/**
	 * Returns the code persistence.
	 *
	 * @return the code persistence
	 */
	public CodePersistence getCodePersistence() {
		return codePersistence;
	}

	/**
	 * Sets the code persistence.
	 *
	 * @param codePersistence the code persistence
	 */
	public void setCodePersistence(CodePersistence codePersistence) {
		this.codePersistence = codePersistence;
	}

	/**
	 * Returns the code detail local service.
	 *
	 * @return the code detail local service
	 */
	public hk.org.hkbh.cms.outpatient.service.CodeDetailLocalService getCodeDetailLocalService() {
		return codeDetailLocalService;
	}

	/**
	 * Sets the code detail local service.
	 *
	 * @param codeDetailLocalService the code detail local service
	 */
	public void setCodeDetailLocalService(
		hk.org.hkbh.cms.outpatient.service.CodeDetailLocalService codeDetailLocalService) {
		this.codeDetailLocalService = codeDetailLocalService;
	}

	/**
	 * Returns the code detail persistence.
	 *
	 * @return the code detail persistence
	 */
	public CodeDetailPersistence getCodeDetailPersistence() {
		return codeDetailPersistence;
	}

	/**
	 * Sets the code detail persistence.
	 *
	 * @param codeDetailPersistence the code detail persistence
	 */
	public void setCodeDetailPersistence(
		CodeDetailPersistence codeDetailPersistence) {
		this.codeDetailPersistence = codeDetailPersistence;
	}

	/**
	 * Returns the code dto local service.
	 *
	 * @return the code dto local service
	 */
	public hk.org.hkbh.cms.outpatient.service.CodeDtoLocalService getCodeDtoLocalService() {
		return codeDtoLocalService;
	}

	/**
	 * Sets the code dto local service.
	 *
	 * @param codeDtoLocalService the code dto local service
	 */
	public void setCodeDtoLocalService(
		hk.org.hkbh.cms.outpatient.service.CodeDtoLocalService codeDtoLocalService) {
		this.codeDtoLocalService = codeDtoLocalService;
	}

	/**
	 * Returns the code dto persistence.
	 *
	 * @return the code dto persistence
	 */
	public CodeDtoPersistence getCodeDtoPersistence() {
		return codeDtoPersistence;
	}

	/**
	 * Sets the code dto persistence.
	 *
	 * @param codeDtoPersistence the code dto persistence
	 */
	public void setCodeDtoPersistence(CodeDtoPersistence codeDtoPersistence) {
		this.codeDtoPersistence = codeDtoPersistence;
	}

	/**
	 * Returns the code dto finder.
	 *
	 * @return the code dto finder
	 */
	public CodeDtoFinder getCodeDtoFinder() {
		return codeDtoFinder;
	}

	/**
	 * Sets the code dto finder.
	 *
	 * @param codeDtoFinder the code dto finder
	 */
	public void setCodeDtoFinder(CodeDtoFinder codeDtoFinder) {
		this.codeDtoFinder = codeDtoFinder;
	}

	/**
	 * Returns the component control local service.
	 *
	 * @return the component control local service
	 */
	public hk.org.hkbh.cms.outpatient.service.ComponentControlLocalService getComponentControlLocalService() {
		return componentControlLocalService;
	}

	/**
	 * Sets the component control local service.
	 *
	 * @param componentControlLocalService the component control local service
	 */
	public void setComponentControlLocalService(
		hk.org.hkbh.cms.outpatient.service.ComponentControlLocalService componentControlLocalService) {
		this.componentControlLocalService = componentControlLocalService;
	}

	/**
	 * Returns the component control persistence.
	 *
	 * @return the component control persistence
	 */
	public ComponentControlPersistence getComponentControlPersistence() {
		return componentControlPersistence;
	}

	/**
	 * Sets the component control persistence.
	 *
	 * @param componentControlPersistence the component control persistence
	 */
	public void setComponentControlPersistence(
		ComponentControlPersistence componentControlPersistence) {
		this.componentControlPersistence = componentControlPersistence;
	}

	/**
	 * Returns the component control dto local service.
	 *
	 * @return the component control dto local service
	 */
	public hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalService getComponentControlDtoLocalService() {
		return componentControlDtoLocalService;
	}

	/**
	 * Sets the component control dto local service.
	 *
	 * @param componentControlDtoLocalService the component control dto local service
	 */
	public void setComponentControlDtoLocalService(
		hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalService componentControlDtoLocalService) {
		this.componentControlDtoLocalService = componentControlDtoLocalService;
	}

	/**
	 * Returns the component control dto persistence.
	 *
	 * @return the component control dto persistence
	 */
	public ComponentControlDtoPersistence getComponentControlDtoPersistence() {
		return componentControlDtoPersistence;
	}

	/**
	 * Sets the component control dto persistence.
	 *
	 * @param componentControlDtoPersistence the component control dto persistence
	 */
	public void setComponentControlDtoPersistence(
		ComponentControlDtoPersistence componentControlDtoPersistence) {
		this.componentControlDtoPersistence = componentControlDtoPersistence;
	}

	/**
	 * Returns the component control dto finder.
	 *
	 * @return the component control dto finder
	 */
	public ComponentControlDtoFinder getComponentControlDtoFinder() {
		return componentControlDtoFinder;
	}

	/**
	 * Sets the component control dto finder.
	 *
	 * @param componentControlDtoFinder the component control dto finder
	 */
	public void setComponentControlDtoFinder(
		ComponentControlDtoFinder componentControlDtoFinder) {
		this.componentControlDtoFinder = componentControlDtoFinder;
	}

	/**
	 * Returns the component dto local service.
	 *
	 * @return the component dto local service
	 */
	public hk.org.hkbh.cms.outpatient.service.ComponentDtoLocalService getComponentDtoLocalService() {
		return componentDtoLocalService;
	}

	/**
	 * Sets the component dto local service.
	 *
	 * @param componentDtoLocalService the component dto local service
	 */
	public void setComponentDtoLocalService(
		hk.org.hkbh.cms.outpatient.service.ComponentDtoLocalService componentDtoLocalService) {
		this.componentDtoLocalService = componentDtoLocalService;
	}

	/**
	 * Returns the component dto persistence.
	 *
	 * @return the component dto persistence
	 */
	public ComponentDtoPersistence getComponentDtoPersistence() {
		return componentDtoPersistence;
	}

	/**
	 * Sets the component dto persistence.
	 *
	 * @param componentDtoPersistence the component dto persistence
	 */
	public void setComponentDtoPersistence(
		ComponentDtoPersistence componentDtoPersistence) {
		this.componentDtoPersistence = componentDtoPersistence;
	}

	/**
	 * Returns the component dto finder.
	 *
	 * @return the component dto finder
	 */
	public ComponentDtoFinder getComponentDtoFinder() {
		return componentDtoFinder;
	}

	/**
	 * Sets the component dto finder.
	 *
	 * @param componentDtoFinder the component dto finder
	 */
	public void setComponentDtoFinder(ComponentDtoFinder componentDtoFinder) {
		this.componentDtoFinder = componentDtoFinder;
	}

	/**
	 * Returns the imaging result local service.
	 *
	 * @return the imaging result local service
	 */
	public hk.org.hkbh.cms.outpatient.service.ImagingResultLocalService getImagingResultLocalService() {
		return imagingResultLocalService;
	}

	/**
	 * Sets the imaging result local service.
	 *
	 * @param imagingResultLocalService the imaging result local service
	 */
	public void setImagingResultLocalService(
		hk.org.hkbh.cms.outpatient.service.ImagingResultLocalService imagingResultLocalService) {
		this.imagingResultLocalService = imagingResultLocalService;
	}

	/**
	 * Returns the imaging result persistence.
	 *
	 * @return the imaging result persistence
	 */
	public ImagingResultPersistence getImagingResultPersistence() {
		return imagingResultPersistence;
	}

	/**
	 * Sets the imaging result persistence.
	 *
	 * @param imagingResultPersistence the imaging result persistence
	 */
	public void setImagingResultPersistence(
		ImagingResultPersistence imagingResultPersistence) {
		this.imagingResultPersistence = imagingResultPersistence;
	}

	/**
	 * Returns the lab result local service.
	 *
	 * @return the lab result local service
	 */
	public LabResultLocalService getLabResultLocalService() {
		return labResultLocalService;
	}

	/**
	 * Sets the lab result local service.
	 *
	 * @param labResultLocalService the lab result local service
	 */
	public void setLabResultLocalService(
		LabResultLocalService labResultLocalService) {
		this.labResultLocalService = labResultLocalService;
	}

	/**
	 * Returns the lab result persistence.
	 *
	 * @return the lab result persistence
	 */
	public LabResultPersistence getLabResultPersistence() {
		return labResultPersistence;
	}

	/**
	 * Sets the lab result persistence.
	 *
	 * @param labResultPersistence the lab result persistence
	 */
	public void setLabResultPersistence(
		LabResultPersistence labResultPersistence) {
		this.labResultPersistence = labResultPersistence;
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
		persistedModelLocalServiceRegistry.register("hk.org.hkbh.cms.outpatient.model.LabResult",
			labResultLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"hk.org.hkbh.cms.outpatient.model.LabResult");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return LabResultLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return LabResult.class;
	}

	protected String getModelClassName() {
		return LabResult.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = labResultPersistence.getDataSource();

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

	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.AuditTrailLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.AuditTrailLocalService auditTrailLocalService;
	@BeanReference(type = AuditTrailPersistence.class)
	protected AuditTrailPersistence auditTrailPersistence;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.ClinicalNoteTemplateLocalService clinicalNoteTemplateLocalService;
	@BeanReference(type = ClinicalNoteTemplatePersistence.class)
	protected ClinicalNoteTemplatePersistence clinicalNoteTemplatePersistence;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.CodeLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.CodeLocalService codeLocalService;
	@BeanReference(type = CodePersistence.class)
	protected CodePersistence codePersistence;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.CodeDetailLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.CodeDetailLocalService codeDetailLocalService;
	@BeanReference(type = CodeDetailPersistence.class)
	protected CodeDetailPersistence codeDetailPersistence;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.CodeDtoLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.CodeDtoLocalService codeDtoLocalService;
	@BeanReference(type = CodeDtoPersistence.class)
	protected CodeDtoPersistence codeDtoPersistence;
	@BeanReference(type = CodeDtoFinder.class)
	protected CodeDtoFinder codeDtoFinder;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.ComponentControlLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.ComponentControlLocalService componentControlLocalService;
	@BeanReference(type = ComponentControlPersistence.class)
	protected ComponentControlPersistence componentControlPersistence;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalService componentControlDtoLocalService;
	@BeanReference(type = ComponentControlDtoPersistence.class)
	protected ComponentControlDtoPersistence componentControlDtoPersistence;
	@BeanReference(type = ComponentControlDtoFinder.class)
	protected ComponentControlDtoFinder componentControlDtoFinder;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.ComponentDtoLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.ComponentDtoLocalService componentDtoLocalService;
	@BeanReference(type = ComponentDtoPersistence.class)
	protected ComponentDtoPersistence componentDtoPersistence;
	@BeanReference(type = ComponentDtoFinder.class)
	protected ComponentDtoFinder componentDtoFinder;
	@BeanReference(type = hk.org.hkbh.cms.outpatient.service.ImagingResultLocalService.class)
	protected hk.org.hkbh.cms.outpatient.service.ImagingResultLocalService imagingResultLocalService;
	@BeanReference(type = ImagingResultPersistence.class)
	protected ImagingResultPersistence imagingResultPersistence;
	@BeanReference(type = LabResultLocalService.class)
	protected LabResultLocalService labResultLocalService;
	@BeanReference(type = LabResultPersistence.class)
	protected LabResultPersistence labResultPersistence;
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