create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria (
id bigint auto_increment,
descricao varchar (255) not null,
tipo varchar (255),
disponivel boolean,
primary key (id)
);

insert tb_categoria(descricao, tipo, disponivel) values ("Madeira", "Carvalho", true);
insert tb_categoria(descricao, tipo, disponivel) values ("Ferro", "Fundido", true);
insert tb_categoria(descricao, tipo, disponivel) values ("Aço", "Carbono", true);
insert tb_categoria(descricao, tipo, disponivel) values ("Aço", "Inox", true);
insert tb_categoria(descricao, tipo, disponivel) values ("Madeira", "Bétua", true);

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal not null,
qtd int not null,
entrega boolean,
pagamento varchar (50),
cat_id bigint not null,
primary key (id),
foreign key (cat_id) references tb_categoria(id)
);

insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Pilar medio", 78.88, 10, true, "Débito ou Crédito", 5);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Pilar grande", 103.00, 10, true, "Débito ou Crédito", 1);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Pilar pequeno", 150.00, 10, true, "Débito ou Crédito", 2);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Calha", 45.00, 10, true, "Débito ou Crédito", 4);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Rufo Externo", 50.00, 10, true, "Débito ou Crédito", 3);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Emenda Galvanizada", 15.00, 10, true, "Débito ou Crédito", 4);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Martelo", 30.00, 10, true, "Débito ou Crédito", 5);
insert tb_produto(nome, preco, qtd, entrega, pagamento, cat_id) values ("Telha",43.40, 10, true, "Débito ou Crédito", 5);

select nome, preco, qtd from tb_produto where preco >= 50;
select nome, preco, qtd from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%c%";

select * from tb_produto inner join tb_categoria on tb_produto.cat_id = tb_categoria.id;
select * from tb_produto inner join tb_categoria on tb_produto.cat_id = tb_categoria.id
where tb_categoria.tipo = "Inox";
select * from tb_produto;