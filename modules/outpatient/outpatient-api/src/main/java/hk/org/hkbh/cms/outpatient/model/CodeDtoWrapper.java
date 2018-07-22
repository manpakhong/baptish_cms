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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CodeDto}.
 * </p>
 *
 * @author Dave Man
 * @see CodeDto
 * @generated
 */
@ProviderType
public class CodeDtoWrapper implements CodeDto, ModelWrapper<CodeDto> {
	public CodeDtoWrapper(CodeDto codeDto) {
		_codeDto = codeDto;
	}

	@Override
	public Class<?> getModelClass() {
		return CodeDto.class;
	}

	@Override
	public String getModelClassName() {
		return CodeDto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("masterCode", getMasterCode());
		attributes.put("codeDisplayText", getCodeDisplayText());
		attributes.put("codeActive", getCodeActive());
		attributes.put("subcodeEnabled", getSubcodeEnabled());
		attributes.put("codeRemarks", getCodeRemarks());
		attributes.put("detailCode", getDetailCode());
		attributes.put("seq", getSeq());
		attributes.put("codeDetailDisplayText", getCodeDetailDisplayText());
		attributes.put("codeDetailActive", getCodeDetailActive());
		attributes.put("level", getLevel());
		attributes.put("upLevelId", getUpLevelId());
		attributes.put("codeDetailRemarks", getCodeDetailRemarks());
		attributes.put("createDate", getCreateDate());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String masterCode = (String)attributes.get("masterCode");

		if (masterCode != null) {
			setMasterCode(masterCode);
		}

		String codeDisplayText = (String)attributes.get("codeDisplayText");

		if (codeDisplayText != null) {
			setCodeDisplayText(codeDisplayText);
		}

		Boolean codeActive = (Boolean)attributes.get("codeActive");

		if (codeActive != null) {
			setCodeActive(codeActive);
		}

		Boolean subcodeEnabled = (Boolean)attributes.get("subcodeEnabled");

		if (subcodeEnabled != null) {
			setSubcodeEnabled(subcodeEnabled);
		}

		String codeRemarks = (String)attributes.get("codeRemarks");

		if (codeRemarks != null) {
			setCodeRemarks(codeRemarks);
		}

		String detailCode = (String)attributes.get("detailCode");

		if (detailCode != null) {
			setDetailCode(detailCode);
		}

		Integer seq = (Integer)attributes.get("seq");

		if (seq != null) {
			setSeq(seq);
		}

		String codeDetailDisplayText = (String)attributes.get(
				"codeDetailDisplayText");

		if (codeDetailDisplayText != null) {
			setCodeDetailDisplayText(codeDetailDisplayText);
		}

		Boolean codeDetailActive = (Boolean)attributes.get("codeDetailActive");

		if (codeDetailActive != null) {
			setCodeDetailActive(codeDetailActive);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Integer upLevelId = (Integer)attributes.get("upLevelId");

		if (upLevelId != null) {
			setUpLevelId(upLevelId);
		}

		String codeDetailRemarks = (String)attributes.get("codeDetailRemarks");

		if (codeDetailRemarks != null) {
			setCodeDetailRemarks(codeDetailRemarks);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new CodeDtoWrapper((CodeDto)_codeDto.clone());
	}

	@Override
	public int compareTo(CodeDto codeDto) {
		return _codeDto.compareTo(codeDto);
	}

	/**
	* Returns the code active of this code dto.
	*
	* @return the code active of this code dto
	*/
	@Override
	public java.lang.Boolean getCodeActive() {
		return _codeDto.getCodeActive();
	}

	/**
	* Returns the code detail active of this code dto.
	*
	* @return the code detail active of this code dto
	*/
	@Override
	public java.lang.Boolean getCodeDetailActive() {
		return _codeDto.getCodeDetailActive();
	}

	/**
	* Returns the code detail display text of this code dto.
	*
	* @return the code detail display text of this code dto
	*/
	@Override
	public java.lang.String getCodeDetailDisplayText() {
		return _codeDto.getCodeDetailDisplayText();
	}

	/**
	* Returns the code detail remarks of this code dto.
	*
	* @return the code detail remarks of this code dto
	*/
	@Override
	public java.lang.String getCodeDetailRemarks() {
		return _codeDto.getCodeDetailRemarks();
	}

	/**
	* Returns the code display text of this code dto.
	*
	* @return the code display text of this code dto
	*/
	@Override
	public java.lang.String getCodeDisplayText() {
		return _codeDto.getCodeDisplayText();
	}

	/**
	* Returns the code remarks of this code dto.
	*
	* @return the code remarks of this code dto
	*/
	@Override
	public java.lang.String getCodeRemarks() {
		return _codeDto.getCodeRemarks();
	}

	/**
	* Returns the create date of this code dto.
	*
	* @return the create date of this code dto
	*/
	@Override
	public Date getCreateDate() {
		return _codeDto.getCreateDate();
	}

	/**
	* Returns the created by of this code dto.
	*
	* @return the created by of this code dto
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _codeDto.getCreatedBy();
	}

	/**
	* Returns the detail code of this code dto.
	*
	* @return the detail code of this code dto
	*/
	@Override
	public java.lang.String getDetailCode() {
		return _codeDto.getDetailCode();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _codeDto.getExpandoBridge();
	}

	/**
	* Returns the ID of this code dto.
	*
	* @return the ID of this code dto
	*/
	@Override
	public int getId() {
		return _codeDto.getId();
	}

	/**
	* Returns the level of this code dto.
	*
	* @return the level of this code dto
	*/
	@Override
	public java.lang.Integer getLevel() {
		return _codeDto.getLevel();
	}

	/**
	* Returns the master code of this code dto.
	*
	* @return the master code of this code dto
	*/
	@Override
	public java.lang.String getMasterCode() {
		return _codeDto.getMasterCode();
	}

	/**
	* Returns the primary key of this code dto.
	*
	* @return the primary key of this code dto
	*/
	@Override
	public int getPrimaryKey() {
		return _codeDto.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _codeDto.getPrimaryKeyObj();
	}

	/**
	* Returns the seq of this code dto.
	*
	* @return the seq of this code dto
	*/
	@Override
	public java.lang.Integer getSeq() {
		return _codeDto.getSeq();
	}

	/**
	* Returns the subcode enabled of this code dto.
	*
	* @return the subcode enabled of this code dto
	*/
	@Override
	public java.lang.Boolean getSubcodeEnabled() {
		return _codeDto.getSubcodeEnabled();
	}

	/**
	* Returns the update date of this code dto.
	*
	* @return the update date of this code dto
	*/
	@Override
	public Date getUpdateDate() {
		return _codeDto.getUpdateDate();
	}

	/**
	* Returns the updated by of this code dto.
	*
	* @return the updated by of this code dto
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _codeDto.getUpdatedBy();
	}

	/**
	* Returns the up level ID of this code dto.
	*
	* @return the up level ID of this code dto
	*/
	@Override
	public java.lang.Integer getUpLevelId() {
		return _codeDto.getUpLevelId();
	}

	@Override
	public int hashCode() {
		return _codeDto.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _codeDto.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _codeDto.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _codeDto.isNew();
	}

	@Override
	public void persist() {
		_codeDto.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_codeDto.setCachedModel(cachedModel);
	}

	/**
	* Sets the code active of this code dto.
	*
	* @param codeActive the code active of this code dto
	*/
	@Override
	public void setCodeActive(java.lang.Boolean codeActive) {
		_codeDto.setCodeActive(codeActive);
	}

	/**
	* Sets the code detail active of this code dto.
	*
	* @param codeDetailActive the code detail active of this code dto
	*/
	@Override
	public void setCodeDetailActive(java.lang.Boolean codeDetailActive) {
		_codeDto.setCodeDetailActive(codeDetailActive);
	}

	/**
	* Sets the code detail display text of this code dto.
	*
	* @param codeDetailDisplayText the code detail display text of this code dto
	*/
	@Override
	public void setCodeDetailDisplayText(java.lang.String codeDetailDisplayText) {
		_codeDto.setCodeDetailDisplayText(codeDetailDisplayText);
	}

	/**
	* Sets the code detail remarks of this code dto.
	*
	* @param codeDetailRemarks the code detail remarks of this code dto
	*/
	@Override
	public void setCodeDetailRemarks(java.lang.String codeDetailRemarks) {
		_codeDto.setCodeDetailRemarks(codeDetailRemarks);
	}

	/**
	* Sets the code display text of this code dto.
	*
	* @param codeDisplayText the code display text of this code dto
	*/
	@Override
	public void setCodeDisplayText(java.lang.String codeDisplayText) {
		_codeDto.setCodeDisplayText(codeDisplayText);
	}

	/**
	* Sets the code remarks of this code dto.
	*
	* @param codeRemarks the code remarks of this code dto
	*/
	@Override
	public void setCodeRemarks(java.lang.String codeRemarks) {
		_codeDto.setCodeRemarks(codeRemarks);
	}

	/**
	* Sets the create date of this code dto.
	*
	* @param createDate the create date of this code dto
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_codeDto.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this code dto.
	*
	* @param createdBy the created by of this code dto
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_codeDto.setCreatedBy(createdBy);
	}

	/**
	* Sets the detail code of this code dto.
	*
	* @param detailCode the detail code of this code dto
	*/
	@Override
	public void setDetailCode(java.lang.String detailCode) {
		_codeDto.setDetailCode(detailCode);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_codeDto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_codeDto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_codeDto.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this code dto.
	*
	* @param id the ID of this code dto
	*/
	@Override
	public void setId(int id) {
		_codeDto.setId(id);
	}

	/**
	* Sets the level of this code dto.
	*
	* @param level the level of this code dto
	*/
	@Override
	public void setLevel(java.lang.Integer level) {
		_codeDto.setLevel(level);
	}

	/**
	* Sets the master code of this code dto.
	*
	* @param masterCode the master code of this code dto
	*/
	@Override
	public void setMasterCode(java.lang.String masterCode) {
		_codeDto.setMasterCode(masterCode);
	}

	@Override
	public void setNew(boolean n) {
		_codeDto.setNew(n);
	}

	/**
	* Sets the primary key of this code dto.
	*
	* @param primaryKey the primary key of this code dto
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_codeDto.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_codeDto.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the seq of this code dto.
	*
	* @param seq the seq of this code dto
	*/
	@Override
	public void setSeq(java.lang.Integer seq) {
		_codeDto.setSeq(seq);
	}

	/**
	* Sets the subcode enabled of this code dto.
	*
	* @param subcodeEnabled the subcode enabled of this code dto
	*/
	@Override
	public void setSubcodeEnabled(java.lang.Boolean subcodeEnabled) {
		_codeDto.setSubcodeEnabled(subcodeEnabled);
	}

	/**
	* Sets the update date of this code dto.
	*
	* @param updateDate the update date of this code dto
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_codeDto.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this code dto.
	*
	* @param updatedBy the updated by of this code dto
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_codeDto.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the up level ID of this code dto.
	*
	* @param upLevelId the up level ID of this code dto
	*/
	@Override
	public void setUpLevelId(java.lang.Integer upLevelId) {
		_codeDto.setUpLevelId(upLevelId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CodeDto> toCacheModel() {
		return _codeDto.toCacheModel();
	}

	@Override
	public CodeDto toEscapedModel() {
		return new CodeDtoWrapper(_codeDto.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _codeDto.toString();
	}

	@Override
	public CodeDto toUnescapedModel() {
		return new CodeDtoWrapper(_codeDto.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _codeDto.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CodeDtoWrapper)) {
			return false;
		}

		CodeDtoWrapper codeDtoWrapper = (CodeDtoWrapper)obj;

		if (Objects.equals(_codeDto, codeDtoWrapper._codeDto)) {
			return true;
		}

		return false;
	}

	@Override
	public CodeDto getWrappedModel() {
		return _codeDto;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _codeDto.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _codeDto.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_codeDto.resetOriginalValues();
	}

	private final CodeDto _codeDto;
}