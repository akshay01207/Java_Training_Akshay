create database DPhone_corporation

use DPhone_corporation

--User(userId,first name,last name, address, mobile, email, username, password,referral points )--
CREATE table User(
	userId int NOT NULL PRIMARY KEY,
	first_name nvarchar(30),
    last_name nvarchar(30),
    address nvarchar(40), 
    mobileNo nvarchar(12), 
    email varchar(20), 
    username varchar(20),
    u_password nvarchar(20),
    referral_points varchar(50)
    );
    /* input values User */
   insert into User values (101,'Mahesh', 'Kumar','noida','8627024573','mahesh@gmail.com','mahesh123',123456,0);
   insert into User values (102,'akshay', 'Kumar','greater noida','955759000','akshay@gmail.com','akshay123',123456,0);
   insert into User values (103,'arpit', 'verma','gzb','238642323','arpit@gmail.com','arpit123',123456,0);
   insert into User values (104,'ashvani', 'Kumar','delhi','12342353','ashvani@gmail.com','ashvani123',123456,0);
   insert into User values (105,'anand', 'Kumar','delhi','976436432','anand@gmail.com','anand123',123456,0);
   select * from user;
   
   
        create table Referral( 
        referalId int primary key ,
        referral_fname nvarchar(30),
		referral_lname nvarchar(30),  
        mobile varchar(10), 
        email varchar(50), 
        userId int , 
        datereferral Date, 
        status boolean DEFAULT -0 , 
        foreign key(userId) references User(userId)
        );
        
        /* input values Referral */
        insert into Referral values(051, 'Mohit', 'kumar','45678987','mohc@gmail',101,'2021-12-11',false);
        
         insert into Referral values (1001,'akash', 'Kumar','8627024573','akash@gmail.com', 101, '2022-12-11',false);
         insert into Referral values (1002,'anand', 'singh','9763223457','anand@gmail.com', 102, '2022-02-10',false);
         insert into Referral values (1003,'akash', 'gautam','0976323243','kumar@gmail.com', 101, '2022-03-31',false);
         insert into Referral values (1004,'annu', 'rajput','8627024573','annu@gmail.com', 104, '2021-12-11',false);
         insert into Referral values (1005,'sagar', 'gujjar','8627024573','sagar@gmail.com', 103, '2022-12-12',false);
		 insert into Referral values (1005,'sagar', 'gujjar','8627024573','sagar@gmail.com', 103, '2022-09-21',true);

         select * from Referral;
         
         /*1. Display total number of referral done by particular user by userId.*/
         select * from Referral where userId=101;
         
         /* 3. Display name and mobile of user whose referral customer have purchased item on 21/09/2022*/
         
         select u.first_name, u.mobileNo from User u
         inner join Referral r
         ON
         u.userId=r.userId;
         
         select u.first_name,u.mobileNo, r.datereferral from User u 
         inner join Referral r 
         where u.userId=r.userId && r.datereferral='2022-09-21';
         
        create table Customer(
        custermerId int primary key, 
        c_fname nvarchar(30),
		c_lname nvarchar(30),
        mobile varchar(50));
        insert into Customer values(111, 'akshay', 'singh','9557595977');
         insert into Customer values(112, 'anand', 'kumar','9557595977');
          insert into Customer values(113, 'raj', 'sinha','9557595977');
           insert into Customer values(114, 'ankit', 'tomar','9557595977');
           
             select * from Customer;
        
        create table BuyingDetails( 
        custermerId int,
        userId int,
        purchase date, 
        productName varchar(10), 
        Foreign key(custermerId) references Customer(custermerId),
        Foreign key(userId) references User(userId));
        
        insert into BuyingDetails values(111, 101, '2022-09-21', 'iPhone14');
		insert into BuyingDetails values(112, 102, '2022-09-21', 'iPhone13');
		insert into BuyingDetails values(113, 101, '2022-09-21', 'iPhone14');
		insert into BuyingDetails values(114, 104, '2022-09-21', 'iPhone11');
        delete from BuyingDetails where 
         select * from BuyingDetails;
        select * from BuyingDetails where custermerId= 101;
        
