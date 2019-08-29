create database cubic_technologies;

-- drop database employees;
show databases;
use cubic_technologies;

show tables;
drop table employees;
create table employees(
	id int auto_increment not null ,
    name varchar(50) not null,
    address varchar(50) not null,
    phone_number varchar(10),
    country varchar(20) default "USA" ,
    primary key(id)
);

-- alter table employees add primary key(id); 

desc employees;

show tables;

insert into employees(name, address, phone_number)
values("Subash", "Fairfax", "4322199910");

insert into employees(name, address, phone_number,country)
values("Abhinash", "Fairfax", "4322145910","Nepal");

insert into employees(name, address, phone_number)
values("Bishal", "Fairfax", "4322199910");


select * from employees;
select name,address,phone_number from employees where phone_number="4322199910";

update employees set address="Circle Tower" where name="subash";

delete from employees where id=3;


use cubic_technologies;

show tables;

create table departments(
id int not null primary key,
name varchar(30) not null,
description varchar(100),
block varchar(10) not null
);

insert into departments(id, name, description, block)
select 1 as id, 'HR' as name, 'Human Resources' as description, '2A' as block from dual union
select 2 as id, 'Dev1' as name, 'Development 1' as description, '3A' as block from dual;

select * from departments;

select * from employees;

update employees set dept_id=1;

alter table employees add column dept_id int not null;

alter table employees add foreign key(dept_id) references departments(id);


desc employees;

select * from employees;

select * from departments;

insert into employees(name, address,phone_number,dept_id)
select 'bhisma','boston','1234567898',2 from dual union
select 'yadav','virginia','9876567898',2 from dual union
select 'sunny','baltimore','1234567898',2 from dual;

select e.name as employee_name,e.address,e.phone_number, d.name as department_name,
d.description, d.block
from employees e, departments d where e.dept_id=d.id;

select * from employees;

