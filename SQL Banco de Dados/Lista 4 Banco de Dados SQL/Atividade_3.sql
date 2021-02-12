create database bd_escola_registro;
use bd_escola_registro;

create table alunos(
ra bigint auto_increment,
nome varchar(255) not null,
sala varchar (10) not null,
sexo varchar (10),
telefone double,
nota float not null,
primary key (ra)
);

insert into alunos (nome, sala, sexo, telefone, nota) value ("Alberto Giro", "A1", "Masculino", 11945236547, 8.5);
insert into alunos (nome, sala, sexo, telefone, nota) value ("Lucema Giria", "B2", "Feminino", 11932145658, 9.5);
insert into alunos (nome, sala, telefone, nota) value ("Miriam ", "A1", 11945236547, 7);
insert into alunos (nome, sala, sexo, telefone, nota) value ("Vegana Sarah ", "C3", " ", 11945236547, 5);
insert into alunos (nome, sala, sexo, telefone, nota) value ("Bruno", "B2", "Masculino", 11934562584, 6.5);
insert into alunos (nome, sala, sexo, telefone, nota) value ("Carlos Alberto", "D2", "Masculino", 11965425841, 10);
insert into alunos (nome, sala, sexo, telefone, nota) value ("Mariah Luciana", "C3", "Feminino", 0 , 8);
insert into alunos (nome, sala, sexo, telefone, nota) value ("Julio Certino", "B2", "Masculino", 11934562584, 4.5);

update alunos set sexo = "  " where ra = 3;

select nome, sala, nota from alunos where nota > 7;
select nome, sala, nota from alunos where nota < 7;
select * from alunos;