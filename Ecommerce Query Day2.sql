create database Ecommerce
use Ecommerce
create table product(id int,name nvarchar(20),price numeric(18,2),category nvarchar(20))
insert into product values(1,'earphone',1240,'electronics')
insert into product values(2,'breads',40,'grocery')
insert into product values(3,'table',3020,'furniture')
insert into product values(4,'shoe',2500,'footwear')
insert into product values(5,'chips',30,'snacks')
insert into product values(6,'charger',1250,'electronics')
insert into product values(7,'chair',7000,'furniture')
insert into product values(8,'mobile',20999,'electronics')
insert into product values(9,'notebook',60,'stationary')
insert into product values(10,'pen',20,'stationary')
select * from product

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

create view order_view
as select c_id,c_name,order_no 
from customer as c inner join orders as o on c.c_name=o.name

select * from order_view


---CREATE VIEW customer_detail
---as select c_id,c_name,number,address,order_no,card_no
---from customer as c inner join account as a on c.c_name=a.acc_name

select * from customer_detail


---create view order_detail
---as select order_no,p_name,p_price,p_category 
---from orders as o inner join product as p on o.p_id=p.p_id

select * from order_detail

---create view full_detail
---as select c_id,c_name,p_name,p_category,p_price,order_no
---from ((orders as o inner join product as p on o.p_id=p.p_id) inner join
---customer as c on o.name=c.c_name)

select * from full_detail