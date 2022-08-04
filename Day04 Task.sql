create database company
use company

create table brand (id int primary key identity, name varchar(30))
insert into brand values('boat')
insert into brand values('vimal')
insert into brand values('vimals')
insert into brand values('jwellery')
insert into brand values('being human')
insert into brand values('ubon')
insert into brand values('rupa')
insert into brand values('one plus')
insert into brand values('uborn')
insert into brand values('Hrititk')


drop table brand

select * from brand order by id

create table celebrity (id int identity, name varchar(30) primary key)

insert into celebrity values('akshay kumar')
insert into celebrity values('srk')
insert into celebrity values('ajay devgan')
insert into celebrity values('aishvarya')
insert into celebrity values('salman khan')
insert into celebrity values ('tiger shroff')
insert into celebrity values ('ranvir singh')
insert into celebrity values('john')
insert into celebrity values('shraddha')
insert into celebrity values('hrx')
insert into celebrity values('vicky')

select * from celebrity order by id

create table endorsement(id int primary key identity, name varchar(30), bid numeric(5)
FOREIGN KEY (name) REFERENCES celebrity(name))

insert into endorsement values ('akshay kumar',1235)
insert into endorsement values ('srk',1235)
insert into endorsement values('ajay devgan', 1235)
insert into endorsement values('aishvarya',1236)
insert into endorsement values('salman khan', 1237)
insert into endorsement values('tiger shroff' ,1237)
insert into endorsement values('ranvir singh', 1238)
insert into endorsement values('john', 1241)
insert into endorsement values('shraddha',1243)
insert into endorsement values('hrx',1248)

select * from endorsement

select * from brand 

select b.id, b.name, e.id, e.name from brand as b inner join endorsement as e on b.name=e.name

select b.id, b.name, e.id, e.name from brand as b
full join
endorsement as e on b.name=e.name
where e.id is null

select b.id, b.name, e.id, e.name from brand as b
full join
endorsement as e on b.name=e.name
where e.id is not null

 
select b.id, b.name, e.id, e.name from brand as b
full join
endorsement as e on b.name=e.name
where e.id is null or b.id is null