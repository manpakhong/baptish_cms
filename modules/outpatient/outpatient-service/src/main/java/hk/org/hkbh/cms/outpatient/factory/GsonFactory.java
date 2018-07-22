package hk.org.hkbh.cms.outpatient.factory;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class GsonFactory {

	public GsonFactory() {

	}
	public  Gson buildGson() {
	
		FieldNamingStrategy customPolicy = new FieldNamingStrategy() {  
		    @Override
		    public String translateName(Field f) {
		        return f.getName().replace("_", "");
		    }
		};

		GsonBuilder gsonBuilder = new GsonBuilder();  
		gsonBuilder.setFieldNamingStrategy(customPolicy);  
		Gson gson = gsonBuilder.create();

		return gson;
	}
}
