package hk.org.hkbh.cms.outpatient.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.List;

import hk.org.hkbh.cms.outpatient.model.CodeDto;
import hk.org.hkbh.cms.outpatient.model.impl.CodeDtoImpl;
import hk.org.hkbh.cms.outpatient.service.persistence.CodeDtoFinder;

public class CodeDtoFinderImpl extends CodeDtoFinderBaseImpl implements CodeDtoFinder {
	public static final String GET_CODE_DTO_BY_MASTER_CODE = CodeDtoFinderImpl.class.getName() + ".getCodeDtoByMasterCode";
	public List<CodeDto> getCodeDtoByMasterCode(String masterCode) {
		Session session = null;
		List<CodeDto> codeDtoList = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(), GET_CODE_DTO_BY_MASTER_CODE);
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			queryObject.addEntity("CodeDto", CodeDtoImpl.class);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(masterCode);
			codeDtoList = (List<CodeDto>) queryObject.list();

			
			//return  (List<Student>) QueryUtil.list(queryObject,getDialect(),start, end);// for pagination feature
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return codeDtoList;
	}

}
