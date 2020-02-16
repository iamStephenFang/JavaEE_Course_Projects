create table customer
(
    customerID int not null
        primary key,
    account varchar(20) null,
    password varchar(20) null,
    name varchar(20) null,
    sex tinyint(1) null,
    birthday date null,
    phone varchar(20) null,
    email varchar(100) null,
    address varchar(200) null,
    zipcode varchar(10) null,
    fax varchar(20) null
);
