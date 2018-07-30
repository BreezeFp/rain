create table `sys_role` (
  `id`   INT(9) auto_increment comment '编号' primary key,
  `role` VARCHAR(32) not null comment '角色',
  constraint `role` unique (`role`)
) comment '角色';
create table `sys_user` (
  `id`       INT(9) auto_increment comment '编号' primary key,
  `username` VARCHAR(32) not null comment '用户名',
  `password` VARCHAR(32) not null comment '密码',
  constraint `username` unique (`username`)
) comment '用户';
create table `sys_user_role` (
  `id`      INT(9) auto_increment comment '编号' primary key,
  `user_id` INT(9) not null comment '用户编号',
  `role_id` INT(9) not null comment '角色编号'
) comment '用户角色关系';