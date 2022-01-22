create table usuarios (
	id_user int not null auto_increment,
	nome varchar(50) not null,
	primary key(id_user)
);

-- drop table livros;
-- drop table emprestimo;
-- drop table livros;

create table livros ( 
	id_titulo int not null auto_increment,
	nome varchar(50) not null,
	
	constraint tab_livros_pkey
	primary key (id_titulo)
);

	create table emprestimo (
	id_emprestimo int not null auto_increment,
	data_emprestimo date not null,
	id_user int not null,
	id_titulo int not null,
	
	constraint tab_emprestimo_pkey
	primary key (id_emprestimo),
	
	constraint fk_emprestimo
	foreign key (id_user)
	references usuarios(id_user),
	
	constraint fk_livros
	foreign key (id_titulo)
	references livros(id_titulo)
);

insert into usuarios
values (default, 'Lucca');

insert into usuarios
values (default, 'Taty');

insert into usuarios
values (default, 'Dom');

insert into livros 
values (default, 'Harry Potter');

insert into livros 
values (default, 'It a coisa');

insert into emprestimo 
values (default, '2022-01-10', 1, 1);

insert into emprestimo 
values (default, '2022-01-11', 3, 2);


-- select u.nome, l.nome, data_emprestimo 
-- from emprestimo e
-- inner join usuarios u on e.id_user = u.id_user
-- inner join livros l on e.id_titulo = l.id_titulo;

