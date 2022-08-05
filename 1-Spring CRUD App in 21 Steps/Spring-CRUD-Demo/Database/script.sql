use projectdb

create table user (id int PRIMARY KEY AUTO_INCREMENT,loginid varchar(30),name varchar(20),status varchar(10),expiry date);

select * from user

drop table user