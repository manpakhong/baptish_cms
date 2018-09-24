package hk.org.hkbh.cms.outpatient.util;

import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import hk.org.hkbh.cms.outpatient.eo.ServiceBundlesEo;

public class ServiceBundlesUtils extends BundleUtils<ServiceBundlesEo> {
	private static Log log = LogFactoryUtil.getLog(ServiceBundlesUtils.class);
	public ServiceBundlesUtils() {
		super();
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
	private String getClassName() {
		return this.getClass().getName();
	}
	@Override
	public ServiceBundlesEo getProperties() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
