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

import hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDtoException;
import hk.org.hkbh.cms.outpatient.model.CodeDto;
import hk.org.hkbh.cms.outpatient.model.impl.CodeDtoImpl;
import hk.org.hkbh.cms.outpatient.model.impl.CodeDtoModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDtoPersistence;

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
 * The persistence implementation for the code dto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see CodeDtoPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.CodeDtoUtil
 * @generated
 */
@ProviderType
public class CodeDtoPersistenceImpl extends BasePersistenceImpl<CodeDto>
	implements CodeDtoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CodeDtoUtil} to access the code dto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CodeDtoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoModelImpl.FINDER_CACHE_ENABLED, CodeDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoModelImpl.FINDER_CACHE_ENABLED, CodeDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MASTERCODE =
		new FinderPath(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoModelImpl.FINDER_CACHE_ENABLED, CodeDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMasterCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERCODE =
		new FinderPath(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoModelImpl.FINDER_CACHE_ENABLED, CodeDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMasterCode",
			new String[] { String.class.getName() },
			CodeDtoModelImpl.MASTERCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASTERCODE = new FinderPath(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMasterCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the code dtos where masterCode = &#63;.
	 *
	 * @param masterCode the master code
	 * @return the matching code dtos
	 */
	@Override
	public List<CodeDto> findByMasterCode(String masterCode) {
		return findByMasterCode(masterCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the code dtos where masterCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masterCode the master code
	 * @param start the lower bound of the range of code dtos
	 * @param end the upper bound of the range of code dtos (not inclusive)
	 * @return the range of matching code dtos
	 */
	@Override
	public List<CodeDto> findByMasterCode(String masterCode, int start, int end) {
		return findByMasterCode(masterCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the code dtos where masterCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masterCode the master code
	 * @param start the lower bound of the range of code dtos
	 * @param end the upper bound of the range of code dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching code dtos
	 */
	@Override
	public List<CodeDto> findByMasterCode(String masterCode, int start,
		int end, OrderByComparator<CodeDto> orderByComparator) {
		return findByMasterCode(masterCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the code dtos where masterCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masterCode the master code
	 * @param start the lower bound of the range of code dtos
	 * @param end the upper bound of the range of code dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching code dtos
	 */
	@Override
	public List<CodeDto> findByMasterCode(String masterCode, int start,
		int end, OrderByComparator<CodeDto> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERCODE;
			finderArgs = new Object[] { masterCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MASTERCODE;
			finderArgs = new Object[] { masterCode, start, end, orderByComparator };
		}

		List<CodeDto> list = null;

		if (retrieveFromCache) {
			list = (List<CodeDto>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (CodeDto codeDto : list) {
					if (!Objects.equals(masterCode, codeDto.getMasterCode())) {
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

			query.append(_SQL_SELECT_CODEDTO_WHERE);

			boolean bindMasterCode = false;

			if (masterCode == null) {
				query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_1);
			}
			else if (masterCode.equals("")) {
				query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_3);
			}
			else {
				bindMasterCode = true;

				query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CodeDtoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasterCode) {
					qPos.add(masterCode);
				}

				if (!pagination) {
					list = (List<CodeDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CodeDto>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first code dto in the ordered set where masterCode = &#63;.
	 *
	 * @param masterCode the master code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching code dto
	 * @throws NoSuchCodeDtoException if a matching code dto could not be found
	 */
	@Override
	public CodeDto findByMasterCode_First(String masterCode,
		OrderByComparator<CodeDto> orderByComparator)
		throws NoSuchCodeDtoException {
		CodeDto codeDto = fetchByMasterCode_First(masterCode, orderByComparator);

		if (codeDto != null) {
			return codeDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("masterCode=");
		msg.append(masterCode);

		msg.append("}");

		throw new NoSuchCodeDtoException(msg.toString());
	}

	/**
	 * Returns the first code dto in the ordered set where masterCode = &#63;.
	 *
	 * @param masterCode the master code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching code dto, or <code>null</code> if a matching code dto could not be found
	 */
	@Override
	public CodeDto fetchByMasterCode_First(String masterCode,
		OrderByComparator<CodeDto> orderByComparator) {
		List<CodeDto> list = findByMasterCode(masterCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last code dto in the ordered set where masterCode = &#63;.
	 *
	 * @param masterCode the master code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching code dto
	 * @throws NoSuchCodeDtoException if a matching code dto could not be found
	 */
	@Override
	public CodeDto findByMasterCode_Last(String masterCode,
		OrderByComparator<CodeDto> orderByComparator)
		throws NoSuchCodeDtoException {
		CodeDto codeDto = fetchByMasterCode_Last(masterCode, orderByComparator);

		if (codeDto != null) {
			return codeDto;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("masterCode=");
		msg.append(masterCode);

		msg.append("}");

		throw new NoSuchCodeDtoException(msg.toString());
	}

	/**
	 * Returns the last code dto in the ordered set where masterCode = &#63;.
	 *
	 * @param masterCode the master code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching code dto, or <code>null</code> if a matching code dto could not be found
	 */
	@Override
	public CodeDto fetchByMasterCode_Last(String masterCode,
		OrderByComparator<CodeDto> orderByComparator) {
		int count = countByMasterCode(masterCode);

		if (count == 0) {
			return null;
		}

		List<CodeDto> list = findByMasterCode(masterCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the code dtos before and after the current code dto in the ordered set where masterCode = &#63;.
	 *
	 * @param id the primary key of the current code dto
	 * @param masterCode the master code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next code dto
	 * @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto[] findByMasterCode_PrevAndNext(long id, String masterCode,
		OrderByComparator<CodeDto> orderByComparator)
		throws NoSuchCodeDtoException {
		CodeDto codeDto = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CodeDto[] array = new CodeDtoImpl[3];

			array[0] = getByMasterCode_PrevAndNext(session, codeDto,
					masterCode, orderByComparator, true);

			array[1] = codeDto;

			array[2] = getByMasterCode_PrevAndNext(session, codeDto,
					masterCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CodeDto getByMasterCode_PrevAndNext(Session session,
		CodeDto codeDto, String masterCode,
		OrderByComparator<CodeDto> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CODEDTO_WHERE);

		boolean bindMasterCode = false;

		if (masterCode == null) {
			query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_1);
		}
		else if (masterCode.equals("")) {
			query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_3);
		}
		else {
			bindMasterCode = true;

			query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_2);
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
			query.append(CodeDtoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMasterCode) {
			qPos.add(masterCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(codeDto);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CodeDto> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the code dtos where masterCode = &#63; from the database.
	 *
	 * @param masterCode the master code
	 */
	@Override
	public void removeByMasterCode(String masterCode) {
		for (CodeDto codeDto : findByMasterCode(masterCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(codeDto);
		}
	}

	/**
	 * Returns the number of code dtos where masterCode = &#63;.
	 *
	 * @param masterCode the master code
	 * @return the number of matching code dtos
	 */
	@Override
	public int countByMasterCode(String masterCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MASTERCODE;

		Object[] finderArgs = new Object[] { masterCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CODEDTO_WHERE);

			boolean bindMasterCode = false;

			if (masterCode == null) {
				query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_1);
			}
			else if (masterCode.equals("")) {
				query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_3);
			}
			else {
				bindMasterCode = true;

				query.append(_FINDER_COLUMN_MASTERCODE_MASTERCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasterCode) {
					qPos.add(masterCode);
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

	private static final String _FINDER_COLUMN_MASTERCODE_MASTERCODE_1 = "codeDto.masterCode IS NULL";
	private static final String _FINDER_COLUMN_MASTERCODE_MASTERCODE_2 = "codeDto.masterCode = ?";
	private static final String _FINDER_COLUMN_MASTERCODE_MASTERCODE_3 = "(codeDto.masterCode IS NULL OR codeDto.masterCode = '')";

	public CodeDtoPersistenceImpl() {
		setModelClass(CodeDto.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "code_detail_id");
			dbColumnNames.put("masterCode", "master_code");
			dbColumnNames.put("codeDisplayTextEn", "code_display_text_en");
			dbColumnNames.put("codeDisplayTextChi", "code_display_text_chi");
			dbColumnNames.put("codeActive", "code_active");
			dbColumnNames.put("subcodeEnabled", "subcode_enabled");
			dbColumnNames.put("codeRemarks", "code_remarks");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("codeDetailDisplayTextEn",
				"code_detail_display_text_en");
			dbColumnNames.put("codeDetailDisplayTextChi",
				"code_detail_display_text_chi");
			dbColumnNames.put("codeDetailActive", "code_detail_active");
			dbColumnNames.put("upLevelId", "up_level_id");
			dbColumnNames.put("codeDetailRemarks", "code_detail_remarks");
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
	 * Caches the code dto in the entity cache if it is enabled.
	 *
	 * @param codeDto the code dto
	 */
	@Override
	public void cacheResult(CodeDto codeDto) {
		entityCache.putResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoImpl.class, codeDto.getPrimaryKey(), codeDto);

		codeDto.resetOriginalValues();
	}

	/**
	 * Caches the code dtos in the entity cache if it is enabled.
	 *
	 * @param codeDtos the code dtos
	 */
	@Override
	public void cacheResult(List<CodeDto> codeDtos) {
		for (CodeDto codeDto : codeDtos) {
			if (entityCache.getResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
						CodeDtoImpl.class, codeDto.getPrimaryKey()) == null) {
				cacheResult(codeDto);
			}
			else {
				codeDto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all code dtos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CodeDtoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the code dto.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CodeDto codeDto) {
		entityCache.removeResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoImpl.class, codeDto.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CodeDto> codeDtos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CodeDto codeDto : codeDtos) {
			entityCache.removeResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
				CodeDtoImpl.class, codeDto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new code dto with the primary key. Does not add the code dto to the database.
	 *
	 * @param id the primary key for the new code dto
	 * @return the new code dto
	 */
	@Override
	public CodeDto create(long id) {
		CodeDto codeDto = new CodeDtoImpl();

		codeDto.setNew(true);
		codeDto.setPrimaryKey(id);

		return codeDto;
	}

	/**
	 * Removes the code dto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the code dto
	 * @return the code dto that was removed
	 * @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto remove(long id) throws NoSuchCodeDtoException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the code dto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the code dto
	 * @return the code dto that was removed
	 * @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto remove(Serializable primaryKey)
		throws NoSuchCodeDtoException {
		Session session = null;

		try {
			session = openSession();

			CodeDto codeDto = (CodeDto)session.get(CodeDtoImpl.class, primaryKey);

			if (codeDto == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCodeDtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(codeDto);
		}
		catch (NoSuchCodeDtoException nsee) {
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
	protected CodeDto removeImpl(CodeDto codeDto) {
		codeDto = toUnwrappedModel(codeDto);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(codeDto)) {
				codeDto = (CodeDto)session.get(CodeDtoImpl.class,
						codeDto.getPrimaryKeyObj());
			}

			if (codeDto != null) {
				session.delete(codeDto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (codeDto != null) {
			clearCache(codeDto);
		}

		return codeDto;
	}

	@Override
	public CodeDto updateImpl(CodeDto codeDto) {
		codeDto = toUnwrappedModel(codeDto);

		boolean isNew = codeDto.isNew();

		CodeDtoModelImpl codeDtoModelImpl = (CodeDtoModelImpl)codeDto;

		Session session = null;

		try {
			session = openSession();

			if (codeDto.isNew()) {
				session.save(codeDto);

				codeDto.setNew(false);
			}
			else {
				codeDto = (CodeDto)session.merge(codeDto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CodeDtoModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { codeDtoModelImpl.getMasterCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_MASTERCODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERCODE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((codeDtoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						codeDtoModelImpl.getOriginalMasterCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MASTERCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERCODE,
					args);

				args = new Object[] { codeDtoModelImpl.getMasterCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MASTERCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASTERCODE,
					args);
			}
		}

		entityCache.putResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
			CodeDtoImpl.class, codeDto.getPrimaryKey(), codeDto, false);

		codeDto.resetOriginalValues();

		return codeDto;
	}

	protected CodeDto toUnwrappedModel(CodeDto codeDto) {
		if (codeDto instanceof CodeDtoImpl) {
			return codeDto;
		}

		CodeDtoImpl codeDtoImpl = new CodeDtoImpl();

		codeDtoImpl.setNew(codeDto.isNew());
		codeDtoImpl.setPrimaryKey(codeDto.getPrimaryKey());

		codeDtoImpl.setId(codeDto.getId());
		codeDtoImpl.setMasterCode(codeDto.getMasterCode());
		codeDtoImpl.setCodeDisplayTextEn(codeDto.getCodeDisplayTextEn());
		codeDtoImpl.setCodeDisplayTextChi(codeDto.getCodeDisplayTextChi());
		codeDtoImpl.setCodeActive(codeDto.getCodeActive());
		codeDtoImpl.setSubcodeEnabled(codeDto.getSubcodeEnabled());
		codeDtoImpl.setCodeRemarks(codeDto.getCodeRemarks());
		codeDtoImpl.setDetailCode(codeDto.getDetailCode());
		codeDtoImpl.setSeq(codeDto.getSeq());
		codeDtoImpl.setCodeDetailDisplayTextEn(codeDto.getCodeDetailDisplayTextEn());
		codeDtoImpl.setCodeDetailDisplayTextChi(codeDto.getCodeDetailDisplayTextChi());
		codeDtoImpl.setCodeDetailActive(codeDto.getCodeDetailActive());
		codeDtoImpl.setLevel(codeDto.getLevel());
		codeDtoImpl.setUpLevelId(codeDto.getUpLevelId());
		codeDtoImpl.setCodeDetailRemarks(codeDto.getCodeDetailRemarks());
		codeDtoImpl.setCreateDate(codeDto.getCreateDate());
		codeDtoImpl.setUpdateDate(codeDto.getUpdateDate());
		codeDtoImpl.setCreatedBy(codeDto.getCreatedBy());
		codeDtoImpl.setUpdatedBy(codeDto.getUpdatedBy());

		return codeDtoImpl;
	}

	/**
	 * Returns the code dto with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the code dto
	 * @return the code dto
	 * @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCodeDtoException {
		CodeDto codeDto = fetchByPrimaryKey(primaryKey);

		if (codeDto == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCodeDtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return codeDto;
	}

	/**
	 * Returns the code dto with the primary key or throws a {@link NoSuchCodeDtoException} if it could not be found.
	 *
	 * @param id the primary key of the code dto
	 * @return the code dto
	 * @throws NoSuchCodeDtoException if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto findByPrimaryKey(long id) throws NoSuchCodeDtoException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the code dto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the code dto
	 * @return the code dto, or <code>null</code> if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
				CodeDtoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CodeDto codeDto = (CodeDto)serializable;

		if (codeDto == null) {
			Session session = null;

			try {
				session = openSession();

				codeDto = (CodeDto)session.get(CodeDtoImpl.class, primaryKey);

				if (codeDto != null) {
					cacheResult(codeDto);
				}
				else {
					entityCache.putResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
						CodeDtoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
					CodeDtoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return codeDto;
	}

	/**
	 * Returns the code dto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the code dto
	 * @return the code dto, or <code>null</code> if a code dto with the primary key could not be found
	 */
	@Override
	public CodeDto fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, CodeDto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CodeDto> map = new HashMap<Serializable, CodeDto>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CodeDto codeDto = fetchByPrimaryKey(primaryKey);

			if (codeDto != null) {
				map.put(primaryKey, codeDto);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
					CodeDtoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CodeDto)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CODEDTO_WHERE_PKS_IN);

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

			for (CodeDto codeDto : (List<CodeDto>)q.list()) {
				map.put(codeDto.getPrimaryKeyObj(), codeDto);

				cacheResult(codeDto);

				uncachedPrimaryKeys.remove(codeDto.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CodeDtoModelImpl.ENTITY_CACHE_ENABLED,
					CodeDtoImpl.class, primaryKey, nullModel);
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
	 * Returns all the code dtos.
	 *
	 * @return the code dtos
	 */
	@Override
	public List<CodeDto> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the code dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of code dtos
	 * @param end the upper bound of the range of code dtos (not inclusive)
	 * @return the range of code dtos
	 */
	@Override
	public List<CodeDto> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the code dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of code dtos
	 * @param end the upper bound of the range of code dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of code dtos
	 */
	@Override
	public List<CodeDto> findAll(int start, int end,
		OrderByComparator<CodeDto> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the code dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of code dtos
	 * @param end the upper bound of the range of code dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of code dtos
	 */
	@Override
	public List<CodeDto> findAll(int start, int end,
		OrderByComparator<CodeDto> orderByComparator, boolean retrieveFromCache) {
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

		List<CodeDto> list = null;

		if (retrieveFromCache) {
			list = (List<CodeDto>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CODEDTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CODEDTO;

				if (pagination) {
					sql = sql.concat(CodeDtoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CodeDto>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CodeDto>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the code dtos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CodeDto codeDto : findAll()) {
			remove(codeDto);
		}
	}

	/**
	 * Returns the number of code dtos.
	 *
	 * @return the number of code dtos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CODEDTO);

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
		return CodeDtoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the code dto persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CodeDtoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CODEDTO = "SELECT codeDto FROM CodeDto codeDto";
	private static final String _SQL_SELECT_CODEDTO_WHERE_PKS_IN = "SELECT codeDto FROM CodeDto codeDto WHERE code_detail_id IN (";
	private static final String _SQL_SELECT_CODEDTO_WHERE = "SELECT codeDto FROM CodeDto codeDto WHERE ";
	private static final String _SQL_COUNT_CODEDTO = "SELECT COUNT(codeDto) FROM CodeDto codeDto";
	private static final String _SQL_COUNT_CODEDTO_WHERE = "SELECT COUNT(codeDto) FROM CodeDto codeDto WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "codeDto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CodeDto exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CodeDto exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CodeDtoPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "masterCode", "codeDisplayTextEn", "codeDisplayTextChi",
				"codeActive", "subcodeEnabled", "codeRemarks", "detailCode",
				"codeDetailDisplayTextEn", "codeDetailDisplayTextChi",
				"codeDetailActive", "upLevelId", "codeDetailRemarks",
				"createDate", "updateDate", "createdBy", "updatedBy"
			});
}