--Alter Operation

--Part – A:

--Use Deposit table of lab-1.

--From the above given tables perform the following queries (ALTER Operation):

--1. Add two more columns City VARCHAR (20) and Pincode INT.
	Alter table DEPOSIT Add CITY VARCHAR(20),PINCODE INT;
		select * from DEPOSIT;

--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
	alter table DEPOSIT alter column CNAME VARCHAR(35);
	select * from DEPOSIT;

--3. Change the data type DECIMAL to INT in amount Column.
	Alter table DEPOSIT alter column AMOUNT INT;
	select * from DEPOSIT;

--4. Rename Column ActNo to ANO.
	exec SP_RENAME 'DEPOSIT.ACTNO' , 'ANO';
		

--5. Delete Column City from the DEPOSIT table.
     alter table deposit drop column city ;

--6. Change name of table DEPOSIT to DEPOSIT_DETAIL.
     exec sp_rename 'deposit' ,'deposit_detail' ; 

--Part – B:
--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
     exec SP_RENAME 'DEPOSIT_DETAIL.ADATE' , 'AOPENDATE ';
	 select * from DEPOSIT_DETAIL

--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
      alter table DEPOSIT_DETAIL drop column AOPENDATE ;


--3. Rename Column CNAME to CustomerName.
     exec SP_RENAME 'DEPOSIT_DETAIL.CNAME' , 'CustomerName ';

--	 Part – C:
--Create following table using query according to the definition.
create table STUDENT_DETAIL(
		Enrollment_No VARCHAR(20),
		Name VARCHAR(25),
		CPI DECIMAL(5,2),
		Birthdate DATETIME
		)

--1. Add two more columns City VARCHAR (20) (Not null) and Backlog INT (Null).
alter table STUDENT_DETAIL add city varchar(20) not null , Backlog INT Null;
select * from STUDENT_DETAIL;
--2. Change the size of NAME column of student_detail from VARCHAR (25) to VARCHAR (35).
alter table STUDENT_DETAIL alter column Name varchar(35);
--3. Change the data type DECIMAL to INT in CPI Column.
alter table STUDENT_DETAIL alter column CPI int;
--4. Rename Column Enrollment_No to ENO.
exec sp_rename 'STUDENT_DETAIL.Enrollment_No','ENO';
--5. Delete Column City from the student_detail table.
alter table student_detail drop column City;
--6. Change name of table student_detail to STUDENT_MASTER
exec sp_rename 'STUDENT_DETAIL','STUDENT_MASTER';




--	 Part – A: (DELETE, Truncate, Drop Operation)
--Use Deposit_Detail table (Altered table of DEPOSIT)
--1. Delete all the records of DEPOSIT_DETAIL table having amount greater than and equals to 4000.
delete from deposit_detail where amount>= 4000;
--2. Delete all the accounts CHANDI BRANCH.
delete from deposit_detail where branch = "chandi";
--3. Delete all the accounts having account number (ANO) is greater than 105.
delete from deposit_detail where ano>=105;
--4. Delete all the records of Deposit_Detail tabl
drop table deposite_detail;


--Part – B:
--Create following table using query according to the definition.
create table EMPLOYEE_MASTER(

EmpNo INT,
EmpName VARCHAR(25),
JoiningDate DATETIME,
Salary DECIMAL (8,2),
City VARCHAR(20)
);

insert into EMPLOYEE_MASTER values (101, 'Keyur', '5-1-02', 12000.00 ,'Rajkot')
insert into EMPLOYEE_MASTER values(102, 'Hardik', '15-2-04', 14000.00,'Ahmedabad')
insert into EMPLOYEE_MASTER values(103, 'Kajal','14-3-06', 15000.00,' Baroda')
insert into EMPLOYEE_MASTER values(104, 'Bhoomi', '23-6-05', 12500.00,' Ahmedabad')
insert into EMPLOYEE_MASTER values(105, 'Harmit', '15-2-04', 14000.00 ,'Rajkot')
insert into EMPLOYEE_MASTER values(106, 'Mitesh', '25-9-01', 5000.00 ,'Jamnagar')
insert into EMPLOYEE_MASTER values(107, 'Meera', Null, 7000.00,' Morbi')
insert into EMPLOYEE_MASTER values(108, 'Kishan', '6-2-03', 10000.00, NULL)

--1. Delete all the records of Employee_MASTER table having salary greater than and equals to 14000.
delete from deposit_detail where amount>= 4000;
--2. Delete all the Employees who belongs to ‘RAJKOT’ city.
--3. Delete all the Employees who joined after 1-1-2007.
--4. Delete the records of Employees whose joining date is null and Name is not null.
--5. Delete the records of Employees whose salary is 50% of 20000.
--6. Delete the records of Employees whose City Name is not empty.
--7. Delete all the records of Employee_MASTER table. (Use Truncate)
--8. Remove Employee_MASTER table. (Use Drop)
