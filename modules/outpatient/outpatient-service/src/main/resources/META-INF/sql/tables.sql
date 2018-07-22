create table Op_CodeDto (
	code_detail_id INTEGER not null primary key,
	master_code VARCHAR(75) null,
	code_display_text VARCHAR(75) null,
	code_active BOOLEAN,
	subcode_enabled BOOLEAN,
	code_remarks VARCHAR(75) null,
	detail_code VARCHAR(75) null,
	seq INTEGER,
	code_detail_display_text VARCHAR(75) null,
	code_detail_active BOOLEAN,
	level INTEGER,
	up_level_id INTEGER,
	code_detail_remarks VARCHAR(75) null,
	create_date DATE null,
	update_date DATE null,
	created_by VARCHAR(75) null,
	updated_by VARCHAR(75) null
);