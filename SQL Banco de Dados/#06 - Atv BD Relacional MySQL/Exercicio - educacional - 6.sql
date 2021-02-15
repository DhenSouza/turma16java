create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar (255) not null,
formaPagamento varchar (255),
aprovacaoPagamento varchar (255) not null,
primary key (id)
);

insert tb_categoria (descricao, formaPagamento, aprovacaoPagamento ) values ("Programação", "Boleto", "aguardando");
insert tb_categoria (descricao, formaPagamento, aprovacaoPagamento ) values ("LÓGICA DE PROGRAMAÇÃO", "Boleto", "aguardando");
insert tb_categoria (descricao, formaPagamento, aprovacaoPagamento ) values ("SISTEMA OPERACIONAL", "Credito", "em analise");
insert tb_categoria (descricao, formaPagamento, aprovacaoPagamento ) values ("BANCO DE DADOS", "Credito", "aproavado");
insert tb_categoria (descricao, formaPagamento, aprovacaoPagamento ) values ("MÉTODOLOGIA AGIL", "Debito", "em analise");


create table tb_produto (
id bigint auto_increment,
nome VARCHAR (255) NOT NULL,
preco decimal not null,
qtd int not null,
cadastro varchar (50) not null,
ativo boolean,
cat_id bigint,
primary key (id),
foreign key(cat_id) references tb_categoria(id)
);
alter table tb_produto change cat_id cat_id bigint not null;
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("JAVA", 59.99, 10, "CADASTRADO", true, 1);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("C#", 39.99, 10, "CADASTRADO", true, 2);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("LINUX", 89.99, 10, "CADASTRADO", true, 3);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("MY SQL", 45.55, 10, "CADASTRADO", true, 4);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("SCRUM",100.00, 10, "CADASTRADO", true, 5);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("PHP", 10.99, 10, "CADASTRADO", true, 2);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("WINDOWS SERVER", 103.00, 10, "CADASTRADO", true, 3);
insert tb_produto (nome, preco, qtd, cadastro, ativo, cat_id ) values ("RUBY", 89.99, 10, "CADASTRADO", true, 1);
select * from tb_produto;

select nome, preco from tb_produto where preco >= 50;
select nome, preco, qtd from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%j%";

select * from tb_produto inner join tb_categoria on tb_produto.cat_id = tb_categoria.id;
select * from tb_produto inner join tb_categoria on tb_produto.cat_id = tb_categoria.id
where tb_categoria.formaPagamento = "Credito";