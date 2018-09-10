package hk.org.hkbh.cms.web.helpers;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.web.portlet.OutpatientWebPortlet;

public class OutpatientWebPortletHelper {
	private static Log logger = LogFactoryUtil.getLog(OutpatientWebPortletHelper.class);
	public StringBuilder marshellListToMenuHtml(List<ComponentControlDto> componentControlDtoList) {
		StringBuilder sb = null;
		try {

		}catch (Exception e) {
			logger.error(".marshellListToMenuHtml() - componentControlDtoList=" + componentControlDtoList, e);
			throw e;
		}
		return sb;
		
	}
}
