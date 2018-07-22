Ext.onReady(function(){
	console.log('extjs onready');
	Ext.QuickTips.init();
})
Ext.application({
    name: 'ClinicalNote',
    tag: 'app',
    appFolder: 'app',
//    requires:['Ext.container.Viewport'],
    controllers:['ClinicalNoteController'],
//    stores:['ClinicalNote.store.ClinicalNoteTypeStore'],
//    models:['ClinicalNote.model.ClinicalNoteType'],
//    view:[],
    init: function(){
    	console.log(this.tag + '-> init launch');
    },
    launch: function(){    
        console.log(this.tag + 'App is launched');
    }
})