
create table employee(
id int(10) not null auto_increment ,
first_name varchar(30),
last_name varchar(30),
salary int(10) not null ,
primary key(id)
);

create table collections(
id int(10) not null auto_increment ,
number varchar(30),
primary key(id)
);




create table jsonobjects(
id int(10) not null auto_increment ,
JSON varchar(30),
primary key(id)
);