create user qm_admin@localhost identified by 'qm_admin@123456';
create database qm_admin_db;
create database trm_db;
grant create, drop, alter, select, delete, update, insert on qm_admin_db.* to qm_admin@localhost;
grant create, drop, alter, select, delete, update, insert on trm_db.* to qm_admin@localhost;


