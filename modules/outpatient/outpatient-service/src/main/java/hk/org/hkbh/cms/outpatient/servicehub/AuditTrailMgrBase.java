package hk.org.hkbh.cms.outpatient.servicehub;

import com.google.gson.Gson;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import hk.org.hkbh.cms.outpatient.dto.AuditTrailImageDto;
import hk.org.hkbh.cms.outpatient.model.AuditTrail;
import hk.org.hkbh.cms.outpatient.service.AuditTrailLocalServiceUtil;
import hk.org.hkbh.cms.outpatient.util.GsonUtils;

public abstract class AuditTrailMgrBase {
	private static Log logger = LogFactoryUtil.getLog(ClinicalNoteTemplateMgr.class);
	protected void createAuditImage(AuditTrailImageDto dto) throws Exception {
		try {
			Object beforePersistImage = dto.getBeforePersistImage();
			Object afterPersistImage = dto.getAfterPersistImage();
			Integer functionId = dto.getFunctionId();
			Integer userId = dto.getUserId();
			// for testing only
			AuditTrail auditTrail = AuditTrailLocalServiceUtil.getAuditTrail(1);
			String json = GsonUtils.getInstance().convertObjectToGson(auditTrail);
			auditTrail = AuditTrailLocalServiceUtil.updateAuditTrail(auditTrail);
		} catch (PortalException e) {
			logger.error(getClassName() + ".saveAuditImage() - dto=" +  dto, e);
			throw e;
		}
	}
	private String getClassName() {
		return this.getClass().getName();
	}
}
