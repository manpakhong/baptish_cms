<%@ include file="/init.jsp" %>
<%@ page import = "java.io.*,java.util.*,hk.org.hkbh.cms.web.controllers.CommonController" %>
<p>
	<b>
<!-- 	<liferay-ui:message key="outpatient-web.caption"/> -->
	</b>
</p>
<div class="informationDiv">11</div>
<div class="menuDiv">
	<jsp:scriptlet>
		CommonController controller = new CommonController();
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
