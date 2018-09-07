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

import hk.org.hkbh.cms.outpatient.exception.NoSuchCodeException;
import hk.org.hkbh.cms.outpatient.model.Code;
import hk.org.hkbh.cms.outpatient.model.impl.CodeImpl;
import hk.org.hkbh.cms.outpatient.model.impl.CodeModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.CodePersistence;

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
 * The persistence implementation for the code service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see CodePersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.CodeUtil
 * @generated
 */
@ProviderType
public class CodePersistenceImpl extends BasePersistenceImpl<Code>
	implements CodePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CodeUtil} to access the code persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CodeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CodeModelImpl.ENTITY_CACHE_ENABLED,
			CodeModelImpl.FINDER_CACHE_ENABLED, CodeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CodeModelImpl.ENTITY_CACHE_ENABLED,
			CodeModelImpl.FINDER_CACHE_ENABLED, CodeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CodeModelImpl.ENTITY_CACHE_ENABLED,
			CodeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CodePersistenceImpl() {
		setModelClass(Code.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("masterCode", "master_code");
			dbColumnNames.put("displayTextEn", "display_text_en");
			dbColumnNames.put("displayTextChi", "display_text_chi");
			dbColumnNames.put("subcodeEnabled", "subcode_enabled");
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
	 * Caches the code in the entity cache if it is enabled.
	 *
	 * @param code the code
	 */
	@Override
	public void cacheResult(Code code) {
		entityCache.putResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
			CodeImpl.class, code.getPrimaryKey(), code);

		code.resetOriginalValues();
	}

	/**
	 * Caches the codes in the entity cache if it is enabled.
	 *
	 * @param codes the codes
	 */
	@Override
	public void cacheResult(List<Code> codes) {
		for (Code code : codes) {
			if (entityCache.getResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
						CodeImpl.class, code.getPrimaryKey()) == null) {
				cacheResult(code);
			}
			else {
				code.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all codes.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CodeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the code.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Code code) {
		entityCache.removeResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
			CodeImpl.class, code.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Code> codes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Code code : codes) {
			entityCache.removeResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
				CodeImpl.class, code.getPrimaryKey());
		}
	}

	/**
	 * Creates a new code with the primary key. Does not add the code to the database.
	 *
	 * @param id the primary key for the new code
	 * @return the new code
	 */
	@Override
	public Code create(int id) {
		Code code = new CodeImpl();

		code.setNew(true);
		code.setPrimaryKey(id);

		return code;
	}

	/**
	 * Removes the code with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the code
	 * @return the code that was removed
	 * @throws NoSuchCodeException if a code with the primary key could not be found
	 */
	@Override
	public Code remove(int id) throws NoSuchCodeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the code with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the code
	 * @return the code that was removed
	 * @throws NoSuchCodeException if a code with the primary key could not be found
	 */
	@Override
	public Code remove(Serializable primaryKey) throws NoSuchCodeException {
		Session session = null;

		try {
			session = openSession();

			Code code = (Code)session.get(CodeImpl.class, primaryKey);

			if (code == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCodeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(code);
		}
		catch (NoSuchCodeException nsee) {
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
	protected Code removeImpl(Code code) {
		code = toUnwrappedModel(code);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(code)) {
				code = (Code)session.get(CodeImpl.class, code.getPrimaryKeyObj());
			}

			if (code != null) {
				session.delete(code);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (code != null) {
			clearCache(code);
		}

		return code;
	}

	@Override
	public Code updateImpl(Code code) {
		code = toUnwrappedModel(code);

		boolean isNew = code.isNew();

		Session session = null;

		try {
			session = openSession();

			if (code.isNew()) {
				session.save(code);

				code.setNew(false);
			}
			else {
				code = (Code)session.merge(code);
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

		entityCache.putResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
			CodeImpl.class, code.getPrimaryKey(), code, false);

		code.resetOriginalValues();

		return code;
	}

	protected Code toUnwrappedModel(Code code) {
		if (code instanceof CodeImpl) {
			return code;
		}

		CodeImpl codeImpl = new CodeImpl();

		codeImpl.setNew(code.isNew());
		codeImpl.setPrimaryKey(code.getPrimaryKey());

		codeImpl.setId(code.getId());
		codeImpl.setMasterCode(code.getMasterCode());
		codeImpl.setDisplayTextEn(code.getDisplayTextEn());
		codeImpl.setDisplayTextChi(code.getDisplayTextChi());
		codeImpl.setActive(code.getActive());
		codeImpl.setSubcodeEnabled(code.getSubcodeEnabled());
		codeImpl.setRemarks(code.getRemarks());
		codeImpl.setCreateDate(code.getCreateDate());
		codeImpl.setUpdateDate(code.getUpdateDate());
		codeImpl.setCreatedBy(code.getCreatedBy());
		codeImpl.setUpdatedBy(code.getUpdatedBy());

		return codeImpl;
	}

	/**
	 * Returns the code with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the code
	 * @return the code
	 * @throws NoSuchCodeException if a code with the primary key could not be found
	 */
	@Override
	public Code findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCodeException {
		Code code = fetchByPrimaryKey(primaryKey);

		if (code == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCodeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return code;
	}

	/**
	 * Returns the code with the primary key or throws a {@link NoSuchCodeException} if it could not be found.
	 *
	 * @param id the primary key of the code
	 * @return the code
	 * @throws NoSuchCodeException if a code with the primary key could not be found
	 */
	@Override
	public Code findByPrimaryKey(int id) throws NoSuchCodeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the code with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the code
	 * @return the code, or <code>null</code> if a code with the primary key could not be found
	 */
	@Override
	public Code fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
				CodeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Code code = (Code)serializable;

		if (code == null) {
			Session session = null;

			try {
				session = openSession();

				code = (Code)session.get(CodeImpl.class, primaryKey);

				if (code != null) {
					cacheResult(code);
				}
				else {
					entityCache.putResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
						CodeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
					CodeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return code;
	}

	/**
	 * Returns the code with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the code
	 * @return the code, or <code>null</code> if a code with the primary key could not be found
	 */
	@Override
	public Code fetchByPrimaryKey(int id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Code> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Code> map = new HashMap<Serializable, Code>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Code code = fetchByPrimaryKey(primaryKey);

			if (code != null) {
				map.put(primaryKey, code);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
					CodeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Code)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CODE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Code code : (List<Code>)q.list()) {
				map.put(code.getPrimaryKeyObj(), code);

				cacheResult(code);

				uncachedPrimaryKeys.remove(code.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CodeModelImpl.ENTITY_CACHE_ENABLED,
					CodeImpl.class, primaryKey, nullModel);
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
	 * Returns all the codes.
	 *
	 * @return the codes
	 */
	@Override
	public List<Code> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of codes
	 * @param end the upper bound of the range of codes (not inclusive)
	 * @return the range of codes
	 */
	@Override
	public List<Code> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of codes
	 * @param end the upper bound of the range of codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of codes
	 */
	@Override
	public List<Code> findAll(int start, int end,
		OrderByComparator<Code> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the codes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of codes
	 * @param end the upper bound of the range of codes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of codes
	 */
	@Override
	public List<Code> findAll(int start, int end,
		OrderByComparator<Code> orderByComparator, boolean retrieveFromCache) {
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

		List<Code> list = null;

		if (retrieveFromCache) {
			list = (List<Code>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CODE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CODE;

				if (pagination) {
					sql = sql.concat(CodeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Code>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Code>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the codes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Code code : findAll()) {
			remove(code);
		}
	}

	/**
	 * Returns the number of codes.
	 *
	 * @return the number of codes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CODE);

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
		return CodeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the code persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CodeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CODE = "SELECT code FROM Code code";
	private static final String _SQL_SELECT_CODE_WHERE_PKS_IN = "SELECT code FROM Code code WHERE id IN (";
	private static final String _SQL_COUNT_CODE = "SELECT COUNT(code) FROM Code code";
	private static final String _ORDER_BY_ENTITY_ALIAS = "code.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Code exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CodePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"masterCode", "displayTextEn", "displayTextChi",
				"subcodeEnabled", "createDate", "updateDate", "createdBy",
				"updatedBy"
			});
}