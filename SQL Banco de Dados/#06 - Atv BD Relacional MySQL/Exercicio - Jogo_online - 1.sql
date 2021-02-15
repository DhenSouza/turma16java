create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
classe varchar (255) not null,
armas varchar (255) not null,
habilidades varchar (255) not null,
primary key (id)
);

insert tb_classe(classe,armas,habilidades) values ("Guerreiro", "Espada Grande", "Resistencia ATQ Fisico");
insert tb_classe(classe,armas,habilidades) values ("Mago", "Cajado", "Bola de Fogo");
insert tb_classe(classe,armas,habilidades) values ("Barbaro", "Duplo Machado", "Investida");
insert tb_classe(classe,armas,habilidades) values ("Feiticeiro", "Anel conjurador", "Invocação Elemental");
insert tb_classe(classe,armas,habilidades) values ("Ladino", "Adagas", "Silencio Mortal");
select * from tb_classe;

create table tb_personagem(
id bigint auto_increment,
nome varchar(255) not null,
sexo char not null,
raca varchar (255) not null,
ataque double not null,
defesa double not null,
classificacao_id bigint not null,
primary key (id),
foreign key (classificacao_id) references tb_classe (id)
);

insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("BeuWulf", "M","Humano", 1200, 2500, 1);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Silenc", "E","khajiit", 2150, 950, 5);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Luthien", "F","Elfo", 2680, 1800, 4);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Girold", "M","ORC", 2700, 2000, 3);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Hajid", "E","Humano", 2450, 1300, 5);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Raphaella", "M","Humano", 3000, 1000, 2);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Rowan", "H","Férico", 2650, 2150, 1);
insert tb_personagem(nome,sexo,raca,ataque,defesa,classificacao_id) values ("Ladil", "M","Férico", 2900, 1500, 2);

select nome, raca, ataque from tb_personagem where ataque > 2000;
select nome, raca, defesa from tb_personagem where defesa between 1000 and 2000;
select * from tb_personagem where nome like "%c%";

select nome, raca, ataque, defesa, tb_classe.classe from tb_personagem inner join tb_classe on 
tb_personagem.classificacao_id = tb_classe.id;

select tb_personagem.nome, tb_classe.classe, tb_classe.habilidades 
from tb_personagem inner join tb_classe on tb_personagem.classificacao_id = tb_classe.id 
where tb_classe.classe = "Ladino";


