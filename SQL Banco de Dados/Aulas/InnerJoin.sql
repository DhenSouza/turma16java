create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Bovino",true);
insert tb_categoria (descricao, ativo) values ("Suino",true);
insert tb_categoria (descricao, ativo) values ("Aves",true);
insert tb_categoria (descricao, ativo) values ("pertence feijoada",true);
insert tb_categoria (descricao, ativo) values ("imbutidos",true);
insert tb_categoria (descricao, ativo) values ("outros",true);

select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("ASA",40.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Picanha",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("coxa de frango",20.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Bacon",30.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("hamburguer",60.00,30,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Cupim",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Peito de frango",25.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Orelha de porco",20.00,30,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Salame",18.00,30,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("medalhao",50.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("mocoto",20.00,30,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("chuleta",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto) values ("acendedor de churrasqueira",20.00,30);

select * from tb_produtos;
-- Mostra os dados especificos como preco 20,30,18
select * from tb_produtos where preco in (20,30,18);
-- Mostra os dados entre 20 e 40
select * from tb_produtos where preco between 20 and 40;
-- Conta quantos dados tem na tabela produtos
select count(*) from tb_produtos;
-- Faz a media da coluna preco da tabela produtos
select avg(preco) as media from tb_produtos;
-- soma todos os valores da coluna preco da tabela produtos
select sum(preco) from tb_produtos;

-- Mostra os dados relacionados entre as duas tabelas categorias e produtos
select nome,preco,qtProduto, tb_categoria.descricao, tb_categoria.ativo from tb_produtos inner join tb_categoria on
tb_categoria.id = tb_produtos.categoria_id;

