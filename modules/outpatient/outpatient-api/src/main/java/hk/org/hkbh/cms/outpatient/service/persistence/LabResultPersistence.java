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

import hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException;
import hk.org.hkbh.cms.outpatient.model.LabResult;

/**
 * The persistence interface for the lab result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.LabResultPersistenceImpl
 * @see LabResultUtil
 * @generated
 */
@ProviderType
public interface LabResultPersistence extends BasePersistence<LabResult> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LabResultUtil} to access the lab result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the lab results where id = &#63;.
	*
	* @param id the ID
	* @return the matching lab results
	*/
	public java.util.List<LabResult> findById(long id);

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
	public java.util.List<LabResult> findById(long id, int start, int end);

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
	public java.util.List<LabResult> findById(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

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
	public java.util.List<LabResult> findById(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the first lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the last lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the last lab result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Removes all the lab results where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeById(long id);

	/**
	* Returns the number of lab results where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching lab results
	*/
	public int countById(long id);

	/**
	* Returns all the lab results where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching lab results
	*/
	public java.util.List<LabResult> findByPatientId(java.lang.Long patientId);

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
	public java.util.List<LabResult> findByPatientId(java.lang.Long patientId,
		int start, int end);

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
	public java.util.List<LabResult> findByPatientId(java.lang.Long patientId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

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
	public java.util.List<LabResult> findByPatientId(java.lang.Long patientId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findByPatientId_First(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the first lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchByPatientId_First(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the last lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findByPatientId_Last(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the last lab result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchByPatientId_Last(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the lab results before and after the current lab result in the ordered set where patientId = &#63;.
	*
	* @param id the primary key of the current lab result
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public LabResult[] findByPatientId_PrevAndNext(long id,
		java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Removes all the lab results where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	*/
	public void removeByPatientId(java.lang.Long patientId);

	/**
	* Returns the number of lab results where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching lab results
	*/
	public int countByPatientId(java.lang.Long patientId);

	/**
	* Returns all the lab results where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @return the matching lab results
	*/
	public java.util.List<LabResult> findByEpisodeId(java.lang.Long episodeId);

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
	public java.util.List<LabResult> findByEpisodeId(java.lang.Long episodeId,
		int start, int end);

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
	public java.util.List<LabResult> findByEpisodeId(java.lang.Long episodeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

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
	public java.util.List<LabResult> findByEpisodeId(java.lang.Long episodeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findByEpisodeId_First(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the first lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchByEpisodeId_First(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the last lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findByEpisodeId_Last(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the last lab result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchByEpisodeId_Last(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the lab results before and after the current lab result in the ordered set where episodeId = &#63;.
	*
	* @param id the primary key of the current lab result
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public LabResult[] findByEpisodeId_PrevAndNext(long id,
		java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Removes all the lab results where episodeId = &#63; from the database.
	*
	* @param episodeId the episode ID
	*/
	public void removeByEpisodeId(java.lang.Long episodeId);

	/**
	* Returns the number of lab results where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @return the number of matching lab results
	*/
	public int countByEpisodeId(java.lang.Long episodeId);

	/**
	* Returns all the lab results where orderId = &#63;.
	*
	* @param orderId the order ID
	* @return the matching lab results
	*/
	public java.util.List<LabResult> findByOrderId(java.lang.Long orderId);

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
	public java.util.List<LabResult> findByOrderId(java.lang.Long orderId,
		int start, int end);

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
	public java.util.List<LabResult> findByOrderId(java.lang.Long orderId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

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
	public java.util.List<LabResult> findByOrderId(java.lang.Long orderId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findByOrderId_First(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the first lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchByOrderId_First(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the last lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result
	* @throws NoSuchLabResultException if a matching lab result could not be found
	*/
	public LabResult findByOrderId_Last(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Returns the last lab result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	*/
	public LabResult fetchByOrderId_Last(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

	/**
	* Returns the lab results before and after the current lab result in the ordered set where orderId = &#63;.
	*
	* @param id the primary key of the current lab result
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public LabResult[] findByOrderId_PrevAndNext(long id,
		java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException;

	/**
	* Removes all the lab results where orderId = &#63; from the database.
	*
	* @param orderId the order ID
	*/
	public void removeByOrderId(java.lang.Long orderId);

	/**
	* Returns the number of lab results where orderId = &#63;.
	*
	* @param orderId the order ID
	* @return the number of matching lab results
	*/
	public int countByOrderId(java.lang.Long orderId);

	/**
	* Caches the lab result in the entity cache if it is enabled.
	*
	* @param labResult the lab result
	*/
	public void cacheResult(LabResult labResult);

	/**
	* Caches the lab results in the entity cache if it is enabled.
	*
	* @param labResults the lab results
	*/
	public void cacheResult(java.util.List<LabResult> labResults);

	/**
	* Creates a new lab result with the primary key. Does not add the lab result to the database.
	*
	* @param id the primary key for the new lab result
	* @return the new lab result
	*/
	public LabResult create(long id);

	/**
	* Removes the lab result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lab result
	* @return the lab result that was removed
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public LabResult remove(long id) throws NoSuchLabResultException;

	public LabResult updateImpl(LabResult labResult);

	/**
	* Returns the lab result with the primary key or throws a {@link NoSuchLabResultException} if it could not be found.
	*
	* @param id the primary key of the lab result
	* @return the lab result
	* @throws NoSuchLabResultException if a lab result with the primary key could not be found
	*/
	public LabResult findByPrimaryKey(long id) throws NoSuchLabResultException;

	/**
	* Returns the lab result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lab result
	* @return the lab result, or <code>null</code> if a lab result with the primary key could not be found
	*/
	public LabResult fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, LabResult> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the lab results.
	*
	* @return the lab results
	*/
	public java.util.List<LabResult> findAll();

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
	public java.util.List<LabResult> findAll(int start, int end);

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
	public java.util.List<LabResult> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator);

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
	public java.util.List<LabResult> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LabResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the lab results from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of lab results.
	*
	* @return the number of lab results
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}