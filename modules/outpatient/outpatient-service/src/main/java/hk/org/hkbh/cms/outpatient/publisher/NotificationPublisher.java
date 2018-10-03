package hk.org.hkbh.cms.outpatient.publisher;

import java.util.ArrayList;
import java.util.List;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;
import hk.org.hkbh.cms.outpatient.subscriber.Subscriber;

public class NotificationPublisher {
	private List<Subscriber> subscriberList;
	public NotificationPublisher() {
		subscriberList = new ArrayList<Subscriber>();
	}
	public void addSubscriber(Subscriber subscriber) {
		subscriberList.add(subscriber);
	}
	public void removeSubscriber(Subscriber subscriber) {
		subscriberList.remove(subscriber);
	}

	public void notify(MessageEo messageEo) {
		for (Subscriber subscriber: subscriberList) {

		}
	}
}
