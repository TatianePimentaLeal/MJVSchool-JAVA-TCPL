-- SQL - LINGUAGEM DE INTERACAO COM O BANCO DE DADOS
-- DDL - DEFINICAOO
create table tab_ficha_cadastral2 (
	nome varchar (50) not null,
	salario_minimo numeric(8,2) not null
);

-- DML - MANIPULACAOO DOS DADOS
insert into tab_ficha_cadastral2 
values ('GLEYSON SAMPAIO',1200.50); 

-- DQL
select nome, salario_minimo as sal_min 
from tab_ficha_cadastral2
where salario_minimo  > 1000.0 and salario_minimo  < 5000.0
-- and nome LIKE 'GLEYSON%'
;

-- Inclusao da profissao com first
alter table tab_ficha_cadastral2
add profissao varchar(50) not null first;

alter table tab_ficha_cadastral2
add salario_maximo numeric (8,2) null,
add data_nascimento date not null,
add cpf varchar(12) not null,
add rg varchar(10) not null,
add logradouro varchar (50) not null,
add numero int null,
add complemento varchar(30) null,
add bairro varchar(30) not null,
add municipio varchar(30) not null,
add UF char(2) not null,
add cep varchar (9) not null,
add naturalidade varchar (50) not null,
add pais varchar (50) not null,
add telefone varchar(12) null,
add celular varchar(12) not null,
add email varchar(100) not null;


alter table tab_ficha_cadastral2
add escolaridade ENUM('analfabeto', 'ensino fundamental incompleto', 'ensino fundamental completo', 'ensino medio completo', 'ensino medio incompleto', 'ensino superior completo', 'ensino superior incompleto');

-- Inclusao de Dev de acordo com a inclusao da coluna profissao
insert into tab_ficha_cadastral2 
values ('Dev','Tatiane', 1200.50, 3000.00,'2020-11-16','33457692807','424511010','RUA SEM NOME', 12,'BBRAUM','TERRA DO NUNCA', 'RIO DE JANEIRO','RJ','09060710','BRASILEIRA', 'BRASIL', '21999999999', '21888888888', 'TATYPLUMMER@GMAIL.COM', 'ensino superior completo');

insert into tab_ficha_cadastral2
values ('Dev','Lucca', 1200.50, 5000.00,'2022-10-22','00000000000','314511010','RUA SEM NOME', 33,'BBRAUM','TERRA DO NUNCA', 'RIO DE JANEIRO','SP','09060000','BRASILEIRA', 'BRASIL', '21999999999', '21888888888', 'LUCCA@GMAIL.COM', 'ensino superior completo');

insert into tab_ficha_cadastral2
values ('Dev','Dom', 1200.50, 4000.00,'2000-09-19','00000000001','426611010','RUA SEM NOME', 44,'BBRAUM','TERRA DO NUNCA', 'RIO DE JANEIRO','SP','09060111','BRASILEIRA', 'BRASIL', '21999999999', '21888888888', 'DOM@GMAIL.COM', 'ensino superior completo');


select * 
from tab_ficha_cadastral2
where UF = 'SP';

select * 
from tab_ficha_cadastral2
order by salario_minimo, nome;

select nome, data_nascimento as nascimento
from tab_ficha_cadastral2
order by data_nascimento;









