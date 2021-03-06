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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import hk.org.hkbh.cms.outpatient.exception.NoSuchCodeDetailException;
import hk.org.hkbh.cms.outpatient.model.CodeDetail;
import hk.org.hkbh.cms.outpatient.model.impl.CodeDetailImpl;
import hk.org.hkbh.cms.outpatient.model.impl.CodeDetailModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDetailPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the code detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see CodeDetailPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.CodeDetailUtil
 * @generated
 */
@ProviderType
public class CodeDetailPersistenceImpl extends BasePersistenceImpl<CodeDetail>
	implements CodeDetailPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CodeDetailUtil} to access the code detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CodeDetailImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
			CodeDetailModelImpl.FINDER_CACHE_ENABLED, CodeDetailImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
			CodeDetailModelImpl.FINDER_CACHE_ENABLED, CodeDetailImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
			CodeDetailModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CodeDetailPersistenceImpl() {
		setModelClass(CodeDetail.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("codeId", "code_id");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("displayTextEn", "display_text_en");
			dbColumnNames.put("displayTextChi", "display_text_chi");
			dbColumnNames.put("upLevelId", "up_level_id");
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
	 * Caches the code detail in the entity cache if it is enabled.
	 *
	 * @param codeDetail the code detail
	 */
	@Override
	public void cacheResult(CodeDetail codeDetail) {
		entityCache.putResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
			CodeDetailImpl.class, codeDetail.getPrimaryKey(), codeDetail);

		codeDetail.resetOriginalValues();
	}

	/**
	 * Caches the code details in the entity cache if it is enabled.
	 *
	 * @param codeDetails the code details
	 */
	@Override
	public void cacheResult(List<CodeDetail> codeDetails) {
		for (CodeDetail codeDetail : codeDetails) {
			if (entityCache.getResult(
						CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
						CodeDetailImpl.class, codeDetail.getPrimaryKey()) == null) {
				cacheResult(codeDetail);
			}
			else {
				codeDetail.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all code details.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CodeDetailImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the code detail.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CodeDetail codeDetail) {
		entityCache.removeResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
			CodeDetailImpl.class, codeDetail.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CodeDetail> codeDetails) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CodeDetail codeDetail : codeDetails) {
			entityCache.removeResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
				CodeDetailImpl.class, codeDetail.getPrimaryKey());
		}
	}

	/**
	 * Creates a new code detail with the primary key. Does not add the code detail to the database.
	 *
	 * @param id the primary key for the new code detail
	 * @return the new code detail
	 */
	@Override
	public CodeDetail create(long id) {
		CodeDetail codeDetail = new CodeDetailImpl();

		codeDetail.setNew(true);
		codeDetail.setPrimaryKey(id);

		return codeDetail;
	}

	/**
	 * Removes the code detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the code detail
	 * @return the code detail that was removed
	 * @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	 */
	@Override
	public CodeDetail remove(long id) throws NoSuchCodeDetailException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the code detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the code detail
	 * @return the code detail that was removed
	 * @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	 */
	@Override
	public CodeDetail remove(Serializable primaryKey)
		throws NoSuchCodeDetailException {
		Session session = null;

		try {
			session = openSession();

			CodeDetail codeDetail = (CodeDetail)session.get(CodeDetailImpl.class,
					primaryKey);

			if (codeDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCodeDetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(codeDetail);
		}
		catch (NoSuchCodeDetailException nsee) {
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
	protected CodeDetail removeImpl(CodeDetail codeDetail) {
		codeDetail = toUnwrappedModel(codeDetail);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(codeDetail)) {
				codeDetail = (CodeDetail)session.get(CodeDetailImpl.class,
						codeDetail.getPrimaryKeyObj());
			}

			if (codeDetail != null) {
				session.delete(codeDetail);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (codeDetail != null) {
			clearCache(codeDetail);
		}

		return codeDetail;
	}

	@Override
	public CodeDetail updateImpl(CodeDetail codeDetail) {
		codeDetail = toUnwrappedModel(codeDetail);

		boolean isNew = codeDetail.isNew();

		Session session = null;

		try {
			session = openSession();

			if (codeDetail.isNew()) {
				session.save(codeDetail);

				codeDetail.setNew(false);
			}
			else {
				codeDetail = (CodeDetail)session.merge(codeDetail);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
			CodeDetailImpl.class, codeDetail.getPrimaryKey(), codeDetail, false);

		codeDetail.resetOriginalValues();

		return codeDetail;
	}

	protected CodeDetail toUnwrappedModel(CodeDetail codeDetail) {
		if (codeDetail instanceof CodeDetailImpl) {
			return codeDetail;
		}

		CodeDetailImpl codeDetailImpl = new CodeDetailImpl();

		codeDetailImpl.setNew(codeDetail.isNew());
		codeDetailImpl.setPrimaryKey(codeDetail.getPrimaryKey());

		codeDetailImpl.setId(codeDetail.getId());
		codeDetailImpl.setCodeId(codeDetail.getCodeId());
		codeDetailImpl.setDetailCode(codeDetail.getDetailCode());
		codeDetailImpl.setSeq(codeDetail.getSeq());
		codeDetailImpl.setDisplayTextEn(codeDetail.getDisplayTextEn());
		codeDetailImpl.setDisplayTextChi(codeDetail.getDisplayTextChi());
		codeDetailImpl.setSymbol(codeDetail.getSymbol());
		codeDetailImpl.setSymbol_html_code(codeDetail.getSymbol_html_code());
		codeDetailImpl.setActive(codeDetail.getActive());
		codeDetailImpl.setLevel(codeDetail.getLevel());
		codeDetailImpl.setUpLevelId(codeDetail.getUpLevelId());
		codeDetailImpl.setRemarks(codeDetail.getRemarks());
		codeDetailImpl.setCreateDate(codeDetail.getCreateDate());
		codeDetailImpl.setUpdateDate(codeDetail.getUpdateDate());
		codeDetailImpl.setCreatedBy(codeDetail.getCreatedBy());
		codeDetailImpl.setUpdatedBy(codeDetail.getUpdatedBy());

		return codeDetailImpl;
	}

	/**
	 * Returns the code detail with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the code detail
	 * @return the code detail
	 * @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	 */
	@Override
	public CodeDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCodeDetailException {
		CodeDetail codeDetail = fetchByPrimaryKey(primaryKey);

		if (codeDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCodeDetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return codeDetail;
	}

	/**
	 * Returns the code detail with the primary key or throws a {@link NoSuchCodeDetailException} if it could not be found.
	 *
	 * @param id the primary key of the code detail
	 * @return the code detail
	 * @throws NoSuchCodeDetailException if a code detail with the primary key could not be found
	 */
	@Override
	public CodeDetail findByPrimaryKey(long id)
		throws NoSuchCodeDetailException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the code detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the code detail
	 * @return the code detail, or <code>null</code> if a code detail with the primary key could not be found
	 */
	@Override
	public CodeDetail fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
				CodeDetailImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CodeDetail codeDetail = (CodeDetail)serializable;

		if (codeDetail == null) {
			Session session = null;

			try {
				session = openSession();

				codeDetail = (CodeDetail)session.get(CodeDetailImpl.class,
						primaryKey);

				if (codeDetail != null) {
					cacheResult(codeDetail);
				}
				else {
					entityCache.putResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
						CodeDetailImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
					CodeDetailImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return codeDetail;
	}

	/**
	 * Returns the code detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the code detail
	 * @return the code detail, or <code>null</code> if a code detail with the primary key could not be found
	 */
	@Override
	public CodeDetail fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, CodeDetail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CodeDetail> map = new HashMap<Serializable, CodeDetail>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CodeDetail codeDetail = fetchByPrimaryKey(primaryKey);

			if (codeDetail != null) {
				map.put(primaryKey, codeDetail);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
					CodeDetailImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CodeDetail)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CODEDETAIL_WHERE_PKS_IN);

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

			for (CodeDetail codeDetail : (List<CodeDetail>)q.list()) {
				map.put(codeDetail.getPrimaryKeyObj(), codeDetail);

				cacheResult(codeDetail);

				uncachedPrimaryKeys.remove(codeDetail.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CodeDetailModelImpl.ENTITY_CACHE_ENABLED,
					CodeDetailImpl.class, primaryKey, nullModel);
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
	 * Returns all the code details.
	 *
	 * @return the code details
	 */
	@Override
	public List<CodeDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the code details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of code details
	 * @param end the upper bound of the range of code details (not inclusive)
	 * @return the range of code details
	 */
	@Override
	public List<CodeDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the code details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of code details
	 * @param end the upper bound of the range of code details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of code details
	 */
	@Override
	public List<CodeDetail> findAll(int start, int end,
		OrderByComparator<CodeDetail> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the code details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeDetailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of code details
	 * @param end the upper bound of the range of code details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of code details
	 */
	@Override
	public List<CodeDetail> findAll(int start, int end,
		OrderByComparator<CodeDetail> orderByComparator,
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

		List<CodeDetail> list = null;

		if (retrieveFromCache) {
			list = (List<CodeDetail>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CODEDETAIL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CODEDETAIL;

				if (pagination) {
					sql = sql.concat(CodeDetailModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CodeDetail>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CodeDetail>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the code details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CodeDetail codeDetail : findAll()) {
			remove(codeDetail);
		}
	}

	/**
	 * Returns the number of code details.
	 *
	 * @return the number of code details
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CODEDETAIL);

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
		return CodeDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the code detail persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CodeDetailImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CODEDETAIL = "SELECT codeDetail FROM CodeDetail codeDetail";
	private static final String _SQL_SELECT_CODEDETAIL_WHERE_PKS_IN = "SELECT codeDetail FROM CodeDetail codeDetail WHERE id IN (";
	private static final String _SQL_COUNT_CODEDETAIL = "SELECT COUNT(codeDetail) FROM CodeDetail codeDetail";
	private static final String _ORDER_BY_ENTITY_ALIAS = "codeDetail.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CodeDetail exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CodeDetailPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"codeId", "detailCode", "displayTextEn", "displayTextChi",
				"upLevelId", "createDate", "updateDate", "createdBy",
				"updatedBy"
			});
}