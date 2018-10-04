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
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/jqwidgets/styles/jqx.base.css"/>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/jqwidgets/styles/jqx.classic.css"/>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/menu.css?ver=${verNo}"/>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/common.css?ver=${verNo}"/>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/doctorWorkbench.css?ver=${verNo}"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxdata.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxmenu.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxbuttons.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxscrollbar.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxexpander.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxlistbox.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxlayout.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jqwidgets/jqxribbon.js"></script>
<script type="text/javascript">
	var GLOBAL_AJAX_PATH = "<portlet:resourceURL/>";
	var PORTLET_NAMESPACE = "<portlet:namespace/>";
	var CONTEXT_PATH = "<%=request.getContextPath()%>";
</script>
	<c:if test="${scriptVersion eq true}"  >
<%-- 		<script type="text/javascript" src="<%=request.getContextPath()%>/js/app.js?ver=${verNo}"></script> --%>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/menu.js?ver=${verNo}"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/doctorWorkbench.js?ver=${verNo}"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js?ver=${verNo}"></script>
	</c:if>
	<c:if test="${scriptVersion eq false}">
<%-- 		<script type="text/javascript" src="<%=request.getContextPath()%>/js/app.js"></script> --%>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/menu.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/doctorWorkbench.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
	</c:if>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/json3.min.js"></script>
<liferay-theme:defineObjects />

<portlet:defineObjects />