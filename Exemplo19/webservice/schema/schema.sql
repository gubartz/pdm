--Apaga as tabelas
DROP TABLE IF EXISTS emp CASCADE;
DROP TABLE IF EXISTS dep CASCADE;
DROP TABLE IF EXISTS faixa_sal CASCADE;

--Tabela dep
CREATE TABLE dep (
    n_dep integer,
    nome_dep varchar(20),
    local_dep varchar(30),
    PRIMARY KEY (n_dep)
);

INSERT INTO dep VALUES (10, 'Administracao', 'Campinas');
INSERT INTO dep VALUES (20, 'Pesquisa', 'Campinas');
INSERT INTO dep VALUES (30, 'Vendas', 'Sao Paulo');
INSERT INTO dep VALUES (40, 'Producao', 'Sao Paulo');

--Tabela emp
CREATE TABLE emp (
    n_emp integer,
    nome_emp varchar(30) NOT NULL,
    cargo varchar(10) NOT NULL,
    chefe integer,
    data_adm date,
    sal numeric(10,2) NOT NULL,
    com numeric(10,2),
    n_dep integer,
    PRIMARY KEY (n_emp),
    FOREIGN KEY(n_dep) REFERENCES dep(n_dep),    
    CHECK (sal > 0)
);

INSERT INTO emp VALUES (175, 'Pedro', 'Presidente', NULL, '2004-02-23', 15000.00, NULL, 10);
INSERT INTO emp VALUES (110, 'Ubaldo', 'Diretor', 175, '2003-03-27', 8000.00, NULL, 20);
INSERT INTO emp VALUES (189, 'Rosa', 'Diretor', 175, '2004-12-21', 3300.00, 5000.00, 30);
INSERT INTO emp VALUES (201, 'Eduardo', 'Vendedor', 189, '2003-04-11', 2000.00, 3000.00, 30);
INSERT INTO emp VALUES (208, 'Sérgio', 'Vendedor', 189, '2003-10-30', 1500.00, 9000.00, 30);
INSERT INTO emp VALUES (230, 'Augusta', 'Secretária', 175, '2005-06-10', 1200.00, NULL, 10);
INSERT INTO emp VALUES (276, 'Ronaldo', 'Analista', 110, '2004-04-17', 5000.00, NULL, 20);
INSERT INTO emp VALUES (103, 'Sílvia', 'Analista', 110, '2003-03-17', 1500.00, NULL, 20);

--Chave estrangeira chefe para n_emp
ALTER TABLE emp ADD FOREIGN KEY (chefe) REFERENCES emp(n_emp);

--Tabela faixa_sal
CREATE TABLE faixa_sal (
    faixa character(1) NOT NULL,
    salmin numeric(10,2) NOT NULL,
    salmax numeric(10,2) NOT NULL,
    PRIMARY KEY(faixa)
);

INSERT INTO faixa_sal VALUES ('A', 0.00, 999.99);
INSERT INTO faixa_sal VALUES ('B', 1000, 1999.99);
INSERT INTO faixa_sal VALUES ('C', 2000, 2999.99);
INSERT INTO faixa_sal VALUES ('D', 3000, 3999.99);
INSERT INTO faixa_sal VALUES ('E', 4000, 1000000);