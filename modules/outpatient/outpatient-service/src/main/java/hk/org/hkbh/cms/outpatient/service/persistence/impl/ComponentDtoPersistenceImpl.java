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

import hk.org.hkbh.cms.outpatient.exception.NoSuchComponentDtoException;
import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoImpl;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentDtoPersistence;

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
 * The persistence implementation for the component dto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ComponentDtoPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.ComponentDtoUtil
 * @generated
 */
@ProviderType
public class ComponentDtoPersistenceImpl extends BasePersistenceImpl<ComponentDto>
	implements ComponentDtoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ComponentDtoUtil} to access the component dto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ComponentDtoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findById",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findById",
			new String[] { Long.class.getName() },
			ComponentDtoModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countById",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the component dtos where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching component dtos
	 */
	@Override
	public List<ComponentDto> findById(long id) {
		return findById(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component dtos where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @return the range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findById(long id, int start, int end) {
		return findById(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component dtos where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findById(long id, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return findById(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component dtos where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findById(long id, int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
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

		List<ComponentDto> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentDto>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentDto componentDto : list) {
					if ((id != componentDto.getId())) {
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

			query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first component dto in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findById_First(long id,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchById_First(id, orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the first component dto in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchById_First(long id,
		OrderByComparator<ComponentDto> orderByComparator) {
		List<ComponentDto> list = findById(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component dto in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findById_Last(long id,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchById_Last(id, orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the last component dto in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchById_Last(long id,
		OrderByComparator<ComponentDto> orderByComparator) {
		int count = countById(id);

		if (count == 0) {
			return null;
		}

		List<ComponentDto> list = findById(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the component dtos where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeById(long id) {
		for (ComponentDto componentDto : findById(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(componentDto);
		}
	}

	/**
	 * Returns the number of component dtos where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching component dtos
	 */
	@Override
	public int countById(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTDTO_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "componentDto.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPONENTCODE =
		new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByComponentCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTCODE =
		new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByComponentCode",
			new String[] { String.class.getName() },
			ComponentDtoModelImpl.COMPONENTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPONENTCODE = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByComponentCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the component dtos where componentCode = &#63;.
	 *
	 * @param componentCode the component code
	 * @return the matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentCode(String componentCode) {
		return findByComponentCode(componentCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component dtos where componentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentCode the component code
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @return the range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentCode(String componentCode,
		int start, int end) {
		return findByComponentCode(componentCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component dtos where componentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentCode the component code
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentCode(String componentCode,
		int start, int end, OrderByComparator<ComponentDto> orderByComparator) {
		return findByComponentCode(componentCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component dtos where componentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentCode the component code
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentCode(String componentCode,
		int start, int end, OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTCODE;
			finderArgs = new Object[] { componentCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPONENTCODE;
			finderArgs = new Object[] {
					componentCode,
					
					start, end, orderByComparator
				};
		}

		List<ComponentDto> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentDto>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentDto componentDto : list) {
					if (!Objects.equals(componentCode,
								componentDto.getComponentCode())) {
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

			query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

			boolean bindComponentCode = false;

			if (componentCode == null) {
				query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_1);
			}
			else if (componentCode.equals("")) {
				query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_3);
			}
			else {
				bindComponentCode = true;

				query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindComponentCode) {
					qPos.add(componentCode);
				}

				if (!pagination) {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first component dto in the ordered set where componentCode = &#63;.
	 *
	 * @param componentCode the component code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findByComponentCode_First(String componentCode,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByComponentCode_First(componentCode,
				orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("componentCode=");
		msg.append(componentCode);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the first component dto in the ordered set where componentCode = &#63;.
	 *
	 * @param componentCode the component code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchByComponentCode_First(String componentCode,
		OrderByComparator<ComponentDto> orderByComparator) {
		List<ComponentDto> list = findByComponentCode(componentCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component dto in the ordered set where componentCode = &#63;.
	 *
	 * @param componentCode the component code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findByComponentCode_Last(String componentCode,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByComponentCode_Last(componentCode,
				orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("componentCode=");
		msg.append(componentCode);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the last component dto in the ordered set where componentCode = &#63;.
	 *
	 * @param componentCode the component code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchByComponentCode_Last(String componentCode,
		OrderByComparator<ComponentDto> orderByComparator) {
		int count = countByComponentCode(componentCode);

		if (count == 0) {
			return null;
		}

		List<ComponentDto> list = findByComponentCode(componentCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the component dtos before and after the current component dto in the ordered set where componentCode = &#63;.
	 *
	 * @param id the primary key of the current component dto
	 * @param componentCode the component code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next component dto
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto[] findByComponentCode_PrevAndNext(long id,
		String componentCode, OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ComponentDto[] array = new ComponentDtoImpl[3];

			array[0] = getByComponentCode_PrevAndNext(session, componentDto,
					componentCode, orderByComparator, true);

			array[1] = componentDto;

			array[2] = getByComponentCode_PrevAndNext(session, componentDto,
					componentCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComponentDto getByComponentCode_PrevAndNext(Session session,
		ComponentDto componentDto, String componentCode,
		OrderByComparator<ComponentDto> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

		boolean bindComponentCode = false;

		if (componentCode == null) {
			query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_1);
		}
		else if (componentCode.equals("")) {
			query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_3);
		}
		else {
			bindComponentCode = true;

			query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_2);
		}

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
			query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindComponentCode) {
			qPos.add(componentCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(componentDto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ComponentDto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the component dtos where componentCode = &#63; from the database.
	 *
	 * @param componentCode the component code
	 */
	@Override
	public void removeByComponentCode(String componentCode) {
		for (ComponentDto componentDto : findByComponentCode(componentCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(componentDto);
		}
	}

	/**
	 * Returns the number of component dtos where componentCode = &#63;.
	 *
	 * @param componentCode the component code
	 * @return the number of matching component dtos
	 */
	@Override
	public int countByComponentCode(String componentCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPONENTCODE;

		Object[] finderArgs = new Object[] { componentCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTDTO_WHERE);

			boolean bindComponentCode = false;

			if (componentCode == null) {
				query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_1);
			}
			else if (componentCode.equals("")) {
				query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_3);
			}
			else {
				bindComponentCode = true;

				query.append(_FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindComponentCode) {
					qPos.add(componentCode);
				}

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

	private static final String _FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_1 = "componentDto.componentCode IS NULL";
	private static final String _FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_2 = "componentDto.componentCode = ?";
	private static final String _FINDER_COLUMN_COMPONENTCODE_COMPONENTCODE_3 = "(componentDto.componentCode IS NULL OR componentDto.componentCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPONENTLEVEL =
		new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByComponentLevel",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTLEVEL =
		new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByComponentLevel",
			new String[] { Integer.class.getName() },
			ComponentDtoModelImpl.COMPONENTLEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPONENTLEVEL = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByComponentLevel",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the component dtos where componentLevel = &#63;.
	 *
	 * @param componentLevel the component level
	 * @return the matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentLevel(Integer componentLevel) {
		return findByComponentLevel(componentLevel, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component dtos where componentLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentLevel the component level
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @return the range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentLevel(Integer componentLevel,
		int start, int end) {
		return findByComponentLevel(componentLevel, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component dtos where componentLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentLevel the component level
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentLevel(Integer componentLevel,
		int start, int end, OrderByComparator<ComponentDto> orderByComparator) {
		return findByComponentLevel(componentLevel, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component dtos where componentLevel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param componentLevel the component level
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByComponentLevel(Integer componentLevel,
		int start, int end, OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTLEVEL;
			finderArgs = new Object[] { componentLevel };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPONENTLEVEL;
			finderArgs = new Object[] {
					componentLevel,
					
					start, end, orderByComparator
				};
		}

		List<ComponentDto> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentDto>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentDto componentDto : list) {
					if (!Objects.equals(componentLevel,
								componentDto.getComponentLevel())) {
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

			query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

			query.append(_FINDER_COLUMN_COMPONENTLEVEL_COMPONENTLEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(componentLevel.intValue());

				if (!pagination) {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first component dto in the ordered set where componentLevel = &#63;.
	 *
	 * @param componentLevel the component level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findByComponentLevel_First(Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByComponentLevel_First(componentLevel,
				orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("componentLevel=");
		msg.append(componentLevel);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the first component dto in the ordered set where componentLevel = &#63;.
	 *
	 * @param componentLevel the component level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchByComponentLevel_First(Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator) {
		List<ComponentDto> list = findByComponentLevel(componentLevel, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component dto in the ordered set where componentLevel = &#63;.
	 *
	 * @param componentLevel the component level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findByComponentLevel_Last(Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByComponentLevel_Last(componentLevel,
				orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("componentLevel=");
		msg.append(componentLevel);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the last component dto in the ordered set where componentLevel = &#63;.
	 *
	 * @param componentLevel the component level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchByComponentLevel_Last(Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator) {
		int count = countByComponentLevel(componentLevel);

		if (count == 0) {
			return null;
		}

		List<ComponentDto> list = findByComponentLevel(componentLevel,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the component dtos before and after the current component dto in the ordered set where componentLevel = &#63;.
	 *
	 * @param id the primary key of the current component dto
	 * @param componentLevel the component level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next component dto
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto[] findByComponentLevel_PrevAndNext(long id,
		Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ComponentDto[] array = new ComponentDtoImpl[3];

			array[0] = getByComponentLevel_PrevAndNext(session, componentDto,
					componentLevel, orderByComparator, true);

			array[1] = componentDto;

			array[2] = getByComponentLevel_PrevAndNext(session, componentDto,
					componentLevel, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComponentDto getByComponentLevel_PrevAndNext(Session session,
		ComponentDto componentDto, Integer componentLevel,
		OrderByComparator<ComponentDto> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

		query.append(_FINDER_COLUMN_COMPONENTLEVEL_COMPONENTLEVEL_2);

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
			query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(componentLevel.intValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(componentDto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ComponentDto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the component dtos where componentLevel = &#63; from the database.
	 *
	 * @param componentLevel the component level
	 */
	@Override
	public void removeByComponentLevel(Integer componentLevel) {
		for (ComponentDto componentDto : findByComponentLevel(componentLevel,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(componentDto);
		}
	}

	/**
	 * Returns the number of component dtos where componentLevel = &#63;.
	 *
	 * @param componentLevel the component level
	 * @return the number of matching component dtos
	 */
	@Override
	public int countByComponentLevel(Integer componentLevel) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPONENTLEVEL;

		Object[] finderArgs = new Object[] { componentLevel };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTDTO_WHERE);

			query.append(_FINDER_COLUMN_COMPONENTLEVEL_COMPONENTLEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(componentLevel.intValue());

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

	private static final String _FINDER_COLUMN_COMPONENTLEVEL_COMPONENTLEVEL_2 = "componentDto.componentLevel = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISMENUITEM =
		new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIsMenuItem",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISMENUITEM =
		new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, ComponentDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIsMenuItem",
			new String[] { Boolean.class.getName() },
			ComponentDtoModelImpl.ISMENUITEM_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISMENUITEM = new FinderPath(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIsMenuItem",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the component dtos where isMenuItem = &#63;.
	 *
	 * @param isMenuItem the is menu item
	 * @return the matching component dtos
	 */
	@Override
	public List<ComponentDto> findByIsMenuItem(Boolean isMenuItem) {
		return findByIsMenuItem(isMenuItem, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component dtos where isMenuItem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isMenuItem the is menu item
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @return the range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByIsMenuItem(Boolean isMenuItem, int start,
		int end) {
		return findByIsMenuItem(isMenuItem, start, end, null);
	}

	/**
	 * Returns an ordered range of all the component dtos where isMenuItem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isMenuItem the is menu item
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByIsMenuItem(Boolean isMenuItem, int start,
		int end, OrderByComparator<ComponentDto> orderByComparator) {
		return findByIsMenuItem(isMenuItem, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component dtos where isMenuItem = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isMenuItem the is menu item
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching component dtos
	 */
	@Override
	public List<ComponentDto> findByIsMenuItem(Boolean isMenuItem, int start,
		int end, OrderByComparator<ComponentDto> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISMENUITEM;
			finderArgs = new Object[] { isMenuItem };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISMENUITEM;
			finderArgs = new Object[] { isMenuItem, start, end, orderByComparator };
		}

		List<ComponentDto> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentDto>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComponentDto componentDto : list) {
					if (!Objects.equals(isMenuItem, componentDto.getIsMenuItem())) {
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

			query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

			query.append(_FINDER_COLUMN_ISMENUITEM_ISMENUITEM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isMenuItem.booleanValue());

				if (!pagination) {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first component dto in the ordered set where isMenuItem = &#63;.
	 *
	 * @param isMenuItem the is menu item
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findByIsMenuItem_First(Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByIsMenuItem_First(isMenuItem,
				orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isMenuItem=");
		msg.append(isMenuItem);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the first component dto in the ordered set where isMenuItem = &#63;.
	 *
	 * @param isMenuItem the is menu item
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchByIsMenuItem_First(Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator) {
		List<ComponentDto> list = findByIsMenuItem(isMenuItem, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last component dto in the ordered set where isMenuItem = &#63;.
	 *
	 * @param isMenuItem the is menu item
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto
	 * @throws NoSuchComponentDtoException if a matching component dto could not be found
	 */
	@Override
	public ComponentDto findByIsMenuItem_Last(Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByIsMenuItem_Last(isMenuItem,
				orderByComparator);

		if (componentDto != null) {
			return componentDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isMenuItem=");
		msg.append(isMenuItem);

		msg.append("}");

		throw new NoSuchComponentDtoException(msg.toString());
	}

	/**
	 * Returns the last component dto in the ordered set where isMenuItem = &#63;.
	 *
	 * @param isMenuItem the is menu item
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching component dto, or <code>null</code> if a matching component dto could not be found
	 */
	@Override
	public ComponentDto fetchByIsMenuItem_Last(Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator) {
		int count = countByIsMenuItem(isMenuItem);

		if (count == 0) {
			return null;
		}

		List<ComponentDto> list = findByIsMenuItem(isMenuItem, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the component dtos before and after the current component dto in the ordered set where isMenuItem = &#63;.
	 *
	 * @param id the primary key of the current component dto
	 * @param isMenuItem the is menu item
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next component dto
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto[] findByIsMenuItem_PrevAndNext(long id,
		Boolean isMenuItem, OrderByComparator<ComponentDto> orderByComparator)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ComponentDto[] array = new ComponentDtoImpl[3];

			array[0] = getByIsMenuItem_PrevAndNext(session, componentDto,
					isMenuItem, orderByComparator, true);

			array[1] = componentDto;

			array[2] = getByIsMenuItem_PrevAndNext(session, componentDto,
					isMenuItem, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComponentDto getByIsMenuItem_PrevAndNext(Session session,
		ComponentDto componentDto, Boolean isMenuItem,
		OrderByComparator<ComponentDto> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMPONENTDTO_WHERE);

		query.append(_FINDER_COLUMN_ISMENUITEM_ISMENUITEM_2);

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
			query.append(ComponentDtoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isMenuItem.booleanValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(componentDto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ComponentDto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the component dtos where isMenuItem = &#63; from the database.
	 *
	 * @param isMenuItem the is menu item
	 */
	@Override
	public void removeByIsMenuItem(Boolean isMenuItem) {
		for (ComponentDto componentDto : findByIsMenuItem(isMenuItem,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(componentDto);
		}
	}

	/**
	 * Returns the number of component dtos where isMenuItem = &#63;.
	 *
	 * @param isMenuItem the is menu item
	 * @return the number of matching component dtos
	 */
	@Override
	public int countByIsMenuItem(Boolean isMenuItem) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISMENUITEM;

		Object[] finderArgs = new Object[] { isMenuItem };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPONENTDTO_WHERE);

			query.append(_FINDER_COLUMN_ISMENUITEM_ISMENUITEM_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isMenuItem.booleanValue());

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

	private static final String _FINDER_COLUMN_ISMENUITEM_ISMENUITEM_2 = "componentDto.isMenuItem = ?";

	public ComponentDtoPersistenceImpl() {
		setModelClass(ComponentDto.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("componentCode", "component_code");
			dbColumnNames.put("componentName", "component_name");
			dbColumnNames.put("componentTypeCodeId", "component_type_code_id");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("codeDetailSeq", "code_detail_seq");
			dbColumnNames.put("codeDetailDisplayTextEn",
				"code_detail_display_text_en");
			dbColumnNames.put("codeDetailDisplayTextChi",
				"code_detail_display_text_chi");
			dbColumnNames.put("componentSeq", "component_seq");
			dbColumnNames.put("isMenuItem", "is_menu_item");
			dbColumnNames.put("componentDesc", "component_desc");
			dbColumnNames.put("componentLevel", "component_level");
			dbColumnNames.put("upComponentId", "up_component_id");
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
	 * Caches the component dto in the entity cache if it is enabled.
	 *
	 * @param componentDto the component dto
	 */
	@Override
	public void cacheResult(ComponentDto componentDto) {
		entityCache.putResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoImpl.class, componentDto.getPrimaryKey(), componentDto);

		componentDto.resetOriginalValues();
	}

	/**
	 * Caches the component dtos in the entity cache if it is enabled.
	 *
	 * @param componentDtos the component dtos
	 */
	@Override
	public void cacheResult(List<ComponentDto> componentDtos) {
		for (ComponentDto componentDto : componentDtos) {
			if (entityCache.getResult(
						ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
						ComponentDtoImpl.class, componentDto.getPrimaryKey()) == null) {
				cacheResult(componentDto);
			}
			else {
				componentDto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all component dtos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ComponentDtoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the component dto.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ComponentDto componentDto) {
		entityCache.removeResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoImpl.class, componentDto.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ComponentDto> componentDtos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ComponentDto componentDto : componentDtos) {
			entityCache.removeResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
				ComponentDtoImpl.class, componentDto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new component dto with the primary key. Does not add the component dto to the database.
	 *
	 * @param id the primary key for the new component dto
	 * @return the new component dto
	 */
	@Override
	public ComponentDto create(long id) {
		ComponentDto componentDto = new ComponentDtoImpl();

		componentDto.setNew(true);
		componentDto.setPrimaryKey(id);

		return componentDto;
	}

	/**
	 * Removes the component dto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the component dto
	 * @return the component dto that was removed
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto remove(long id) throws NoSuchComponentDtoException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the component dto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the component dto
	 * @return the component dto that was removed
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto remove(Serializable primaryKey)
		throws NoSuchComponentDtoException {
		Session session = null;

		try {
			session = openSession();

			ComponentDto componentDto = (ComponentDto)session.get(ComponentDtoImpl.class,
					primaryKey);

			if (componentDto == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchComponentDtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(componentDto);
		}
		catch (NoSuchComponentDtoException nsee) {
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
	protected ComponentDto removeImpl(ComponentDto componentDto) {
		componentDto = toUnwrappedModel(componentDto);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(componentDto)) {
				componentDto = (ComponentDto)session.get(ComponentDtoImpl.class,
						componentDto.getPrimaryKeyObj());
			}

			if (componentDto != null) {
				session.delete(componentDto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (componentDto != null) {
			clearCache(componentDto);
		}

		return componentDto;
	}

	@Override
	public ComponentDto updateImpl(ComponentDto componentDto) {
		componentDto = toUnwrappedModel(componentDto);

		boolean isNew = componentDto.isNew();

		ComponentDtoModelImpl componentDtoModelImpl = (ComponentDtoModelImpl)componentDto;

		Session session = null;

		try {
			session = openSession();

			if (componentDto.isNew()) {
				session.save(componentDto);

				componentDto.setNew(false);
			}
			else {
				componentDto = (ComponentDto)session.merge(componentDto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ComponentDtoModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { componentDtoModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			args = new Object[] { componentDtoModelImpl.getComponentCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTCODE,
				args);

			args = new Object[] { componentDtoModelImpl.getComponentLevel() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTLEVEL, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTLEVEL,
				args);

			args = new Object[] { componentDtoModelImpl.getIsMenuItem() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ISMENUITEM, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISMENUITEM,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((componentDtoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentDtoModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { componentDtoModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}

			if ((componentDtoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentDtoModelImpl.getOriginalComponentCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTCODE,
					args);

				args = new Object[] { componentDtoModelImpl.getComponentCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTCODE,
					args);
			}

			if ((componentDtoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTLEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentDtoModelImpl.getOriginalComponentLevel()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTLEVEL,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTLEVEL,
					args);

				args = new Object[] { componentDtoModelImpl.getComponentLevel() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPONENTLEVEL,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPONENTLEVEL,
					args);
			}

			if ((componentDtoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISMENUITEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						componentDtoModelImpl.getOriginalIsMenuItem()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISMENUITEM, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISMENUITEM,
					args);

				args = new Object[] { componentDtoModelImpl.getIsMenuItem() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISMENUITEM, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISMENUITEM,
					args);
			}
		}

		entityCache.putResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentDtoImpl.class, componentDto.getPrimaryKey(), componentDto,
			false);

		componentDto.resetOriginalValues();

		return componentDto;
	}

	protected ComponentDto toUnwrappedModel(ComponentDto componentDto) {
		if (componentDto instanceof ComponentDtoImpl) {
			return componentDto;
		}

		ComponentDtoImpl componentDtoImpl = new ComponentDtoImpl();

		componentDtoImpl.setNew(componentDto.isNew());
		componentDtoImpl.setPrimaryKey(componentDto.getPrimaryKey());

		componentDtoImpl.setId(componentDto.getId());
		componentDtoImpl.setComponentCode(componentDto.getComponentCode());
		componentDtoImpl.setComponentName(componentDto.getComponentName());
		componentDtoImpl.setComponentTypeCodeId(componentDto.getComponentTypeCodeId());
		componentDtoImpl.setDetailCode(componentDto.getDetailCode());
		componentDtoImpl.setCodeDetailSeq(componentDto.getCodeDetailSeq());
		componentDtoImpl.setCodeDetailDisplayTextEn(componentDto.getCodeDetailDisplayTextEn());
		componentDtoImpl.setCodeDetailDisplayTextChi(componentDto.getCodeDetailDisplayTextChi());
		componentDtoImpl.setComponentSeq(componentDto.getComponentSeq());
		componentDtoImpl.setIsMenuItem(componentDto.getIsMenuItem());
		componentDtoImpl.setComponentDesc(componentDto.getComponentDesc());
		componentDtoImpl.setUrl(componentDto.getUrl());
		componentDtoImpl.setComponentLevel(componentDto.getComponentLevel());
		componentDtoImpl.setUpComponentId(componentDto.getUpComponentId());
		componentDtoImpl.setCreateDate(componentDto.getCreateDate());
		componentDtoImpl.setUpdateDate(componentDto.getUpdateDate());
		componentDtoImpl.setCreatedBy(componentDto.getCreatedBy());
		componentDtoImpl.setUpdatedBy(componentDto.getUpdatedBy());

		return componentDtoImpl;
	}

	/**
	 * Returns the component dto with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the component dto
	 * @return the component dto
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchComponentDtoException {
		ComponentDto componentDto = fetchByPrimaryKey(primaryKey);

		if (componentDto == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchComponentDtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return componentDto;
	}

	/**
	 * Returns the component dto with the primary key or throws a {@link NoSuchComponentDtoException} if it could not be found.
	 *
	 * @param id the primary key of the component dto
	 * @return the component dto
	 * @throws NoSuchComponentDtoException if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto findByPrimaryKey(long id)
		throws NoSuchComponentDtoException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the component dto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the component dto
	 * @return the component dto, or <code>null</code> if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
				ComponentDtoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ComponentDto componentDto = (ComponentDto)serializable;

		if (componentDto == null) {
			Session session = null;

			try {
				session = openSession();

				componentDto = (ComponentDto)session.get(ComponentDtoImpl.class,
						primaryKey);

				if (componentDto != null) {
					cacheResult(componentDto);
				}
				else {
					entityCache.putResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
						ComponentDtoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
					ComponentDtoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return componentDto;
	}

	/**
	 * Returns the component dto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the component dto
	 * @return the component dto, or <code>null</code> if a component dto with the primary key could not be found
	 */
	@Override
	public ComponentDto fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ComponentDto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ComponentDto> map = new HashMap<Serializable, ComponentDto>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ComponentDto componentDto = fetchByPrimaryKey(primaryKey);

			if (componentDto != null) {
				map.put(primaryKey, componentDto);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
					ComponentDtoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ComponentDto)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COMPONENTDTO_WHERE_PKS_IN);

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

			for (ComponentDto componentDto : (List<ComponentDto>)q.list()) {
				map.put(componentDto.getPrimaryKeyObj(), componentDto);

				cacheResult(componentDto);

				uncachedPrimaryKeys.remove(componentDto.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ComponentDtoModelImpl.ENTITY_CACHE_ENABLED,
					ComponentDtoImpl.class, primaryKey, nullModel);
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
	 * Returns all the component dtos.
	 *
	 * @return the component dtos
	 */
	@Override
	public List<ComponentDto> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @return the range of component dtos
	 */
	@Override
	public List<ComponentDto> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the component dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of component dtos
	 */
	@Override
	public List<ComponentDto> findAll(int start, int end,
		OrderByComparator<ComponentDto> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component dtos
	 * @param end the upper bound of the range of component dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of component dtos
	 */
	@Override
	public List<ComponentDto> findAll(int start, int end,
		OrderByComparator<ComponentDto> orderByComparator,
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

		List<ComponentDto> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentDto>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COMPONENTDTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPONENTDTO;

				if (pagination) {
					sql = sql.concat(ComponentDtoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentDto>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the component dtos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ComponentDto componentDto : findAll()) {
			remove(componentDto);
		}
	}

	/**
	 * Returns the number of component dtos.
	 *
	 * @return the number of component dtos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMPONENTDTO);

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
		return ComponentDtoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the component dto persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ComponentDtoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COMPONENTDTO = "SELECT componentDto FROM ComponentDto componentDto";
	private static final String _SQL_SELECT_COMPONENTDTO_WHERE_PKS_IN = "SELECT componentDto FROM ComponentDto componentDto WHERE id IN (";
	private static final String _SQL_SELECT_COMPONENTDTO_WHERE = "SELECT componentDto FROM ComponentDto componentDto WHERE ";
	private static final String _SQL_COUNT_COMPONENTDTO = "SELECT COUNT(componentDto) FROM ComponentDto componentDto";
	private static final String _SQL_COUNT_COMPONENTDTO_WHERE = "SELECT COUNT(componentDto) FROM ComponentDto componentDto WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "componentDto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ComponentDto exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ComponentDto exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ComponentDtoPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"componentCode", "componentName", "componentTypeCodeId",
				"detailCode", "codeDetailSeq", "codeDetailDisplayTextEn",
				"codeDetailDisplayTextChi", "componentSeq", "isMenuItem",
				"componentDesc", "componentLevel", "upComponentId", "createDate",
				"updateDate", "createdBy", "updatedBy"
			});
}