package hk.org.hkbh.cms.outpatient.util;

import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import hk.org.hkbh.cms.outpatient.eo.PortletBundlesEo;
import hk.org.hkbh.cms.outpatient.eo.SysServiceBundlesEo;

public class SysServiceBundlesUtils extends BundlesUtils<SysServiceBundlesEo> {
	private static Log log = LogFactoryUtil.getLog(SysServiceBundlesUtils.class);
	public SysServiceBundlesUtils(String fileName) throws Exception {
		super(fileName);

	}
	private Configuration getConfiguration(String fileNameWithoutSuffix) throws Exception{
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
	public SysServiceBundlesEo getProperties() throws Exception {
		SysServiceBundlesEo eo = null;
		try{
			
			eo = new SysServiceBundlesEo();
			Configuration configuration = getConfiguration(this.fileName);
			String xxx = getPropValues("xxx");
			eo.setSample(xxx);
		} catch (Exception e){
			log.error(getClassName() + ".getSysProperties()", e);
			throw e;
		}
		return eo;
	}
}
