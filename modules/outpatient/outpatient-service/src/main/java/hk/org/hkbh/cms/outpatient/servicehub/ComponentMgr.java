package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.service.ComponentControlDtoLocalServiceUtil;
import hk.org.hkbh.cms.outpatient.service.ComponentDtoLocalServiceUtil;
import hk.org.hkbh.cms.outpatient.so.ComponentDtoSo;

public class ComponentMgr {
	private static Log logger = LogFactoryUtil.getLog(ComponentMgr.class);
	public List<ComponentDto> getComponentDtoList(ComponentDtoSo so) throws Exception{
		List<ComponentDto> dtoList = null;
		try {
			dtoList = ComponentDtoLocalServiceUtil.getComponentDtoList(so);
		
		} catch (Exception e) {
			logger.error(".getComponentControlList()  ", e);
			throw e;
		}
		return dtoList;
	}
	
}
