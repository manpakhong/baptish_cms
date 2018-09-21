package hk.org.hkbh.cms.outpatient.message;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;

public class LabMessageHandlerImpl implements MessageHandler {
	private MessageHandler chain;
	@Override
	public void setNextChain(MessageHandler nextChain) {
		this.chain=nextChain;

	}

	@Override
	public void handleMessage(MessageEo messageEo) {
		if (messageEo.getMessageType().equals(MESSAGE_TYPE_LAB_RECORD_CHECKING)) {
			
		} else {
			this.chain.handleMessage(messageEo);
		}

	}

}
