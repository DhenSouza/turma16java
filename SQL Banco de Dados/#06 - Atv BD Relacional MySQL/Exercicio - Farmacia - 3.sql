create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria (
id bigint auto_increment,
cosmesticos varchar (255),
medicamento varchar (255),
higieneBucal varchar (255),
primary key(id)
);

insert tb_categoria (cosmesticos, medicamento, higieneBucal) values ("SIM", "NÃO","NÃO");
insert tb_categoria (cosmesticos, medicamento, higieneBucal) values ("NÃO", "SIM","NÃO");
insert tb_categoria (cosmesticos, medicamento, higieneBucal) values ("NAO", "NÃO","SIM");
insert tb_categoria (cosmesticos, medicamento, higieneBucal) values ("NAO", "NÃO","NÃO");
insert tb_categoria (cosmesticos, medicamento, higieneBucal) values ("SIM", "SIM","SIM");
 


create table tb_produto (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtd int not null,
descricao varchar (255),
fabricante varchar (255),
categoria_id bigint not null,
primary key (id),
foreign key(categoria_id) references tb_categoria(id)
);
alter table tb_produto change preco preco decimal not null;
insert tb_produto (nome, preco, qtd, descricao, fabricante, categoria_id) values ("Pasta Dental", 5.00, 10, "Colgate", "Colgate-Palmolive", 3);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Enxaguante Bucal", 15.50, 10, "Oral-B", "Gillette", 3);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Delineador", 50.00, 10, "Vizzela", "Vizzela", 1);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Analgesico", 20.00, 10, "Tylenol", "Bayer", 2);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Analgesico", 9.99, 10, "Dipirona", "GENERICO", 2);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Medidor Pressao", 150.00, 10, "G-tec", "Bayer", 4);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Muletas", 75.99, 10, "Mercur", "Mercur", 4);
insert tb_produto (nome, preco, qtd, descricao,fabricante, categoria_id) values ("Relacante Muscular", 20.00, 10, "DORFLEX", "Sanofi", 2);

select nome,descricao, preco from TB_produto where preco > 50;
select nome,descricao, preco from TB_produto where preco between 3 and 60;
select * from tb_produto where descricao like "%b%";

select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id
where tb_categoria.cosmesticos = "SIM";