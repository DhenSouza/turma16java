create database db_cidade_das_carnes_1;
use db_cidade_das_carnes_1;

create table tb_categoria(
id bigint auto_increment,
descricao varchar (255)not null,
origem varchar (255) not null, 
disponibilidade boolean,
primary key (id)
);

insert tb_categoria (descricao, origem, disponibilidade) value ("Bovino", "Argentina", true);
insert tb_categoria (descricao, origem, disponibilidade) value ("Suino", "Japão", true);
insert tb_categoria (descricao, origem, disponibilidade) value ("Aves", "Brasil", true);
insert tb_categoria (descricao, origem, disponibilidade) value ("pertence feijoada", "Brasil", true);
insert tb_categoria (descricao, origem, disponibilidade) value ("imbutidos", "Brasil", true);
insert tb_categoria (descricao, origem, disponibilidade) value ("Caprinos", "Irlanda", true);

select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtd int not null,
importados boolean,
cat_id bigint,
primary key(id),
foreign key(cat_id) references tb_categoria(id)
);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("ASA",40.00,10,false,3);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("Picanha",80.00,10,true,1);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("coxa de frango",20.00,10,false,3);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("Bacon",30.00,10,true,2);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("hamburguer",60.00,10,false,5);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("Cabra",100.00,10,true,6);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("Peito de frango",25.00,10,false,3);
insert tb_produtos (nome, preco, qtd, importados, cat_id) values ("Orelha de porco",15.00,10,false,4);
select * from tb_produtos;

select nome, preco, qtd from tb_produtos where preco > 50;
select nome, preco, qtd from tb_produtos where preco between 3 and 60;
select * from tb_produtos where nome like "%c%";

select * from tb_produtos inner join tb_categoria on tb_produtos.cat_id = tb_categoria.id;
select * from tb_produtos inner join tb_categoria on tb_produtos.cat_id = tb_categoria.id
where tb_categoria.descricao = "aves";