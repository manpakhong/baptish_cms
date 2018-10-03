package hk.org.hkbh.cms.outpatient.eo;

public class MessageEo<T> {
	private String messageType;
	private T messageObject;
	public MessageEo(T messageObject, String messageType) {
		this.messageObject = messageObject;
		this.messageType = messageType;
	}
	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public T getMessageObject() {
		return messageObject;
	}
}
