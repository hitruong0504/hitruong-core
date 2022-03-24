create database QuanLySanBong

use QuanLySanBong
--1
create table san(
	masan int primary key,
	tensan varchar(255) unique,
	sotien float constraint ck_tien check(sotien >= 0)
)

create table khachhang(
	sdt varchar(20) primary key,
	hoten nvarchar(255)
)


create table dichvu(
	madv varchar(10) primary key,
	tendv nvarchar(255),
	soluong int constraint ck_soluong check (soluong >= 0),
	dongia float
)

create table phieudatsan(
	mads int primary key,
	sdt varchar(20) foreign key references khachhang(sdt),
	ngaydat date constraint df_date default getdate(),
	ngaythidau date,
	giobatdau time,
	gioketthuc time
)

create table hoadon(
	sohd int primary key,
	ngaylap date,
	mads int foreign key references phieudatsan(mads)
)

create table cthd(
	sohd int foreign key references hoadon(sohd),
	madv varchar(10) foreign key references dichvu(madv),
	soluong int,
	dongia float,
	constraint PK_cthd primary key(sohd, madv)
)

--2
insert into San values(101, 'A', 15000), (102, 'B', 17000), (110, 'F', 25000), (111, 'G', 15500), (108, 'Z', 30000)
insert into khachhang values('0953421652', 'John'), ('0653416982', 'Camelia'), ('0632198543', 'Miden'), ('0563217943', 'Biden'), ('0314965278', 'Putin')
insert into dichvu values('WT', 'Nuoc nong', 10, 70000), ('PEP', 'Nuoc uong', 1, 10000), ('LD', 'Muon ao', 1, 100000), ('TO', 'Muon khan', 1, 50000), ('NG', 'Nuoc co ga', 1, 12000), ('FD', 'Thuc an', 1, 20000)


insert into phieudatsan values
(1 , '0953421652', '2022-03-24', '2022-03-31', '17:00', '19:00'), 
(2 , '0953421652', '2022-04-07', '2022-04-14', '17:00', '19:00'),
(3 , '0953421652', '2022-05-01', '2022-05-01', '17:00', '19:00'),
(4 , '0653416982', '2022-03-24', '2022-03-31', '15:00', '17:00'),
(5 , '0632198543', '2022-03-24', '2022-03-31', '9:00', '11:00'),
(6 , '0314965278', '2022-03-25', '2022-04-04', '17:00', '19:00'),
(7 , '0314965278', '2022-04-03', '2022-04-10', '17:00', '19:00'),
(8 , '0632198543', '2022-03-24', '2022-03-31', '7:00', '9:00'),
(9 , '0632198543', '2022-04-01', '2022-04-08', '17:00', '19:00'),
(10 , '0314965278', '2019-12-01', '2019-12-02', '7:00', '9:00')


insert into hoadon values
(1001, '2022-03-24', 1),
(1010, '2022-03-24', 2),
(1003, '2022-03-24', 3),
(1100, '2022-03-24', 4),
(1101, '2022-03-24', 5),
(1011, '2022-03-24', 6),
(1006, '2022-03-24', 7),
(1007, '2022-03-24', 8),
(1009, '2022-03-24', 9),
(1008, '2022-03-24', 10)

insert into cthd values
(1001, 'PEP', 1, 10000),
(1010, 'FD', 1, 20000),
(1101, 'PEP', 1, 10000),
(1003, 'NG', 1, 12000),
(1100, 'NG', 1, 12000),
(1011, 'TO', 1, 50000),
(1006, 'LD', 1, 100000),
(1007, 'PEP', 1, 10000),
(1009, 'PEP', 1, 10000),
(1008, 'PEP', 1, 10000)

--3
--a
alter table cthd add constraint ck_soluong_cthd check(soluong > 0)
alter table cthd add constraint ck_dongia check(dongia > 0)
--b
alter table hoadon add tongtien int
alter table hoadon drop column tongtien
--c
alter table hoadon add constraint df_tongtien default 0 for tongtien
alter table hoadon drop constraint df_tongtien

--4
--a
select tendv from dichvu where soluong >= 10
--b
select k.sdt, k.hoten, p.ngaydat, p.ngaythidau
from khachhang k, phieudatsan p
where k.sdt = p.sdt and (p.ngaydat >= '2019-10-01' and p.ngaydat <= '2019-12-31')
--c
select k.sdt, k.hoten, count(p.sdt) as 'so lan dat'
from khachhang k, phieudatsan p
where p.sdt = k.sdt and year(p.ngaydat) = '2019'
group by p.sdt, hoten, k.sdt
--d
select top 1 tongtien from hoadon order by tongtien desc
--e
update dichvu set soluong = soluong + 10 where madv ='PEP'
--f
update dichvu set dongia =
case when dongia + 100000 > 200000 then 200000 else dongia + 100000 end
where madv = 'PEP'
--g
select tendv
from dichvu
where madv in
(
select top 3 madv
from cthd
group by madv
order by count(madv) desc
)
--h
select tendv
from dichvu
where madv not in
(
select top 3 madv
from cthd
group by madv
order by count(madv) desc
)
