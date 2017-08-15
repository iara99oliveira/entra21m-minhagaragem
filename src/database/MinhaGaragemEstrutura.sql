# apagar o banco se dados se ele existir
DROP DATABASE IF EXISTS minha_garagem;

# criar o banco se dados se ele não existir
CREATE DATABASE IF NOT EXISTS minha_garagem;

# Seleciona o banco de dados
USE minha_garagem;

# deleta a tbela se ela existir
DROP TABLE IF EXISTS carros;

# Criar a tabela se ela não existir
CREATE TABLE IF NOT EXISTS carros (
    id INTEGER PRIMARY KEY auto_increment,
    nome VARCHAR(150),
    cor VARCHAR(100),
    fabricante VARCHAR(255),
    placa VARCHAR(8),
    chassi VARCHAR(50),
    quilometragem FLOAT,
    potencia FLOAT,
    data_compra DATE,
    esta_funcionando BOOLEAN,
    permitida_circulacao BOOLEAN,
    quantidade_portas TINYINT,
    quantidade_batidas TINYINT,
    ano_fabricacao SMALLINT,
    ano_lancamento SMALLINT,
    tipo_pneu SMALLINT,
    renavam INT,
    descricao TEXT
);

# Seleciona todas as colunas da tabela carro
SELECT * FROM carros;

# Seleciona a coluna nome, fabricante, cor e quantidade
# colocado uma apelido para apresentar ao usuario de uma melhor forma
SELECT
    nome AS 'Nome',
    fabricante AS 'Fabricante',
    cor AS 'Cor',
    quantidade_portas AS 'Qtd. Portas'
FROM
    carros;

# Exemplo 01 de INSERT na tabela de carros
# onde são informadas as colunas desejadas
INSERT INTO carros
(id, nome, cor, fabricante, placa, chassi, quilometragem, potencia, 
data_compra, esta_funcionando, permitida_circulacao, quantidade_portas, 
quantidade_batidas, ano_fabricacao, ano_lancamento, tipo_pneu, renavam, 
descricao)
value
(1, "Gol", "Azul Bebê", "Audi", "ABC-2000", "vv156af74h1yjs1", 40028922,
 85, '2017-08-17', 1, 0, 4, 0, 2017, 2016, 175, 1156348413, "");

# EXEMPLO 02 ''
INSERT INTO carros 
(nome, cor, fabricante, potencia, data_compra)
VALUE 
("Palio", "Rosa Choque", "Fiat", 65, '2013-04-29'),
("Fox", "Purple", "VW", 120, '2017-05-11'),
("Cross Fox", "Amarelo", "VW", 100, '2015-04-29');

INSERT INTO carros (fabricante, cor, nome)
value
("VW", "Cinza", "Golf"),
("VW", "Vermelho", "Jetta"),
("VW", "Amarelo", "Saveiro"),
("VW", "Preto", "New Beetle"),
("VW", "Azul Bebê", "Fusca"),
("VW", "Branco", "Novo Fusca"),
("VW", "Cinza", "Up"),
("VW", "Azul Calcinha", "Kombi"),
("VW", "Cobalto", "Bora"),
("VW", "Varmelho", "Passat");

# Limpar tabela carros por completo
TRUNCATE carros;

# UPDATEs
UPDATE carros SET
cor = "Branco"
WHERE cor = "Vermelho";

UPDATE carros SET
ano_fabricacao = 2017,
ano_lancamento = 2016
WHERE cor = "Branco";

# ORDE BY
select nome from carros ORDER BY nome ASC; 
        # ASC não é necessario ao ordenar apenas uma coluna
SELECT fabricante, nome, cor FROM carros 
ORDER BY 
	fabricante ASC,
	nome ASC,
	cor ASC;

SELECT cor, count(cor) FROM carros 
GROUP BY cor
ORDER BY count(cor) DESC;
