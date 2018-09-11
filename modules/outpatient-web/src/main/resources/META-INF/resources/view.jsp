<%@ include file="/init.jsp" %>
<%@ page import = "java.io.*,java.util.*,hk.org.hkbh.cms.web.controllers.CommonController" %>
<p>
	<b><liferay-ui:message key="outpatient-web.caption"/></b>
</p>
<div>
menu
</div>
<jsp:scriptlet>
	CommonController controller = new CommonController();
	out.print(controller.renderMenu());

</jsp:scriptlet>

<div>
content
</div>