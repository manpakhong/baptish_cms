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
public class CodeDtoSoap implements Serializable {
	public static CodeDtoSoap toSoapModel(CodeDto model) {
		CodeDtoSoap soapModel = new CodeDtoSoap();

		soapModel.setId(model.getId());
		soapModel.setMasterCode(model.getMasterCode());
		soapModel.setCodeDisplayTextEn(model.getCodeDisplayTextEn());
		soapModel.setCodeDisplayTextChi(model.getCodeDisplayTextChi());
		soapModel.setCodeActive(model.getCodeActive());
		soapModel.setSubcodeEnabled(model.getSubcodeEnabled());
		soapModel.setCodeRemarks(model.getCodeRemarks());
		soapModel.setDetailCode(model.getDetailCode());
		soapModel.setSeq(model.getSeq());
		soapModel.setCodeDetailDisplayTextEn(model.getCodeDetailDisplayTextEn());
		soapModel.setCodeDetailDisplayTextChi(model.getCodeDetailDisplayTextChi());
		soapModel.setCodeDetailActive(model.getCodeDetailActive());
		soapModel.setLevel(model.getLevel());
		soapModel.setUpLevelId(model.getUpLevelId());
		soapModel.setCodeDetailRemarks(model.getCodeDetailRemarks());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static CodeDtoSoap[] toSoapModels(CodeDto[] models) {
		CodeDtoSoap[] soapModels = new CodeDtoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CodeDtoSoap[][] toSoapModels(CodeDto[][] models) {
		CodeDtoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CodeDtoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CodeDtoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CodeDtoSoap[] toSoapModels(List<CodeDto> models) {
		List<CodeDtoSoap> soapModels = new ArrayList<CodeDtoSoap>(models.size());

		for (CodeDto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CodeDtoSoap[soapModels.size()]);
	}

	public CodeDtoSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getMasterCode() {
		return _masterCode;
	}

	public void setMasterCode(String masterCode) {
		_masterCode = masterCode;
	}

	public String getCodeDisplayTextEn() {
		return _codeDisplayTextEn;
	}

	public void setCodeDisplayTextEn(String codeDisplayTextEn) {
		_codeDisplayTextEn = codeDisplayTextEn;
	}

	public String getCodeDisplayTextChi() {
		return _codeDisplayTextChi;
	}

	public void setCodeDisplayTextChi(String codeDisplayTextChi) {
		_codeDisplayTextChi = codeDisplayTextChi;
	}

	public Boolean getCodeActive() {
		return _codeActive;
	}

	public void setCodeActive(Boolean codeActive) {
		_codeActive = codeActive;
	}

	public Boolean getSubcodeEnabled() {
		return _subcodeEnabled;
	}

	public void setSubcodeEnabled(Boolean subcodeEnabled) {
		_subcodeEnabled = subcodeEnabled;
	}

	public String getCodeRemarks() {
		return _codeRemarks;
	}

	public void setCodeRemarks(String codeRemarks) {
		_codeRemarks = codeRemarks;
	}

	public String getDetailCode() {
		return _detailCode;
	}

	public void setDetailCode(String detailCode) {
		_detailCode = detailCode;
	}

	public Integer getSeq() {
		return _seq;
	}

	public void setSeq(Integer seq) {
		_seq = seq;
	}

	public String getCodeDetailDisplayTextEn() {
		return _codeDetailDisplayTextEn;
	}

	public void setCodeDetailDisplayTextEn(String codeDetailDisplayTextEn) {
		_codeDetailDisplayTextEn = codeDetailDisplayTextEn;
	}

	public String getCodeDetailDisplayTextChi() {
		return _codeDetailDisplayTextChi;
	}

	public void setCodeDetailDisplayTextChi(String codeDetailDisplayTextChi) {
		_codeDetailDisplayTextChi = codeDetailDisplayTextChi;
	}

	public Boolean getCodeDetailActive() {
		return _codeDetailActive;
	}

	public void setCodeDetailActive(Boolean codeDetailActive) {
		_codeDetailActive = codeDetailActive;
	}

	public Integer getLevel() {
		return _level;
	}

	public void setLevel(Integer level) {
		_level = level;
	}

	public Long getUpLevelId() {
		return _upLevelId;
	}

	public void setUpLevelId(Long upLevelId) {
		_upLevelId = upLevelId;
	}

	public String getCodeDetailRemarks() {
		return _codeDetailRemarks;
	}

	public void setCodeDetailRemarks(String codeDetailRemarks) {
		_codeDetailRemarks = codeDetailRemarks;
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

	private long _id;
	private String _masterCode;
	private String _codeDisplayTextEn;
	private String _codeDisplayTextChi;
	private Boolean _codeActive;
	private Boolean _subcodeEnabled;
	private String _codeRemarks;
	private String _detailCode;
	private Integer _seq;
	private String _codeDetailDisplayTextEn;
	private String _codeDetailDisplayTextChi;
	private Boolean _codeDetailActive;
	private Integer _level;
	private Long _upLevelId;
	private String _codeDetailRemarks;
	private Date _createDate;
	private Date _updateDate;
	private String _createdBy;
	private String _updatedBy;
}