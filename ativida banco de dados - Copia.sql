CREATE DATABASE empresa;
USE empresa;
 CREATE TABLE funcionarios(
 id BIGINT auto_increment,
 nome VARCHAR (255),
 cargo VARCHAR(255), 
 tempo INT,
 salario DECIMAL (7,2),
 equipe VARCHAR(255),
 PRIMARY KEY (id)
 );
 
 INSERT INTO  funcionarios (nome,cargo,tempo,salario,equipe) 
 VALUES ("Gustavo Rocha","CEO", 2, 9500, "equipe 01");
 
 INSERT INTO funcionarios (nome,cargo,tempo,salario,equipe)
 VALUES ("Gabreiel Santos","COF",2, 4800, "equipe 01");
 
 INSERT INTO funcionarios (nome,cargo,tempo,salario,equipe)
 VALUES ("Andreia","Gerente",1, 2000, "equipe 01");
 
 INSERT INTO funcionarios (nome,cargo,tempo,salario,equipe)
 VALUES ("Marineusa","Atendente",1, 1200, "equipe 01");
 
 INSERT INTO funcionarios (nome,cargo,tempo,salario,equipe)
 VALUES ("Giseli Pinho","Vendedora",1, 1800, "equipe 01");

 SELECT * FROM funcionarios;
 
 SELECT * FROM funcionarios WHERE salario < 2000;
 
 SELECT * FROM funcionarios WHERE salario > 2000;