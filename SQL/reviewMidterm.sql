create database NGK

use NGK

--cau 1
--a
create table LoaiNGK(
	Maloai varchar(10) primary key,
	Tenloai varchar(255) unique
)
--b
create table NGK(
	MaNGK varchar(10) primary key,
	TenNGK varchar(255) unique,
	DVT varchar(10) constraint ck_dvt check (DVT = 'thung' or DVT = 'lon' or DVT = 'chai' or DVT = 'ket'),
	soluong int constraint ck_sl check (soluong > 0),
	dongia int constraint ck_dg check (dongia > 0),
	maloaingk varchar(10) foreign key references LoaiNGK(Maloai)
)
--c
create table khachhang(
	msKH varchar(10) primary key,
	hoten varchar(255),
	diachi varchar(255),
	dienthoai varchar(10) constraint macdinh_dienthoai default 'chua co'
)
--d
create table hoadon(
	sohd int primary key,
	mskh varchar(10) foreign key references khachhang(msKH),
	nhanvien varchar(255),
	ngaylap date constraint ngayhientai default getdate()
)
--e
create table cthd(
	sohd int,
	MaNGK varchar(10),
	constraint PK_cthd primary key(sohd, MaNGK),
	Soluong int constraint ck_soluong check (Soluong > 0),
	dongia int
)
--f
alter table cthd add thanhtien int
alter table cthd add constraint FK_cthd_hoadon foreign key (sohd) references hoadon(sohd)
alter table cthd add constraint FK_cthd_NGK foreign key (MaNGK) references NGK(MaNGK)
alter table NGK add constraint ck_dongia check (dongia > 1000)
--g
alter table cthd drop constraint FK_cthd_hoadon
--h
alter table cthd add constraint ck_thanhtien check (thanhtien > 0)