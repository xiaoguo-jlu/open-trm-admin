use qm_admin_db;

-- 初始化角色
insert into qm_role_t (role_name, creation_date, last_update_date)
values ('System Admin', now(), now());

