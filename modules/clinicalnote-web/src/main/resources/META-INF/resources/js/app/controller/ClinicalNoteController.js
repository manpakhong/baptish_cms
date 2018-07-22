Ext.define('ClinicalNote.controller.ClinicalNoteController',{
    extend:'Ext.app.Controller',
	  stores:['ClinicalNote.store.ClinicalNoteTypeStore'],
	  models:['ClinicalNote.model.ClinicalNoteType'],
	  view:['ClinicalNote.view.ClinicalNoteTypeGrid'],
    tag: 'ClinicalNoteController',
    init:function(){
        console.log(this.tag + '-> init Controller');
        this.control({
        	
        })
    }
})