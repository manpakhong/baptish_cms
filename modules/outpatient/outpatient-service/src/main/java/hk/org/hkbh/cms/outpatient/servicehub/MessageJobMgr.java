package hk.org.hkbh.cms.outpatient.servicehub;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;
import hk.org.hkbh.cms.outpatient.messagechain.EndoscopeMessageChainElementImpl;
import hk.org.hkbh.cms.outpatient.messagechain.ImagingMessageChainElementImpl;
import hk.org.hkbh.cms.outpatient.messagechain.LabMessageChainElementImpl;
import hk.org.hkbh.cms.outpatient.messagechain.MessageChain;

public class MessageJobMgr {
	private static Log logger = LogFactoryUtil.getLog(MessageJobMgr.class);
	private List<MessageChain> messageHandlerList;
	public MessageJobMgr() {
		messageHandlerList = new ArrayList<MessageChain>();
		messageHandlerList.add(new LabMessageChainElementImpl());
		messageHandlerList.add(new ImagingMessageChainElementImpl());
		messageHandlerList.add(new EndoscopeMessageChainElementImpl());
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
