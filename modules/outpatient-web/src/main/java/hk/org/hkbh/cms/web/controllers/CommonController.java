package hk.org.hkbh.cms.web.controllers;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.servicehub.ComponentMgr;
import hk.org.hkbh.cms.outpatient.so.ComponentDtoSo;
import hk.org.hkbh.cms.web.helpers.OutpatientWebPortletHelper;
public class CommonController {
	private static Log logger = LogFactoryUtil.getLog(CommonController.class);
	private ComponentMgr componentMgr;
	private OutpatientWebPortletHelper helper;
	public CommonController() {
		componentMgr = new ComponentMgr();
		helper = new OutpatientWebPortletHelper();
	}
	public String renderMenu() {
		ComponentDtoSo so = null;
		String html = null;
		try {
			so = new ComponentDtoSo();
			so.setIsMenuItem(true);
			List<ComponentDto> componentDtoList = componentMgr.getComponentDtoList(so);
			StringBuilder sb = helper.createMenu(componentDtoList);
			html = sb.toString();
		} catch (Exception e) {
			logger.error(".renderMenu()", e);
		}
		return html;
	}
	public String renderNotification() {
		String html = null;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("<div class='informationDiv'>" + "</div>");
			html = sb.toString();
		} catch (Exception e) {
			logger.error(".renderNotification()", e);
		}
		return html;
	}
}
