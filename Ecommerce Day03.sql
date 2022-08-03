use Ecommerce
create table products(id int primary key ,name nvarchar(20),price numeric(18,2),category nvarchar(20))
insert into products values(1,'earphone',1240,'electronics')
insert into products values(2,'breads',40,'grocery')
insert into products values(3,'table',3020,'furniture')
insert into products values(4,'shoe',2500,'footwear')
insert into products values(5,'chips',30,'snacks')
insert into products values(6,'charger',1250,'electronics')
insert into products values(7,'chair',7000,'furniture')
insert into products values(8,'mobile',20999,'electronics')
insert into products values(9,'notebook',60,'stationary')
insert into products values(10,'pen',20,'stationary')
select * from products

create table customer(id int,name nvarchar(20),number int,address nvarchar(20))
insert into customer values(1,'Mohit',951243,'Greater Noida')
insert into customer values(2,'Rahul',765823,'Bareilly')
insert into customer values(3,'Rohit',123456,'Rewari')
insert into customer values(4,'Param',111111,'Sonipat')
insert into customer values(5,'Sahil',866832,'Delhi')
insert into customer values(6,'Akshay',987583,'Noida')
insert into customer values(7,'Sonu',985364,'Narnaul')
insert into customer values(8,'Sumit',564783,'Gurgaon')
insert into customer values(9,'Gaurav',342274,'Gangtok')
insert into customer values(10,'Saurav',974833,'Gwalior')
select * from customer

create table orders(order_no int,items int,price numeric(18,2),name nvarchar(20))
insert into orders values(1024,3,2000,'Saurav')
insert into orders values(1025,2,5000,'Sumit')
insert into orders values(1026,12,7000,'Akshay')
insert into orders values(1027,6,3000,'Param')
insert into orders values(1028,2,1000,'Rahul')
insert into orders values(1029,4,2200,'Mohit')
insert into orders values(1030,1,20999,'Rohit')
insert into orders values(1031,2,1600,'Sahil')
insert into orders values(1032,4,1100,'Sonu')
insert into orders values(1033,1,1040,'Gaurav')
select * from orders


create table account(id int,name nvarchar(20),order_no nvarchar(20),address nvarchar(20))
insert into account values(1,'Mohit',1029,'Greater Noida')
insert into account values(2,'Rahul',1028,'Bareilly')
insert into account values(3,'Rohit',1030,'Rewari')
insert into account values(4,'Param',1027,'Sonipat')
insert into account values(5,'Sahil',1031,'Delhi')
insert into account values(6,'Akshay',1026,'Noida')
insert into account values(7,'Sonu',1032,'Narnaul')
insert into account values(8,'Sumit',1025,'Gurgaon')
insert into account values(9,'Gaurav',1033,'Gangtok')
insert into account values(10,'Saurav',1024,'Gwalior')

select * from account

Create View product 
as
select name, price from product as p
inner join account as a on p.id=a.id;

--Operators in SQL 
use Ecommerce
Create table Emp_Kanpur(id int primary key identity(1,1), name nvarchar(50), salary numeric(18,0), city nvarchar(30))
Create table Emp_Lucknow(id int primary key identity(1,1), name nvarchar(50), salary numeric(18,0), city nvarchar(30))

insert into Emp_Kanpur values('akshay', 42000, 'Gr. Noida')
insert into Emp_Kanpur values('aksh', 40000, 'Noida')
insert into Emp_Kanpur values('Mohit', 43000, 'Gr. Noida')
insert into Emp_Kanpur values('akhand', 32000, 'Delhi')
insert into Emp_Kanpur values('anand', 52000, 'Kanpur')
insert into Emp_Kanpur values('anand',null, 'Kanpur')


insert into Emp_Lucknow values('akshay', 42000, 'Lucknow')
insert into Emp_Lucknow values('aksh', 40000, 'Lucknow')
insert into Emp_Lucknow values('Mohit', 43000, 'Lucknow')
insert into Emp_Lucknow values('akhand', 32000, 'lucknow')
insert into Emp_Lucknow values('anand', 52000, 'lucknow')
insert into Emp_Lucknow values('anand', 52000, 'Kanpur')

Select * from Emp_Kanpur

Select * from product where name='earphone'

select * from Emp_Kanpur
union 
select * from Emp_Lucknow 

select name, city from Emp_Kanpur
intersect 
select name, city from Emp_Lucknow 

select * from Emp_Kanpur where name in ('Mohit','mahesh','anand')

select * from Emp_Kanpur where salary in (25000, 40000, 32000)

select * from Emp_Kanpur where salary between 25000 and 40000
select * from Emp_Kanpur where salary not between 40000 and 42000

select * from Emp_Kanpur where salary is null
select * from Emp_Kanpur where salary is not null


select * from Emp_Kanpur where name like 'A%'
select * from Emp_Kanpur where name like '%a%'

select * from Emp_Kanpur where name like 'NI[EO]T'

select name, city, salary from Emp_Kanpur where city like '[an]%'

select * from Emp_Lucknow where exists (select * from Emp_Kanpur where Emp_Lucknow.salary=Emp_Kanpur.salary)
