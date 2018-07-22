package hk.org.hkbh.cms.outpatient.factory;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import java.lang.reflect.Field;

public class GsonNamingStrategy implements FieldNamingStrategy{
    @Override
    public String translateName(Field f) {
        return f.getName().replace("_", "");
    }


}
