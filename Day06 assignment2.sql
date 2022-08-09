create database flightmanagement
use flightmanagement

select*from employee

--EMPLOYEE TABLE--

create table employee(emp_id int PRIMARY KEY IDENTITY(1001,1), emp_name nvarchar(30), Department nvarchar(20))
insert into employee values ('Mahesh Kumar','IT')
insert into employee values ('Suresh Goel','Attendant')
insert into employee values ('Harshit Kumar','Management')
insert into employee values ('Raj SIngh','Security')
insert into employee values ('Jaspreet Makol','Management')

--TICKET BOOKING-
select * from ticket
drop table ticket
create table ticket(t_id int PRIMARY KEY IDENTITY(2001,1), t_time nvarchar(30), Cost int)

insert into ticket values (19, '8000')
insert into ticket values (07, '18000')
insert into ticket values (23, '7500')
insert into ticket values (11, '20000')
insert into ticket values (15, '13000')

--FLIGHT DETAILS--

select*from  flight

create table flight(f_id int PRIMARY KEY IDENTITY(700,1), f_name nvarchar(30), flight_from nvarchar(20), flight_to nvarchar(20), t_id int
CONSTRAINT fk_ticket_t_id
FOREIGN KEY (t_id)
REFERENCES ticket(t_id))
)

insert into flight values('Kingfisher', 'Delhi', 'Goa',2001)
insert into flight values('Spicejet', 'Ahemdabad', 'Gujrat',2002)
insert into flight values('Vistara', 'Jaipur', 'Mumbai',2003)
insert into flight values('Kingfisher', 'Goa', 'Dehradun',2004)
insert into flight values('Kingfisher', 'Delhi', 'Hyderabad',2005)

--CUTOMER TABLE--

select * from customer
drop table customer

create table customer(c_id int PRIMARY KEY IDENTITY(9000,1), c_name nvarchar(30), Phone_no nvarchar(20), f_id int, t_id int,
CONSTRAINT fk_ticket1_t_id
FOREIGN KEY (t_id)
REFERENCES ticket(t_id),
CONSTRAINT fk_flight_t_id
FOREIGN KEY (f_id)
REFERENCES flight(f_id)
)

insert into customer values('Ekjot Singh',8527024573,700,2001)
insert into customer values('Dilshan Sethi',9810095175,701,2002)
insert into customer values('Daksh Khanna',9910065175,702,2003)
insert into customer values('Aryaman Pasricha',9811319212,703,2004)
insert into customer values('Manzar Ahmed',9711999212,704,2005)



-- STORAGE PROCEDURE--


create procedure sp_flight1_customer
as
begin
select c.c_id,c_name,f.f_id,f.f_name
from customer c
left join flight f
on c.f_id=f.f_id
order by c_name
end

exec sp_flight1_customer


drop procedure sp_ticket1_customer
create procedure sp_ticket1_customer
as
begin
select c.c_id,c_name,t.t_id,t.t_time,t.cost
from customer c
right join ticket t
on c.t_id=t.t_id order by cost desc
end

exec sp_ticket1_customer