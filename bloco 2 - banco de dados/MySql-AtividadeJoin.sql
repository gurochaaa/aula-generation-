CREATE DATABASE db_generation_game_online;
 USE db_generation_game_online;
 
 CREATE TABLE  tb_classes(
 id BIGINT auto_increment,
 nome VARCHAR(255),
 tamanho CHAR,

PRIMARY KEY (id)
 );

CREATE TABLE tb_personagens(
id BIGINT auto_increment,
nome VARCHAR(255),
forca VARCHAR(255),
inteligencia varchar(255), 
velocidade VARCHAR(255),
tb_classes_id BIGINT,

PRIMARY KEY (id),
FOREIGN KEY (tb_classes_id) REFERENCES tb_classes(id)
);

-- classes e tipos 
INSERT INTO tb_classes (nome,tamanho)
VALUES ("Fogo", "1");

INSERT INTO tb_classes (nome,tamanho)
VALUES ("Água", "2");

INSERT INTO tb_classes (nome,tamanho)
VALUES ("Terra", "3");

INSERT INTO tb_classes (nome,tamanho)
VALUES ("Ar", "4");

INSERT INTO tb_classes (nome,tamanho)
VALUES ("Madeira", "5");

SELECT * FROM tb_classes;

-- PERSONAGENS 

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Ragnar", "1250","3500","2000",1);

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Kim", "1500","1500","3000",3);

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Erus", "2800","1000","2500",4);

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Odin", "3200","1000","1900",2);

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Astrid", "2900","1900","1700",5);

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Gertrud", "3200","1000","1900",4);

INSERT INTO tb_personagens (nome,forca,inteligencia,velocidade,tb_classes_id)
VALUES ("Saga", "3200","1000","1900",4);

SELECT * FROM tb_personagens;

SELECT * FROM tb_personagens WHERE forca > 2000;

SELECT * FROM tb_personagens WHERE forca > 1000 AND forca < 2000;

SELECT * FROM tb_personagens
WHERE nome LIKE "%A%";

SELECT * FROM tb_personagens
INNER JOIN tb_classes
ON tb_classes.id  = tb_personagens.tb_classes_id;

SELECT * FROM tb_personagens
INNER JOIN tb_classes
ON tb_classes.id  = tb_personagens.tb_classes_id 
WHERE tamanho LIKE "%4%";
