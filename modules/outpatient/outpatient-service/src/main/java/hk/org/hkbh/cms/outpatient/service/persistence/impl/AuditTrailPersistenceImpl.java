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

import hk.org.hkbh.cms.outpatient.exception.NoSuchAuditTrailException;
import hk.org.hkbh.cms.outpatient.model.AuditTrail;
import hk.org.hkbh.cms.outpatient.model.impl.AuditTrailImpl;
import hk.org.hkbh.cms.outpatient.model.impl.AuditTrailModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.AuditTrailPersistence;

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
 * The persistence implementation for the audit trail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see AuditTrailPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.AuditTrailUtil
 * @generated
 */
@ProviderType
public class AuditTrailPersistenceImpl extends BasePersistenceImpl<AuditTrail>
	implements AuditTrailPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AuditTrailUtil} to access the audit trail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AuditTrailImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
			AuditTrailModelImpl.FINDER_CACHE_ENABLED, AuditTrailImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
			AuditTrailModelImpl.FINDER_CACHE_ENABLED, AuditTrailImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
			AuditTrailModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AuditTrailPersistenceImpl() {
		setModelClass(AuditTrail.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("userId", "user_id");
			dbColumnNames.put("functionId", "function_id");
			dbColumnNames.put("patientId", "patient_id");
			dbColumnNames.put("episodeId", "episode_id");
			dbColumnNames.put("className", "class_name");
			dbColumnNames.put("userAction", "user_action");
			dbColumnNames.put("beforeImageInJson", "before_image_in_json");
			dbColumnNames.put("afterImageInJson", "after_image_in_json");
			dbColumnNames.put("isDeleted", "is_deleted");
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
	 * Caches the audit trail in the entity cache if it is enabled.
	 *
	 * @param auditTrail the audit trail
	 */
	@Override
	public void cacheResult(AuditTrail auditTrail) {
		entityCache.putResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
			AuditTrailImpl.class, auditTrail.getPrimaryKey(), auditTrail);

		auditTrail.resetOriginalValues();
	}

	/**
	 * Caches the audit trails in the entity cache if it is enabled.
	 *
	 * @param auditTrails the audit trails
	 */
	@Override
	public void cacheResult(List<AuditTrail> auditTrails) {
		for (AuditTrail auditTrail : auditTrails) {
			if (entityCache.getResult(
						AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
						AuditTrailImpl.class, auditTrail.getPrimaryKey()) == null) {
				cacheResult(auditTrail);
			}
			else {
				auditTrail.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all audit trails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AuditTrailImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the audit trail.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AuditTrail auditTrail) {
		entityCache.removeResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
			AuditTrailImpl.class, auditTrail.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AuditTrail> auditTrails) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AuditTrail auditTrail : auditTrails) {
			entityCache.removeResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
				AuditTrailImpl.class, auditTrail.getPrimaryKey());
		}
	}

	/**
	 * Creates a new audit trail with the primary key. Does not add the audit trail to the database.
	 *
	 * @param id the primary key for the new audit trail
	 * @return the new audit trail
	 */
	@Override
	public AuditTrail create(long id) {
		AuditTrail auditTrail = new AuditTrailImpl();

		auditTrail.setNew(true);
		auditTrail.setPrimaryKey(id);

		return auditTrail;
	}

	/**
	 * Removes the audit trail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the audit trail
	 * @return the audit trail that was removed
	 * @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	 */
	@Override
	public AuditTrail remove(long id) throws NoSuchAuditTrailException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the audit trail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the audit trail
	 * @return the audit trail that was removed
	 * @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	 */
	@Override
	public AuditTrail remove(Serializable primaryKey)
		throws NoSuchAuditTrailException {
		Session session = null;

		try {
			session = openSession();

			AuditTrail auditTrail = (AuditTrail)session.get(AuditTrailImpl.class,
					primaryKey);

			if (auditTrail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAuditTrailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(auditTrail);
		}
		catch (NoSuchAuditTrailException nsee) {
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
	protected AuditTrail removeImpl(AuditTrail auditTrail) {
		auditTrail = toUnwrappedModel(auditTrail);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(auditTrail)) {
				auditTrail = (AuditTrail)session.get(AuditTrailImpl.class,
						auditTrail.getPrimaryKeyObj());
			}

			if (auditTrail != null) {
				session.delete(auditTrail);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (auditTrail != null) {
			clearCache(auditTrail);
		}

		return auditTrail;
	}

	@Override
	public AuditTrail updateImpl(AuditTrail auditTrail) {
		auditTrail = toUnwrappedModel(auditTrail);

		boolean isNew = auditTrail.isNew();

		Session session = null;

		try {
			session = openSession();

			if (auditTrail.isNew()) {
				session.save(auditTrail);

				auditTrail.setNew(false);
			}
			else {
				auditTrail = (AuditTrail)session.merge(auditTrail);
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

		entityCache.putResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
			AuditTrailImpl.class, auditTrail.getPrimaryKey(), auditTrail, false);

		auditTrail.resetOriginalValues();

		return auditTrail;
	}

	protected AuditTrail toUnwrappedModel(AuditTrail auditTrail) {
		if (auditTrail instanceof AuditTrailImpl) {
			return auditTrail;
		}

		AuditTrailImpl auditTrailImpl = new AuditTrailImpl();

		auditTrailImpl.setNew(auditTrail.isNew());
		auditTrailImpl.setPrimaryKey(auditTrail.getPrimaryKey());

		auditTrailImpl.setId(auditTrail.getId());
		auditTrailImpl.setUserId(auditTrail.getUserId());
		auditTrailImpl.setFunctionId(auditTrail.getFunctionId());
		auditTrailImpl.setPatientId(auditTrail.getPatientId());
		auditTrailImpl.setEpisodeId(auditTrail.getEpisodeId());
		auditTrailImpl.setClassName(auditTrail.getClassName());
		auditTrailImpl.setUserAction(auditTrail.getUserAction());
		auditTrailImpl.setBeforeImageInJson(auditTrail.getBeforeImageInJson());
		auditTrailImpl.setAfterImageInJson(auditTrail.getAfterImageInJson());
		auditTrailImpl.setIsDeleted(auditTrail.getIsDeleted());
		auditTrailImpl.setCreateDate(auditTrail.getCreateDate());
		auditTrailImpl.setUpdateDate(auditTrail.getUpdateDate());
		auditTrailImpl.setCreatedBy(auditTrail.getCreatedBy());
		auditTrailImpl.setUpdatedBy(auditTrail.getUpdatedBy());

		return auditTrailImpl;
	}

	/**
	 * Returns the audit trail with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the audit trail
	 * @return the audit trail
	 * @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	 */
	@Override
	public AuditTrail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAuditTrailException {
		AuditTrail auditTrail = fetchByPrimaryKey(primaryKey);

		if (auditTrail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAuditTrailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return auditTrail;
	}

	/**
	 * Returns the audit trail with the primary key or throws a {@link NoSuchAuditTrailException} if it could not be found.
	 *
	 * @param id the primary key of the audit trail
	 * @return the audit trail
	 * @throws NoSuchAuditTrailException if a audit trail with the primary key could not be found
	 */
	@Override
	public AuditTrail findByPrimaryKey(long id)
		throws NoSuchAuditTrailException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the audit trail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the audit trail
	 * @return the audit trail, or <code>null</code> if a audit trail with the primary key could not be found
	 */
	@Override
	public AuditTrail fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
				AuditTrailImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AuditTrail auditTrail = (AuditTrail)serializable;

		if (auditTrail == null) {
			Session session = null;

			try {
				session = openSession();

				auditTrail = (AuditTrail)session.get(AuditTrailImpl.class,
						primaryKey);

				if (auditTrail != null) {
					cacheResult(auditTrail);
				}
				else {
					entityCache.putResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
						AuditTrailImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
					AuditTrailImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return auditTrail;
	}

	/**
	 * Returns the audit trail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the audit trail
	 * @return the audit trail, or <code>null</code> if a audit trail with the primary key could not be found
	 */
	@Override
	public AuditTrail fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, AuditTrail> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AuditTrail> map = new HashMap<Serializable, AuditTrail>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AuditTrail auditTrail = fetchByPrimaryKey(primaryKey);

			if (auditTrail != null) {
				map.put(primaryKey, auditTrail);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
					AuditTrailImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AuditTrail)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_AUDITTRAIL_WHERE_PKS_IN);

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

			for (AuditTrail auditTrail : (List<AuditTrail>)q.list()) {
				map.put(auditTrail.getPrimaryKeyObj(), auditTrail);

				cacheResult(auditTrail);

				uncachedPrimaryKeys.remove(auditTrail.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AuditTrailModelImpl.ENTITY_CACHE_ENABLED,
					AuditTrailImpl.class, primaryKey, nullModel);
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
	 * Returns all the audit trails.
	 *
	 * @return the audit trails
	 */
	@Override
	public List<AuditTrail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the audit trails.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of audit trails
	 * @param end the upper bound of the range of audit trails (not inclusive)
	 * @return the range of audit trails
	 */
	@Override
	public List<AuditTrail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the audit trails.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of audit trails
	 * @param end the upper bound of the range of audit trails (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of audit trails
	 */
	@Override
	public List<AuditTrail> findAll(int start, int end,
		OrderByComparator<AuditTrail> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the audit trails.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AuditTrailModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of audit trails
	 * @param end the upper bound of the range of audit trails (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of audit trails
	 */
	@Override
	public List<AuditTrail> findAll(int start, int end,
		OrderByComparator<AuditTrail> orderByComparator,
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

		List<AuditTrail> list = null;

		if (retrieveFromCache) {
			list = (List<AuditTrail>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_AUDITTRAIL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AUDITTRAIL;

				if (pagination) {
					sql = sql.concat(AuditTrailModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AuditTrail>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AuditTrail>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the audit trails from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AuditTrail auditTrail : findAll()) {
			remove(auditTrail);
		}
	}

	/**
	 * Returns the number of audit trails.
	 *
	 * @return the number of audit trails
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AUDITTRAIL);

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
		return AuditTrailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the audit trail persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AuditTrailImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_AUDITTRAIL = "SELECT auditTrail FROM AuditTrail auditTrail";
	private static final String _SQL_SELECT_AUDITTRAIL_WHERE_PKS_IN = "SELECT auditTrail FROM AuditTrail auditTrail WHERE id IN (";
	private static final String _SQL_COUNT_AUDITTRAIL = "SELECT COUNT(auditTrail) FROM AuditTrail auditTrail";
	private static final String _ORDER_BY_ENTITY_ALIAS = "auditTrail.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AuditTrail exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AuditTrailPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"userId", "functionId", "patientId", "episodeId", "className",
				"userAction", "beforeImageInJson", "afterImageInJson",
				"isDeleted", "createDate", "updateDate", "createdBy",
				"updatedBy"
			});
}