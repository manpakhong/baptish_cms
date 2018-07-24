var ckeditor;
var templateComboBox;  
var vo;
var clinicalNoteTypeListJson;
function createPostTemplate(object){
	var postObject = {};
	postObject.data = object;
	postObject.action="default";
	return postObject;
}
$(document).ready(function () {
	prepareCkEditor();
	//$('.contentDiv').append('<span>hey hey</span>');
});
function ajaxCall(){
	var data = '{test:test}';
	$.ajax({
		  url : GLOBAL_AJAX_PATH + PORTLET_NAMESPACE,
		  data : data,
		  type: 'POST',
		  dataType : "json",
		  success : function(data) {
		    vo = data;
		  }
		});
}
function pageLoadPostExtJs(){
    Ext.Ajax.request({
        url: GLOBAL_AJAX_PATH + PORTLET_NAMESPACE,
        success: function(resp) {
            var result = Ext.decode(resp.responseText);
//            clinicalNoteTypeStore.getProxy().data = result;
//            clinicalNoteTypeStore.load();
            console.log("pageLoadPostExtJs: " + resp.responseText);
            clinicalNoteTypeStore.loadRawData(result,false);
//            var tempData = [[1,'op','op long']];
//            clinicalNoteTypeStore.loadData(tempData);
        },
    });
}
function pageLoadPost(){
	var obj = {};
	var data = createPostTemplate(obj);
	var dataJson = Ext.encode(data);
	$.ajax({
		  url : GLOBAL_AJAX_PATH + PORTLET_NAMESPACE,
		  data : dataJson,
		  type: 'POST',
		  dataType : "json",
		  success : function(data) {
			  clinicalNoteTypeListJson = Ext.encode(data.clinicalNoteTypeList);
			  vo = data;
			  var tempData = [];
			  clinicalNoteTypeStore.loadRawData(clinicalNoteTypeListJson,false);
		  }
		});
}
function prepareCkEditor(){

	ckeditor = CKEDITOR.replace( 'clinicalNoteTextArea', {
		customConfig : 'ckeditor_config.js',
		language: 'en-us'
	});
}
Ext.define('ClinicalNoteTypeModel', {
    extend: 'Ext.data.Model',
    fields: [
    	{name: 'id', type: 'int'},
        {name: 'detailCode', type: 'string'},
        {name: 'codeDetailDisplayText',  type: 'string'}
    ]
});
//var clinicalNoteTypeStore = Ext.create('Ext.data.Store', {
////    model: 'ClinicalNoteTypeModel',
//    fields: [
//    	{name: 'id', type: 'int'},
//        {name: 'detailCode', type: 'string'},
//        {name: 'codeDetailDisplayText',  type: 'string'}
//    ],
//    autoLoad: true,
//    proxy: {
//        type: 'ajax',
////        url: GLOBAL_AJAX_PATH + PORTLET_NAMESPACE,
//        reader: {
//            type: 'json',
//            root: 'clinicalNoteTypeList'
//        }
//    },
////    data: clinicalNoteTypeListJson
//});
var clinicalNoteTypeStore = Ext.create('Ext.data.Store', {
//  model: 'ClinicalNoteTypeModel',
  fields: [
  	{name: 'id', type: 'int'},
      {name: 'detailCode', type: 'string'},
      {name: 'codeDetailDisplayText',  type: 'string'}
  ],
  autoLoad: true,
  proxy: {
	    type: 'ajax',
	    reader: {
	        type: 'json',
	        root: 'clinicalNoteTypeList'
	    }
	}
});

Ext.onReady(function() {
	//pageLoadPost();
	pageLoadPostExtJs();
	var clinicalNoteTypeComboBox =  Ext.create('Ext.form.ComboBox', {
		renderTo: "clinicalNoteTemplateTypeCombo",
	    /*fieldLabel: 'Choose Care Provider',*/
	    store: clinicalNoteTypeStore,
	    queryMode: 'local',
	    displayField: 'codeDetailDisplayText',
	    valueField: 'codeDetailId',
	    anyMatch: true,
	    editable:true,
	    width: 500,
	    tpl:['<table width="100%">',
	            '<tr class="',
	             Ext.baseCSSPrefix, 'grid-group-hd ',
	             Ext.baseCSSPrefix, 'grid-group-title">',
	                '<th>Code </th>',
	                '<th>Type </th>',           
	            '</tr>',
	            '<tpl for=".">',
	            '<tr class="x-boundlist-item">',
	                '<td>{detailCode}</td>',
	                '<td>{codeDetailDisplayText}</td>',             
	            '</tr>',
	            '</tpl>',
	       '</table>']
	});    
	var comboBox = Ext.create('Ext.form.ComboBox', {
//		renderTo: "careProviderCombo",
	    /*fieldLabel: 'Choose Care Provider',*/
	    store: states,
	    queryMode: 'local',
	    displayField: 'display_name',
	    valueField: 'code',
	    anyMatch: true,
	    editable:true,
	    width: 500,
	    tpl:['<table width="100%">',
	            '<tr class="',
	             Ext.baseCSSPrefix, 'grid-group-hd ',
	             Ext.baseCSSPrefix, 'grid-group-title">',
	                '<th>Code </th>',
	                '<th>Name </th>',
	                '<th>Chi. Name </th>',                
	            '</tr>',
	            '<tpl for=".">',
	            '<tr class="x-boundlist-item">',
	                '<td>{code}</td>',
	                '<td>{name}</td>',
	                '<td>{chi_name}</td>',                
	            '</tr>',
	            '</tpl>',
	       '</table>']
	});    
	templateComboBox = Ext.create('Ext.form.ComboBox', {
//	renderTo: "doctorNoteCombo",
    /*fieldLabel: 'Choose Care Provider',*/
    store: drNoteTemplate,
    queryMode: 'local',
    displayField: 'template_name',
    valueField: 'code',
    anyMatch: true,
    editable:true,
    width: 800,
    tpl:['<table width="100%">',
            '<tr class="',
             Ext.baseCSSPrefix, 'grid-group-hd ',
             Ext.baseCSSPrefix, 'grid-group-title">',
                '<th>Code </th>',
                '<th>Template Name </th>',
                '<th>Preview </th>',                
            '</tr>',
            '<tpl for=".">',
            '<tr class="x-boundlist-item">',
                '<td>{code}</td>',
                '<td>{template_name}</td>',
                '<td>{content_rich_text}</td>',                
            '</tr>',
            '</tpl>',
       '</table>'],
    listeners:{
         'select': templateComboBox_onSelect
    	}
	});  
})

var drNoteTemplate = Ext.create('Ext.data.Store', {
    fields: ['code', 'template_name', 'content_rich_text'],
    data : [
			  {
			    "code": "0030",
			    "template_name": "Work Based Doctor Note Template",
			    "content_rich_text": "<p style=\"text-align:center\"><span style=\"font-size:16px\"><strong><big>Hong Kong Baptist Hospital</big></strong></span></p><p> </p><p>Certificate of Medical Consultation:</p><p>______________________ was under my care on _______________ he/she will be able to return to work/ school on _______________.</p><p>Physician's Comments:</p><p>______________________________________________________________________________________________________________</p><p>______________________________________________________________________________________________________________</p><p>______________________________________________________________________________________________________________</p><p>______________________________________________________________________________________________________________</p><p>______________________________________________________________________________________________________________</p><p> </p><p>Rx __________________________</p><p>Dr. Paul Au Yeung</p>"
			  },
			  {
			    "code": "0031",
			    "template_name": "Medical Doctor Note Regarding Necessity of Dental Care",
			    "content_rich_text": "<p style=\"text-align:center\"><strong><span style=\"font-size:14px\">Medical Doctor Note Regarding Necessity </span></strong><strong><span style=\"font-size:14px\">of</span></strong><strong><span style=\"font-size:14px\"> Dental Care</span></strong></p><p>I have been notified that medicaid patients currently require a note from their physician in order to determine a medical need for certain dental procedures. As the patient’s medical doctor, I am familiar with the medical history as well as the list of medications that the patient is currently taking. The information can be found below:</p><p>Patient Name:__________________________________________________________________</p><p>Patient DOB:___________________________________________________________________</p><p>Medical History: ____________________________________________________________________________ ____________________________________________________________________________ ____________________________________________________________________________</p><p>List of Medications: ____________________________________________________________________________ ____________________________________________________________________________ ____________________________________________________________________________</p><p>It is my medical opinion that considering the current health status of the patient, medical history and list of medications, if it is possible to save the patient’s natural teeth by placement of a dental crown then it should be done.</p><p>Decreasing the patient\’s chewing capacity by denying the crown will negatively affect the patient’s health and nutrition. It may interfere with the patient’s ability to properly take medications. This could result in serious deterioration of the patient’s health.</p><p>Additional Support Notes: ____________________________________________________________________________ ____________________________________________________________________________ ____________________________________________________________________________ If you have any further questions, please contact the office.</p><p>Office Phone Number: ___________________________________________________________</p><p>Sincerely,</p><p>Medical Doctor</p><p>Dr. Paul Au Yeung</p>"
			  }
			]
});


 var states = Ext.create('Ext.data.Store', {
    fields: ['code', 'name', 'chi_name', "display_name"],
    data : [
        {"code":"0030", "name":"WONG CHO YIU", "chi_name":"王祖耀", "display_name": "WONG CHO YIU - 王祖耀"},
        {"code":"0312", "name":"YEUNG KAI KIN", "chi_name":"楊啟健", "display_name": "YEUNG KAI KIN - 楊啟健"},
        {"code":"0313", "name":"PANG WING LUK", "chi_name":"彭永祿", "display_name": "PANG WING LUK - 彭永祿"},
        {"code":"0734", "name":"NG SHI HON", "chi_name":"伍仕漢", "display_name": "NG SHI HON - 伍仕漢"},
        {"code":"0837", "name":"AU YEONG CHI KEUNG", "chi_name":"歐陽志強", "display_name": "AU YEONG CHI KEUNG - 歐陽志強"},
        {"code":"1390", "name":"LEUNG FUNG HA BELINDA", "chi_name":"梁鳳霞", "display_name": "LEUNG FUNG HA BELINDA - 梁鳳霞"},
    ]
});
 function templateComboBox_onSelect(control, record, index){
		ckeditor.setData(record.data.content_rich_text);
	}