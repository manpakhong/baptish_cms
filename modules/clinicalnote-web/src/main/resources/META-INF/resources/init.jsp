<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<c:set var="now" value="<%=new java.util.Date()%>" />
<c:set var="scriptVersion" value="true" scope="page" />
<fmt:formatDate value="${now}" pattern="yyyyMmmdd_hhMMss" var="verNo" />

<script>
var GLOBAL_AJAX_PATH = "<portlet:resourceURL/>";
var PORTLET_NAMESPACE = "<portlet:namespace/>";
//var vo = "${bigSmallEoList}";
</script>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/js/extjs/6.2.0/classic/theme-neptune-touch/resources/theme-neptune-touch-all.css"/>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/clinicalnote.css?ver=${verNo}"/>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/extjs/6.2.0/ext-all.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/extjs/6.2.0/classic/theme-neptune-touch/theme-neptune-touch.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ckeditor/ckeditor.js"></script>

	<c:if test="${scriptVersion eq true}"  >
<%-- 		<script type="text/javascript" src="<%=request.getContextPath()%>/js/app.js?ver=${verNo}"></script> --%>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/clinicalnote.js?ver=${verNo}"></script>
	</c:if>
	<c:if test="${scriptVersion eq false}">
<%-- 		<script type="text/javascript" src="<%=request.getContextPath()%>/js/app.js"></script> --%>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/clinicalnote.js"></script>
	</c:if>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/json3.min.js"></script>
<liferay-theme:defineObjects />

<portlet:defineObjects />