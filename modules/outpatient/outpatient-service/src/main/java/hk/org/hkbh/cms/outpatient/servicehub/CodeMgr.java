package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.CodeDto;
import hk.org.hkbh.cms.outpatient.service.CodeDtoLocalServiceUtil;

public class CodeMgr {
	private static Log logger = LogFactoryUtil.getLog(CodeMgr.class);
	public List<CodeDto> getCodeList(String masterCode) throws Exception{
		List<CodeDto> codeDtoList = null;
		try {
			codeDtoList = CodeDtoLocalServiceUtil.getCodeDtoByMasterCode(masterCode);
		} catch (Exception e) {
			logger.error(".getCodeList() - masterCode=" + masterCode, e);
			throw e;
		}
		return codeDtoList;
	}
}
