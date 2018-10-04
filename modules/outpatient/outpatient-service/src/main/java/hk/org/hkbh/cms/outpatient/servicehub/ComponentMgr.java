package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.dto.AuditTrailImageDto;
import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.service.ComponentDtoLocalServiceUtil;
import hk.org.hkbh.cms.outpatient.so.ComponentDtoSo;

public class ComponentMgr extends AuditTrailMgrBase{
	private static Log logger = LogFactoryUtil.getLog(ComponentMgr.class);
	public List<ComponentDto> getComponentDtoList(ComponentDtoSo so) throws Exception{
		List<ComponentDto> dtoList = null;
		try {
			dtoList = ComponentDtoLocalServiceUtil.getComponentDtoList(so);
			Object beforePersistImage = null;
			Object afterPersistImage = null;
			AuditTrailImageDto dto = new AuditTrailImageDto();
			dto.setBeforePersistImage(beforePersistImage);
			dto.setAfterPersistImage(afterPersistImage);
			
			this.createAuditImage(dto);
		} catch (Exception e) {
			logger.error(getClassName() + ".getComponentControlList()  ", e);
			throw e;
		}
		return dtoList;
	}
	private String getClassName() {
		return this.getClass().getName();
	}
}
