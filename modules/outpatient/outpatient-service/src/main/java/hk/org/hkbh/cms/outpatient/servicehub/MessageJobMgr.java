package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;
import hk.org.hkbh.cms.outpatient.messagehandler.EndoscopeMessageHandlerImpl;
import hk.org.hkbh.cms.outpatient.messagehandler.ImagingMessageHandlerImpl;
import hk.org.hkbh.cms.outpatient.messagehandler.LabMessageHandlerImpl;
import hk.org.hkbh.cms.outpatient.messagehandler.MessageHandler;

public class MessageJobMgr {
	private static Log logger = LogFactoryUtil.getLog(MessageJobMgr.class);
	private List<MessageHandler> messageHandlerList;
	public MessageJobMgr() {
		messageHandlerList = new ArrayList<MessageHandler>();
		messageHandlerList.add(new LabMessageHandlerImpl());
		messageHandlerList.add(new ImagingMessageHandlerImpl());
		messageHandlerList.add(new EndoscopeMessageHandlerImpl());
		for (int i=0; i < messageHandlerList.size() - 1; i++) {
			messageHandlerList.get(i).setNextChain(messageHandlerList.get(i+1));
		}
	}
	public void process(MessageEo eo) throws Exception{
		try {
			messageHandlerList.get(0).handleMessage(eo);
		} catch (Exception e) {
			logger.error(".process() - eo=" + eo, e);
			throw e;
		}

	}
}
