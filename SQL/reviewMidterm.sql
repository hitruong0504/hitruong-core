create database NGK

use NGK

--1
create table LoaiNGK(
	maloai varchar(10) primary key,
	tenloai nvarchar(255) unique
)

create table NGK(
	mangk varchar(10) primary key,
	tenngk nvarchar(255) unique,
	dvt varchar(20) constraint ck_dvt check(dvt = 'lon'or dvt = 'thung' or dvt = 'ket'or dvt = 'chai'),
	soluong int constraint ck_soluong_ngk check(soluong > 0),
	dongia float constraint ck_dongia check (dongia > 0),
	maloaingk varchar(10) foreign key references LoaiNGK(maloai)
)


create table khachhang(
	mskh varchar(10) primary key,
	hoten nvarchar(255),
	diachi nvarchar(255),
	dienthoai varchar(20) constraint df_dienthoai default 'chua co'
)

create table hoadon(
	sohd int primary key,
	mskh varchar(10) foreign key references khachhang(mskh),
	nhanvien nvarchar(255),
	ngaylap date constraint df_ngaylap default getdate()
)

create table cthd(
	sohd int,
	mangk varchar(10),
	soluong int constraint ck_soluong_cthd check(soluong > 0),
	dongia float
	constraint PK_ctdh primary key(sohd, mangk)
)
--f
alter table cthd add thanhtien int
alter table cthd add constraint FK_cthd_hoadon foreign key (sohd) references hoadon(sohd)
alter table cthd add constraint FK_cths_NGK foreign key (mangk) references NGK(mangk)
alter table cthd add constraint ck_dongia_cthd check(dongia > 1000)
--g
alter table cthd drop constraint FK_cths_NGK
alter table cthd drop constraint FK_cthd_hoadon 
--h
alter table cthd add constraint ck_thanhtien check(thanhtien > 0)

--2
--a
insert into LoaiNGK values('PEP', 'Nuoc co ga'), ('NK', 'Nuoc khoang'), ('Olong', 'Nuoc ngot')
insert into NGK values ('S1', 'PEPSIl', 'lon', 1, 10000, 'PEP'), ('S2', 'PEPSIt', 'thung', 1, 180000, 'PEP'), ('S3', 'Olong', 'chai', 1, 10000, 'Olong')
insert into khachhang values('k1', 'John', 'Hanoi', '0326496541'), ('k2', 'Mai', 'TPHCM', '0634219578'), ('k3', 'Eit', 'TPHCM', '')
insert into hoadon values(1, 'k1', 'A1', default), (2, 'k2', 'A1', default), (3, 'k3', 'B3', default)
insert into cthd values(1, 'S1', 1, 10000, 10000), (2, 'S2', 1, 180000, 180000), (3, 'S3', 1, 10000, 10000)
--b
update NGK set dongia = dongia + 10000 where dvt = 'lon'
--c
delete k
from khachhang k
join hoadon h on k.mskh = h.mskh and year(h.ngaylap) < '2010'
--d
delete from NGK where soluong = 0
--e
update NGK set dongia = 
case when dongia + 100000 > 500000 then 500000 else dongia + 100000 end
where dvt = 'thung'
--3
--a
select *
from NGK
where dvt = 'lon'
--b
select *
from khachhang
where diachi = 'TPHCM'
--c
select n.tenngk
from cthd c, NGK n, hoadon h
where c.sohd = h.sohd and c.mangk = n.mangk
and MONTH(h.ngaylap) >= 7 and MONTH(h.ngaylap) <= 9 and YEAR(h.ngaylap) < 2018
--d
select n.tenngk, c.soluong
from cthd c, NGK n
where c.mangk = n.mangk
--e
SELECT C.SOHD
FROM CTHD C, LOAINGK L, NGK N
WHERE (C.MANGK = N.MANGK) AND (N.MALOAINGK = L.MALOAI) AND (L.TENLOAI = 'NUOC CO GA' AND L.TENLOAI = 'NUOC NGOT')