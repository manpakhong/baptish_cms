package hk.org.hkbh.cms.outpatient.messagechain;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;

public class ImagingMessageChainElementImpl implements MessageChain {
	private MessageChain chain;
	@Override
	public void setNextChain(MessageChain nextChain) {
		this.chain=nextChain;

	}

	@Override
	public void handleMessage(MessageEo messageEo) {
		if (messageEo.getMessageType().equals(MESSAGE_TYPE_IMAGING_RECORD_CHECKING)) {
			
		} else {
			this.chain.handleMessage(messageEo);
		}

	}

}
