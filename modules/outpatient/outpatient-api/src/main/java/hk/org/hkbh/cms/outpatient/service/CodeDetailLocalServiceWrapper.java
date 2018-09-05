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
 * Provides a wrapper for {@link CodeDetailLocalService}.
 *
 * @author Dave Man
 * @see CodeDetailLocalService
 * @generated
 */
@ProviderType
public class CodeDetailLocalServiceWrapper implements CodeDetailLocalService,
	ServiceWrapper<CodeDetailLocalService> {
	public CodeDetailLocalServiceWrapper(
		CodeDetailLocalService codeDetailLocalService) {
		_codeDetailLocalService = codeDetailLocalService;
	}

	/**
	* Adds the code detail to the database. Also notifies the appropriate model listeners.
	*
	* @param codeDetail the code detail
	* @return the code detail that was added
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail addCodeDetail(
		hk.org.hkbh.cms.outpatient.model.CodeDetail codeDetail) {
		return _codeDetailLocalService.addCodeDetail(codeDetail);
	}

	/**
	* Creates a new code detail with the primary key. Does not add the code detail to the database.
	*
	* @param id the primary key for the new code detail
	* @return the new code detail
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail createCodeDetail(long id) {
		return _codeDetailLocalService.createCodeDetail(id);
	}

	/**
	* Deletes the code detail from the database. Also notifies the appropriate model listeners.
	*
	* @param codeDetail the code detail
	* @return the code detail that was removed
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail deleteCodeDetail(
		hk.org.hkbh.cms.outpatient.model.CodeDetail codeDetail) {
		return _codeDetailLocalService.deleteCodeDetail(codeDetail);
	}

	/**
	* Deletes the code detail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the code detail
	* @return the code detail that was removed
	* @throws PortalException if a code detail with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail deleteCodeDetail(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _codeDetailLocalService.deleteCodeDetail(id);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _codeDetailLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _codeDetailLocalService.dynamicQuery();
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
		return _codeDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _codeDetailLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _codeDetailLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _codeDetailLocalService.dynamicQueryCount(dynamicQuery);
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
		return _codeDetailLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail fetchCodeDetail(long id) {
		return _codeDetailLocalService.fetchCodeDetail(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _codeDetailLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the code detail with the primary key.
	*
	* @param id the primary key of the code detail
	* @return the code detail
	* @throws PortalException if a code detail with the primary key could not be found
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail getCodeDetail(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _codeDetailLocalService.getCodeDetail(id);
	}

	/**
	* Returns a range of all the code details.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hk.org.hkbh.cms.outpatient.model.impl.CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of code details
	* @param end the upper bound of the range of code details (not inclusive)
	* @return the range of code details
	*/
	@Override
	public java.util.List<hk.org.hkbh.cms.outpatient.model.CodeDetail> getCodeDetails(
		int start, int end) {
		return _codeDetailLocalService.getCodeDetails(start, end);
	}

	/**
	* Returns the number of code details.
	*
	* @return the number of code details
	*/
	@Override
	public int getCodeDetailsCount() {
		return _codeDetailLocalService.getCodeDetailsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _codeDetailLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _codeDetailLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _codeDetailLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the code detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param codeDetail the code detail
	* @return the code detail that was updated
	*/
	@Override
	public hk.org.hkbh.cms.outpatient.model.CodeDetail updateCodeDetail(
		hk.org.hkbh.cms.outpatient.model.CodeDetail codeDetail) {
		return _codeDetailLocalService.updateCodeDetail(codeDetail);
	}

	@Override
	public CodeDetailLocalService getWrappedService() {
		return _codeDetailLocalService;
	}

	@Override
	public void setWrappedService(CodeDetailLocalService codeDetailLocalService) {
		_codeDetailLocalService = codeDetailLocalService;
	}

	private CodeDetailLocalService _codeDetailLocalService;
}