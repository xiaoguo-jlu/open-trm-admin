use qm_admin_db;

-- 用户表
drop table if exists qm_user_t;
create table qm_user_t
(
    user_id          bigint       not null auto_increment primary key,
    user_name        varchar(100) not null,
    cute_name        varchar(50),
    password         varchar(100),
    profile_url      varchar(512),
    status           char(1) default 'Y',
    delete_flag      char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

drop table if exists qm_role_t;
create table qm_role_t
(
    role_id          bigint       not null auto_increment primary key,
    role_name        varchar(100) not null,
    status           char(1) default 'Y',
    delete_flag      char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

drop table if exists qm_user_role_t;
create table qm_user_role_t
(
    user_role_id     bigint   not null auto_increment primary key,
    user_id          bigint   not null,
    role_id          bigint   not null,
    status           char(1) default 'Y',
    delete_flag      char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

drop table if exists qm_permission_t;
create table qm_permission_t
(
    permission_id           bigint   not null auto_increment primary key,
    resource_operation_name varchar(500),
    resource_code           varchar(200),
    resource_name           varchar(200),
    operation_code          varchar(200),
    operation_name          varchar(200),
    status                  char(1) default 'Y',
    delete_flag             char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

drop table if exists qm_role_permission_t;
create table qm_role_permission_t
(
    role_permission_id bigint   not null auto_increment primary key,
    role_id            bigint   not null,
    permission_id      bigint   not null,
    status             char(1) default 'Y',
    delete_flag        char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

-- 基础数据配置表
drop table if exists qm_data_classify_t;
create table qm_data_classify_t
(
    classify_id          bigint   not null auto_increment primary key,
    classify_code        varchar(200),
    classify_desc        varchar(500),
    parent_classify_code varchar(200),
    status               char(1) default 'Y',
    delete_flag          char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

drop table if exists qm_data_item_t;
create table qm_data_item_t
(
    item_id          bigint   not null auto_increment primary key,
    item_code        varchar(200),
    item_name        varchar(500),
    classify_code    varchar(200),
    extend_attr01    varchar(500),
    extend_attr02    varchar(500),
    extend_attr03    varchar(500),
    extend_attr04    varchar(500),
    extend_attr05    varchar(500),
    status           char(1) default 'Y',
    delete_flag      char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

-- 数据字典配置
drop table if exists qm_property_t;
create table qm_property_t
(
    property_id        bigint   not null auto_increment primary key,
    property_key       varchar(200),
    property_value     varchar(500),
    property_desc      varchar(500),
    path               varchar(200),
    parent_property_id bigint,
    status             char(1) default 'Y',
    delete_flag        char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

-- 菜单栏配置表
drop table if exists qm_menu_t;
create table qm_menu_t
(
    menu_id          bigint   not null auto_increment primary key,
    menu_name        varchar(200),
    menu_path        varchar(500),
    parent_menu_id   bigint,
    status           char(1) default 'Y',
    delete_flag      char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);

-- 审计日志表
drop table if exists qm_audit_log_t;
create table qm_audit_log_t
(
    log_id           bigint   not null auto_increment primary key,
    request_path     varchar(500),
    user_id          bigint,
    client_ip        varchar(100),
    server_ip        varchar(100),
    request_body     text,
    response_body    text,
    status           char(1) default 'Y',
    delete_flag      char(1) default 'N',
    creation_date    datetime not null default now(),
    created_by    bigint not null default -1,
    last_update_date datetime not null default now(),
    last_updated_by    bigint not null default -1
);
