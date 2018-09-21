package hk.org.hkbh.cms.outpatient.messagehandler;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;

public interface MessageHandler {
	public static final String MESSAGE_TYPE_LAB_RECORD_CHECKING ="MESSAGE_TYPE_LAB_RECORD_CHECKING";
	public static final String MESSAGE_TYPE_ENDOSCOPE_RECORD_CHECKING = "MESSAGE_TYPE_ENDOSCOPE_RECORD_CHECKING";
	public static final String MESSAGE_TYPE_IMAGING_RECORD_CHECKING = "MESSAGE_TYPE_IMAGING_RECORD_CHECKING";
	public void setNextChain(MessageHandler nextChain);
	public void handleMessage(MessageEo messageEo);
}
