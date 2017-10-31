

create database mts;
use mts;

create table mts.ACCOUNTS(
num varchar(12),
balance double,
type varchar(10)
);

insert into mts.ACCOUNTS('1',1000.00,'SAVINGS');
insert into mts.ACCOUNTS('2',1000.00,'SAVINGS');