<%@ include file="/init.jsp" %>
<%@ page import = "java.io.*,java.util.*,hk.org.hkbh.cms.web.controller.CommonController" %>
<p>
	<b>
<!-- 	<liferay-ui:message key="outpatient-web.caption"/> -->
	</b>
</p>
<%-- <div class="commonOverlayDiv"><div class="commonOverlayTextDiv"><img src="<%=request.getContextPath()%>/image/processing.gif" alt="processingGif"></div></div> --%>
	<jsp:scriptlet>
		CommonController controller = new CommonController();
		out.print(controller.renderProcessingOverlay(request));
	</jsp:scriptlet>
<input type="button" onClick="testOverLay()" value="overlayTest" />
<jsp:scriptlet>
	out.print(controller.renderAlertAndNotification());
	out.print(controller.renderSystemMessageDialog(request));
</jsp:scriptlet>
<div class="menuDiv">
	<jsp:scriptlet>
		out.print(controller.renderMenu());
	</jsp:scriptlet>
</div>
<div class="contentDiv">
    <div id="layoutDiv">
        <!--The panel content divs can have a flat structure-->
        <!-- West tabbedGroup -->
        <div data-container="DiagnosisPanel">
            Diagnosis Panel</div>
        <div data-container="AlertPanel">
            Alert Panel</div> 
        <div data-container="AllergensPanel">
            Allergens Panel</div>
        <div data-container="OrderPanel">
            Order Panel</div>
        <div data-container="TriagePanel">
            Triage Panel</div>        
        <!--Centre-->
        <div data-container="DrNotePanel">
            Dr. Note Panel</div>
        <div data-container="LetterPanel">
            Letter Panel</div>
        <div data-container="SickNotePanel">
            Sick Note Panel</div>
        <!--East tabbedGroup-->
        <div data-container="LabResultsPanel">
            ImageResultPanel</div>
        <div data-container="XRayPanel">
            XRayPanel</div>
        <div data-container="EndoscopyResultsPanel">
            EndoscopyResultsPanel</div>
        <div data-container="MrasPanel">
            MrasPanel</div>
        <!-- Sourth -->
        <div data-container="ObservationProfilePanel">
        	ObservationProfilePanel
        </div>
        <div data-container="PatientHistoryPanel">
        	PatientHistoryPanel
        </div>
    </div>
</div>
