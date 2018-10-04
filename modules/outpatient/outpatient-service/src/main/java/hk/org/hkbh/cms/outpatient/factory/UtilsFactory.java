package hk.org.hkbh.cms.outpatient.factory;

import hk.org.hkbh.cms.outpatient.util.GsonUtils;

public class UtilsFactory {
	private static GsonUtils gsonUtils;
	private UtilsFactory() {

	}
	public static GsonUtils getInstanceOfGsonUtils() {
		if (gsonUtils == null) {
			gsonUtils = GsonUtils.getInstance();
		}
		return gsonUtils;
	}
}
