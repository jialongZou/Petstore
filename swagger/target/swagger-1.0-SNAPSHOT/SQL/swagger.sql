create database swagger;
use swagger;
-- 用户表
create table User(
  u_id int auto_increment primary key ,
  u_username varchar(20) not null,    -- 用户名
  u_password varchar(20) not null ,   -- 密码
  u_firstName varchar(10) not null ,  -- 名
  u_lastName varchar(20) not null ,   -- 姓
  u_email varchar(20) not null ,      -- email
  u_phone varchar(20) not null ,      -- 电话
  u_status int default 1 check (u_status=0 or u_status=1)
);-- status代表当前用户的状态（1为在用or0为弃用）

insert into User(u_username, u_password, u_firstName, u_lastName, u_email, u_phone)
VALUES ('大帅哥', '123456', '凡', '莫', '1798139789@qq.com', '12345678909');
select * from User;

-- 标签表（宠物的标签，例如 可爱型、帅气型）
create table Tag(
  t_id int auto_increment primary key ,
  t_name varchar(10) not null
);

insert into Tag(t_name) values('可爱'),('帅气'),('威猛');
select * from Tag;

-- 类别表(宠物的类别，例如是猫是狗)
create table category(
  c_id int auto_increment primary key ,
  c_name varchar(10) not null
);

insert into category(c_name) values('小猫'),('小狗'),('乌龟');
select * from category;

-- 宠物表
create table Pet (
  p_id         int auto_increment primary key,
  p_categoryId int         not null, -- 类别(外键)
  p_name       varchar(10) not null, -- 名字
  p_photoUrls  varchar(100),         -- 图片地址
  p_tagId      int,                  -- 标签(外键)
  p_status     varchar(10),          -- 状态(售出、预定、未售)
  foreign key (p_tagId) references Tag (t_id),
  foreign key (p_categoryId) references category(c_id)
);

insert into Pet (p_categoryId, p_name, p_tagId, p_status)
values (1,'小黄','1','未售'),(3,'厚土','2','预定');
select * from pet;
-- 查询具体的编号、类别、名字、标签、状态
select p.p_id 编号, c.c_name 类别, p.p_name 名字, t.t_name 标签, p.p_status 状态
from Pet p,
     category c,
     tag t
where p.p_categoryId = c.c_id
  and p.p_tagId = t.t_id;

-- 订单表
create table `order` (
  o_id       int  auto_increment primary key,
  o_petId    int  not null , -- 宠物编号
  o_quantity int  not null, -- 数量
  o_shipDate date , -- 发货日期
  o_status   varchar(10),   -- 订单状态
  o_complete varchar(10) default 'false'check (o_complete='false' or o_complete='true'),-- 完成
  foreign key (o_petId) references pet (p_id)
);

insert into `order` (o_petId, o_quantity, o_shipDate, o_status)
values (2, 1, '2018-11-21', '未完成');
select * from `order`;