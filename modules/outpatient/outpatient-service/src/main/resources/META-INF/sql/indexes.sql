create index IX_14DB0E80 on Op_CodeDto (master_code[$COLUMN_LENGTH:75$]);

create index IX_50926796 on Op_ComponentControlDto (id);

create index IX_E42AFAA9 on Op_ComponentDto (component_code[$COLUMN_LENGTH:75$]);
create index IX_6D3A9A2C on Op_ComponentDto (component_level);
create index IX_104E38D5 on Op_ComponentDto (id);
create index IX_97BFA18 on Op_ComponentDto (is_menu_item);