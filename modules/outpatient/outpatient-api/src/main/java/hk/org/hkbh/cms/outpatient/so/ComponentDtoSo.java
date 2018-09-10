package hk.org.hkbh.cms.outpatient.so;

public class ComponentDtoSo {
	private Long id;
	private String componentCode;
	private Boolean isMenuItem;
	private Integer componentLevel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComponentCode() {
		return componentCode;
	}
	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}
	public Boolean getIsMenuItem() {
		return isMenuItem;
	}
	public void setIsMenuItem(Boolean isMenuItem) {
		this.isMenuItem = isMenuItem;
	}
	public Integer getComponentLevel() {
		return componentLevel;
	}
	public void setComponentLevel(Integer componentLevel) {
		this.componentLevel = componentLevel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComponentSo [id=");
		builder.append(id);
		builder.append(", componentCode=");
		builder.append(componentCode);
		builder.append(", isMenuItem=");
		builder.append(isMenuItem);
		builder.append(", componentLevel=");
		builder.append(componentLevel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
