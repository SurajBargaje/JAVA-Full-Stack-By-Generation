use companydb;
insert into employee(EmployeeID, FirstName,LastName,Postion,Department,Salary)
values(1,'Ajay','Sharma','Manager','HR',60000),
(2,'Amar','Rawat','Developer','IT',55000),
(3,'Mahesh','Yadav','Accountant','Finance',50000),
(4,'Evina','Steve',' Sales Manager','Sales',58000),
(5,'Dinesh','Kumar','Marketing Exec','Marketing',52000);

insert into departments(DepartmentId,DepartmentName,ManagerId)
values(1,'HR',1),
(2,'IT',2),
(3,'Finance',3),
(4,'Sales',4),
(5,'Marketing',5);

select * from employee;
select * from Departments;

select * from employee 
order by salary desc;

select * from employee where
employeeeID >2;




select FirstName as EmpName ,Salary as EmpSalary from employee;

select concat( FirstName,' ',LastName) as EmpName ,Salary as EmpSalary from employee;