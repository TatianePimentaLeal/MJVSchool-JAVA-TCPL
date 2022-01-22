alter table tab_cliente (
nome varchar (50) ,
cpf varchar (12) ,
data_nascimento date ,
logradouro varchar (100) ,
bairro varchar (100) ,
numero varchar (5) ,
sexo char(1) ,
estrangeiro char(1) ,
);

insert into tab_cliente values (
	'GLEYSON','0887','2020-10-01','RUA TAL','CENTRO','S/N','M', 0
);

insert into tab_cliente (nome, cpf)
values ('GLEYSON','0887');