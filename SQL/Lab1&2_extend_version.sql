--Lab 1 extend
-- create database
create database StudentManagement
-- use database
use StudentManagement


--create tables
create table department(
	did varchar(10) primary key,
	dname varchar(255),
	year int
)

create table student(
	sid varchar(10) primary key,
	name nvarchar(255),
	birthday date,
	did varchar(10) foreign key references department(did)
)

create table courses(
	cid varchar(10) primary key,
	cname varchar(255),
	credit int,
	did varchar(10) foreign key references department(did)
)

create table condition(
	cid varchar(10) foreign key references courses(cid),
	precid varchar(10) foreign key references courses(cid)
	constraint PK_condition primary key(cid, precid) 
)

create table results(
	sid varchar(10),
	cid varchar(10),
	score float
)

--Lab2 extend
--Q1
insert into department(did, dname, year) values ('IT', 'Information Technology', 2012), ('ET', 'Electronic Technology', 1997), ('BT', 'Biotechnology', 1997), ('FL', 'Foreign language', 2000), ('CT', 'Chemical Technology', 2011)
insert into student values ('S01', 'Phước Trần', '1990-02-24','IT'), ('S02', 'Timothy', '2000-12-12','IT'), ('S03', 'Kaily', '2001-10-01','ET'),('S04', 'Tâm Nguyễn', '1998-12-20','ET'),('S05', 'Lee Nguyễn ', '1999-02-28','BT')
insert into courses values ('OOP','Object Oriented Programming','4','IT'),('PM','Programming method','4','IT'),('DBS','Database system','4','IT'),('SE','Software engineering','4','IT'),('CN','Computer network','3','IT')
insert into condition values('OOP','PM'),('DBS','PM'),('DBS','OOP'),('SE','OOP'),('SE','DBS')
insert into results values('S01','PM',9.5),('S01','OOP',10),('S02','PM',4.5),('S02','DBS',6.0),('S03','DBS',8.0)
--Q2
--2a
update student set birthday = '1999-02-20' where sid = 'S01'
--2b
update results set score = score + 1 where sid = 'S02' and cid = 'PM'
--2c
delete from results where score < 5
--Q3
--3a
alter table student add phone int
--3b
alter table student alter column phone varchar(10)
--3c
alter table student add constraint df_phone default 'None' for phone
--3d
alter table results alter column sid varchar(10) not null
alter table results alter column cid varchar(10) not null

alter table results add constraint PK_results primary key(sid, cid)
--3e
--i
alter table results add constraint FK_results_student foreign key (sid) references student(sid)
--ii
alter table results add constraint FK_results_courses foreign key (cid) references courses(cid)
--3f
--i
alter table results add constraint check_score check (score >= 0 and score <= 10)
--ii
alter table courses add constraint check_credit check (credit >= 1 and credit <= 12)
--iii
alter table courses add constraint CnameMustBeUnique unique (cname)
--3g
alter table student drop constraint df_phone
alter table student drop column phone
--3h
alter table courses drop constraint check_credit

sp_help student
select * from department
select * from student
select * from courses
select * from condition
select * from results