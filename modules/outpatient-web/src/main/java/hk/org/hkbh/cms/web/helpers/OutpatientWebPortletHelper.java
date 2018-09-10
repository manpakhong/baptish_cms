package hk.org.hkbh.cms.web.helpers;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hk.org.hkbh.cms.outpatient.model.ComponentDto;

public class OutpatientWebPortletHelper {
	private static Log logger = LogFactoryUtil.getLog(OutpatientWebPortletHelper.class);
	private Map<Long, ComponentDto> map;
	private int maxLevel;
	public void createMenu( List<ComponentDto> componentDtoList) {
		try {
			maxLevel = findTheMaxLevel(componentDtoList);
			map = transferListToMap(componentDtoList);
			for (ComponentDto componentDto: componentDtoList) {
				marshellListToMenuHtml(componentDto);
			}
		}catch (Exception e) {
			logger.error(".createMenu() - componentDtoList=" + componentDtoList, e);
			throw e;
		}
	}
	public StringBuilder marshellListToMenuHtml(ComponentDto componentDto) {
		StringBuilder sb = null;
		try {

			if (componentDto.getComponentLevel().intValue() == 1) {
				logger.info("id: " + componentDto.getId() + ", upLevelId: " + componentDto.getUpComponentId());
			} else {
				ComponentDto upComponentDto = map.get(componentDto.getUpComponentId());
				logger.info("id: " + upComponentDto.getId() + ", upLevelId: " + upComponentDto.getUpComponentId());
				marshellListToMenuHtml(upComponentDto);
			}

		}catch (Exception e) {
			logger.error(".marshellListToMenuHtml() - componentDto=" + componentDto, e);
			throw e;
		}
		return sb;
		
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
