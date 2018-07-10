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

import hk.org.hkbh.cms.outpatient.exception.NoSuchClinicalNoteTemplateException;
import hk.org.hkbh.cms.outpatient.model.ClinicalNoteTemplate;
import hk.org.hkbh.cms.outpatient.model.impl.ClinicalNoteTemplateImpl;
import hk.org.hkbh.cms.outpatient.model.impl.ClinicalNoteTemplateModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ClinicalNoteTemplatePersistence;

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
 * The persistence implementation for the clinical note template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ClinicalNoteTemplatePersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.ClinicalNoteTemplateUtil
 * @generated
 */
@ProviderType
public class ClinicalNoteTemplatePersistenceImpl extends BasePersistenceImpl<ClinicalNoteTemplate>
	implements ClinicalNoteTemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ClinicalNoteTemplateUtil} to access the clinical note template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ClinicalNoteTemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
			ClinicalNoteTemplateModelImpl.FINDER_CACHE_ENABLED,
			ClinicalNoteTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
			ClinicalNoteTemplateModelImpl.FINDER_CACHE_ENABLED,
			ClinicalNoteTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
			ClinicalNoteTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ClinicalNoteTemplatePersistenceImpl() {
		setModelClass(ClinicalNoteTemplate.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "id_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the clinical note template in the entity cache if it is enabled.
	 *
	 * @param clinicalNoteTemplate the clinical note template
	 */
	@Override
	public void cacheResult(ClinicalNoteTemplate clinicalNoteTemplate) {
		entityCache.putResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
			ClinicalNoteTemplateImpl.class,
			clinicalNoteTemplate.getPrimaryKey(), clinicalNoteTemplate);

		clinicalNoteTemplate.resetOriginalValues();
	}

	/**
	 * Caches the clinical note templates in the entity cache if it is enabled.
	 *
	 * @param clinicalNoteTemplates the clinical note templates
	 */
	@Override
	public void cacheResult(List<ClinicalNoteTemplate> clinicalNoteTemplates) {
		for (ClinicalNoteTemplate clinicalNoteTemplate : clinicalNoteTemplates) {
			if (entityCache.getResult(
						ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
						ClinicalNoteTemplateImpl.class,
						clinicalNoteTemplate.getPrimaryKey()) == null) {
				cacheResult(clinicalNoteTemplate);
			}
			else {
				clinicalNoteTemplate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all clinical note templates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ClinicalNoteTemplateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the clinical note template.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ClinicalNoteTemplate clinicalNoteTemplate) {
		entityCache.removeResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
			ClinicalNoteTemplateImpl.class, clinicalNoteTemplate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ClinicalNoteTemplate> clinicalNoteTemplates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ClinicalNoteTemplate clinicalNoteTemplate : clinicalNoteTemplates) {
			entityCache.removeResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
				ClinicalNoteTemplateImpl.class,
				clinicalNoteTemplate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new clinical note template with the primary key. Does not add the clinical note template to the database.
	 *
	 * @param id the primary key for the new clinical note template
	 * @return the new clinical note template
	 */
	@Override
	public ClinicalNoteTemplate create(int id) {
		ClinicalNoteTemplate clinicalNoteTemplate = new ClinicalNoteTemplateImpl();

		clinicalNoteTemplate.setNew(true);
		clinicalNoteTemplate.setPrimaryKey(id);

		return clinicalNoteTemplate;
	}

	/**
	 * Removes the clinical note template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clinical note template
	 * @return the clinical note template that was removed
	 * @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate remove(int id)
		throws NoSuchClinicalNoteTemplateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the clinical note template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clinical note template
	 * @return the clinical note template that was removed
	 * @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate remove(Serializable primaryKey)
		throws NoSuchClinicalNoteTemplateException {
		Session session = null;

		try {
			session = openSession();

			ClinicalNoteTemplate clinicalNoteTemplate = (ClinicalNoteTemplate)session.get(ClinicalNoteTemplateImpl.class,
					primaryKey);

			if (clinicalNoteTemplate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchClinicalNoteTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(clinicalNoteTemplate);
		}
		catch (NoSuchClinicalNoteTemplateException nsee) {
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
	protected ClinicalNoteTemplate removeImpl(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		clinicalNoteTemplate = toUnwrappedModel(clinicalNoteTemplate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(clinicalNoteTemplate)) {
				clinicalNoteTemplate = (ClinicalNoteTemplate)session.get(ClinicalNoteTemplateImpl.class,
						clinicalNoteTemplate.getPrimaryKeyObj());
			}

			if (clinicalNoteTemplate != null) {
				session.delete(clinicalNoteTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (clinicalNoteTemplate != null) {
			clearCache(clinicalNoteTemplate);
		}

		return clinicalNoteTemplate;
	}

	@Override
	public ClinicalNoteTemplate updateImpl(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		clinicalNoteTemplate = toUnwrappedModel(clinicalNoteTemplate);

		boolean isNew = clinicalNoteTemplate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (clinicalNoteTemplate.isNew()) {
				session.save(clinicalNoteTemplate);

				clinicalNoteTemplate.setNew(false);
			}
			else {
				clinicalNoteTemplate = (ClinicalNoteTemplate)session.merge(clinicalNoteTemplate);
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

		entityCache.putResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
			ClinicalNoteTemplateImpl.class,
			clinicalNoteTemplate.getPrimaryKey(), clinicalNoteTemplate, false);

		clinicalNoteTemplate.resetOriginalValues();

		return clinicalNoteTemplate;
	}

	protected ClinicalNoteTemplate toUnwrappedModel(
		ClinicalNoteTemplate clinicalNoteTemplate) {
		if (clinicalNoteTemplate instanceof ClinicalNoteTemplateImpl) {
			return clinicalNoteTemplate;
		}

		ClinicalNoteTemplateImpl clinicalNoteTemplateImpl = new ClinicalNoteTemplateImpl();

		clinicalNoteTemplateImpl.setNew(clinicalNoteTemplate.isNew());
		clinicalNoteTemplateImpl.setPrimaryKey(clinicalNoteTemplate.getPrimaryKey());

		clinicalNoteTemplateImpl.setId(clinicalNoteTemplate.getId());
		clinicalNoteTemplateImpl.setUserId(clinicalNoteTemplate.getUserId());
		clinicalNoteTemplateImpl.setTemplateTypeCodeId(clinicalNoteTemplate.getTemplateTypeCodeId());
		clinicalNoteTemplateImpl.setTemplateName(clinicalNoteTemplate.getTemplateName());
		clinicalNoteTemplateImpl.setTemplateContent(clinicalNoteTemplate.getTemplateContent());
		clinicalNoteTemplateImpl.setTemplateContentHtml(clinicalNoteTemplate.getTemplateContentHtml());
		clinicalNoteTemplateImpl.setCreateDate(clinicalNoteTemplate.getCreateDate());
		clinicalNoteTemplateImpl.setUpdateDate(clinicalNoteTemplate.getUpdateDate());
		clinicalNoteTemplateImpl.setCreatedBy(clinicalNoteTemplate.getCreatedBy());
		clinicalNoteTemplateImpl.setUpdatedBy(clinicalNoteTemplate.getUpdatedBy());

		return clinicalNoteTemplateImpl;
	}

	/**
	 * Returns the clinical note template with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clinical note template
	 * @return the clinical note template
	 * @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchClinicalNoteTemplateException {
		ClinicalNoteTemplate clinicalNoteTemplate = fetchByPrimaryKey(primaryKey);

		if (clinicalNoteTemplate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchClinicalNoteTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return clinicalNoteTemplate;
	}

	/**
	 * Returns the clinical note template with the primary key or throws a {@link NoSuchClinicalNoteTemplateException} if it could not be found.
	 *
	 * @param id the primary key of the clinical note template
	 * @return the clinical note template
	 * @throws NoSuchClinicalNoteTemplateException if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate findByPrimaryKey(int id)
		throws NoSuchClinicalNoteTemplateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the clinical note template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clinical note template
	 * @return the clinical note template, or <code>null</code> if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
				ClinicalNoteTemplateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ClinicalNoteTemplate clinicalNoteTemplate = (ClinicalNoteTemplate)serializable;

		if (clinicalNoteTemplate == null) {
			Session session = null;

			try {
				session = openSession();

				clinicalNoteTemplate = (ClinicalNoteTemplate)session.get(ClinicalNoteTemplateImpl.class,
						primaryKey);

				if (clinicalNoteTemplate != null) {
					cacheResult(clinicalNoteTemplate);
				}
				else {
					entityCache.putResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
						ClinicalNoteTemplateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
					ClinicalNoteTemplateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return clinicalNoteTemplate;
	}

	/**
	 * Returns the clinical note template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the clinical note template
	 * @return the clinical note template, or <code>null</code> if a clinical note template with the primary key could not be found
	 */
	@Override
	public ClinicalNoteTemplate fetchByPrimaryKey(int id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ClinicalNoteTemplate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ClinicalNoteTemplate> map = new HashMap<Serializable, ClinicalNoteTemplate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ClinicalNoteTemplate clinicalNoteTemplate = fetchByPrimaryKey(primaryKey);

			if (clinicalNoteTemplate != null) {
				map.put(primaryKey, clinicalNoteTemplate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
					ClinicalNoteTemplateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ClinicalNoteTemplate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CLINICALNOTETEMPLATE_WHERE_PKS_IN);

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

			for (ClinicalNoteTemplate clinicalNoteTemplate : (List<ClinicalNoteTemplate>)q.list()) {
				map.put(clinicalNoteTemplate.getPrimaryKeyObj(),
					clinicalNoteTemplate);

				cacheResult(clinicalNoteTemplate);

				uncachedPrimaryKeys.remove(clinicalNoteTemplate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ClinicalNoteTemplateModelImpl.ENTITY_CACHE_ENABLED,
					ClinicalNoteTemplateImpl.class, primaryKey, nullModel);
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
	 * Returns all the clinical note templates.
	 *
	 * @return the clinical note templates
	 */
	@Override
	public List<ClinicalNoteTemplate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clinical note templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clinical note templates
	 * @param end the upper bound of the range of clinical note templates (not inclusive)
	 * @return the range of clinical note templates
	 */
	@Override
	public List<ClinicalNoteTemplate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the clinical note templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clinical note templates
	 * @param end the upper bound of the range of clinical note templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clinical note templates
	 */
	@Override
	public List<ClinicalNoteTemplate> findAll(int start, int end,
		OrderByComparator<ClinicalNoteTemplate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clinical note templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClinicalNoteTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clinical note templates
	 * @param end the upper bound of the range of clinical note templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of clinical note templates
	 */
	@Override
	public List<ClinicalNoteTemplate> findAll(int start, int end,
		OrderByComparator<ClinicalNoteTemplate> orderByComparator,
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

		List<ClinicalNoteTemplate> list = null;

		if (retrieveFromCache) {
			list = (List<ClinicalNoteTemplate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CLINICALNOTETEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLINICALNOTETEMPLATE;

				if (pagination) {
					sql = sql.concat(ClinicalNoteTemplateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ClinicalNoteTemplate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClinicalNoteTemplate>)QueryUtil.list(q,
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
	 * Removes all the clinical note templates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ClinicalNoteTemplate clinicalNoteTemplate : findAll()) {
			remove(clinicalNoteTemplate);
		}
	}

	/**
	 * Returns the number of clinical note templates.
	 *
	 * @return the number of clinical note templates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CLINICALNOTETEMPLATE);

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
		return ClinicalNoteTemplateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the clinical note template persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ClinicalNoteTemplateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CLINICALNOTETEMPLATE = "SELECT clinicalNoteTemplate FROM ClinicalNoteTemplate clinicalNoteTemplate";
	private static final String _SQL_SELECT_CLINICALNOTETEMPLATE_WHERE_PKS_IN = "SELECT clinicalNoteTemplate FROM ClinicalNoteTemplate clinicalNoteTemplate WHERE id_ IN (";
	private static final String _SQL_COUNT_CLINICALNOTETEMPLATE = "SELECT COUNT(clinicalNoteTemplate) FROM ClinicalNoteTemplate clinicalNoteTemplate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "clinicalNoteTemplate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ClinicalNoteTemplate exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ClinicalNoteTemplatePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}