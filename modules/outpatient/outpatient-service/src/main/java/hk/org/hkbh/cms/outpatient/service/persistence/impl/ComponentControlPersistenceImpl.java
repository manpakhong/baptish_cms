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

import hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlException;
import hk.org.hkbh.cms.outpatient.model.ComponentControl;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentControlImpl;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentControlModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlPersistence;

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
 * The persistence implementation for the component control service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlUtil
 * @generated
 */
@ProviderType
public class ComponentControlPersistenceImpl extends BasePersistenceImpl<ComponentControl>
	implements ComponentControlPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ComponentControlUtil} to access the component control persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ComponentControlImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ComponentControlModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the component controls where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserId(Long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component controls where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @return the range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserId(Long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component controls where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserId(Long userId, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component controls where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserId(Long userId, int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<ComponentControl> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentControl>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentControl componentControl : list) {
					if (!Objects.equals(userId, componentControl.getUserId())) {
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

			query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId.longValue());

				if (!pagination) {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first component control in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component control
	 * @throws NoSuchComponentControlException if a matching component control could not be found
	 */
	@Override
	public ComponentControl findByUserId_First(Long userId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByUserId_First(userId,
				orderByComparator);

		if (componentControl != null) {
			return componentControl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchComponentControlException(msg.toString());
	}

	/**
	 * Returns the first component control in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component control, or <code>null</code> if a matching component control could not be found
	 */
	@Override
	public ComponentControl fetchByUserId_First(Long userId,
		OrderByComparator<ComponentControl> orderByComparator) {
		List<ComponentControl> list = findByUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component control in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component control
	 * @throws NoSuchComponentControlException if a matching component control could not be found
	 */
	@Override
	public ComponentControl findByUserId_Last(Long userId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByUserId_Last(userId,
				orderByComparator);

		if (componentControl != null) {
			return componentControl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchComponentControlException(msg.toString());
	}

	/**
	 * Returns the last component control in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component control, or <code>null</code> if a matching component control could not be found
	 */
	@Override
	public ComponentControl fetchByUserId_Last(Long userId,
		OrderByComparator<ComponentControl> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ComponentControl> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the component controls before and after the current component control in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current component control
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next component control
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl[] findByUserId_PrevAndNext(long id, Long userId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ComponentControl[] array = new ComponentControlImpl[3];

			array[0] = getByUserId_PrevAndNext(session, componentControl,
					userId, orderByComparator, true);

			array[1] = componentControl;

			array[2] = getByUserId_PrevAndNext(session, componentControl,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComponentControl getByUserId_PrevAndNext(Session session,
		ComponentControl componentControl, Long userId,
		OrderByComparator<ComponentControl> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(ComponentControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(componentControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ComponentControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the component controls where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(Long userId) {
		for (ComponentControl componentControl : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(componentControl);
		}
	}

	/**
	 * Returns the number of component controls where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching component controls
	 */
	@Override
	public int countByUserId(Long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTCONTROL_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId.longValue());

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "componentControl.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERROLEID =
		new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserRoleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERROLEID =
		new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserRoleId",
			new String[] { Long.class.getName() },
			ComponentControlModelImpl.USERROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERROLEID = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserRoleId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the component controls where userRoleId = &#63;.
	 *
	 * @param userRoleId the user role ID
	 * @return the matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserRoleId(Long userRoleId) {
		return findByUserRoleId(userRoleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component controls where userRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userRoleId the user role ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @return the range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserRoleId(Long userRoleId, int start,
		int end) {
		return findByUserRoleId(userRoleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component controls where userRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userRoleId the user role ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserRoleId(Long userRoleId, int start,
		int end, OrderByComparator<ComponentControl> orderByComparator) {
		return findByUserRoleId(userRoleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component controls where userRoleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userRoleId the user role ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByUserRoleId(Long userRoleId, int start,
		int end, OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERROLEID;
			finderArgs = new Object[] { userRoleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERROLEID;
			finderArgs = new Object[] { userRoleId, start, end, orderByComparator };
		}

		List<ComponentControl> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentControl>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentControl componentControl : list) {
					if (!Objects.equals(userRoleId,
								componentControl.getUserRoleId())) {
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

			query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE);

			query.append(_FINDER_COLUMN_USERROLEID_USERROLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userRoleId.longValue());

				if (!pagination) {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first component control in the ordered set where userRoleId = &#63;.
	 *
	 * @param userRoleId the user role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component control
	 * @throws NoSuchComponentControlException if a matching component control could not be found
	 */
	@Override
	public ComponentControl findByUserRoleId_First(Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByUserRoleId_First(userRoleId,
				orderByComparator);

		if (componentControl != null) {
			return componentControl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userRoleId=");
		msg.append(userRoleId);

		msg.append("}");

		throw new NoSuchComponentControlException(msg.toString());
	}

	/**
	 * Returns the first component control in the ordered set where userRoleId = &#63;.
	 *
	 * @param userRoleId the user role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component control, or <code>null</code> if a matching component control could not be found
	 */
	@Override
	public ComponentControl fetchByUserRoleId_First(Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator) {
		List<ComponentControl> list = findByUserRoleId(userRoleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component control in the ordered set where userRoleId = &#63;.
	 *
	 * @param userRoleId the user role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component control
	 * @throws NoSuchComponentControlException if a matching component control could not be found
	 */
	@Override
	public ComponentControl findByUserRoleId_Last(Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByUserRoleId_Last(userRoleId,
				orderByComparator);

		if (componentControl != null) {
			return componentControl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userRoleId=");
		msg.append(userRoleId);

		msg.append("}");

		throw new NoSuchComponentControlException(msg.toString());
	}

	/**
	 * Returns the last component control in the ordered set where userRoleId = &#63;.
	 *
	 * @param userRoleId the user role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component control, or <code>null</code> if a matching component control could not be found
	 */
	@Override
	public ComponentControl fetchByUserRoleId_Last(Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator) {
		int count = countByUserRoleId(userRoleId);

		if (count == 0) {
			return null;
		}

		List<ComponentControl> list = findByUserRoleId(userRoleId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the component controls before and after the current component control in the ordered set where userRoleId = &#63;.
	 *
	 * @param id the primary key of the current component control
	 * @param userRoleId the user role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next component control
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl[] findByUserRoleId_PrevAndNext(long id,
		Long userRoleId, OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ComponentControl[] array = new ComponentControlImpl[3];

			array[0] = getByUserRoleId_PrevAndNext(session, componentControl,
					userRoleId, orderByComparator, true);

			array[1] = componentControl;

			array[2] = getByUserRoleId_PrevAndNext(session, componentControl,
					userRoleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComponentControl getByUserRoleId_PrevAndNext(Session session,
		ComponentControl componentControl, Long userRoleId,
		OrderByComparator<ComponentControl> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE);

		query.append(_FINDER_COLUMN_USERROLEID_USERROLEID_2);

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
			query.append(ComponentControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userRoleId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(componentControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ComponentControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the component controls where userRoleId = &#63; from the database.
	 *
	 * @param userRoleId the user role ID
	 */
	@Override
	public void removeByUserRoleId(Long userRoleId) {
		for (ComponentControl componentControl : findByUserRoleId(userRoleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(componentControl);
		}
	}

	/**
	 * Returns the number of component controls where userRoleId = &#63;.
	 *
	 * @param userRoleId the user role ID
	 * @return the number of matching component controls
	 */
	@Override
	public int countByUserRoleId(Long userRoleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERROLEID;

		Object[] finderArgs = new Object[] { userRoleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTCONTROL_WHERE);

			query.append(_FINDER_COLUMN_USERROLEID_USERROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userRoleId.longValue());

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

	private static final String _FINDER_COLUMN_USERROLEID_USERROLEID_2 = "componentControl.userRoleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPONENTID =
		new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByComponentId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTID =
		new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByComponentId",
			new String[] { Long.class.getName() },
			ComponentControlModelImpl.COMPONENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPONENTID = new FinderPath(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByComponentId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the component controls where componentId = &#63;.
	 *
	 * @param componentId the component ID
	 * @return the matching component controls
	 */
	@Override
	public List<ComponentControl> findByComponentId(Long componentId) {
		return findByComponentId(componentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component controls where componentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentId the component ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @return the range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByComponentId(Long componentId,
		int start, int end) {
		return findByComponentId(componentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component controls where componentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentId the component ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByComponentId(Long componentId,
		int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return findByComponentId(componentId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the component controls where componentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentId the component ID
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component controls
	 */
	@Override
	public List<ComponentControl> findByComponentId(Long componentId,
		int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTID;
			finderArgs = new Object[] { componentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPONENTID;
			finderArgs = new Object[] { componentId, start, end, orderByComparator };
		}

		List<ComponentControl> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentControl>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentControl componentControl : list) {
					if (!Objects.equals(componentId,
								componentControl.getComponentId())) {
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

			query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE);

			query.append(_FINDER_COLUMN_COMPONENTID_COMPONENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentControlModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(componentId.longValue());

				if (!pagination) {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first component control in the ordered set where componentId = &#63;.
	 *
	 * @param componentId the component ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component control
	 * @throws NoSuchComponentControlException if a matching component control could not be found
	 */
	@Override
	public ComponentControl findByComponentId_First(Long componentId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByComponentId_First(componentId,
				orderByComparator);

		if (componentControl != null) {
			return componentControl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("componentId=");
		msg.append(componentId);

		msg.append("}");

		throw new NoSuchComponentControlException(msg.toString());
	}

	/**
	 * Returns the first component control in the ordered set where componentId = &#63;.
	 *
	 * @param componentId the component ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component control, or <code>null</code> if a matching component control could not be found
	 */
	@Override
	public ComponentControl fetchByComponentId_First(Long componentId,
		OrderByComparator<ComponentControl> orderByComparator) {
		List<ComponentControl> list = findByComponentId(componentId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component control in the ordered set where componentId = &#63;.
	 *
	 * @param componentId the component ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component control
	 * @throws NoSuchComponentControlException if a matching component control could not be found
	 */
	@Override
	public ComponentControl findByComponentId_Last(Long componentId,
		OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByComponentId_Last(componentId,
				orderByComparator);

		if (componentControl != null) {
			return componentControl;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("componentId=");
		msg.append(componentId);

		msg.append("}");

		throw new NoSuchComponentControlException(msg.toString());
	}

	/**
	 * Returns the last component control in the ordered set where componentId = &#63;.
	 *
	 * @param componentId the component ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component control, or <code>null</code> if a matching component control could not be found
	 */
	@Override
	public ComponentControl fetchByComponentId_Last(Long componentId,
		OrderByComparator<ComponentControl> orderByComparator) {
		int count = countByComponentId(componentId);

		if (count == 0) {
			return null;
		}

		List<ComponentControl> list = findByComponentId(componentId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the component controls before and after the current component control in the ordered set where componentId = &#63;.
	 *
	 * @param id the primary key of the current component control
	 * @param componentId the component ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next component control
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl[] findByComponentId_PrevAndNext(long id,
		Long componentId, OrderByComparator<ComponentControl> orderByComparator)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ComponentControl[] array = new ComponentControlImpl[3];

			array[0] = getByComponentId_PrevAndNext(session, componentControl,
					componentId, orderByComparator, true);

			array[1] = componentControl;

			array[2] = getByComponentId_PrevAndNext(session, componentControl,
					componentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComponentControl getByComponentId_PrevAndNext(Session session,
		ComponentControl componentControl, Long componentId,
		OrderByComparator<ComponentControl> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE);

		query.append(_FINDER_COLUMN_COMPONENTID_COMPONENTID_2);

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
			query.append(ComponentControlModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(componentId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(componentControl);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ComponentControl> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the component controls where componentId = &#63; from the database.
	 *
	 * @param componentId the component ID
	 */
	@Override
	public void removeByComponentId(Long componentId) {
		for (ComponentControl componentControl : findByComponentId(
				componentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(componentControl);
		}
	}

	/**
	 * Returns the number of component controls where componentId = &#63;.
	 *
	 * @param componentId the component ID
	 * @return the number of matching component controls
	 */
	@Override
	public int countByComponentId(Long componentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPONENTID;

		Object[] finderArgs = new Object[] { componentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTCONTROL_WHERE);

			query.append(_FINDER_COLUMN_COMPONENTID_COMPONENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(componentId.longValue());

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

	private static final String _FINDER_COLUMN_COMPONENTID_COMPONENTID_2 = "componentControl.componentId = ?";

	public ComponentControlPersistenceImpl() {
		setModelClass(ComponentControl.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("userId", "user_id");
			dbColumnNames.put("userRoleId", "user_role_id");
			dbColumnNames.put("componentId", "component_id");
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
	 * Caches the component control in the entity cache if it is enabled.
	 *
	 * @param componentControl the component control
	 */
	@Override
	public void cacheResult(ComponentControl componentControl) {
		entityCache.putResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlImpl.class, componentControl.getPrimaryKey(),
			componentControl);

		componentControl.resetOriginalValues();
	}

	/**
	 * Caches the component controls in the entity cache if it is enabled.
	 *
	 * @param componentControls the component controls
	 */
	@Override
	public void cacheResult(List<ComponentControl> componentControls) {
		for (ComponentControl componentControl : componentControls) {
			if (entityCache.getResult(
						ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
						ComponentControlImpl.class,
						componentControl.getPrimaryKey()) == null) {
				cacheResult(componentControl);
			}
			else {
				componentControl.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all component controls.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ComponentControlImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the component control.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ComponentControl componentControl) {
		entityCache.removeResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlImpl.class, componentControl.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ComponentControl> componentControls) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ComponentControl componentControl : componentControls) {
			entityCache.removeResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
				ComponentControlImpl.class, componentControl.getPrimaryKey());
		}
	}

	/**
	 * Creates a new component control with the primary key. Does not add the component control to the database.
	 *
	 * @param id the primary key for the new component control
	 * @return the new component control
	 */
	@Override
	public ComponentControl create(long id) {
		ComponentControl componentControl = new ComponentControlImpl();

		componentControl.setNew(true);
		componentControl.setPrimaryKey(id);

		return componentControl;
	}

	/**
	 * Removes the component control with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the component control
	 * @return the component control that was removed
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl remove(long id)
		throws NoSuchComponentControlException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the component control with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the component control
	 * @return the component control that was removed
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl remove(Serializable primaryKey)
		throws NoSuchComponentControlException {
		Session session = null;

		try {
			session = openSession();

			ComponentControl componentControl = (ComponentControl)session.get(ComponentControlImpl.class,
					primaryKey);

			if (componentControl == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchComponentControlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(componentControl);
		}
		catch (NoSuchComponentControlException nsee) {
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
	protected ComponentControl removeImpl(ComponentControl componentControl) {
		componentControl = toUnwrappedModel(componentControl);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(componentControl)) {
				componentControl = (ComponentControl)session.get(ComponentControlImpl.class,
						componentControl.getPrimaryKeyObj());
			}

			if (componentControl != null) {
				session.delete(componentControl);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (componentControl != null) {
			clearCache(componentControl);
		}

		return componentControl;
	}

	@Override
	public ComponentControl updateImpl(ComponentControl componentControl) {
		componentControl = toUnwrappedModel(componentControl);

		boolean isNew = componentControl.isNew();

		ComponentControlModelImpl componentControlModelImpl = (ComponentControlModelImpl)componentControl;

		Session session = null;

		try {
			session = openSession();

			if (componentControl.isNew()) {
				session.save(componentControl);

				componentControl.setNew(false);
			}
			else {
				componentControl = (ComponentControl)session.merge(componentControl);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ComponentControlModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { componentControlModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] { componentControlModelImpl.getUserRoleId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERROLEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERROLEID,
				args);

			args = new Object[] { componentControlModelImpl.getComponentId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((componentControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentControlModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { componentControlModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((componentControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERROLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentControlModelImpl.getOriginalUserRoleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERROLEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERROLEID,
					args);

				args = new Object[] { componentControlModelImpl.getUserRoleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERROLEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERROLEID,
					args);
			}

			if ((componentControlModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentControlModelImpl.getOriginalComponentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTID,
					args);

				args = new Object[] { componentControlModelImpl.getComponentId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTID,
					args);
			}
		}

		entityCache.putResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlImpl.class, componentControl.getPrimaryKey(),
			componentControl, false);

		componentControl.resetOriginalValues();

		return componentControl;
	}

	protected ComponentControl toUnwrappedModel(
		ComponentControl componentControl) {
		if (componentControl instanceof ComponentControlImpl) {
			return componentControl;
		}

		ComponentControlImpl componentControlImpl = new ComponentControlImpl();

		componentControlImpl.setNew(componentControl.isNew());
		componentControlImpl.setPrimaryKey(componentControl.getPrimaryKey());

		componentControlImpl.setId(componentControl.getId());
		componentControlImpl.setUserId(componentControl.getUserId());
		componentControlImpl.setUserRoleId(componentControl.getUserRoleId());
		componentControlImpl.setComponentId(componentControl.getComponentId());
		componentControlImpl.setCreate(componentControl.getCreate());
		componentControlImpl.setRead(componentControl.getRead());
		componentControlImpl.setUpdate(componentControl.getUpdate());
		componentControlImpl.setDelete(componentControl.getDelete());
		componentControlImpl.setDeny(componentControl.getDeny());
		componentControlImpl.setVisible(componentControl.getVisible());
		componentControlImpl.setEnable(componentControl.getEnable());
		componentControlImpl.setControl_desc(componentControl.getControl_desc());
		componentControlImpl.setCreateDate(componentControl.getCreateDate());
		componentControlImpl.setUpdateDate(componentControl.getUpdateDate());
		componentControlImpl.setCreatedBy(componentControl.getCreatedBy());
		componentControlImpl.setUpdatedBy(componentControl.getUpdatedBy());

		return componentControlImpl;
	}

	/**
	 * Returns the component control with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the component control
	 * @return the component control
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl findByPrimaryKey(Serializable primaryKey)
		throws NoSuchComponentControlException {
		ComponentControl componentControl = fetchByPrimaryKey(primaryKey);

		if (componentControl == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchComponentControlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return componentControl;
	}

	/**
	 * Returns the component control with the primary key or throws a {@link NoSuchComponentControlException} if it could not be found.
	 *
	 * @param id the primary key of the component control
	 * @return the component control
	 * @throws NoSuchComponentControlException if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl findByPrimaryKey(long id)
		throws NoSuchComponentControlException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the component control with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the component control
	 * @return the component control, or <code>null</code> if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
				ComponentControlImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ComponentControl componentControl = (ComponentControl)serializable;

		if (componentControl == null) {
			Session session = null;

			try {
				session = openSession();

				componentControl = (ComponentControl)session.get(ComponentControlImpl.class,
						primaryKey);

				if (componentControl != null) {
					cacheResult(componentControl);
				}
				else {
					entityCache.putResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
						ComponentControlImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
					ComponentControlImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return componentControl;
	}

	/**
	 * Returns the component control with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the component control
	 * @return the component control, or <code>null</code> if a component control with the primary key could not be found
	 */
	@Override
	public ComponentControl fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ComponentControl> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ComponentControl> map = new HashMap<Serializable, ComponentControl>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ComponentControl componentControl = fetchByPrimaryKey(primaryKey);

			if (componentControl != null) {
				map.put(primaryKey, componentControl);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
					ComponentControlImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ComponentControl)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COMPONENTCONTROL_WHERE_PKS_IN);

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

			for (ComponentControl componentControl : (List<ComponentControl>)q.list()) {
				map.put(componentControl.getPrimaryKeyObj(), componentControl);

				cacheResult(componentControl);

				uncachedPrimaryKeys.remove(componentControl.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ComponentControlModelImpl.ENTITY_CACHE_ENABLED,
					ComponentControlImpl.class, primaryKey, nullModel);
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
	 * Returns all the component controls.
	 *
	 * @return the component controls
	 */
	@Override
	public List<ComponentControl> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component controls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @return the range of component controls
	 */
	@Override
	public List<ComponentControl> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the component controls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of component controls
	 */
	@Override
	public List<ComponentControl> findAll(int start, int end,
		OrderByComparator<ComponentControl> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component controls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component controls
	 * @param end the upper bound of the range of component controls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of component controls
	 */
	@Override
	public List<ComponentControl> findAll(int start, int end,
		OrderByComparator<ComponentControl> orderByComparator,
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

		List<ComponentControl> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentControl>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COMPONENTCONTROL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPONENTCONTROL;

				if (pagination) {
					sql = sql.concat(ComponentControlModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentControl>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the component controls from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ComponentControl componentControl : findAll()) {
			remove(componentControl);
		}
	}

	/**
	 * Returns the number of component controls.
	 *
	 * @return the number of component controls
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMPONENTCONTROL);

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
		return ComponentControlModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the component control persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ComponentControlImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COMPONENTCONTROL = "SELECT componentControl FROM ComponentControl componentControl";
	private static final String _SQL_SELECT_COMPONENTCONTROL_WHERE_PKS_IN = "SELECT componentControl FROM ComponentControl componentControl WHERE id IN (";
	private static final String _SQL_SELECT_COMPONENTCONTROL_WHERE = "SELECT componentControl FROM ComponentControl componentControl WHERE ";
	private static final String _SQL_COUNT_COMPONENTCONTROL = "SELECT COUNT(componentControl) FROM ComponentControl componentControl";
	private static final String _SQL_COUNT_COMPONENTCONTROL_WHERE = "SELECT COUNT(componentControl) FROM ComponentControl componentControl WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "componentControl.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ComponentControl exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ComponentControl exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ComponentControlPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"userId", "userRoleId", "componentId", "createDate",
				"updateDate", "createdBy", "updatedBy"
			});
}