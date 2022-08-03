use Ecommerce
create table Persons(Id int primary key identity(1,1),Name nvarchar(50),Number numeric,City nvarchar(200))
insert into Persons values ('Akshay', 9557594942, 'Greater Noida')
insert into Persons values ('mohit', 9557594943, 'Greater Noida')
insert into Persons values ('Arpit', 9557594944, 'Noida')
insert into Persons values ('aakash', 9557594952, 'Delhi')
insert into Persons values ('samman', 9557594972, 'Faridabad')


select * from Persons

create table Items(Id int primary key identity(1,1) ,Name nvarchar(20),Price numeric(18,2), Color nvarchar(20))
insert into Items values('jeans', 1000, 'black')
insert into Items values('t-shirt', 500, 'grey')
insert into Items values('shoes', 3000, 'white')
insert into Items values('cup', 300, 'green')
insert into Items values('table', 3000, 'wooden black')

select * from Items

create table Orders_Details(id int primary key identity(1,1), Item_Id int NOT NULL, Persons_Id int NOT NULL, payment_mode nvarchar(20),
constraint fk_ord_Items_Id 
foreign key (Item_Id)
references Items (Id),
constraint fk_ord_Persons_Id 
foreign key (Persons_Id)
references Persons(id)
)

insert into orders values(1, 108, 'COD')
insert into orders values(2, 104, 'Online')
insert into orders values(3, 101, 'Card')
insert into orders values(4, 102, 'Online')
insert into orders values(5, 109, 'COD')

select * from orders



drop table Persons