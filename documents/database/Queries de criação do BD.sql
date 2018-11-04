//Queries para criação do banco de dados.

 CREATE TABLE tb_nivel_formacao (
       cod     INTEGER NOT NULL,
       nivel   VARCHAR(150) NOT NULL UNIQUE,
       PRIMARY KEY (cod)
   );

 CREATE TABLE tb_curso (
       cod          INTEGER NOT NULL,
       nome_curso   VARCHAR(150) NOT NULL UNIQUE,
       PRIMARY KEY (cod)
   );

 CREATE TABLE tb_empregado (
       cod                      INTEGER NOT NULL,
       cod_nivel_formacao       INTEGER NOT NULL,
       identificador_empresa   VARCHAR(150) NOT NULL UNIQUE,
       nome                     VARCHAR(150) NOT NULL,
       idade                    INTEGER NOT NULL,
       cpf                      VARCHAR(11) NOT NULL UNIQUE,
       data_nascimento          DATE NOT NULL,
       PRIMARY KEY (cod),
       FOREIGN KEY (cod_nivel_formacao) REFERENCES tb_nivel_formacao (cod)
   );

 CREATE TABLE tb_curso_empregado (
       cod             INTEGER NOT NULL,
       cod_empregado   INTEGER NOT NULL,
       cod_curso       INTEGER NOT NULL,
       PRIMARY KEY (cod),
       FOREIGN KEY (cod_empregado) REFERENCES tb_empregado (cod),
       FOREIGN KEY (cod_curso) REFERENCES tb_curso (cod)
   );

 CREATE TABLE tb_setor (
       cod           INTEGER NOT NULL,
       cod_diretor   INTEGER,
       nome          VARCHAR(150) NOT NULL UNIQUE,
       PRIMARY KEY (cod),
       FOREIGN KEY (cod_diretor) REFERENCES tb_empregado (cod)
   );

 CREATE TABLE tb_tipo_empregado (
       cod               INTEGER NOT NULL,
       tipo              VARCHAR(150) NOT NULL UNIQUE,
       salario           FLOAT(20) NOT NULL,
       vale_transporte   FLOAT(20),
       porcentagem_bonus INTEGER,
       PRIMARY KEY (cod)
   );

 CREATE TABLE tb_vinculo_empregaticio (
       cod                  INTEGER NOT NULL,
       cod_empregado        INTEGER NOT NULL,
       cod_tipo_empregado   INTEGER NOT NULL,
       cod_setor            INTEGER,
       data_inicio          DATE NOT NULL,
       data_fim             DATE,
       PRIMARY KEY (cod),
       FOREIGN KEY (cod_empregado) REFERENCES tb_empregado (cod),
       FOREIGN KEY (cod_tipo_empregado) REFERENCES tb_tipo_empregado (cod),
       FOREIGN KEY (cod_setor) REFERENCES tb_setor (cod)
   );