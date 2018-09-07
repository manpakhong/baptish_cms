package hk.org.hkbh.cms.outpatient.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.ComponentControlDto;
import hk.org.hkbh.cms.outpatient.model.impl.ComponentControlDtoImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.ComponentControlDtoFinder;
public class ComponentControlDtoFinderImpl extends ComponentControlDtoFinderBaseImpl implements ComponentControlDtoFinder {
	public static final String GET_COMPONENT_CONTROL_DTO_LIST = ComponentControlDtoFinderImpl.class.getName() + ".getComponentControlDtoList";
	private static Log logger = LogFactoryUtil.getLog(ComponentControlDtoFinderImpl.class);
	public List<ComponentControlDto> getComponentControlDtoList(Long userRoleId, Long userId){
		List<ComponentControlDto> componentControlDtoList = null;
	    Session session = null;
	    try {
	        session = openSession();

			String sql = CustomSQLUtil.get(getClass(), GET_COMPONENT_CONTROL_DTO_LIST);
			StringBuilder sb = new StringBuilder(sql);
			
			int count = 0;
			if (userRoleId != null) {
				if (count == 0) {
					sb.append(" " + "where" + " ");
				}
				sb.append("user_role_id = ? ");
				count++;
			} 
			if (userId != null) {
				if (count == 0) {
					sb.append(" " + "where" + " ");
				}
				sb.append("user_id = ? ");
				count++;
			}
			
			
			
	        SQLQuery queryObject = session.createSQLQuery(sb.toString());
	        queryObject.setCacheable(false);
	        queryObject.addEntity("ComponentControlDto", ComponentControlDtoImpl.class);

	        QueryPos qPos = QueryPos.getInstance(queryObject);
	        
	        if (userRoleId != null) {
		        qPos.add(userRoleId);
	        }
	        if (userId != null) {
		        qPos.add(userId);
	        }

	        componentControlDtoList = (List<ComponentControlDto>) queryObject.list();
//	        (List<ComponentControlDto>) QueryUtil.list(q, getDialect(), begin, end);

	    }
	    catch (Exception e) {
			logger.error(".getComponentControlDtoList() - userRoleId=" + userRoleId + ", userId = " + userId, e);
			throw e;
	    }
	    finally {
	        closeSession(session);
	    }
		
		return componentControlDtoList;
	}
}
