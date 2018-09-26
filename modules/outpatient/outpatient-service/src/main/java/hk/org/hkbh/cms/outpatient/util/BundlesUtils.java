package hk.org.hkbh.cms.outpatient.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class BundlesUtils<T> {
	private static Log log = LogFactoryUtil.getLog(BundlesUtils.class);
	private Properties properties;
	protected String fileName;
	public BundlesUtils(String fileName) throws Exception {
		this.fileName = fileName;
		init();
	}
	private void init() throws IOException{
		InputStream inputStream = null;
		properties = new Properties();
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException(getClassName() + "init() - property file '" + fileName + "' not found in the classpath");
			}
		} catch (Exception e) {
			log.error(getClassName() + ".init()", e);
			throw e;
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				log.error(getClassName() + ".init()", e);
				throw e;
			}
		}
	}
	private String getClassName() {
		return this.getClass().getName();
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
