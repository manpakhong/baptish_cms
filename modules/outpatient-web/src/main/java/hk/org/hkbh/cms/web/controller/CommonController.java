package hk.org.hkbh.cms.web.controller;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.servicehub.ComponentMgr;
import hk.org.hkbh.cms.outpatient.so.ComponentDtoSo;
import hk.org.hkbh.cms.web.helper.OutpatientWebPortletHelper;
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
	public String renderProcessingOverlay(HttpServletRequest request) {
		String html = null;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("<div class=\"commonOverlayDiv\"><div class=\"commonOverlayTextDiv\"><img src=\"" + request.getContextPath() + "/image/processing.gif\" alt=\"processingGif\"></div></div>");
			html = sb.toString();
		}catch (Exception e) {
			logger.error(".renderProcessingOverlay()", e);
		}
		return html;
	}
	public String renderAlertAndNotification() {
		String html = null;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("<div class=\"alertDiv\">11</div>");
			html = sb.toString();
		}catch (Exception e) {
			logger.error(".renderAlertAndNotification()", e);
		}
		return html;
	}
	public String renderSystemMessageDialog(HttpServletRequest request) {
		String html = null;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("<div class=\"systemMessageWindowDiv\">");
				sb.append("<div class=\"systemMessageWindowHeader\">");
					sb.append("<span>");
						sb.append("<img class=\"systemMessageWindowTitleImage\" src=\"" + request.getContextPath() + "/image/if_Error_16.png\" alt=\"system error image\" style=\"margin-right: 15px\" /><span class=\"systemMessageSpan\">System Error</span>");
					sb.append("</span>");
				sb.append("</div>");
				sb.append("<div style=\"overflow: hidden;\" id=\"systemMessageWindowContent\" style=\"text-align: center;\">");
					sb.append("<div style=\"padding-left: 10px;position:relative;top:30%;\">");
						sb.append("<img class=\"systemMessageWindowContentImage\" src=\"" + request.getContextPath() + "/image/if_Error_24.png\" alt=\"system error image\" style=\"margin-right: 15px\" />");
						sb.append("<span style=\"font-size: large\" class=\"systemMessageDisplaySpan\">System Error!</span>");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
			html = sb.toString();
		}catch (Exception e) {
			logger.error(".renderSystemMessageDialog()", e);
		}
		return html;
	}
}
