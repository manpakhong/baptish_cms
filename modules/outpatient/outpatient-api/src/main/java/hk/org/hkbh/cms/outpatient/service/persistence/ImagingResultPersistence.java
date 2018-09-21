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

import hk.org.hkbh.cms.outpatient.exception.NoSuchImagingResultException;
import hk.org.hkbh.cms.outpatient.model.ImagingResult;

/**
 * The persistence interface for the imaging result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see hk.org.hkbh.cms.outpatient.service.persistence.impl.ImagingResultPersistenceImpl
 * @see ImagingResultUtil
 * @generated
 */
@ProviderType
public interface ImagingResultPersistence extends BasePersistence<ImagingResult> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ImagingResultUtil} to access the imaging result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the imaging results where id = &#63;.
	*
	* @param id the ID
	* @return the matching imaging results
	*/
	public java.util.List<ImagingResult> findById(long id);

	/**
	* Returns a range of all the imaging results where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @return the range of matching imaging results
	*/
	public java.util.List<ImagingResult> findById(long id, int start, int end);

	/**
	* Returns an ordered range of all the imaging results where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findById(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns an ordered range of all the imaging results where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findById(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first imaging result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the first imaging result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the last imaging result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the last imaging result in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Removes all the imaging results where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeById(long id);

	/**
	* Returns the number of imaging results where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching imaging results
	*/
	public int countById(long id);

	/**
	* Returns all the imaging results where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching imaging results
	*/
	public java.util.List<ImagingResult> findByPatientId(
		java.lang.Long patientId);

	/**
	* Returns a range of all the imaging results where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @return the range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByPatientId(
		java.lang.Long patientId, int start, int end);

	/**
	* Returns an ordered range of all the imaging results where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByPatientId(
		java.lang.Long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns an ordered range of all the imaging results where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByPatientId(
		java.lang.Long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first imaging result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findByPatientId_First(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the first imaging result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchByPatientId_First(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the last imaging result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findByPatientId_Last(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the last imaging result in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchByPatientId_Last(java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the imaging results before and after the current imaging result in the ordered set where patientId = &#63;.
	*
	* @param id the primary key of the current imaging result
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imaging result
	* @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	*/
	public ImagingResult[] findByPatientId_PrevAndNext(long id,
		java.lang.Long patientId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Removes all the imaging results where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	*/
	public void removeByPatientId(java.lang.Long patientId);

	/**
	* Returns the number of imaging results where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching imaging results
	*/
	public int countByPatientId(java.lang.Long patientId);

	/**
	* Returns all the imaging results where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @return the matching imaging results
	*/
	public java.util.List<ImagingResult> findByEpisodeId(
		java.lang.Long episodeId);

	/**
	* Returns a range of all the imaging results where episodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param episodeId the episode ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @return the range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByEpisodeId(
		java.lang.Long episodeId, int start, int end);

	/**
	* Returns an ordered range of all the imaging results where episodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param episodeId the episode ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByEpisodeId(
		java.lang.Long episodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns an ordered range of all the imaging results where episodeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param episodeId the episode ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByEpisodeId(
		java.lang.Long episodeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first imaging result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findByEpisodeId_First(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the first imaging result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchByEpisodeId_First(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the last imaging result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findByEpisodeId_Last(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the last imaging result in the ordered set where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchByEpisodeId_Last(java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the imaging results before and after the current imaging result in the ordered set where episodeId = &#63;.
	*
	* @param id the primary key of the current imaging result
	* @param episodeId the episode ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imaging result
	* @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	*/
	public ImagingResult[] findByEpisodeId_PrevAndNext(long id,
		java.lang.Long episodeId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Removes all the imaging results where episodeId = &#63; from the database.
	*
	* @param episodeId the episode ID
	*/
	public void removeByEpisodeId(java.lang.Long episodeId);

	/**
	* Returns the number of imaging results where episodeId = &#63;.
	*
	* @param episodeId the episode ID
	* @return the number of matching imaging results
	*/
	public int countByEpisodeId(java.lang.Long episodeId);

	/**
	* Returns all the imaging results where orderId = &#63;.
	*
	* @param orderId the order ID
	* @return the matching imaging results
	*/
	public java.util.List<ImagingResult> findByOrderId(java.lang.Long orderId);

	/**
	* Returns a range of all the imaging results where orderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderId the order ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @return the range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByOrderId(java.lang.Long orderId,
		int start, int end);

	/**
	* Returns an ordered range of all the imaging results where orderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderId the order ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByOrderId(java.lang.Long orderId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns an ordered range of all the imaging results where orderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderId the order ID
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching imaging results
	*/
	public java.util.List<ImagingResult> findByOrderId(java.lang.Long orderId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first imaging result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findByOrderId_First(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the first imaging result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchByOrderId_First(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the last imaging result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result
	* @throws NoSuchImagingResultException if a matching imaging result could not be found
	*/
	public ImagingResult findByOrderId_Last(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Returns the last imaging result in the ordered set where orderId = &#63;.
	*
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	*/
	public ImagingResult fetchByOrderId_Last(java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns the imaging results before and after the current imaging result in the ordered set where orderId = &#63;.
	*
	* @param id the primary key of the current imaging result
	* @param orderId the order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imaging result
	* @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	*/
	public ImagingResult[] findByOrderId_PrevAndNext(long id,
		java.lang.Long orderId,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException;

	/**
	* Removes all the imaging results where orderId = &#63; from the database.
	*
	* @param orderId the order ID
	*/
	public void removeByOrderId(java.lang.Long orderId);

	/**
	* Returns the number of imaging results where orderId = &#63;.
	*
	* @param orderId the order ID
	* @return the number of matching imaging results
	*/
	public int countByOrderId(java.lang.Long orderId);

	/**
	* Caches the imaging result in the entity cache if it is enabled.
	*
	* @param imagingResult the imaging result
	*/
	public void cacheResult(ImagingResult imagingResult);

	/**
	* Caches the imaging results in the entity cache if it is enabled.
	*
	* @param imagingResults the imaging results
	*/
	public void cacheResult(java.util.List<ImagingResult> imagingResults);

	/**
	* Creates a new imaging result with the primary key. Does not add the imaging result to the database.
	*
	* @param id the primary key for the new imaging result
	* @return the new imaging result
	*/
	public ImagingResult create(long id);

	/**
	* Removes the imaging result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imaging result
	* @return the imaging result that was removed
	* @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	*/
	public ImagingResult remove(long id) throws NoSuchImagingResultException;

	public ImagingResult updateImpl(ImagingResult imagingResult);

	/**
	* Returns the imaging result with the primary key or throws a {@link NoSuchImagingResultException} if it could not be found.
	*
	* @param id the primary key of the imaging result
	* @return the imaging result
	* @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	*/
	public ImagingResult findByPrimaryKey(long id)
		throws NoSuchImagingResultException;

	/**
	* Returns the imaging result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imaging result
	* @return the imaging result, or <code>null</code> if a imaging result with the primary key could not be found
	*/
	public ImagingResult fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ImagingResult> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the imaging results.
	*
	* @return the imaging results
	*/
	public java.util.List<ImagingResult> findAll();

	/**
	* Returns a range of all the imaging results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @return the range of imaging results
	*/
	public java.util.List<ImagingResult> findAll(int start, int end);

	/**
	* Returns an ordered range of all the imaging results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imaging results
	*/
	public java.util.List<ImagingResult> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator);

	/**
	* Returns an ordered range of all the imaging results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ImagingResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imaging results
	* @param end the upper bound of the range of imaging results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of imaging results
	*/
	public java.util.List<ImagingResult> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the imaging results from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of imaging results.
	*
	* @return the number of imaging results
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}