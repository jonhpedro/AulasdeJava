drop database if exists projetobd;
create database projetobd;
use projetobd;

create table produto(
id bigint primary key auto_increment,
nmProduto varchar(50) not null,
descProduto varchar(255),
preco float8 not null,
quantidade int not null
);

insert into produto(nmProduto,descProduto,preco,quantidade) 
values ("camisa","Camisa Senac TI", 45.00,20); 

select *from produto;