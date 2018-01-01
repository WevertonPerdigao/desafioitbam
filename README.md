Descrição: As ferramentas adotadas para o desenvolvimento da aplicação  foram: 
- AngularJs(Frameworks Javascript)
- Bootstrap(Frameworks de CSS)
- Spring Boot (Framework Java)
- Maven
- MySQL

Instrução:

-Executar o Script abaixo no banco de dados MySQL

-Utilizar o Eclipse com o plugin Spring Tools (aka Spring IDE and Spring Tool Suite) instalado

-Importar através de Projeto Maven Existente 

-Executar o projeto

-Navegar pelo link de Produtos em http://localhost:8080


CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `preco` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idproduto`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

LOCK TABLES `produto` WRITE;

INSERT INTO `produto` VALUES ('Display Colorido',100),('Bateria',7);

UNLOCK TABLES;
