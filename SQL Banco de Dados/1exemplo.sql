-- cria um banco de dados
create database db_servico_rh;
-- acessa o banco de dados
use db_servico_rh;
-- cria uma tabela
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null, -- not null obrigatorio preencher a coluna
idade int not null,
salario float not null,
primary key(id)
);
-- busca das informações
select * from tb_funcionarios;
-- busca das informações especificas
select nome, salario from tb_funcionarios where salario = 20000;
-- aqui insert dados da tabela
insert into tb_funcionarios (nome,idade,salario) values ("Rafael", 00,10000);
insert into tb_funcionarios (nome,idade,salario) values ("Maraia", 20,10000);

-- altera a tabela add coluna 
alter table tb_funcionarios
add descricao varchar(255);
-- modifica coluna no BD
alter table tb_funcionarios change descricao descricao_funcionario varchar (255);
-- atualiza um dado da tabela 
update tb_funcionarios set salario = 20000 where id = 1;
-- deleta um dado
delete from tb_funcionarios where id = 3;