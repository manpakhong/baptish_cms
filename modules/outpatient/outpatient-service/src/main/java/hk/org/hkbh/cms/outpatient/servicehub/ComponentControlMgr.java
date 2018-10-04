package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.dto.AuditTrailImageDto;
import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalServiceUtil;

public class ComponentControlMgr extends AuditTrailMgrBase{
	private static Log logger = LogFactoryUtil.getLog(ComponentControlMgr.class);
	public List<ComponentControlDto> getComponentControlList(Long userId, Long userRoleId) throws Exception{
		List<ComponentControlDto> componentControlDtoList = null;
		try {
			componentControlDtoList = ComponentControlDtoLocalServiceUtil.getComponentControlDtoList(userRoleId, userId);
			Object beforePersistImage = null;
			Object afterPersistImage = null;
			AuditTrailImageDto dto = new AuditTrailImageDto();
			dto.setBeforePersistImage(beforePersistImage);
			dto.setAfterPersistImage(afterPersistImage);
			
			this.createAuditImage(dto);
		} catch (Exception e) {
			logger.error(".getComponentControlList() - userId=" + userId + ", userRoleId=" + userRoleId, e);
			throw e;
		}
		return componentControlDtoList;
	}
	private String getClassName() {
		return this.getClass().getName();
	}
}
