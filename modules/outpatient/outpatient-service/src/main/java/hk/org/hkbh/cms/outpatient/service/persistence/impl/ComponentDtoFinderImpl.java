package hk.org.hkbh.cms.outpatient.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentDto;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentDtoImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentDtoFinder;
import hk.org.hkbh.cms.outpatient.so.ComponentDtoSo;

public class ComponentDtoFinderImpl extends ComponentDtoFinderBaseImpl implements ComponentDtoFinder{
	public static final String GET_COMPONENT_DTO_LIST = ComponentDtoFinderImpl.class.getName() + ".getComponentDtoList";
	private static Log logger = LogFactoryUtil.getLog(ComponentDtoFinderImpl.class);
	public List<ComponentDto> getComponentDtoList(ComponentDtoSo so){
		List<ComponentDto> componentDtoList = null;
	    Session session = null;
	    try {
	        session = openSession();

			String sql = CustomSQLUtil.get(getClass(), GET_COMPONENT_DTO_LIST);
			StringBuilder sb = new StringBuilder(sql);
			Long id = so.getId();
			String componentCode = so.getComponentCode();
			Integer componentLevel = so.getComponentLevel();
			Boolean isMenuItem = so.getIsMenuItem();
			
			int count = 0;
			if (id != null) {
				if (count == 0) {
					sb.append(" " + "where" + " ");
				}
				sb.append("c.id = ? ");
				count++;
			} 
			if (componentCode != null) {
				if (count == 0) {
					sb.append(" " + "where" + " ");
				}
				sb.append("c.component_code = ? ");
				count++;
			}
			if (isMenuItem != null) {
				if (count == 0) {
					sb.append(" " + "where" + " ");
				}
				sb.append("c.is_menu_item = ? ");
				count++;
			}
			if (componentLevel != null) {
				if (count == 0) {
					sb.append(" " + "where" + " ");
				}
				sb.append("c.component_level = ? ");
				count++;
			}
			sb.append("order by c.component_level, c.seq ");
	        SQLQuery queryObject = session.createSQLQuery(sb.toString());
	        queryObject.setCacheable(false);
	        queryObject.addEntity("ComponentDto", ComponentDtoImpl.class);

	        QueryPos qPos = QueryPos.getInstance(queryObject);
	        
	        if (id != null) {
		        qPos.add(id);
	        }
	        if (componentCode != null) {
		        qPos.add(componentCode);
	        }
	        if (isMenuItem != null) {
		        qPos.add(isMenuItem);
	        }
	        if (componentLevel != null) {
		        qPos.add(componentLevel);
	        }

	        componentDtoList = (List<ComponentDto>) queryObject.list();
//	        (List<ComponentControlDto>) QueryUtil.list(q, getDialect(), begin, end);

	    }
	    catch (Exception e) {
			logger.error(".getComponentControlDtoList() - " , e);
			throw e;
	    }
	    finally {
	        closeSession(session);
	    }
		
		return componentDtoList;
	}	
}
