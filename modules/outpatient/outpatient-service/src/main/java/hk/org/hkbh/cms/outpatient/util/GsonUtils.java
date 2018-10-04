package hk.org.hkbh.cms.outpatient.util;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.lang.reflect.Field;

public class GsonUtils {
	private static Log log = LogFactoryUtil.getLog(GsonUtils.class);
	private static GsonUtils gsonUtils;
	
	private GsonUtils() {
		
	}
	
	public static GsonUtils getInstance() {
		if (gsonUtils == null) {
			gsonUtils = new GsonUtils();
		}
		return gsonUtils;
	}
	
	public String convertObjectToGson(Object obj) throws Exception{
		String jsonString = null;
		try {
			FieldNamingStrategy customPolicy = new FieldNamingStrategy() {  
			    @Override
			    public String translateName(Field f) {
			        return f.getName().replace("_", "");
			    }
			};
	
			GsonBuilder gsonBuilder = new GsonBuilder();  
			gsonBuilder.setFieldNamingStrategy(customPolicy);  
			Gson gson = gsonBuilder.create();
	
			jsonString = gson.toJson(obj);
		} catch (Exception e) {
			
		}
		return jsonString;
	}
}
