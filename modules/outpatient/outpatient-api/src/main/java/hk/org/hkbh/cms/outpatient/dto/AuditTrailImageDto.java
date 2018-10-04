package hk.org.hkbh.cms.outpatient.dto;

public class AuditTrailImageDto {
	private Object beforePersistImage; 
	private Object afterPersistImage;
	private Integer functionId;
	private Integer userId;
	public Object getBeforePersistImage() {
		return beforePersistImage;
	}
	public void setBeforePersistImage(Object beforePersistImage) {
		this.beforePersistImage = beforePersistImage;
	}
	public Object getAfterPersistImage() {
		return afterPersistImage;
	}
	public void setAfterPersistImage(Object afterPersistImage) {
		this.afterPersistImage = afterPersistImage;
	}
	public Integer getFunctionId() {
		return functionId;
	}
	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuditTrailImageDto [beforePersistImage=");
		builder.append(beforePersistImage);
		builder.append(", afterPersistImage=");
		builder.append(afterPersistImage);
		builder.append(", functionId=");
		builder.append(functionId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}
	
}
