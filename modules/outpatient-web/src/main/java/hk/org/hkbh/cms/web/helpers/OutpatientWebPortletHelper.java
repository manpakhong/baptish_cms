package hk.org.hkbh.cms.web.helpers;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import hk.org.hkbh.cms.outpatient.model.ComponentDto;

public class OutpatientWebPortletHelper {
	private static Log logger = LogFactoryUtil.getLog(OutpatientWebPortletHelper.class);
	private Map<Long, ComponentDto> map;
	private List<ComponentDto> componentDtoList;
	private int maxLevel;
	private StringBuilder sb;
	public StringBuilder createMenu( List<ComponentDto> componentDtoList) {
		try {
			sb = new StringBuilder();
			maxLevel = findTheMaxLevel(componentDtoList);
			map = transferListToMap(componentDtoList);
			this.componentDtoList = componentDtoList;
			sb.append("<div id='jqxWidget' class='topDropDownMenu'>");
			sb.append("<div id='jqxMenu' style='visibility: hidden; margin-left: 20px;'>");
			sb.append("<ul>");
			for (ComponentDto componentDto: componentDtoList) {
//				logger.info("id: " + componentDto.getId() + ", upLevelId: " + componentDto.getUpComponentId());
				if (componentDto.getComponentLevel().equals(1)) {
					marshellListToMenuHtml(componentDto);
				}
			}
			sb.append("</ul>");
			sb.append("</div>");
			sb.append("</div>");

			logger.info(sb.toString());
		}catch (Exception e) {
			logger.error(".createMenu() - componentDtoList=" + componentDtoList, e);
			throw e;
		}
		return sb;
	}
	public StringBuilder marshellListToMenuHtml(ComponentDto componentDto) {
		try {
			if (componentDto.getComponentLevel().intValue() == maxLevel) {
				sb.append("<li><a href=\"");
				sb.append(componentDto.getUrl() + "\">");
				sb.append(componentDto.getComponentName());
				sb.append("</a></li>");
				logger.info("id: " + componentDto.getId() + ", level: " + componentDto.getComponentLevel() + ", upLevelId: " + componentDto.getUpComponentId());
			} else {
				logger.info("id: " + componentDto.getId() + ", level: " + componentDto.getComponentLevel() + ", upLevelId: " + componentDto.getUpComponentId());
				List<ComponentDto> componentDtoList = findComponentDtoListByUpLevelComponentId(this.componentDtoList, componentDto.getId());

				sb.append("<li><a href='" + componentDto.getUrl() + "'>" + componentDto.getComponentName() + "</a>");
				if (componentDtoList != null && componentDtoList.size() > 0) {

					sb.append("<ul style='width: 300'>");
					for (ComponentDto c: componentDtoList) {
						marshellListToMenuHtml(c);
					}
					sb.append("</ul>");
				}
				sb.append("</li>");
			}

		}catch (Exception e) {
			logger.error(".marshellListToMenuHtml() - componentDto=" + componentDto, e);
			throw e;
		}
		return sb;
		
	}
	private List<ComponentDto> findComponentDtoListByUpLevelComponentId(final List<ComponentDto> list, final Long upLevelComponentId){
		return list.stream().filter(p -> p.getUpComponentId().equals(upLevelComponentId)).collect(Collectors.toList());
	}
	public int findTheMaxLevel(List<ComponentDto> componentDtoList) {
		int maxLevel = 0;
		try {
			for (ComponentDto componentDto: componentDtoList) {
				if (maxLevel < componentDto.getComponentLevel().intValue()) {
					maxLevel = componentDto.getComponentLevel().intValue();
				}
			}
		}catch (Exception e) {
			logger.error(".findTheMaxLevel() - componentDtoList=" + componentDtoList, e);
			throw e;
		}
		return maxLevel;
	}
	private Map<Long, ComponentDto> transferListToMap(List<ComponentDto> componentDtoList){
		Map<Long, ComponentDto> componentDtoMap = null;
		try {
			componentDtoMap = new HashMap<Long, ComponentDto>();
			for (ComponentDto componentDto: componentDtoList) {
				componentDtoMap.put((Long) componentDto.getId(), componentDto);
			}
		}catch (Exception e) {
			logger.error(".marshellListToMenuHtml() - componentDtoList=" + componentDtoList, e);
			throw e;
		}
		return componentDtoMap;
	}

}
