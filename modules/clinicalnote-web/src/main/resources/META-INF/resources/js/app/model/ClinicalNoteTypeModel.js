Ext.define('ClinicalNote.model.ClinicalNoteType',{
    extend: 'ClinicalNote.data.Model',
    fields: [
    	{name: 'id', type: 'int'},
        {name: 'detailCode', type: 'string'},
        {name: 'codeDetailDisplayText',  type: 'string'}
    ]
})