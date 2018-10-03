package hk.org.hkbh.cms.outpatient.messagechain;

import hk.org.hkbh.cms.outpatient.eo.MessageEo;

public interface MessageChain {
	public static final String MESSAGE_TYPE_LAB_RECORD_CHECKING ="MESSAGE_TYPE_LAB_RECORD_CHECKING";
	public static final String MESSAGE_TYPE_ENDOSCOPE_RECORD_CHECKING = "MESSAGE_TYPE_ENDOSCOPE_RECORD_CHECKING";
	public static final String MESSAGE_TYPE_IMAGING_RECORD_CHECKING = "MESSAGE_TYPE_IMAGING_RECORD_CHECKING";
	public void setNextChain(MessageChain nextChain);
	public void handleMessage(MessageEo messageEo);
}
