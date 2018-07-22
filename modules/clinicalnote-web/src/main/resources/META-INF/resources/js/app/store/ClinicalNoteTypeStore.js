Ext.define('ClinicalNote.store.ClinicalNoteTypeStore',{
    extend: 'Ext.data.Store',
    model: 'ClinicalNote.model.ClinicalNoteType',
    autoload: true,
    proxy:{
        type: 'ajax',
//        url: GLOBAL_AJAX_PATH + PORTLET_NAMESPACE,
		url: 'data/clinicalNoteTypeData.json',
        reader: {
            type: 'json',
            root: 'clinicalNoteTypeList'
        }
})