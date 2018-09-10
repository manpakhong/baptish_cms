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

package hk.org.hkbh.cms.outpatient.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ComponentDto service. Represents a row in the &quot;Op_ComponentDto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoImpl}.
 * </p>
 *
 * @author Dave Man
 * @see ComponentDto
 * @see hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoImpl
 * @see hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoModelImpl
 * @generated
 */
@ProviderType
public interface ComponentDtoModel extends BaseModel<ComponentDto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a component dto model instance should use the {@link ComponentDto} interface instead.
	 */

	/**
	 * Returns the primary key of this component dto.
	 *
	 * @return the primary key of this component dto
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this component dto.
	 *
	 * @param primaryKey the primary key of this component dto
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this component dto.
	 *
	 * @return the ID of this component dto
	 */
	public long getId();

	/**
	 * Sets the ID of this component dto.
	 *
	 * @param id the ID of this component dto
	 */
	public void setId(long id);

	/**
	 * Returns the component code of this component dto.
	 *
	 * @return the component code of this component dto
	 */
	@AutoEscape
	public String getComponentCode();

	/**
	 * Sets the component code of this component dto.
	 *
	 * @param componentCode the component code of this component dto
	 */
	public void setComponentCode(String componentCode);

	/**
	 * Returns the component name of this component dto.
	 *
	 * @return the component name of this component dto
	 */
	@AutoEscape
	public String getComponentName();

	/**
	 * Sets the component name of this component dto.
	 *
	 * @param componentName the component name of this component dto
	 */
	public void setComponentName(String componentName);

	/**
	 * Returns the component type code ID of this component dto.
	 *
	 * @return the component type code ID of this component dto
	 */
	public Long getComponentTypeCodeId();

	/**
	 * Sets the component type code ID of this component dto.
	 *
	 * @param componentTypeCodeId the component type code ID of this component dto
	 */
	public void setComponentTypeCodeId(Long componentTypeCodeId);

	/**
	 * Returns the detail code of this component dto.
	 *
	 * @return the detail code of this component dto
	 */
	@AutoEscape
	public String getDetailCode();

	/**
	 * Sets the detail code of this component dto.
	 *
	 * @param detailCode the detail code of this component dto
	 */
	public void setDetailCode(String detailCode);

	/**
	 * Returns the code detail seq of this component dto.
	 *
	 * @return the code detail seq of this component dto
	 */
	public Integer getCodeDetailSeq();

	/**
	 * Sets the code detail seq of this component dto.
	 *
	 * @param codeDetailSeq the code detail seq of this component dto
	 */
	public void setCodeDetailSeq(Integer codeDetailSeq);

	/**
	 * Returns the code detail display text en of this component dto.
	 *
	 * @return the code detail display text en of this component dto
	 */
	@AutoEscape
	public String getCodeDetailDisplayTextEn();

	/**
	 * Sets the code detail display text en of this component dto.
	 *
	 * @param codeDetailDisplayTextEn the code detail display text en of this component dto
	 */
	public void setCodeDetailDisplayTextEn(String codeDetailDisplayTextEn);

	/**
	 * Returns the code detail display text chi of this component dto.
	 *
	 * @return the code detail display text chi of this component dto
	 */
	@AutoEscape
	public String getCodeDetailDisplayTextChi();

	/**
	 * Sets the code detail display text chi of this component dto.
	 *
	 * @param codeDetailDisplayTextChi the code detail display text chi of this component dto
	 */
	public void setCodeDetailDisplayTextChi(String codeDetailDisplayTextChi);

	/**
	 * Returns the component seq of this component dto.
	 *
	 * @return the component seq of this component dto
	 */
	public Integer getComponentSeq();

	/**
	 * Sets the component seq of this component dto.
	 *
	 * @param componentSeq the component seq of this component dto
	 */
	public void setComponentSeq(Integer componentSeq);

	/**
	 * Returns the is menu item of this component dto.
	 *
	 * @return the is menu item of this component dto
	 */
	public Boolean getIsMenuItem();

	/**
	 * Sets the is menu item of this component dto.
	 *
	 * @param isMenuItem the is menu item of this component dto
	 */
	public void setIsMenuItem(Boolean isMenuItem);

	/**
	 * Returns the component desc of this component dto.
	 *
	 * @return the component desc of this component dto
	 */
	@AutoEscape
	public String getComponentDesc();

	/**
	 * Sets the component desc of this component dto.
	 *
	 * @param componentDesc the component desc of this component dto
	 */
	public void setComponentDesc(String componentDesc);

	/**
	 * Returns the url of this component dto.
	 *
	 * @return the url of this component dto
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this component dto.
	 *
	 * @param url the url of this component dto
	 */
	public void setUrl(String url);

	/**
	 * Returns the component level of this component dto.
	 *
	 * @return the component level of this component dto
	 */
	public Integer getComponentLevel();

	/**
	 * Sets the component level of this component dto.
	 *
	 * @param componentLevel the component level of this component dto
	 */
	public void setComponentLevel(Integer componentLevel);

	/**
	 * Returns the up component ID of this component dto.
	 *
	 * @return the up component ID of this component dto
	 */
	public Long getUpComponentId();

	/**
	 * Sets the up component ID of this component dto.
	 *
	 * @param upComponentId the up component ID of this component dto
	 */
	public void setUpComponentId(Long upComponentId);

	/**
	 * Returns the create date of this component dto.
	 *
	 * @return the create date of this component dto
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this component dto.
	 *
	 * @param createDate the create date of this component dto
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the update date of this component dto.
	 *
	 * @return the update date of this component dto
	 */
	public Date getUpdateDate();

	/**
	 * Sets the update date of this component dto.
	 *
	 * @param updateDate the update date of this component dto
	 */
	public void setUpdateDate(Date updateDate);

	/**
	 * Returns the created by of this component dto.
	 *
	 * @return the created by of this component dto
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this component dto.
	 *
	 * @param createdBy the created by of this component dto
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the updated by of this component dto.
	 *
	 * @return the updated by of this component dto
	 */
	@AutoEscape
	public String getUpdatedBy();

	/**
	 * Sets the updated by of this component dto.
	 *
	 * @param updatedBy the updated by of this component dto
	 */
	public void setUpdatedBy(String updatedBy);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ComponentDto componentDto);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ComponentDto> toCacheModel();

	@Override
	public ComponentDto toEscapedModel();

	@Override
	public ComponentDto toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}