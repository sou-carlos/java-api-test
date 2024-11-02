create table doctors(
 id bigint not null auto_increment,
 name varchar(100) not null,
 email varchar(100) not null unique,
 crm varchar(6) not null unique,
 specialty varchar(50) not null,
 logradouro varchar(100) not null,
 bairro varchar(100) not null,
 cep varchar(20) not null,
 complemento varchar(100),
 address_number varchar(10),
 uf char(2) not null,
 city varchar(100) not null,

primary key(id)
);