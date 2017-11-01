create database if not exists lovefood;

use lovefood;

create or replace table lovefood.funcionario (
	id BIGINT PRIMARY KEY auto_increment,
	nome varchar(150) not null,
	login varchar(50) not null unique,
	senha varchar(255) not null,
	nivel enum('ADMIN', 'NORMAL')
);


select * from lovefood.funcionario;

create or replace table lovefood.cliente (
	id BIGINT PRIMARY KEY auto_increment,
	nome varchar(150) not null,
	login varchar(50) not null unique,
	senha varchar(255) not null,
	endereco text not null,
	telefone varchar(255) not null
);

select * from lovefood.cliente;

SET @sql = CONCAT('SELECT ', (
		SELECT REPLACE(GROUP_CONCAT(COLUMN_NAME), 'senha,', '') 
		FROM INFORMATION_SCHEMA.COLUMNS 
		WHERE TABLE_NAME = 'funcionario' 
		AND TABLE_SCHEMA = 'lovefood'), ' FROM funcionario');

PREPARE stmt_find FROM @sql;
EXECUTE stmt_find;