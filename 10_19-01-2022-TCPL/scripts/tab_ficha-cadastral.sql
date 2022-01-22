create table tab_ficha_cadastral (
	nome varchar (50) not null,
	salario_minimo numeric(8,2) not null
)

insert into tab_ficha_cadastral 
values ('GLEYSON SAMPAIO',1200.50);

select salario_minimo as sal_min
from tab_ficha_cadastral 
where salario_minimo > 1000.0 AND salario_minimo < 1300.0
and nome = 'GLEYSON SAMPAIO'; 