<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="clinicalnote-web.caption"/></b>
</p>
<portlet:resourceURL var="resourceURL" >
</portlet:resourceURL>
<input type="button" onclick="ajaxCall(event)" value="callAjax" />
<div class="contentDiv">
</div>
<div class="tempDiv">

            <table>
              <tr>
              	<td>My Current Templates</td>
              	<td><input type="text" class="input_normal" /></td>
              </tr>
              <tr>
                <td>Type</td>
                <td>
					<div id="clinicalNoteTemplateTypeCombo"/>           
                </td>                
              </tr>
              <tr>
              	<td>Template Code</td>
              	<td><input type="text" class="input_normal" /></td>
              </tr>
              <tr>
                <td>Template Name</td>
                <td><input type="text" class="input_title" /></td>
              </tr>
              <tr>

              </tr>
            </table>
			<textarea id="clinicalNoteTextArea">
			</textarea>
            <input type="button" value="Save" />

</div>
