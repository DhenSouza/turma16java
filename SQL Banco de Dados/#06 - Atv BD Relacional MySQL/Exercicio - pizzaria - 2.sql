create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
entrega boolean not null, 
cDesconto boolean not null,
pagamento varchar (255) not null,
primary key(id)
);

insert tb_categoria (entrega,cDesconto, pagamento) values (true, true,"Debito");
insert tb_categoria (entrega,cDesconto, pagamento) values (false, false,"Credito");
insert tb_categoria (entrega,cDesconto, pagamento) values (true, false,"Dinheiro");
insert tb_categoria (entrega,cDesconto, pagamento) values (true, true,"Vale Refeicao");
insert tb_categoria (entrega,cDesconto, pagamento) values (false, false,"Vale Alimentacao");
select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
descricao varchar (255) not null,
qtd int not null,
tamanho varchar (255) not null,
borda varchar(50),
preco decimal not null,
pizza_id bigint not null,
primary key(id),
foreign key (pizza_id) references tb_categoria(id)
);

insert tb_pizza (descricao, qtd, tamanho, borda,preco,pizza_id) value ("Americana", 1,"GRANDE", "Cheddar", 50.00, 1);
insert tb_pizza (descricao, qtd, tamanho, borda,preco,pizza_id) value ("Portuguesa", 3,"GRANDE", "Catupiry", 75.00, 5);
insert tb_pizza (descricao, qtd, tamanho, borda,preco,pizza_id) value ("Calabresa", 1,"BROTO", "Cheddar", 54.60, 3);
insert tb_pizza (descricao, qtd, tamanho, borda,preco,pizza_id) value ("Mussarela", 1,"BROTO", "Catupiry", 60.57, 2);
insert tb_pizza (descricao, qtd, tamanho,preco,pizza_id) value ("Roys", 2,"GRANDE", 45.50, 4);
insert tb_pizza (descricao, qtd, tamanho,preco,pizza_id) value ("4Queijos", 1,"BROTO", 20.00, 1);
insert tb_pizza (descricao, qtd, tamanho, borda,preco,pizza_id) value ("Frango Catupiry", 2,"Grande", "Catupiry",25.55,1);
insert tb_pizza (descricao, qtd, tamanho,preco,pizza_id) value ("Prestigio", 1,"BROTO",70.00, 2);

select descricao, preco from tb_pizza where preco > 45;

select descricao, preco from tb_pizza where preco between 29 and 60;

select * from tb_pizza where descricao like "%c%";

select * from tb_pizza inner join tb_categoria on tb_pizza.pizza_id = tb_categoria.id;

select * from tb_pizza inner join tb_categoria on tb_pizza.pizza_id = tb_categoria.id where tb_categoria.pagamento = "débito";
