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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Dave Man
 * @generated
 */
@ProviderType
public class CodeDetailSoap implements Serializable {
	public static CodeDetailSoap toSoapModel(CodeDetail model) {
		CodeDetailSoap soapModel = new CodeDetailSoap();

		soapModel.setId(model.getId());
		soapModel.setCodeId(model.getCodeId());
		soapModel.setDetailCode(model.getDetailCode());
		soapModel.setSeq(model.getSeq());
		soapModel.setDisplayTextEn(model.getDisplayTextEn());
		soapModel.setDisplayTextChi(model.getDisplayTextChi());
		soapModel.setSymbol(model.getSymbol());
		soapModel.setSymbol_html_code(model.getSymbol_html_code());
		soapModel.setActive(model.getActive());
		soapModel.setLevel(model.getLevel());
		soapModel.setUpLevelId(model.getUpLevelId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static CodeDetailSoap[] toSoapModels(CodeDetail[] models) {
		CodeDetailSoap[] soapModels = new CodeDetailSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CodeDetailSoap[][] toSoapModels(CodeDetail[][] models) {
		CodeDetailSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CodeDetailSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CodeDetailSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CodeDetailSoap[] toSoapModels(List<CodeDetail> models) {
		List<CodeDetailSoap> soapModels = new ArrayList<CodeDetailSoap>(models.size());

		for (CodeDetail model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CodeDetailSoap[soapModels.size()]);
	}

	public CodeDetailSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public Integer getCodeId() {
		return _codeId;
	}

	public void setCodeId(Integer codeId) {
		_codeId = codeId;
	}

	public Integer getDetailCode() {
		return _detailCode;
	}

	public void setDetailCode(Integer detailCode) {
		_detailCode = detailCode;
	}

	public Integer getSeq() {
		return _seq;
	}

	public void setSeq(Integer seq) {
		_seq = seq;
	}

	public String getDisplayTextEn() {
		return _displayTextEn;
	}

	public void setDisplayTextEn(String displayTextEn) {
		_displayTextEn = displayTextEn;
	}

	public String getDisplayTextChi() {
		return _displayTextChi;
	}

	public void setDisplayTextChi(String displayTextChi) {
		_displayTextChi = displayTextChi;
	}

	public String getSymbol() {
		return _symbol;
	}

	public void setSymbol(String symbol) {
		_symbol = symbol;
	}

	public String getSymbol_html_code() {
		return _symbol_html_code;
	}

	public void setSymbol_html_code(String symbol_html_code) {
		_symbol_html_code = symbol_html_code;
	}

	public Boolean getActive() {
		return _active;
	}

	public void setActive(Boolean active) {
		_active = active;
	}

	public Integer getLevel() {
		return _level;
	}

	public void setLevel(Integer level) {
		_level = level;
	}

	public Integer getUpLevelId() {
		return _upLevelId;
	}

	public void setUpLevelId(Integer upLevelId) {
		_upLevelId = upLevelId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getUpdateDate() {
		return _updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	private int _id;
	private Integer _codeId;
	private Integer _detailCode;
	private Integer _seq;
	private String _displayTextEn;
	private String _displayTextChi;
	private String _symbol;
	private String _symbol_html_code;
	private Boolean _active;
	private Integer _level;
	private Integer _upLevelId;
	private String _remarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}