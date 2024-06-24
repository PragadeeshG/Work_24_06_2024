create table if not exists alternate_ember_id_to_react(
ember_id varchar(255) not null,
react_code varchar(255) null,
quality_grade varchar(255) null,
ember_id_to_react_system varchar(255) null,
ember_id_to_react_system_code varchar(255) null,
ember_id_to_react_system_description varchar(255) null,
known_quality_issues varchar(255) null,
risk_level Integer null,
mitigation varchar(255) null,
approval_code varchar(255) null,
entity_state varchar(255) null,
constraint alternate_ember_id_to_react_pk primary key(ember_id));