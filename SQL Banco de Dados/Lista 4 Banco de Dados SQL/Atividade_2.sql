create database db_ecommerce_produtos;

use db_ecommerce_produtos;

create table produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
descricao varchar (50) not null,
qtd int not null,
origem varchar (50),
primary key (id)
);

alter table produtos change preco preco float;
insert into produtos (nome, preco, descricao, qtd, origem) values ("God of War", 150.00, "RPG Action", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("Red Dead Redemption", 250.00, "RPG Action", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("TLOUII", 350.00, "Action Adventure", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("TLOUII", 350.00, "Action Adventure", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("HADES", 200.00, "RPG Roguelike", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("Microsoft Flight Simulator", 150.00, "Simulator", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("Assasin's Creed Valhalla", 250.00, "RPG Action", 10 ,"EUA");
insert into produtos (nome, preco, descricao, qtd, origem) values ("Doom Eternal", 150.00, "FPS", 10 ,"EUA");

update produtos set nome = "Demon's Souls" where id = 4;
update produtos set nome = "Microsoft Flight Simulator - Complete Ediiton", preco = 650.00 where id = 6;
select nome, preco from produtos where preco >  500.00;
select nome, preco from produtos where preco <  500.00;
select * from produtos;