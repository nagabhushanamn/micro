

--create database mts;
--use mts;

create table if not exists ACCOUNTS(
num varchar(12),
balance double,
acc_type varchar(10)
);

insert into ACCOUNTS values('1',1000.00,'SAVINGS');
insert into ACCOUNTS values('2',1000.00,'SAVINGS');