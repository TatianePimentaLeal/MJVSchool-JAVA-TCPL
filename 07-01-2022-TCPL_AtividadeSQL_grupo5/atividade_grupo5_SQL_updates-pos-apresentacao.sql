create table tab_ficha_profissional (
	id int not null auto_increment ,
	nome varchar(100) not null,
	email varchar(50) not null,
	telefone varchar(12) not null,
	logradouro varchar(50) not null,
	numero int not null,
	bairro varchar(30) not null,
	cidade varchar(30) not null,
	estado varchar(2) not null,
	salario_minimo numeric(8,2) not null, 
	salario_maximo numeric(8,2) not null,
	estrangeiro varchar(30) not null,
	PRIMARY KEY(id)
);

-- Inclusao do atributo/coluna profissao 
-- Foi usada a instrucao 'after' para poder incluir a coluna nova apos estado e antes dos valores como pedido nos requisitos
alter table tab_ficha_profissional 
add profissao varchar (50) null
after estado;

-- Utilizacao da palavra reservada 'modify' para mudar quantidade de caracteres de email
alter table tab_ficha_profissional 
modify column email varchar(100) not null;

-- Ao tentar incluir os dados sem uma primary key escrita, coloquei o n�mero 1 para startar a PK
insert into tab_ficha_profissional 
values
('1','DOM BARBOSA','DOMB@GMAIL.COM','11909876543','RUA UM',11,'VALFENDA','S�O PAULO','SP','DESENVOLVEDOR',2000.00,5000.00,'BRASILEIRO');

-- Para fazer as demais, pesquisei como fazer e encontrei a opcao de incluir 'default' para a numeracao seguir automaticamente
insert into tab_ficha_profissional 
values
(default,'LUCCAS BUGATTI','LUCCAS@GMAIL.COM','11912345678','RUA DOIS',22,'RIVENDEL','S�O PAULO','SP','DESENVOLVEDOR',1500.00,6000.00,'BRASILEIRO');

-- Incluindo demais registros usando o default com sucesso
insert into tab_ficha_profissional 
values
(default,'TATIANE PLUMMER','TATYPLUMMER07@GMAIL.COM','11964393094','RUA TRES',33,'HOGWARTS','RIO DE JANEIRO','RJ','TO BE INCLUDED',2000.00,4500.00,'BRASILEIRO'),
(default,'GLEYSON SAMPAIO','GLEY@GMAIL.COM','45908764567','RUA QUATRO',44,'CONDADO','MACEIO','PE','TO BE INCLUDED',5000.00,12000.00,'BRASILEIRO'),
(default,'TAINA CAMPOS','TAINADEPP@HOTMAIL.COM','11988776644','RUA CINCO',55,'HOGSMEAD','S�O PAULO','SP','TO BE INCLUDED',2500.00,4000.00,'BRASILEIRO'),
(default,'THAIS PIMENTA','PROTHAIS@HOTMAIL.COM','11987540345','RUA SEIS',66,'WONDERLAND','S�O PAULO','SP','TO BE INCLUDED',3000.00,5000.00,'BRASILEIRO'),
(default,'RODRIGO LEAL','RDDECAL@AOL.COM','21923146458','RUA SETE',77,'SONS OF ANARCHY','RIO DE JANEIRO','RJ','TO BE INCLUDED',1500.00,3000.00,'BRASILEIRO'),
(default,'WILSON CAMPOS PIMENTA','WIL@GMAIL.COM','11934560859','RUA OITO',88,'PALMEIRAS','S�O PAULO','SP','TO BE INCLUDED',3000.00,5500.00,'HOLANDES'),
(default,'SELMA REGINA','SELMINHA@GMAIL.COM','11934658960','RUA NOVE',99,'EROS RAMAZOTTI','S�O PAULO','SP','TO BE INCLUDED',4500.00,7000.00,'HOLANDES'),
(default,'CIDALIA LUIZ','CICALUIZ@AOL.COM','11926489678','RUA DEZ',10,'FERNANDO PESSOA','S�O PAULO','SP','TO BE INCLUDED',6700.00,10000.00,'BRASILEIRO');

-- Como coloquei as profissoes de antemao nos 2 primeiros registros vou mudar o que foi colocado com o 'update'
-- e mudei os demais para 'TO BE INCLUDED' para poder fazer como pedido na atividade
update tab_ficha_profissional
set profissao = 'DESENVOLVEDOR BACK-END'
where id = 1;

update tab_ficha_profissional
set profissao = 'DESENVOLVEDOR BACK-END'
where id = 2;

update tab_ficha_profissional
set profissao = 'DESENVOLVEDORA BACK-END'
where id = 3;

update tab_ficha_profissional
set profissao = 'TECH LEAD'
where id = 4;

update tab_ficha_profissional
set profissao = 'DEV FULLSTACK'
where id = 5;

update tab_ficha_profissional
set profissao = 'PSICOPEDAGOGA'
where id = 6;

update tab_ficha_profissional
set profissao = 'UX DESIGNER'
where id = 7;

update tab_ficha_profissional
set profissao = 'DESENVOLVEDOR FRONT-END'
where id = 8;

update tab_ficha_profissional
set profissao = 'ANALISTA QA'
where id = 9;

update tab_ficha_profissional
set profissao = 'SCRUM MASTER'
where id = 10;

-- Exclusao dos registros com 'estrangeiro' como verdadeiro com o uso do operador de comparacao do MySQL '<>''
delete from tab_ficha_profissional 
where estrangeiro <> 'BRASILEIRO';

-- Para efetuara mudanca do numero de acordo com o proximo requisito, sera necessario mudar o tipo da coluna
alter table tab_ficha_profissional
modify column numero char(30) not null;

-- Mudanca do cadastro id=3 para novos dados dos requisitos
update tab_ficha_profissional 
set logradouro = 'PRACA DA SE', numero = 'S/N', bairro = 'CENTRO', cidade = 'SAO PAULO', estado = 'SP'
where id = 3;

-- Retornando uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profiss�o, Nome
select nome,email,profissao,salario_minimo,salario_maximo 
from tab_ficha_profissional
order by profissao, nome;

-- Retornando uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profiss�o, Salario M�ximo do maior para o menor
select nome,email,profissao,salario_minimo,salario_maximo 
from tab_ficha_profissional
order by profissao, salario_maximo desc;

-- Retornando uma lista com a seguinte informa��o concatenada e apelidada de nome_profissao: NOME + ' - ' + PROFISSAO
select concat(nome,' - ',profissao) as nome_profissao
from tab_ficha_profissional;

-- Retornando uma lista contendo o nome da profiss�o e a quantidade de registros da profiss�o
select profissao, count(profissao)
from tab_ficha_profissional
group by profissao;

-- Retornando o registro com menor sal�rio m�nimo;
select * from tab_ficha_profissional
where salario_minimo = (select min(salario_minimo) from tab_ficha_profissional);

-- Retornando se existir o registro com a seguinte condi��o: Nome parecido com 'MARCOS PAULO' e Salario Maximo maior que 1200 e Salario Maximo menor ou igual que 2000 e que o Estado esteja entre SP, RJ, SC.
select *
from tab_ficha_profissional
where nome like 'MARCOS PAULO%'and  
salario_maximo > 1200 and
salario_maximo <= 2000 and
estado in ('SP','RJ','SC');

-- Inserindo dados para testar o select anterior
insert into tab_ficha_profissional 
values
(default,'MARCOS PAULO','marcosp@GMAIL.COM','11912345678','RUA TRES',22,'AZKABAN','S�O PAULO','SP','DESENVOLVEDOR',1500.00,1900.00,'BRASILEIRO');

-- Retornando o registro com menor sal�rio m�nimo de acordo com o nome e limitando a 1 retorno, para trazer apenas uma linha caso haja salarios minimos iguais;
select * from tab_ficha_profissional
order by salario_minimo, nome asc
limit 1;

