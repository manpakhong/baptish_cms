package hk.org.hkbh.cms.outpatient.factory;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import hk.org.hkbh.cms.outpatient.eo.PortletBundlesEo;
import hk.org.hkbh.cms.outpatient.eo.SysServiceBundlesEo;
import hk.org.hkbh.cms.outpatient.util.BundlesUtils;
import hk.org.hkbh.cms.outpatient.util.PortletBundlesUtils;
import hk.org.hkbh.cms.outpatient.util.SysServiceBundlesUtils;

public class BundlesUtilsFactory {
	private static Log log = LogFactoryUtil.getLog(BundlesUtilsFactory.class);
	private static BundlesUtils <PortletBundlesEo> portletBundlesUtils;
	private static BundlesUtils <SysServiceBundlesEo> serviceBundlesUtils;
	private final static String BUNDLES_SYS_SERVICE_FILE_NAME = "sys_service.properties";
	private static BundlesUtilsFactory utilsFactory;
	
	private BundlesUtilsFactory() {

	}
	
	public static BundlesUtilsFactory getInstance() {
		if (utilsFactory == null) {
			utilsFactory = new BundlesUtilsFactory();
		}
		return utilsFactory;
	}
	
	public BundlesUtils<PortletBundlesEo> getInstanceOfPortletBundlesUtils(String fileNameWithoutSuffix) throws Exception{
		try {
			if (portletBundlesUtils == null) {
				portletBundlesUtils = new PortletBundlesUtils(fileNameWithoutSuffix);
			}
		} catch (Exception e) {
			log.error(getClassName() + ".getInstanceOfPortletBundlesUtils() - fileNameWithoutSuffix=" + fileNameWithoutSuffix, e);
			throw e;
		}
		return portletBundlesUtils;
	}
	public BundlesUtils<SysServiceBundlesEo> getInstanceOfServiceBundlesUtils() throws Exception{
		try {
			if (serviceBundlesUtils == null) {
				serviceBundlesUtils = new SysServiceBundlesUtils(BUNDLES_SYS_SERVICE_FILE_NAME);
			}
		} catch (Exception e) {
			log.error(getClassName() + ".getInstanceOfServiceBundlesUtils() - BUNDLES_SYS_SERVICE_FILE_NAME=" + BUNDLES_SYS_SERVICE_FILE_NAME, e);
			throw e;
		}
		return serviceBundlesUtils;
	}
	private static String getClassName() {
		String className = BundlesUtilsFactory.getClassName();
		return className;
	}
}
