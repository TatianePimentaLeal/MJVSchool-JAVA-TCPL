create table tab_profissao (
	id_profissao int not null auto_increment,
	nome varchar (30) not null,
	primary key (id_profissao)
);

create table tab_ficha_cadastral ( 
	id_cadastro int(6) not null auto_increment,
	nome varchar(30) not null,
	id_profissao int not null,
	
	constraint tab_cadastro_pkey
	primary key (id_cadastro),
	
	constraint fk_ficha_cadastral_profissao
	foreign key (id_profissao)
	references tab_profissao(id_profissao)
);

#delete from tab_ficha_cadastral 
#where id_cadastro = 1;

#delete from tab_ficha_cadastral 
#where id_cadastro = 2;

