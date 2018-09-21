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

import hk.org.hkbh.cms.outpatient.model.LabResult;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the lab result service. This utility wraps {@link hk.org.hkbh.cms.outpatient.service.persistence.impl.LabResultPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see LabResultPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.LabResultPersistenceImpl
 * @generated
 */
@ProviderType
public class LabResultUtil {
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
	public static void clearCache(LabResult labResult) {
		getPersistence().clearCache(labResult);
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
	public static List<LabResult> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LabResult> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LabResult> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LabResult update(LabResult labResult) {
		return getPersistence().update(labResult);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LabResult update(LabResult labResult,
		ServiceContext serviceContext) {
		return getPersistence().update(labResult, serviceContext);
	}

	/**
	* Returns all the lab results where id = &#63;.
	*
	* @param id the ID
	* @return the matching lab results
	*/
	public static List<LabResult> findById(long id) {
		return getPersistence().findById(id);
	}

	/**
	* Returns a range of all the lab results where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @return the range of matching lab results
	*/
	public static List<LabResult> findById(long id, int start, int end) {
		return getPersistence().findById(id, start, end);
	}

	/**
	* Returns an ordered range of all the lab results where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findById(long id, int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence().findById(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lab results where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findById(long id, int start, int end,
		OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findById(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findById_First(long id,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence().findById_First(id, orderByComparator);
	}

	/**
	* Returns the first lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchById_First(long id,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence().fetchById_First(id, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findById_Last(long id,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence().findById_Last(id, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchById_Last(long id,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence().fetchById_Last(id, orderByComparator);
	}

	/**
	* Removes all the lab results where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeById(long id) {
		getPersistence().removeById(id);
	}

	/**
	* Returns the number of lab results where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching lab results
	*/
	public static int countById(long id) {
		return getPersistence().countById(id);
	}

	/**
	* Returns all the lab results where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching lab results
	*/
	public static List<LabResult> findByPatientId(java.lang.Long patientId) {
		return getPersistence().findByPatientId(patientId);
	}

	/**
	* Returns a range of all the lab results where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @return the range of matching lab results
	*/
	public static List<LabResult> findByPatientId(java.lang.Long patientId,
		int start, int end) {
		return getPersistence().findByPatientId(patientId, start, end);
	}

	/**
	* Returns an ordered range of all the lab results where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findByPatientId(java.lang.Long patientId,
		int start, int end, OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .findByPatientId(patientId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lab results where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findByPatientId(java.lang.Long patientId,
		int start, int end, OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPatientId(patientId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findByPatientId_First(java.lang.Long patientId,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByPatientId_First(patientId, orderByComparator);
	}

	/**
	* Returns the first lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchByPatientId_First(java.lang.Long patientId,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .fetchByPatientId_First(patientId, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findByPatientId_Last(java.lang.Long patientId,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByPatientId_Last(patientId, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchByPatientId_Last(java.lang.Long patientId,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .fetchByPatientId_Last(patientId, orderByComparator);
	}

	/**
	* Returns the lab results before and after the current lab result in the ordered set where patientId = &#63;.
	*
	* @param id the primary key of the current lab result
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public static LabResult[] findByPatientId_PrevAndNext(long id,
		java.lang.Long patientId, OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByPatientId_PrevAndNext(id, patientId, orderByComparator);
	}

	/**
	* Removes all the lab results where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	*/
	public static void removeByPatientId(java.lang.Long patientId) {
		getPersistence().removeByPatientId(patientId);
	}

	/**
	* Returns the number of lab results where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching lab results
	*/
	public static int countByPatientId(java.lang.Long patientId) {
		return getPersistence().countByPatientId(patientId);
	}

	/**
	* Returns all the lab results where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @return the matching lab results
	*/
	public static List<LabResult> findByEpisodeId(java.lang.Long episodeId) {
		return getPersistence().findByEpisodeId(episodeId);
	}

	/**
	* Returns a range of all the lab results where episodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param episodeId the episode ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @return the range of matching lab results
	*/
	public static List<LabResult> findByEpisodeId(java.lang.Long episodeId,
		int start, int end) {
		return getPersistence().findByEpisodeId(episodeId, start, end);
	}

	/**
	* Returns an ordered range of all the lab results where episodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param episodeId the episode ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findByEpisodeId(java.lang.Long episodeId,
		int start, int end, OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .findByEpisodeId(episodeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lab results where episodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param episodeId the episode ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findByEpisodeId(java.lang.Long episodeId,
		int start, int end, OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEpisodeId(episodeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findByEpisodeId_First(java.lang.Long episodeId,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByEpisodeId_First(episodeId, orderByComparator);
	}

	/**
	* Returns the first lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchByEpisodeId_First(java.lang.Long episodeId,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .fetchByEpisodeId_First(episodeId, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findByEpisodeId_Last(java.lang.Long episodeId,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByEpisodeId_Last(episodeId, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchByEpisodeId_Last(java.lang.Long episodeId,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .fetchByEpisodeId_Last(episodeId, orderByComparator);
	}

	/**
	* Returns the lab results before and after the current lab result in the ordered set where episodeId = &#63;.
	*
	* @param id the primary key of the current lab result
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public static LabResult[] findByEpisodeId_PrevAndNext(long id,
		java.lang.Long episodeId, OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByEpisodeId_PrevAndNext(id, episodeId, orderByComparator);
	}

	/**
	* Removes all the lab results where episodeId = &#63; from the database.
	*
	* @param episodeId the episode ID
	*/
	public static void removeByEpisodeId(java.lang.Long episodeId) {
		getPersistence().removeByEpisodeId(episodeId);
	}

	/**
	* Returns the number of lab results where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @return the number of matching lab results
	*/
	public static int countByEpisodeId(java.lang.Long episodeId) {
		return getPersistence().countByEpisodeId(episodeId);
	}

	/**
	* Returns all the lab results where orderId = &#63;.
	*
	* @param orderId the order ID
	* @return the matching lab results
	*/
	public static List<LabResult> findByOrderId(java.lang.Long orderId) {
		return getPersistence().findByOrderId(orderId);
	}

	/**
	* Returns a range of all the lab results where orderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderId the order ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @return the range of matching lab results
	*/
	public static List<LabResult> findByOrderId(java.lang.Long orderId,
		int start, int end) {
		return getPersistence().findByOrderId(orderId, start, end);
	}

	/**
	* Returns an ordered range of all the lab results where orderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderId the order ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findByOrderId(java.lang.Long orderId,
		int start, int end, OrderByComparator<LabResult> orderByComparator) {
		return getPersistence()
				   .findByOrderId(orderId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lab results where orderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderId the order ID
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lab results
	*/
	public static List<LabResult> findByOrderId(java.lang.Long orderId,
		int start, int end, OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrderId(orderId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findByOrderId_First(java.lang.Long orderId,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence().findByOrderId_First(orderId, orderByComparator);
	}

	/**
	* Returns the first lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchByOrderId_First(java.lang.Long orderId,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence().fetchByOrderId_First(orderId, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public static LabResult findByOrderId_Last(java.lang.Long orderId,
		OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence().findByOrderId_Last(orderId, orderByComparator);
	}

	/**
	* Returns the last lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public static LabResult fetchByOrderId_Last(java.lang.Long orderId,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence().fetchByOrderId_Last(orderId, orderByComparator);
	}

	/**
	* Returns the lab results before and after the current lab result in the ordered set where orderId = &#63;.
	*
	* @param id the primary key of the current lab result
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public static LabResult[] findByOrderId_PrevAndNext(long id,
		java.lang.Long orderId, OrderByComparator<LabResult> orderByComparator)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence()
				   .findByOrderId_PrevAndNext(id, orderId, orderByComparator);
	}

	/**
	* Removes all the lab results where orderId = &#63; from the database.
	*
	* @param orderId the order ID
	*/
	public static void removeByOrderId(java.lang.Long orderId) {
		getPersistence().removeByOrderId(orderId);
	}

	/**
	* Returns the number of lab results where orderId = &#63;.
	*
	* @param orderId the order ID
	* @return the number of matching lab results
	*/
	public static int countByOrderId(java.lang.Long orderId) {
		return getPersistence().countByOrderId(orderId);
	}

	/**
	* Caches the lab result in the entity cache if it is enabled.
	*
	* @param labResult the lab result
	*/
	public static void cacheResult(LabResult labResult) {
		getPersistence().cacheResult(labResult);
	}

	/**
	* Caches the lab results in the entity cache if it is enabled.
	*
	* @param labResults the lab results
	*/
	public static void cacheResult(List<LabResult> labResults) {
		getPersistence().cacheResult(labResults);
	}

	/**
	* Creates a new lab result with the primary key. Does not add the lab result to the database.
	*
	* @param id the primary key for the new lab result
	* @return the new lab result
	*/
	public static LabResult create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the lab result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lab result
	* @return the lab result that was removed
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public static LabResult remove(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence().remove(id);
	}

	public static LabResult updateImpl(LabResult labResult) {
		return getPersistence().updateImpl(labResult);
	}

	/**
	* Returns the lab result with the primary key or throws a {@link NoSuchLabResultException} if it could not be found.
	*
	* @param id the primary key of the lab result
	* @return the lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public static LabResult findByPrimaryKey(long id)
		throws hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the lab result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lab result
	* @return the lab result, or <code>null</code> if a lab result with the primary key could not be found
	*/
	public static LabResult fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, LabResult> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the lab results.
	*
	* @return the lab results
	*/
	public static List<LabResult> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lab results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @return the range of lab results
	*/
	public static List<LabResult> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lab results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lab results
	*/
	public static List<LabResult> findAll(int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lab results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lab results
	* @param end the upper bound of the range of lab results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lab results
	*/
	public static List<LabResult> findAll(int start, int end,
		OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the lab results from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lab results.
	*
	* @return the number of lab results
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LabResultPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LabResultPersistence, LabResultPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LabResultPersistence.class);
}