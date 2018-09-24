package hk.org.hkbh.cms.outpatient.util;

import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import java.util.Properties;

import hk.org.hkbh.cms.outpatient.helper.CmsTaskMessageListenerHelper;

public abstract class BundleUtils<T> {
	private static Log log = LogFactoryUtil.getLog(BundleUtils.class);
	private Properties properties;
	private String fileName;
	public BundleUtils() {
	}
	
	private String getClassName() {
		return BundleUtils.class.getName();
	}
	protected String getPropValues(String paramName) throws Exception{
		String result = null;
		try {
			if (properties != null){
				result = properties.getProperty(paramName);
			}
		} catch (Exception e) {
			log.error(getClassName() + ".getPropValues() - paramName=" + paramName, e);
			throw e;
		} finally {
		}
		return result;
	}
	abstract public T getProperties() throws Exception;

}
