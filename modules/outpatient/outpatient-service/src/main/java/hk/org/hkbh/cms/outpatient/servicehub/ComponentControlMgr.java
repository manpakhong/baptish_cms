package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalServiceUtil;

public class ComponentControlMgr {
	private static Log logger = LogFactoryUtil.getLog(ComponentControlMgr.class);
	public List<ComponentControlDto> getComponentControlList(Long userId, Long userRoleId) throws Exception{
		List<ComponentControlDto> componentControlDtoList = null;
		try {
			componentControlDtoList = ComponentControlDtoLocalServiceUtil.getComponentControlDtoList(userRoleId, userId);
		
		} catch (Exception e) {
			logger.error(".getComponentControlList() - userId=" + userId + ", userRoleId=" + userRoleId, e);
			throw e;
		}
		return componentControlDtoList;
	}
}
