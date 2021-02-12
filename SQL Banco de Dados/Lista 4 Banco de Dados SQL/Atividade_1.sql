create database db_atvservico_rh;

use db_atvservico_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null, 
funcao varchar(50),
salario float not null,
estado varchar (50),
primary key(id)
);

insert into tb_funcionarios (nome, funcao, salario, estado) values ("Michael Scott", "Gerente", 3500, "ATIVO");
insert into tb_funcionarios (nome, funcao, salario, estado) values ("Angela Martin", "Contabilidade", 2999, "ATIVO");
insert into tb_funcionarios (nome, funcao, salario, estado) values ("Stanley Hudson", "Vendas", 5000, "ATIVO");
insert into tb_funcionarios (nome, funcao, salario, estado) values ("Toby Flenderson", "RH", 1500, "ATIVO");
insert into tb_funcionarios (nome, funcao, salario, estado) values ("Jim Halpert", "Vendas", 5000, "ATIVO");


alter table tb_funcionarios change funcao departamento varchar (255);
alter table tb_funcionarios
add funcao varchar(255);

insert into tb_funcionarios(funcao) values ("Gerente");
update tb_funcionarios set funcao = "Gerenciamento" where id = 1;
update tb_funcionarios set funcao = "Contador" where id = 2;
update tb_funcionarios set funcao = "Vendedor" where id = 3;
update tb_funcionarios set funcao = "RH" where id = 4;
update tb_funcionarios set funcao = "Vendedor" where id = 5;
select nome, salario from tb_funcionarios where salario >  2000;
select nome, salario from tb_funcionarios where salario <  2000;

update tb_funcionarios set salario = 6500 where id = 5;
-- select nome, salario from tb_funcionarios where salario > 3500
select * from tb_funcionarios;


