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

import hk.org.hkbh.cms.outpatient.exception.NoSuchComponentControlDtoException;
import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoImpl;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoModelImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlDtoPersistence;

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
 * The persistence implementation for the component control dto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Dave Man
 * @see ComponentControlDtoPersistence
 * @see hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlDtoUtil
 * @generated
 */
@ProviderType
public class ComponentControlDtoPersistenceImpl extends BasePersistenceImpl<ComponentControlDto>
	implements ComponentControlDtoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ComponentControlDtoUtil} to access the component control dto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ComponentControlDtoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlDtoModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlDtoModelImpl.FINDER_CACHE_ENABLED,
			ComponentControlDtoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlDtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ComponentControlDtoPersistenceImpl() {
		setModelClass(ComponentControlDto.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("componentCode", "component_code");
			dbColumnNames.put("componentName", "component_name");
			dbColumnNames.put("componentTypeCodeId", "component_type_code_id");
			dbColumnNames.put("detailCode", "detail_code");
			dbColumnNames.put("detailCodeDisplayTextEn",
				"detail_code_display_text_en");
			dbColumnNames.put("detailCodeDisplayTextChi",
				"detail_code_display_text_chi");
			dbColumnNames.put("componentSeq", "component_seq");
			dbColumnNames.put("isMenuItem", "is_menu_item");
			dbColumnNames.put("componentDesc", "component_desc");
			dbColumnNames.put("componentLevel", "component_level");
			dbColumnNames.put("upComponentId", "up_component_id");
			dbColumnNames.put("componentControlId", "component_control_id");
			dbColumnNames.put("userId", "user_id");
			dbColumnNames.put("userRoleId", "user_role_id");
			dbColumnNames.put("componentId", "component_id");
			dbColumnNames.put("controlDesc", "control_desc");
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
	 * Caches the component control dto in the entity cache if it is enabled.
	 *
	 * @param componentControlDto the component control dto
	 */
	@Override
	public void cacheResult(ComponentControlDto componentControlDto) {
		entityCache.putResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlDtoImpl.class, componentControlDto.getPrimaryKey(),
			componentControlDto);

		componentControlDto.resetOriginalValues();
	}

	/**
	 * Caches the component control dtos in the entity cache if it is enabled.
	 *
	 * @param componentControlDtos the component control dtos
	 */
	@Override
	public void cacheResult(List<ComponentControlDto> componentControlDtos) {
		for (ComponentControlDto componentControlDto : componentControlDtos) {
			if (entityCache.getResult(
						ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
						ComponentControlDtoImpl.class,
						componentControlDto.getPrimaryKey()) == null) {
				cacheResult(componentControlDto);
			}
			else {
				componentControlDto.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all component control dtos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ComponentControlDtoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the component control dto.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ComponentControlDto componentControlDto) {
		entityCache.removeResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlDtoImpl.class, componentControlDto.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ComponentControlDto> componentControlDtos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ComponentControlDto componentControlDto : componentControlDtos) {
			entityCache.removeResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
				ComponentControlDtoImpl.class,
				componentControlDto.getPrimaryKey());
		}
	}

	/**
	 * Creates a new component control dto with the primary key. Does not add the component control dto to the database.
	 *
	 * @param id the primary key for the new component control dto
	 * @return the new component control dto
	 */
	@Override
	public ComponentControlDto create(int id) {
		ComponentControlDto componentControlDto = new ComponentControlDtoImpl();

		componentControlDto.setNew(true);
		componentControlDto.setPrimaryKey(id);

		return componentControlDto;
	}

	/**
	 * Removes the component control dto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the component control dto
	 * @return the component control dto that was removed
	 * @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	 */
	@Override
	public ComponentControlDto remove(int id)
		throws NoSuchComponentControlDtoException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the component control dto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the component control dto
	 * @return the component control dto that was removed
	 * @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	 */
	@Override
	public ComponentControlDto remove(Serializable primaryKey)
		throws NoSuchComponentControlDtoException {
		Session session = null;

		try {
			session = openSession();

			ComponentControlDto componentControlDto = (ComponentControlDto)session.get(ComponentControlDtoImpl.class,
					primaryKey);

			if (componentControlDto == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchComponentControlDtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(componentControlDto);
		}
		catch (NoSuchComponentControlDtoException nsee) {
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
	protected ComponentControlDto removeImpl(
		ComponentControlDto componentControlDto) {
		componentControlDto = toUnwrappedModel(componentControlDto);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(componentControlDto)) {
				componentControlDto = (ComponentControlDto)session.get(ComponentControlDtoImpl.class,
						componentControlDto.getPrimaryKeyObj());
			}

			if (componentControlDto != null) {
				session.delete(componentControlDto);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (componentControlDto != null) {
			clearCache(componentControlDto);
		}

		return componentControlDto;
	}

	@Override
	public ComponentControlDto updateImpl(
		ComponentControlDto componentControlDto) {
		componentControlDto = toUnwrappedModel(componentControlDto);

		boolean isNew = componentControlDto.isNew();

		Session session = null;

		try {
			session = openSession();

			if (componentControlDto.isNew()) {
				session.save(componentControlDto);

				componentControlDto.setNew(false);
			}
			else {
				componentControlDto = (ComponentControlDto)session.merge(componentControlDto);
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

		entityCache.putResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
			ComponentControlDtoImpl.class, componentControlDto.getPrimaryKey(),
			componentControlDto, false);

		componentControlDto.resetOriginalValues();

		return componentControlDto;
	}

	protected ComponentControlDto toUnwrappedModel(
		ComponentControlDto componentControlDto) {
		if (componentControlDto instanceof ComponentControlDtoImpl) {
			return componentControlDto;
		}

		ComponentControlDtoImpl componentControlDtoImpl = new ComponentControlDtoImpl();

		componentControlDtoImpl.setNew(componentControlDto.isNew());
		componentControlDtoImpl.setPrimaryKey(componentControlDto.getPrimaryKey());

		componentControlDtoImpl.setId(componentControlDto.getId());
		componentControlDtoImpl.setComponentCode(componentControlDto.getComponentCode());
		componentControlDtoImpl.setComponentName(componentControlDto.getComponentName());
		componentControlDtoImpl.setComponentTypeCodeId(componentControlDto.getComponentTypeCodeId());
		componentControlDtoImpl.setDetailCode(componentControlDto.getDetailCode());
		componentControlDtoImpl.setDetailCodeDisplayTextEn(componentControlDto.getDetailCodeDisplayTextEn());
		componentControlDtoImpl.setDetailCodeDisplayTextChi(componentControlDto.getDetailCodeDisplayTextChi());
		componentControlDtoImpl.setComponentSeq(componentControlDto.getComponentSeq());
		componentControlDtoImpl.setIsMenuItem(componentControlDto.getIsMenuItem());
		componentControlDtoImpl.setComponentDesc(componentControlDto.getComponentDesc());
		componentControlDtoImpl.setUrl(componentControlDto.getUrl());
		componentControlDtoImpl.setComponentLevel(componentControlDto.getComponentLevel());
		componentControlDtoImpl.setUpComponentId(componentControlDto.getUpComponentId());
		componentControlDtoImpl.setComponentControlId(componentControlDto.getComponentControlId());
		componentControlDtoImpl.setUserId(componentControlDto.getUserId());
		componentControlDtoImpl.setUserRoleId(componentControlDto.getUserRoleId());
		componentControlDtoImpl.setComponentId(componentControlDto.getComponentId());
		componentControlDtoImpl.setCreate(componentControlDto.getCreate());
		componentControlDtoImpl.setRead(componentControlDto.getRead());
		componentControlDtoImpl.setUpdate(componentControlDto.getUpdate());
		componentControlDtoImpl.setDelete(componentControlDto.getDelete());
		componentControlDtoImpl.setDeny(componentControlDto.getDeny());
		componentControlDtoImpl.setVisible(componentControlDto.getVisible());
		componentControlDtoImpl.setEnable(componentControlDto.getEnable());
		componentControlDtoImpl.setControlDesc(componentControlDto.getControlDesc());
		componentControlDtoImpl.setCreateDate(componentControlDto.getCreateDate());
		componentControlDtoImpl.setUpdateDate(componentControlDto.getUpdateDate());
		componentControlDtoImpl.setCreatedBy(componentControlDto.getCreatedBy());
		componentControlDtoImpl.setUpdatedBy(componentControlDto.getUpdatedBy());

		return componentControlDtoImpl;
	}

	/**
	 * Returns the component control dto with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the component control dto
	 * @return the component control dto
	 * @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	 */
	@Override
	public ComponentControlDto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchComponentControlDtoException {
		ComponentControlDto componentControlDto = fetchByPrimaryKey(primaryKey);

		if (componentControlDto == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchComponentControlDtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return componentControlDto;
	}

	/**
	 * Returns the component control dto with the primary key or throws a {@link NoSuchComponentControlDtoException} if it could not be found.
	 *
	 * @param id the primary key of the component control dto
	 * @return the component control dto
	 * @throws NoSuchComponentControlDtoException if a component control dto with the primary key could not be found
	 */
	@Override
	public ComponentControlDto findByPrimaryKey(int id)
		throws NoSuchComponentControlDtoException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the component control dto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the component control dto
	 * @return the component control dto, or <code>null</code> if a component control dto with the primary key could not be found
	 */
	@Override
	public ComponentControlDto fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
				ComponentControlDtoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ComponentControlDto componentControlDto = (ComponentControlDto)serializable;

		if (componentControlDto == null) {
			Session session = null;

			try {
				session = openSession();

				componentControlDto = (ComponentControlDto)session.get(ComponentControlDtoImpl.class,
						primaryKey);

				if (componentControlDto != null) {
					cacheResult(componentControlDto);
				}
				else {
					entityCache.putResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
						ComponentControlDtoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
					ComponentControlDtoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return componentControlDto;
	}

	/**
	 * Returns the component control dto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the component control dto
	 * @return the component control dto, or <code>null</code> if a component control dto with the primary key could not be found
	 */
	@Override
	public ComponentControlDto fetchByPrimaryKey(int id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ComponentControlDto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ComponentControlDto> map = new HashMap<Serializable, ComponentControlDto>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ComponentControlDto componentControlDto = fetchByPrimaryKey(primaryKey);

			if (componentControlDto != null) {
				map.put(primaryKey, componentControlDto);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
					ComponentControlDtoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ComponentControlDto)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COMPONENTCONTROLDTO_WHERE_PKS_IN);

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

			for (ComponentControlDto componentControlDto : (List<ComponentControlDto>)q.list()) {
				map.put(componentControlDto.getPrimaryKeyObj(),
					componentControlDto);

				cacheResult(componentControlDto);

				uncachedPrimaryKeys.remove(componentControlDto.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ComponentControlDtoModelImpl.ENTITY_CACHE_ENABLED,
					ComponentControlDtoImpl.class, primaryKey, nullModel);
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
	 * Returns all the component control dtos.
	 *
	 * @return the component control dtos
	 */
	@Override
	public List<ComponentControlDto> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the component control dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component control dtos
	 * @param end the upper bound of the range of component control dtos (not inclusive)
	 * @return the range of component control dtos
	 */
	@Override
	public List<ComponentControlDto> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the component control dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component control dtos
	 * @param end the upper bound of the range of component control dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of component control dtos
	 */
	@Override
	public List<ComponentControlDto> findAll(int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the component control dtos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ComponentControlDtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of component control dtos
	 * @param end the upper bound of the range of component control dtos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of component control dtos
	 */
	@Override
	public List<ComponentControlDto> findAll(int start, int end,
		OrderByComparator<ComponentControlDto> orderByComparator,
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

		List<ComponentControlDto> list = null;

		if (retrieveFromCache) {
			list = (List<ComponentControlDto>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COMPONENTCONTROLDTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPONENTCONTROLDTO;

				if (pagination) {
					sql = sql.concat(ComponentControlDtoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ComponentControlDto>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ComponentControlDto>)QueryUtil.list(q,
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
	 * Removes all the component control dtos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ComponentControlDto componentControlDto : findAll()) {
			remove(componentControlDto);
		}
	}

	/**
	 * Returns the number of component control dtos.
	 *
	 * @return the number of component control dtos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMPONENTCONTROLDTO);

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
		return ComponentControlDtoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the component control dto persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ComponentControlDtoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COMPONENTCONTROLDTO = "SELECT componentControlDto FROM ComponentControlDto componentControlDto";
	private static final String _SQL_SELECT_COMPONENTCONTROLDTO_WHERE_PKS_IN = "SELECT componentControlDto FROM ComponentControlDto componentControlDto WHERE id IN (";
	private static final String _SQL_COUNT_COMPONENTCONTROLDTO = "SELECT COUNT(componentControlDto) FROM ComponentControlDto componentControlDto";
	private static final String _ORDER_BY_ENTITY_ALIAS = "componentControlDto.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ComponentControlDto exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ComponentControlDtoPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"componentCode", "componentName", "componentTypeCodeId",
				"detailCode", "detailCodeDisplayTextEn",
				"detailCodeDisplayTextChi", "componentSeq", "isMenuItem",
				"componentDesc", "componentLevel", "upComponentId",
				"componentControlId", "userId", "userRoleId", "componentId",
				"controlDesc", "createDate", "updateDate", "createdBy",
				"updatedBy"
			});
}