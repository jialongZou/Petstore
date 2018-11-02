create database swagger;
use swagger;
-- 用户表
create table User(
  id int auto_increment primary key ,
  username varchar(20) not null,    -- 用户名
  password varchar(20) not null ,   -- 密码
  firstName varchar(10) not null ,  -- 名
  lastName varchar(20) not null ,   -- 姓
  email varchar(20) not null ,      -- email
  phone varchar(20) not null ,      -- 电话
  status int default 1 check (status=0 or status=1)
);-- status代表当前用户的状态（1为在用or0为弃用）

-- 标签表（宠物的标签，例如 可爱型、帅气型）
create table Tag(
  id int auto_increment primary key ,
  name varchar(10) not null
);

-- 类别表(宠物的类别，例如是猫是狗)
create table category(
  id int auto_increment primary key ,
  name varchar(10) not null
);

-- 宠物表
create table Pet (
  id         int auto_increment primary key,
  categoryId int         not null, -- 类别(外键)
  name       varchar(10) not null, -- 名字
  photoUrls  varchar(100),         -- 图片地址
  tagId      int,                  -- 标签(外键)
  status     varchar(10),          -- 状态
  foreign key (tagId) references Tag (id),
  foreign key (categoryId) references category(id)
);

-- 订单表
create table `order` (
  id       int  auto_increment primary key,
  petId    int  not null , -- 宠物编号
  quantity int  not null, -- 数量
  shipDate date , -- 发货日期
  status   varchar(10),   -- 订单状态
  complete varchar(10) default 'false'check (complete='false' or complete='true'),
  foreign key (petId) references pet (id)
);