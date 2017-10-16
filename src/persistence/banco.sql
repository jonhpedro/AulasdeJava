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


create table funcionario(
id bigint primary key auto_increment,
nome varchar (150) not null,
cpf varchar (15) not null,
sexo enum("Masculino", "Feminino") not null,
email varchar (150) not  null,
login varchar (50) not null,
senha varchar (255) not null,
salario float8 not null,
matricula bigint not null
);

