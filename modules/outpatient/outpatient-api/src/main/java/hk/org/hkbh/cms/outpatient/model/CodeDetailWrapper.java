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
 * This class is a wrapper for {@link CodeDetail}.
 * </p>
 *
 * @author Dave Man
 * @see CodeDetail
 * @generated
 */
@ProviderType
public class CodeDetailWrapper implements CodeDetail, ModelWrapper<CodeDetail> {
	public CodeDetailWrapper(CodeDetail codeDetail) {
		_codeDetail = codeDetail;
	}

	@Override
	public Class<?> getModelClass() {
		return CodeDetail.class;
	}

	@Override
	public String getModelClassName() {
		return CodeDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("codeId", getCodeId());
		attributes.put("detailCode", getDetailCode());
		attributes.put("seq", getSeq());
		attributes.put("displayTextEn", getDisplayTextEn());
		attributes.put("displayTextChi", getDisplayTextChi());
		attributes.put("symbol", getSymbol());
		attributes.put("symbol_html_code", getSymbol_html_code());
		attributes.put("active", getActive());
		attributes.put("level", getLevel());
		attributes.put("upLevelId", getUpLevelId());
		attributes.put("remarks", getRemarks());
		attributes.put("createDate", getCreateDate());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long codeId = (Long)attributes.get("codeId");

		if (codeId != null) {
			setCodeId(codeId);
		}

		String detailCode = (String)attributes.get("detailCode");

		if (detailCode != null) {
			setDetailCode(detailCode);
		}

		Integer seq = (Integer)attributes.get("seq");

		if (seq != null) {
			setSeq(seq);
		}

		String displayTextEn = (String)attributes.get("displayTextEn");

		if (displayTextEn != null) {
			setDisplayTextEn(displayTextEn);
		}

		String displayTextChi = (String)attributes.get("displayTextChi");

		if (displayTextChi != null) {
			setDisplayTextChi(displayTextChi);
		}

		String symbol = (String)attributes.get("symbol");

		if (symbol != null) {
			setSymbol(symbol);
		}

		String symbol_html_code = (String)attributes.get("symbol_html_code");

		if (symbol_html_code != null) {
			setSymbol_html_code(symbol_html_code);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Long upLevelId = (Long)attributes.get("upLevelId");

		if (upLevelId != null) {
			setUpLevelId(upLevelId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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
		return new CodeDetailWrapper((CodeDetail)_codeDetail.clone());
	}

	@Override
	public int compareTo(CodeDetail codeDetail) {
		return _codeDetail.compareTo(codeDetail);
	}

	/**
	* Returns the active of this code detail.
	*
	* @return the active of this code detail
	*/
	@Override
	public java.lang.Boolean getActive() {
		return _codeDetail.getActive();
	}

	/**
	* Returns the code ID of this code detail.
	*
	* @return the code ID of this code detail
	*/
	@Override
	public java.lang.Long getCodeId() {
		return _codeDetail.getCodeId();
	}

	/**
	* Returns the create date of this code detail.
	*
	* @return the create date of this code detail
	*/
	@Override
	public Date getCreateDate() {
		return _codeDetail.getCreateDate();
	}

	/**
	* Returns the created by of this code detail.
	*
	* @return the created by of this code detail
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _codeDetail.getCreatedBy();
	}

	/**
	* Returns the detail code of this code detail.
	*
	* @return the detail code of this code detail
	*/
	@Override
	public java.lang.String getDetailCode() {
		return _codeDetail.getDetailCode();
	}

	/**
	* Returns the display text chi of this code detail.
	*
	* @return the display text chi of this code detail
	*/
	@Override
	public java.lang.String getDisplayTextChi() {
		return _codeDetail.getDisplayTextChi();
	}

	/**
	* Returns the display text en of this code detail.
	*
	* @return the display text en of this code detail
	*/
	@Override
	public java.lang.String getDisplayTextEn() {
		return _codeDetail.getDisplayTextEn();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _codeDetail.getExpandoBridge();
	}

	/**
	* Returns the ID of this code detail.
	*
	* @return the ID of this code detail
	*/
	@Override
	public long getId() {
		return _codeDetail.getId();
	}

	/**
	* Returns the level of this code detail.
	*
	* @return the level of this code detail
	*/
	@Override
	public java.lang.Integer getLevel() {
		return _codeDetail.getLevel();
	}

	/**
	* Returns the primary key of this code detail.
	*
	* @return the primary key of this code detail
	*/
	@Override
	public long getPrimaryKey() {
		return _codeDetail.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _codeDetail.getPrimaryKeyObj();
	}

	/**
	* Returns the remarks of this code detail.
	*
	* @return the remarks of this code detail
	*/
	@Override
	public java.lang.String getRemarks() {
		return _codeDetail.getRemarks();
	}

	/**
	* Returns the seq of this code detail.
	*
	* @return the seq of this code detail
	*/
	@Override
	public java.lang.Integer getSeq() {
		return _codeDetail.getSeq();
	}

	/**
	* Returns the symbol of this code detail.
	*
	* @return the symbol of this code detail
	*/
	@Override
	public java.lang.String getSymbol() {
		return _codeDetail.getSymbol();
	}

	/**
	* Returns the symbol_html_code of this code detail.
	*
	* @return the symbol_html_code of this code detail
	*/
	@Override
	public java.lang.String getSymbol_html_code() {
		return _codeDetail.getSymbol_html_code();
	}

	/**
	* Returns the update date of this code detail.
	*
	* @return the update date of this code detail
	*/
	@Override
	public Date getUpdateDate() {
		return _codeDetail.getUpdateDate();
	}

	/**
	* Returns the updated by of this code detail.
	*
	* @return the updated by of this code detail
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _codeDetail.getUpdatedBy();
	}

	/**
	* Returns the up level ID of this code detail.
	*
	* @return the up level ID of this code detail
	*/
	@Override
	public java.lang.Long getUpLevelId() {
		return _codeDetail.getUpLevelId();
	}

	@Override
	public int hashCode() {
		return _codeDetail.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _codeDetail.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _codeDetail.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _codeDetail.isNew();
	}

	@Override
	public void persist() {
		_codeDetail.persist();
	}

	/**
	* Sets the active of this code detail.
	*
	* @param active the active of this code detail
	*/
	@Override
	public void setActive(java.lang.Boolean active) {
		_codeDetail.setActive(active);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_codeDetail.setCachedModel(cachedModel);
	}

	/**
	* Sets the code ID of this code detail.
	*
	* @param codeId the code ID of this code detail
	*/
	@Override
	public void setCodeId(java.lang.Long codeId) {
		_codeDetail.setCodeId(codeId);
	}

	/**
	* Sets the create date of this code detail.
	*
	* @param createDate the create date of this code detail
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_codeDetail.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this code detail.
	*
	* @param createdBy the created by of this code detail
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_codeDetail.setCreatedBy(createdBy);
	}

	/**
	* Sets the detail code of this code detail.
	*
	* @param detailCode the detail code of this code detail
	*/
	@Override
	public void setDetailCode(java.lang.String detailCode) {
		_codeDetail.setDetailCode(detailCode);
	}

	/**
	* Sets the display text chi of this code detail.
	*
	* @param displayTextChi the display text chi of this code detail
	*/
	@Override
	public void setDisplayTextChi(java.lang.String displayTextChi) {
		_codeDetail.setDisplayTextChi(displayTextChi);
	}

	/**
	* Sets the display text en of this code detail.
	*
	* @param displayTextEn the display text en of this code detail
	*/
	@Override
	public void setDisplayTextEn(java.lang.String displayTextEn) {
		_codeDetail.setDisplayTextEn(displayTextEn);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_codeDetail.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_codeDetail.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_codeDetail.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this code detail.
	*
	* @param id the ID of this code detail
	*/
	@Override
	public void setId(long id) {
		_codeDetail.setId(id);
	}

	/**
	* Sets the level of this code detail.
	*
	* @param level the level of this code detail
	*/
	@Override
	public void setLevel(java.lang.Integer level) {
		_codeDetail.setLevel(level);
	}

	@Override
	public void setNew(boolean n) {
		_codeDetail.setNew(n);
	}

	/**
	* Sets the primary key of this code detail.
	*
	* @param primaryKey the primary key of this code detail
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_codeDetail.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_codeDetail.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remarks of this code detail.
	*
	* @param remarks the remarks of this code detail
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_codeDetail.setRemarks(remarks);
	}

	/**
	* Sets the seq of this code detail.
	*
	* @param seq the seq of this code detail
	*/
	@Override
	public void setSeq(java.lang.Integer seq) {
		_codeDetail.setSeq(seq);
	}

	/**
	* Sets the symbol of this code detail.
	*
	* @param symbol the symbol of this code detail
	*/
	@Override
	public void setSymbol(java.lang.String symbol) {
		_codeDetail.setSymbol(symbol);
	}

	/**
	* Sets the symbol_html_code of this code detail.
	*
	* @param symbol_html_code the symbol_html_code of this code detail
	*/
	@Override
	public void setSymbol_html_code(java.lang.String symbol_html_code) {
		_codeDetail.setSymbol_html_code(symbol_html_code);
	}

	/**
	* Sets the update date of this code detail.
	*
	* @param updateDate the update date of this code detail
	*/
	@Override
	public void setUpdateDate(Date updateDate) {
		_codeDetail.setUpdateDate(updateDate);
	}

	/**
	* Sets the updated by of this code detail.
	*
	* @param updatedBy the updated by of this code detail
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_codeDetail.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the up level ID of this code detail.
	*
	* @param upLevelId the up level ID of this code detail
	*/
	@Override
	public void setUpLevelId(java.lang.Long upLevelId) {
		_codeDetail.setUpLevelId(upLevelId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CodeDetail> toCacheModel() {
		return _codeDetail.toCacheModel();
	}

	@Override
	public CodeDetail toEscapedModel() {
		return new CodeDetailWrapper(_codeDetail.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _codeDetail.toString();
	}

	@Override
	public CodeDetail toUnescapedModel() {
		return new CodeDetailWrapper(_codeDetail.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _codeDetail.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CodeDetailWrapper)) {
			return false;
		}

		CodeDetailWrapper codeDetailWrapper = (CodeDetailWrapper)obj;

		if (Objects.equals(_codeDetail, codeDetailWrapper._codeDetail)) {
			return true;
		}

		return false;
	}

	@Override
	public CodeDetail getWrappedModel() {
		return _codeDetail;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _codeDetail.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _codeDetail.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_codeDetail.resetOriginalValues();
	}

	private final CodeDetail _codeDetail;
}