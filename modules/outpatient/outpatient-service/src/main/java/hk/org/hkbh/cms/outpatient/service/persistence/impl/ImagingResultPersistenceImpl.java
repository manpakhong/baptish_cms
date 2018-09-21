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

package hk.org.hkbh.cms.outpatient.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import hk.org.hkbh.cms.outpatient.exception.NoSuchImagingResultException;
import hk.org.hkbh.cms.outpatient.model.ImagingResult;
import hk.org.hkbh.cms.outpatient.model.impl.ImagingResultImpl;
import hk.org.hkbh.cms.outpatient.model.impl.ImagingResultModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ImagingResultPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the imaging result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ImagingResultPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.ImagingResultUtil
 * @generated
 */
@ProviderType
public class ImagingResultPersistenceImpl extends BasePersistenceImpl<ImagingResult>
	implements ImagingResultPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ImagingResultUtil} to access the imaging result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ImagingResultImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findById",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findById", new String[] { Long.class.getName() },
			ImagingResultModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countById",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the imaging results where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching imaging results
	 */
	@Override
	public List<ImagingResult> findById(long id) {
		return findById(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ImagingResult> findById(long id, int start, int end) {
		return findById(id, start, end, null);
	}

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
	@Override
	public List<ImagingResult> findById(long id, int start, int end,
		OrderByComparator<ImagingResult> orderByComparator) {
		return findById(id, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ImagingResult> findById(long id, int start, int end,
		OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id, start, end, orderByComparator };
		}

		List<ImagingResult> list = null;

		if (retrieveFromCache) {
			list = (List<ImagingResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ImagingResult imagingResult : list) {
					if ((id != imagingResult.getId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first imaging result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findById_First(long id,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchById_First(id, orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the first imaging result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchById_First(long id,
		OrderByComparator<ImagingResult> orderByComparator) {
		List<ImagingResult> list = findById(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imaging result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findById_Last(long id,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchById_Last(id, orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the last imaging result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchById_Last(long id,
		OrderByComparator<ImagingResult> orderByComparator) {
		int count = countById(id);

		if (count == 0) {
			return null;
		}

		List<ImagingResult> list = findById(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the imaging results where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeById(long id) {
		for (ImagingResult imagingResult : findById(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(imagingResult);
		}
	}

	/**
	 * Returns the number of imaging results where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching imaging results
	 */
	@Override
	public int countById(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ID_ID_2 = "imagingResult.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PATIENTID =
		new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPatientId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID =
		new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPatientId", new String[] { Long.class.getName() },
			ImagingResultModelImpl.PATIENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PATIENTID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPatientId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the imaging results where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @return the matching imaging results
	 */
	@Override
	public List<ImagingResult> findByPatientId(Long patientId) {
		return findByPatientId(patientId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ImagingResult> findByPatientId(Long patientId, int start,
		int end) {
		return findByPatientId(patientId, start, end, null);
	}

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
	@Override
	public List<ImagingResult> findByPatientId(Long patientId, int start,
		int end, OrderByComparator<ImagingResult> orderByComparator) {
		return findByPatientId(patientId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ImagingResult> findByPatientId(Long patientId, int start,
		int end, OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID;
			finderArgs = new Object[] { patientId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PATIENTID;
			finderArgs = new Object[] { patientId, start, end, orderByComparator };
		}

		List<ImagingResult> list = null;

		if (retrieveFromCache) {
			list = (List<ImagingResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ImagingResult imagingResult : list) {
					if (!Objects.equals(patientId, imagingResult.getPatientId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_PATIENTID_PATIENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(patientId.longValue());

				if (!pagination) {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first imaging result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findByPatientId_First(Long patientId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByPatientId_First(patientId,
				orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("patientId=");
		msg.append(patientId);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the first imaging result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchByPatientId_First(Long patientId,
		OrderByComparator<ImagingResult> orderByComparator) {
		List<ImagingResult> list = findByPatientId(patientId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imaging result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findByPatientId_Last(Long patientId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByPatientId_Last(patientId,
				orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("patientId=");
		msg.append(patientId);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the last imaging result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchByPatientId_Last(Long patientId,
		OrderByComparator<ImagingResult> orderByComparator) {
		int count = countByPatientId(patientId);

		if (count == 0) {
			return null;
		}

		List<ImagingResult> list = findByPatientId(patientId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imaging results before and after the current imaging result in the ordered set where patientId = &#63;.
	 *
	 * @param id the primary key of the current imaging result
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imaging result
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult[] findByPatientId_PrevAndNext(long id, Long patientId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImagingResult[] array = new ImagingResultImpl[3];

			array[0] = getByPatientId_PrevAndNext(session, imagingResult,
					patientId, orderByComparator, true);

			array[1] = imagingResult;

			array[2] = getByPatientId_PrevAndNext(session, imagingResult,
					patientId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImagingResult getByPatientId_PrevAndNext(Session session,
		ImagingResult imagingResult, Long patientId,
		OrderByComparator<ImagingResult> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

		query.append(_FINDER_COLUMN_PATIENTID_PATIENTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(patientId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(imagingResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImagingResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imaging results where patientId = &#63; from the database.
	 *
	 * @param patientId the patient ID
	 */
	@Override
	public void removeByPatientId(Long patientId) {
		for (ImagingResult imagingResult : findByPatientId(patientId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(imagingResult);
		}
	}

	/**
	 * Returns the number of imaging results where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @return the number of matching imaging results
	 */
	@Override
	public int countByPatientId(Long patientId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PATIENTID;

		Object[] finderArgs = new Object[] { patientId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_PATIENTID_PATIENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(patientId.longValue());

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PATIENTID_PATIENTID_2 = "imagingResult.patientId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EPISODEID =
		new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEpisodeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID =
		new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEpisodeId", new String[] { Long.class.getName() },
			ImagingResultModelImpl.EPISODEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EPISODEID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEpisodeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the imaging results where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @return the matching imaging results
	 */
	@Override
	public List<ImagingResult> findByEpisodeId(Long episodeId) {
		return findByEpisodeId(episodeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ImagingResult> findByEpisodeId(Long episodeId, int start,
		int end) {
		return findByEpisodeId(episodeId, start, end, null);
	}

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
	@Override
	public List<ImagingResult> findByEpisodeId(Long episodeId, int start,
		int end, OrderByComparator<ImagingResult> orderByComparator) {
		return findByEpisodeId(episodeId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ImagingResult> findByEpisodeId(Long episodeId, int start,
		int end, OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID;
			finderArgs = new Object[] { episodeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EPISODEID;
			finderArgs = new Object[] { episodeId, start, end, orderByComparator };
		}

		List<ImagingResult> list = null;

		if (retrieveFromCache) {
			list = (List<ImagingResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ImagingResult imagingResult : list) {
					if (!Objects.equals(episodeId, imagingResult.getEpisodeId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_EPISODEID_EPISODEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(episodeId.longValue());

				if (!pagination) {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first imaging result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findByEpisodeId_First(Long episodeId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByEpisodeId_First(episodeId,
				orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("episodeId=");
		msg.append(episodeId);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the first imaging result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchByEpisodeId_First(Long episodeId,
		OrderByComparator<ImagingResult> orderByComparator) {
		List<ImagingResult> list = findByEpisodeId(episodeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imaging result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findByEpisodeId_Last(Long episodeId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByEpisodeId_Last(episodeId,
				orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("episodeId=");
		msg.append(episodeId);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the last imaging result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchByEpisodeId_Last(Long episodeId,
		OrderByComparator<ImagingResult> orderByComparator) {
		int count = countByEpisodeId(episodeId);

		if (count == 0) {
			return null;
		}

		List<ImagingResult> list = findByEpisodeId(episodeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imaging results before and after the current imaging result in the ordered set where episodeId = &#63;.
	 *
	 * @param id the primary key of the current imaging result
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imaging result
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult[] findByEpisodeId_PrevAndNext(long id, Long episodeId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImagingResult[] array = new ImagingResultImpl[3];

			array[0] = getByEpisodeId_PrevAndNext(session, imagingResult,
					episodeId, orderByComparator, true);

			array[1] = imagingResult;

			array[2] = getByEpisodeId_PrevAndNext(session, imagingResult,
					episodeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImagingResult getByEpisodeId_PrevAndNext(Session session,
		ImagingResult imagingResult, Long episodeId,
		OrderByComparator<ImagingResult> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

		query.append(_FINDER_COLUMN_EPISODEID_EPISODEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(episodeId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(imagingResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImagingResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imaging results where episodeId = &#63; from the database.
	 *
	 * @param episodeId the episode ID
	 */
	@Override
	public void removeByEpisodeId(Long episodeId) {
		for (ImagingResult imagingResult : findByEpisodeId(episodeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(imagingResult);
		}
	}

	/**
	 * Returns the number of imaging results where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @return the number of matching imaging results
	 */
	@Override
	public int countByEpisodeId(Long episodeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EPISODEID;

		Object[] finderArgs = new Object[] { episodeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_EPISODEID_EPISODEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(episodeId.longValue());

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EPISODEID_EPISODEID_2 = "imagingResult.episodeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOrderId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID =
		new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED,
			ImagingResultImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOrderId", new String[] { Long.class.getName() },
			ImagingResultModelImpl.ORDERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORDERID = new FinderPath(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrderId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the imaging results where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @return the matching imaging results
	 */
	@Override
	public List<ImagingResult> findByOrderId(Long orderId) {
		return findByOrderId(orderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ImagingResult> findByOrderId(Long orderId, int start, int end) {
		return findByOrderId(orderId, start, end, null);
	}

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
	@Override
	public List<ImagingResult> findByOrderId(Long orderId, int start, int end,
		OrderByComparator<ImagingResult> orderByComparator) {
		return findByOrderId(orderId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ImagingResult> findByOrderId(Long orderId, int start, int end,
		OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID;
			finderArgs = new Object[] { orderId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERID;
			finderArgs = new Object[] { orderId, start, end, orderByComparator };
		}

		List<ImagingResult> list = null;

		if (retrieveFromCache) {
			list = (List<ImagingResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ImagingResult imagingResult : list) {
					if (!Objects.equals(orderId, imagingResult.getOrderId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_ORDERID_ORDERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(orderId.longValue());

				if (!pagination) {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first imaging result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findByOrderId_First(Long orderId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByOrderId_First(orderId,
				orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orderId=");
		msg.append(orderId);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the first imaging result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchByOrderId_First(Long orderId,
		OrderByComparator<ImagingResult> orderByComparator) {
		List<ImagingResult> list = findByOrderId(orderId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imaging result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result
	 * @throws NoSuchImagingResultException if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult findByOrderId_Last(Long orderId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByOrderId_Last(orderId,
				orderByComparator);

		if (imagingResult != null) {
			return imagingResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orderId=");
		msg.append(orderId);

		msg.append("}");

		throw new NoSuchImagingResultException(msg.toString());
	}

	/**
	 * Returns the last imaging result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imaging result, or <code>null</code> if a matching imaging result could not be found
	 */
	@Override
	public ImagingResult fetchByOrderId_Last(Long orderId,
		OrderByComparator<ImagingResult> orderByComparator) {
		int count = countByOrderId(orderId);

		if (count == 0) {
			return null;
		}

		List<ImagingResult> list = findByOrderId(orderId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imaging results before and after the current imaging result in the ordered set where orderId = &#63;.
	 *
	 * @param id the primary key of the current imaging result
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imaging result
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult[] findByOrderId_PrevAndNext(long id, Long orderId,
		OrderByComparator<ImagingResult> orderByComparator)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImagingResult[] array = new ImagingResultImpl[3];

			array[0] = getByOrderId_PrevAndNext(session, imagingResult,
					orderId, orderByComparator, true);

			array[1] = imagingResult;

			array[2] = getByOrderId_PrevAndNext(session, imagingResult,
					orderId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImagingResult getByOrderId_PrevAndNext(Session session,
		ImagingResult imagingResult, Long orderId,
		OrderByComparator<ImagingResult> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMAGINGRESULT_WHERE);

		query.append(_FINDER_COLUMN_ORDERID_ORDERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ImagingResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(orderId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(imagingResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImagingResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imaging results where orderId = &#63; from the database.
	 *
	 * @param orderId the order ID
	 */
	@Override
	public void removeByOrderId(Long orderId) {
		for (ImagingResult imagingResult : findByOrderId(orderId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(imagingResult);
		}
	}

	/**
	 * Returns the number of imaging results where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @return the number of matching imaging results
	 */
	@Override
	public int countByOrderId(Long orderId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORDERID;

		Object[] finderArgs = new Object[] { orderId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMAGINGRESULT_WHERE);

			query.append(_FINDER_COLUMN_ORDERID_ORDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(orderId.longValue());

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORDERID_ORDERID_2 = "imagingResult.orderId = ?";

	public ImagingResultPersistenceImpl() {
		setModelClass(ImagingResult.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("patientId", "patient_id");
			dbColumnNames.put("episodeId", "episode_id");
			dbColumnNames.put("orderId", "order_id");
			dbColumnNames.put("labName", "lab_name");
			dbColumnNames.put("reportName", "report_name");
			dbColumnNames.put("labResultTypeCodeId", "lab_result_type_code_id");
			dbColumnNames.put("severityCodeId", "severity_code_id");
			dbColumnNames.put("createDate", "create_date");
			dbColumnNames.put("updateDate", "update_date");
			dbColumnNames.put("createdBy", "created_by");
			dbColumnNames.put("updatedBy", "updated_by");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the imaging result in the entity cache if it is enabled.
	 *
	 * @param imagingResult the imaging result
	 */
	@Override
	public void cacheResult(ImagingResult imagingResult) {
		entityCache.putResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultImpl.class, imagingResult.getPrimaryKey(),
			imagingResult);

		imagingResult.resetOriginalValues();
	}

	/**
	 * Caches the imaging results in the entity cache if it is enabled.
	 *
	 * @param imagingResults the imaging results
	 */
	@Override
	public void cacheResult(List<ImagingResult> imagingResults) {
		for (ImagingResult imagingResult : imagingResults) {
			if (entityCache.getResult(
						ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
						ImagingResultImpl.class, imagingResult.getPrimaryKey()) == null) {
				cacheResult(imagingResult);
			}
			else {
				imagingResult.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all imaging results.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ImagingResultImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the imaging result.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ImagingResult imagingResult) {
		entityCache.removeResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultImpl.class, imagingResult.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ImagingResult> imagingResults) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ImagingResult imagingResult : imagingResults) {
			entityCache.removeResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
				ImagingResultImpl.class, imagingResult.getPrimaryKey());
		}
	}

	/**
	 * Creates a new imaging result with the primary key. Does not add the imaging result to the database.
	 *
	 * @param id the primary key for the new imaging result
	 * @return the new imaging result
	 */
	@Override
	public ImagingResult create(long id) {
		ImagingResult imagingResult = new ImagingResultImpl();

		imagingResult.setNew(true);
		imagingResult.setPrimaryKey(id);

		return imagingResult;
	}

	/**
	 * Removes the imaging result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the imaging result
	 * @return the imaging result that was removed
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult remove(long id) throws NoSuchImagingResultException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the imaging result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the imaging result
	 * @return the imaging result that was removed
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult remove(Serializable primaryKey)
		throws NoSuchImagingResultException {
		Session session = null;

		try {
			session = openSession();

			ImagingResult imagingResult = (ImagingResult)session.get(ImagingResultImpl.class,
					primaryKey);

			if (imagingResult == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchImagingResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(imagingResult);
		}
		catch (NoSuchImagingResultException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ImagingResult removeImpl(ImagingResult imagingResult) {
		imagingResult = toUnwrappedModel(imagingResult);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(imagingResult)) {
				imagingResult = (ImagingResult)session.get(ImagingResultImpl.class,
						imagingResult.getPrimaryKeyObj());
			}

			if (imagingResult != null) {
				session.delete(imagingResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (imagingResult != null) {
			clearCache(imagingResult);
		}

		return imagingResult;
	}

	@Override
	public ImagingResult updateImpl(ImagingResult imagingResult) {
		imagingResult = toUnwrappedModel(imagingResult);

		boolean isNew = imagingResult.isNew();

		ImagingResultModelImpl imagingResultModelImpl = (ImagingResultModelImpl)imagingResult;

		Session session = null;

		try {
			session = openSession();

			if (imagingResult.isNew()) {
				session.save(imagingResult);

				imagingResult.setNew(false);
			}
			else {
				imagingResult = (ImagingResult)session.merge(imagingResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ImagingResultModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { imagingResultModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			args = new Object[] { imagingResultModelImpl.getPatientId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PATIENTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID,
				args);

			args = new Object[] { imagingResultModelImpl.getEpisodeId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EPISODEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID,
				args);

			args = new Object[] { imagingResultModelImpl.getOrderId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((imagingResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						imagingResultModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { imagingResultModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}

			if ((imagingResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						imagingResultModelImpl.getOriginalPatientId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PATIENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID,
					args);

				args = new Object[] { imagingResultModelImpl.getPatientId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PATIENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID,
					args);
			}

			if ((imagingResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						imagingResultModelImpl.getOriginalEpisodeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EPISODEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID,
					args);

				args = new Object[] { imagingResultModelImpl.getEpisodeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EPISODEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID,
					args);
			}

			if ((imagingResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						imagingResultModelImpl.getOriginalOrderId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
					args);

				args = new Object[] { imagingResultModelImpl.getOrderId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
					args);
			}
		}

		entityCache.putResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
			ImagingResultImpl.class, imagingResult.getPrimaryKey(),
			imagingResult, false);

		imagingResult.resetOriginalValues();

		return imagingResult;
	}

	protected ImagingResult toUnwrappedModel(ImagingResult imagingResult) {
		if (imagingResult instanceof ImagingResultImpl) {
			return imagingResult;
		}

		ImagingResultImpl imagingResultImpl = new ImagingResultImpl();

		imagingResultImpl.setNew(imagingResult.isNew());
		imagingResultImpl.setPrimaryKey(imagingResult.getPrimaryKey());

		imagingResultImpl.setId(imagingResult.getId());
		imagingResultImpl.setPatientId(imagingResult.getPatientId());
		imagingResultImpl.setEpisodeId(imagingResult.getEpisodeId());
		imagingResultImpl.setOrderId(imagingResult.getOrderId());
		imagingResultImpl.setLabName(imagingResult.getLabName());
		imagingResultImpl.setReportName(imagingResult.getReportName());
		imagingResultImpl.setLabResultTypeCodeId(imagingResult.getLabResultTypeCodeId());
		imagingResultImpl.setSeverityCodeId(imagingResult.getSeverityCodeId());
		imagingResultImpl.setRemarks(imagingResult.getRemarks());
		imagingResultImpl.setCreateDate(imagingResult.getCreateDate());
		imagingResultImpl.setUpdateDate(imagingResult.getUpdateDate());
		imagingResultImpl.setCreatedBy(imagingResult.getCreatedBy());
		imagingResultImpl.setUpdatedBy(imagingResult.getUpdatedBy());

		return imagingResultImpl;
	}

	/**
	 * Returns the imaging result with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the imaging result
	 * @return the imaging result
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult findByPrimaryKey(Serializable primaryKey)
		throws NoSuchImagingResultException {
		ImagingResult imagingResult = fetchByPrimaryKey(primaryKey);

		if (imagingResult == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchImagingResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return imagingResult;
	}

	/**
	 * Returns the imaging result with the primary key or throws a {@link NoSuchImagingResultException} if it could not be found.
	 *
	 * @param id the primary key of the imaging result
	 * @return the imaging result
	 * @throws NoSuchImagingResultException if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult findByPrimaryKey(long id)
		throws NoSuchImagingResultException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the imaging result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the imaging result
	 * @return the imaging result, or <code>null</code> if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
				ImagingResultImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ImagingResult imagingResult = (ImagingResult)serializable;

		if (imagingResult == null) {
			Session session = null;

			try {
				session = openSession();

				imagingResult = (ImagingResult)session.get(ImagingResultImpl.class,
						primaryKey);

				if (imagingResult != null) {
					cacheResult(imagingResult);
				}
				else {
					entityCache.putResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
						ImagingResultImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
					ImagingResultImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return imagingResult;
	}

	/**
	 * Returns the imaging result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the imaging result
	 * @return the imaging result, or <code>null</code> if a imaging result with the primary key could not be found
	 */
	@Override
	public ImagingResult fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ImagingResult> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ImagingResult> map = new HashMap<Serializable, ImagingResult>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ImagingResult imagingResult = fetchByPrimaryKey(primaryKey);

			if (imagingResult != null) {
				map.put(primaryKey, imagingResult);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
					ImagingResultImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ImagingResult)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_IMAGINGRESULT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ImagingResult imagingResult : (List<ImagingResult>)q.list()) {
				map.put(imagingResult.getPrimaryKeyObj(), imagingResult);

				cacheResult(imagingResult);

				uncachedPrimaryKeys.remove(imagingResult.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ImagingResultModelImpl.ENTITY_CACHE_ENABLED,
					ImagingResultImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the imaging results.
	 *
	 * @return the imaging results
	 */
	@Override
	public List<ImagingResult> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ImagingResult> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ImagingResult> findAll(int start, int end,
		OrderByComparator<ImagingResult> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ImagingResult> findAll(int start, int end,
		OrderByComparator<ImagingResult> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ImagingResult> list = null;

		if (retrieveFromCache) {
			list = (List<ImagingResult>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IMAGINGRESULT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IMAGINGRESULT;

				if (pagination) {
					sql = sql.concat(ImagingResultModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ImagingResult>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the imaging results from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ImagingResult imagingResult : findAll()) {
			remove(imagingResult);
		}
	}

	/**
	 * Returns the number of imaging results.
	 *
	 * @return the number of imaging results
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IMAGINGRESULT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ImagingResultModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the imaging result persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ImagingResultImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_IMAGINGRESULT = "SELECT imagingResult FROM ImagingResult imagingResult";
	private static final String _SQL_SELECT_IMAGINGRESULT_WHERE_PKS_IN = "SELECT imagingResult FROM ImagingResult imagingResult WHERE id IN (";
	private static final String _SQL_SELECT_IMAGINGRESULT_WHERE = "SELECT imagingResult FROM ImagingResult imagingResult WHERE ";
	private static final String _SQL_COUNT_IMAGINGRESULT = "SELECT COUNT(imagingResult) FROM ImagingResult imagingResult";
	private static final String _SQL_COUNT_IMAGINGRESULT_WHERE = "SELECT COUNT(imagingResult) FROM ImagingResult imagingResult WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "imagingResult.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ImagingResult exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ImagingResult exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ImagingResultPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"patientId", "episodeId", "orderId", "labName", "reportName",
				"labResultTypeCodeId", "severityCodeId", "createDate",
				"updateDate", "createdBy", "updatedBy"
			});
}