package hk.org.hkbh.cms.outpatient.subscriber;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;

public interface Subscriber {
	public static final String SUBSCRIBER_ENDOSCOPE = "SUBSCRIBER_ENDOSCOPE";
	public static final String SUBSCRIBER_LAB = "SUBSCRIBER_LAB";
	public static final String SUBSCRIBER_IMAGING = "SUBSCRIBER_IMAGING";
	public void update(MessageEo eo);
}
