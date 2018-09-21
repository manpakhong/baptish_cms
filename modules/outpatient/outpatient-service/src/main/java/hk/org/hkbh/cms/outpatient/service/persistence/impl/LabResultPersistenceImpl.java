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

import hk.org.hkbh.cms.outpatient.exception.NoSuchLabResultException;
import hk.org.hkbh.cms.outpatient.model.LabResult;
import hk.org.hkbh.cms.outpatient.model.impl.LabResultImpl;
import hk.org.hkbh.cms.outpatient.model.impl.LabResultModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.LabResultPersistence;

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
 * The persistence implementation for the lab result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see LabResultPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.LabResultUtil
 * @generated
 */
@ProviderType
public class LabResultPersistenceImpl extends BasePersistenceImpl<LabResult>
	implements LabResultPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LabResultUtil} to access the lab result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LabResultImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findById",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findById",
			new String[] { Long.class.getName() },
			LabResultModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countById",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lab results where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching lab results
	 */
	@Override
	public List<LabResult> findById(long id) {
		return findById(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LabResult> findById(long id, int start, int end) {
		return findById(id, start, end, null);
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
	@Override
	public List<LabResult> findById(long id, int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return findById(id, start, end, orderByComparator, true);
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
	@Override
	public List<LabResult> findById(long id, int start, int end,
		OrderByComparator<LabResult> orderByComparator,
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

		List<LabResult> list = null;

		if (retrieveFromCache) {
			list = (List<LabResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LabResult labResult : list) {
					if ((id != labResult.getId())) {
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

			query.append(_SQL_SELECT_LABRESULT_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LabResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lab result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findById_First(long id,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchById_First(id, orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the first lab result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchById_First(long id,
		OrderByComparator<LabResult> orderByComparator) {
		List<LabResult> list = findById(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lab result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findById_Last(long id,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchById_Last(id, orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the last lab result in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchById_Last(long id,
		OrderByComparator<LabResult> orderByComparator) {
		int count = countById(id);

		if (count == 0) {
			return null;
		}

		List<LabResult> list = findById(id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the lab results where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeById(long id) {
		for (LabResult labResult : findById(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(labResult);
		}
	}

	/**
	 * Returns the number of lab results where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching lab results
	 */
	@Override
	public int countById(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LABRESULT_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "labResult.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PATIENTID =
		new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPatientId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID =
		new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPatientId",
			new String[] { Long.class.getName() },
			LabResultModelImpl.PATIENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PATIENTID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPatientId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lab results where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @return the matching lab results
	 */
	@Override
	public List<LabResult> findByPatientId(Long patientId) {
		return findByPatientId(patientId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<LabResult> findByPatientId(Long patientId, int start, int end) {
		return findByPatientId(patientId, start, end, null);
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
	@Override
	public List<LabResult> findByPatientId(Long patientId, int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return findByPatientId(patientId, start, end, orderByComparator, true);
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
	@Override
	public List<LabResult> findByPatientId(Long patientId, int start, int end,
		OrderByComparator<LabResult> orderByComparator,
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

		List<LabResult> list = null;

		if (retrieveFromCache) {
			list = (List<LabResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LabResult labResult : list) {
					if (!Objects.equals(patientId, labResult.getPatientId())) {
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

			query.append(_SQL_SELECT_LABRESULT_WHERE);

			query.append(_FINDER_COLUMN_PATIENTID_PATIENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LabResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(patientId.longValue());

				if (!pagination) {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lab result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findByPatientId_First(Long patientId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByPatientId_First(patientId,
				orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("patientId=");
		msg.append(patientId);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the first lab result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchByPatientId_First(Long patientId,
		OrderByComparator<LabResult> orderByComparator) {
		List<LabResult> list = findByPatientId(patientId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lab result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findByPatientId_Last(Long patientId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByPatientId_Last(patientId, orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("patientId=");
		msg.append(patientId);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the last lab result in the ordered set where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchByPatientId_Last(Long patientId,
		OrderByComparator<LabResult> orderByComparator) {
		int count = countByPatientId(patientId);

		if (count == 0) {
			return null;
		}

		List<LabResult> list = findByPatientId(patientId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LabResult[] findByPatientId_PrevAndNext(long id, Long patientId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LabResult[] array = new LabResultImpl[3];

			array[0] = getByPatientId_PrevAndNext(session, labResult,
					patientId, orderByComparator, true);

			array[1] = labResult;

			array[2] = getByPatientId_PrevAndNext(session, labResult,
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

	protected LabResult getByPatientId_PrevAndNext(Session session,
		LabResult labResult, Long patientId,
		OrderByComparator<LabResult> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LABRESULT_WHERE);

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
			query.append(LabResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(patientId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(labResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LabResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lab results where patientId = &#63; from the database.
	 *
	 * @param patientId the patient ID
	 */
	@Override
	public void removeByPatientId(Long patientId) {
		for (LabResult labResult : findByPatientId(patientId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(labResult);
		}
	}

	/**
	 * Returns the number of lab results where patientId = &#63;.
	 *
	 * @param patientId the patient ID
	 * @return the number of matching lab results
	 */
	@Override
	public int countByPatientId(Long patientId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PATIENTID;

		Object[] finderArgs = new Object[] { patientId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LABRESULT_WHERE);

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

	private static final String _FINDER_COLUMN_PATIENTID_PATIENTID_2 = "labResult.patientId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EPISODEID =
		new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEpisodeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID =
		new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEpisodeId",
			new String[] { Long.class.getName() },
			LabResultModelImpl.EPISODEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EPISODEID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEpisodeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lab results where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @return the matching lab results
	 */
	@Override
	public List<LabResult> findByEpisodeId(Long episodeId) {
		return findByEpisodeId(episodeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<LabResult> findByEpisodeId(Long episodeId, int start, int end) {
		return findByEpisodeId(episodeId, start, end, null);
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
	@Override
	public List<LabResult> findByEpisodeId(Long episodeId, int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return findByEpisodeId(episodeId, start, end, orderByComparator, true);
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
	@Override
	public List<LabResult> findByEpisodeId(Long episodeId, int start, int end,
		OrderByComparator<LabResult> orderByComparator,
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

		List<LabResult> list = null;

		if (retrieveFromCache) {
			list = (List<LabResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LabResult labResult : list) {
					if (!Objects.equals(episodeId, labResult.getEpisodeId())) {
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

			query.append(_SQL_SELECT_LABRESULT_WHERE);

			query.append(_FINDER_COLUMN_EPISODEID_EPISODEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LabResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(episodeId.longValue());

				if (!pagination) {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lab result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findByEpisodeId_First(Long episodeId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByEpisodeId_First(episodeId,
				orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("episodeId=");
		msg.append(episodeId);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the first lab result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchByEpisodeId_First(Long episodeId,
		OrderByComparator<LabResult> orderByComparator) {
		List<LabResult> list = findByEpisodeId(episodeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lab result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findByEpisodeId_Last(Long episodeId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByEpisodeId_Last(episodeId, orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("episodeId=");
		msg.append(episodeId);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the last lab result in the ordered set where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchByEpisodeId_Last(Long episodeId,
		OrderByComparator<LabResult> orderByComparator) {
		int count = countByEpisodeId(episodeId);

		if (count == 0) {
			return null;
		}

		List<LabResult> list = findByEpisodeId(episodeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LabResult[] findByEpisodeId_PrevAndNext(long id, Long episodeId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LabResult[] array = new LabResultImpl[3];

			array[0] = getByEpisodeId_PrevAndNext(session, labResult,
					episodeId, orderByComparator, true);

			array[1] = labResult;

			array[2] = getByEpisodeId_PrevAndNext(session, labResult,
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

	protected LabResult getByEpisodeId_PrevAndNext(Session session,
		LabResult labResult, Long episodeId,
		OrderByComparator<LabResult> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LABRESULT_WHERE);

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
			query.append(LabResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(episodeId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(labResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LabResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lab results where episodeId = &#63; from the database.
	 *
	 * @param episodeId the episode ID
	 */
	@Override
	public void removeByEpisodeId(Long episodeId) {
		for (LabResult labResult : findByEpisodeId(episodeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(labResult);
		}
	}

	/**
	 * Returns the number of lab results where episodeId = &#63;.
	 *
	 * @param episodeId the episode ID
	 * @return the number of matching lab results
	 */
	@Override
	public int countByEpisodeId(Long episodeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EPISODEID;

		Object[] finderArgs = new Object[] { episodeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LABRESULT_WHERE);

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

	private static final String _FINDER_COLUMN_EPISODEID_EPISODEID_2 = "labResult.episodeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrderId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID =
		new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, LabResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrderId",
			new String[] { Long.class.getName() },
			LabResultModelImpl.ORDERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORDERID = new FinderPath(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrderId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lab results where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @return the matching lab results
	 */
	@Override
	public List<LabResult> findByOrderId(Long orderId) {
		return findByOrderId(orderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LabResult> findByOrderId(Long orderId, int start, int end) {
		return findByOrderId(orderId, start, end, null);
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
	@Override
	public List<LabResult> findByOrderId(Long orderId, int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return findByOrderId(orderId, start, end, orderByComparator, true);
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
	@Override
	public List<LabResult> findByOrderId(Long orderId, int start, int end,
		OrderByComparator<LabResult> orderByComparator,
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

		List<LabResult> list = null;

		if (retrieveFromCache) {
			list = (List<LabResult>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LabResult labResult : list) {
					if (!Objects.equals(orderId, labResult.getOrderId())) {
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

			query.append(_SQL_SELECT_LABRESULT_WHERE);

			query.append(_FINDER_COLUMN_ORDERID_ORDERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LabResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(orderId.longValue());

				if (!pagination) {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lab result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findByOrderId_First(Long orderId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByOrderId_First(orderId, orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orderId=");
		msg.append(orderId);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the first lab result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchByOrderId_First(Long orderId,
		OrderByComparator<LabResult> orderByComparator) {
		List<LabResult> list = findByOrderId(orderId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lab result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result
	 * @throws NoSuchLabResultException if a matching lab result could not be found
	 */
	@Override
	public LabResult findByOrderId_Last(Long orderId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByOrderId_Last(orderId, orderByComparator);

		if (labResult != null) {
			return labResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orderId=");
		msg.append(orderId);

		msg.append("}");

		throw new NoSuchLabResultException(msg.toString());
	}

	/**
	 * Returns the last lab result in the ordered set where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lab result, or <code>null</code> if a matching lab result could not be found
	 */
	@Override
	public LabResult fetchByOrderId_Last(Long orderId,
		OrderByComparator<LabResult> orderByComparator) {
		int count = countByOrderId(orderId);

		if (count == 0) {
			return null;
		}

		List<LabResult> list = findByOrderId(orderId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LabResult[] findByOrderId_PrevAndNext(long id, Long orderId,
		OrderByComparator<LabResult> orderByComparator)
		throws NoSuchLabResultException {
		LabResult labResult = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			LabResult[] array = new LabResultImpl[3];

			array[0] = getByOrderId_PrevAndNext(session, labResult, orderId,
					orderByComparator, true);

			array[1] = labResult;

			array[2] = getByOrderId_PrevAndNext(session, labResult, orderId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LabResult getByOrderId_PrevAndNext(Session session,
		LabResult labResult, Long orderId,
		OrderByComparator<LabResult> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LABRESULT_WHERE);

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
			query.append(LabResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(orderId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(labResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LabResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lab results where orderId = &#63; from the database.
	 *
	 * @param orderId the order ID
	 */
	@Override
	public void removeByOrderId(Long orderId) {
		for (LabResult labResult : findByOrderId(orderId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(labResult);
		}
	}

	/**
	 * Returns the number of lab results where orderId = &#63;.
	 *
	 * @param orderId the order ID
	 * @return the number of matching lab results
	 */
	@Override
	public int countByOrderId(Long orderId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORDERID;

		Object[] finderArgs = new Object[] { orderId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LABRESULT_WHERE);

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

	private static final String _FINDER_COLUMN_ORDERID_ORDERID_2 = "labResult.orderId = ?";

	public LabResultPersistenceImpl() {
		setModelClass(LabResult.class);

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
	 * Caches the lab result in the entity cache if it is enabled.
	 *
	 * @param labResult the lab result
	 */
	@Override
	public void cacheResult(LabResult labResult) {
		entityCache.putResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultImpl.class, labResult.getPrimaryKey(), labResult);

		labResult.resetOriginalValues();
	}

	/**
	 * Caches the lab results in the entity cache if it is enabled.
	 *
	 * @param labResults the lab results
	 */
	@Override
	public void cacheResult(List<LabResult> labResults) {
		for (LabResult labResult : labResults) {
			if (entityCache.getResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
						LabResultImpl.class, labResult.getPrimaryKey()) == null) {
				cacheResult(labResult);
			}
			else {
				labResult.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lab results.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LabResultImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lab result.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LabResult labResult) {
		entityCache.removeResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultImpl.class, labResult.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LabResult> labResults) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LabResult labResult : labResults) {
			entityCache.removeResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
				LabResultImpl.class, labResult.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lab result with the primary key. Does not add the lab result to the database.
	 *
	 * @param id the primary key for the new lab result
	 * @return the new lab result
	 */
	@Override
	public LabResult create(long id) {
		LabResult labResult = new LabResultImpl();

		labResult.setNew(true);
		labResult.setPrimaryKey(id);

		return labResult;
	}

	/**
	 * Removes the lab result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the lab result
	 * @return the lab result that was removed
	 * @throws NoSuchLabResultException if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult remove(long id) throws NoSuchLabResultException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the lab result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lab result
	 * @return the lab result that was removed
	 * @throws NoSuchLabResultException if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult remove(Serializable primaryKey)
		throws NoSuchLabResultException {
		Session session = null;

		try {
			session = openSession();

			LabResult labResult = (LabResult)session.get(LabResultImpl.class,
					primaryKey);

			if (labResult == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLabResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(labResult);
		}
		catch (NoSuchLabResultException nsee) {
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
	protected LabResult removeImpl(LabResult labResult) {
		labResult = toUnwrappedModel(labResult);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(labResult)) {
				labResult = (LabResult)session.get(LabResultImpl.class,
						labResult.getPrimaryKeyObj());
			}

			if (labResult != null) {
				session.delete(labResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (labResult != null) {
			clearCache(labResult);
		}

		return labResult;
	}

	@Override
	public LabResult updateImpl(LabResult labResult) {
		labResult = toUnwrappedModel(labResult);

		boolean isNew = labResult.isNew();

		LabResultModelImpl labResultModelImpl = (LabResultModelImpl)labResult;

		Session session = null;

		try {
			session = openSession();

			if (labResult.isNew()) {
				session.save(labResult);

				labResult.setNew(false);
			}
			else {
				labResult = (LabResult)session.merge(labResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!LabResultModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { labResultModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			args = new Object[] { labResultModelImpl.getPatientId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PATIENTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID,
				args);

			args = new Object[] { labResultModelImpl.getEpisodeId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EPISODEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID,
				args);

			args = new Object[] { labResultModelImpl.getOrderId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((labResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { labResultModelImpl.getOriginalId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { labResultModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}

			if ((labResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						labResultModelImpl.getOriginalPatientId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PATIENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID,
					args);

				args = new Object[] { labResultModelImpl.getPatientId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PATIENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATIENTID,
					args);
			}

			if ((labResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						labResultModelImpl.getOriginalEpisodeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EPISODEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID,
					args);

				args = new Object[] { labResultModelImpl.getEpisodeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EPISODEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EPISODEID,
					args);
			}

			if ((labResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						labResultModelImpl.getOriginalOrderId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
					args);

				args = new Object[] { labResultModelImpl.getOrderId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
					args);
			}
		}

		entityCache.putResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
			LabResultImpl.class, labResult.getPrimaryKey(), labResult, false);

		labResult.resetOriginalValues();

		return labResult;
	}

	protected LabResult toUnwrappedModel(LabResult labResult) {
		if (labResult instanceof LabResultImpl) {
			return labResult;
		}

		LabResultImpl labResultImpl = new LabResultImpl();

		labResultImpl.setNew(labResult.isNew());
		labResultImpl.setPrimaryKey(labResult.getPrimaryKey());

		labResultImpl.setId(labResult.getId());
		labResultImpl.setPatientId(labResult.getPatientId());
		labResultImpl.setEpisodeId(labResult.getEpisodeId());
		labResultImpl.setOrderId(labResult.getOrderId());
		labResultImpl.setLabName(labResult.getLabName());
		labResultImpl.setReportName(labResult.getReportName());
		labResultImpl.setLabResultTypeCodeId(labResult.getLabResultTypeCodeId());
		labResultImpl.setSeverityCodeId(labResult.getSeverityCodeId());
		labResultImpl.setRemarks(labResult.getRemarks());
		labResultImpl.setCreateDate(labResult.getCreateDate());
		labResultImpl.setUpdateDate(labResult.getUpdateDate());
		labResultImpl.setCreatedBy(labResult.getCreatedBy());
		labResultImpl.setUpdatedBy(labResult.getUpdatedBy());

		return labResultImpl;
	}

	/**
	 * Returns the lab result with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lab result
	 * @return the lab result
	 * @throws NoSuchLabResultException if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLabResultException {
		LabResult labResult = fetchByPrimaryKey(primaryKey);

		if (labResult == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLabResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return labResult;
	}

	/**
	 * Returns the lab result with the primary key or throws a {@link NoSuchLabResultException} if it could not be found.
	 *
	 * @param id the primary key of the lab result
	 * @return the lab result
	 * @throws NoSuchLabResultException if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult findByPrimaryKey(long id) throws NoSuchLabResultException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the lab result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lab result
	 * @return the lab result, or <code>null</code> if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
				LabResultImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LabResult labResult = (LabResult)serializable;

		if (labResult == null) {
			Session session = null;

			try {
				session = openSession();

				labResult = (LabResult)session.get(LabResultImpl.class,
						primaryKey);

				if (labResult != null) {
					cacheResult(labResult);
				}
				else {
					entityCache.putResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
						LabResultImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
					LabResultImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return labResult;
	}

	/**
	 * Returns the lab result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the lab result
	 * @return the lab result, or <code>null</code> if a lab result with the primary key could not be found
	 */
	@Override
	public LabResult fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, LabResult> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LabResult> map = new HashMap<Serializable, LabResult>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LabResult labResult = fetchByPrimaryKey(primaryKey);

			if (labResult != null) {
				map.put(primaryKey, labResult);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
					LabResultImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LabResult)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LABRESULT_WHERE_PKS_IN);

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

			for (LabResult labResult : (List<LabResult>)q.list()) {
				map.put(labResult.getPrimaryKeyObj(), labResult);

				cacheResult(labResult);

				uncachedPrimaryKeys.remove(labResult.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LabResultModelImpl.ENTITY_CACHE_ENABLED,
					LabResultImpl.class, primaryKey, nullModel);
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
	 * Returns all the lab results.
	 *
	 * @return the lab results
	 */
	@Override
	public List<LabResult> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LabResult> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LabResult> findAll(int start, int end,
		OrderByComparator<LabResult> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LabResult> findAll(int start, int end,
		OrderByComparator<LabResult> orderByComparator,
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

		List<LabResult> list = null;

		if (retrieveFromCache) {
			list = (List<LabResult>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LABRESULT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LABRESULT;

				if (pagination) {
					sql = sql.concat(LabResultModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LabResult>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the lab results from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LabResult labResult : findAll()) {
			remove(labResult);
		}
	}

	/**
	 * Returns the number of lab results.
	 *
	 * @return the number of lab results
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LABRESULT);

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
		return LabResultModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lab result persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LabResultImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LABRESULT = "SELECT labResult FROM LabResult labResult";
	private static final String _SQL_SELECT_LABRESULT_WHERE_PKS_IN = "SELECT labResult FROM LabResult labResult WHERE id IN (";
	private static final String _SQL_SELECT_LABRESULT_WHERE = "SELECT labResult FROM LabResult labResult WHERE ";
	private static final String _SQL_COUNT_LABRESULT = "SELECT COUNT(labResult) FROM LabResult labResult";
	private static final String _SQL_COUNT_LABRESULT_WHERE = "SELECT COUNT(labResult) FROM LabResult labResult WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "labResult.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LabResult exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LabResult exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LabResultPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"patientId", "episodeId", "orderId", "labName", "reportName",
				"labResultTypeCodeId", "severityCodeId", "createDate",
				"updateDate", "createdBy", "updatedBy"
			});
}