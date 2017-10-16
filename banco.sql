drop database if exists projetobd;

create database projetobd;

use projetobd;

create table produto(
id bigint primary key auto_increment,
nmProduto varchar(50) not null,
Descpord varchar(255),
preco float8 not null,
qtd int not null
);

insert into produto(nmProduto,Descpord,preco,qtd)values("Camisa","Camisa Senac TI",45.00,20);
select * from produto;