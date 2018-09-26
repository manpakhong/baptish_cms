package hk.org.hkbh.cms.outpatient.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import hk.org.hkbh.cms.outpatient.eo.PortletBundlesEo;

public class PortletBundlesUtils extends BundlesUtils<PortletBundlesEo> {
	private static Log log = LogFactoryUtil.getLog(PortletBundlesUtils.class);
	public PortletBundlesUtils(String fileName) throws Exception {
		super(fileName);

	}
	private String getClassName() {
		String className = this.getClass().getName();
		return className;
	}

	@Override
	public PortletBundlesEo getProperties() throws Exception {
		PortletBundlesEo eo = null;
		try{
			
			eo = new PortletBundlesEo();
			String xxx = getPropValues("xxx");
			eo.setSample(xxx);
		} catch (Exception e){
			log.error(getClassName() + ".getSysProperties()", e);
			throw e;
		}
		return eo;
	}
}
