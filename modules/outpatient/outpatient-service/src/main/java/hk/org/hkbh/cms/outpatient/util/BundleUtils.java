package hk.org.hkbh.cms.outpatient.util;

import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import hk.org.hkbh.cms.outpatient.helper.CmsTaskMessageListenerHelper;

public class BundleUtils {
	private static Log log = LogFactoryUtil.getLog(BundleUtils.class);
	private static BundleUtils bundleUtils;
	private BundleUtils() {
	}
	public static BundleUtils getInstance() {
		if (bundleUtils == null) {
			bundleUtils = new BundleUtils();
		}
		return bundleUtils;
	}
	private String getClassName() {
		return BundleUtils.class.getName();
	}
	public Configuration getConfiguration(String fileNameWithoutSuffix) throws Exception{
		Configuration configuration = null;
		try {
			configuration  = ConfigurationFactoryUtil.getConfiguration(PortalClassLoaderUtil.getClassLoader(),  fileNameWithoutSuffix);
			String url = configuration.get("custom.liferay.base.url");
			log.info(url);
		} catch (Exception e) {
			log.error(getClassName() + ".getConfiguration() - fileNameWithoutSuffix=" + fileNameWithoutSuffix, e);
			throw e;
		}
		return configuration;
	}
}
