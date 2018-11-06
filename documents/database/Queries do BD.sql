SELECT * FROM tb_nivel_formacao;

SELECT * FROM tb_curso;

SELECT * FROM tb_empregado;

SELECT * FROM tb_setor;

SELECT * FROM tb_curso_empregado;

SELECT * FROM tb_tipo_empregado;

SELECT * FROM tb_vinculo_empregaticio;

/*Insert em tb_nivel_formacao.*/

INSERT INTO tb_nivel_formacao (cod, nivel) VALUES (NULL, '1º GRAU (ENSINO FUNDAMENTAL)');
INSERT INTO tb_nivel_formacao (cod, nivel) VALUES (NULL, '2º GRAU (ENSINO MÉDIO)');
INSERT INTO tb_nivel_formacao (cod, nivel) VALUES (NULL, '3º GRAU (ENSINO SUPERIOR)');
INSERT INTO tb_nivel_formacao (cod, nivel) VALUES (NULL, '2º GRAU (CURSO TÉCNICO)');

/*Insert em tb_curso.*/

INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'ADMINISTRAÇÃO');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'CIÊNCIAS CONTÁBEIS');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'COMUNICAÇÃO SOCIAL');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'ECONOMIA');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'MARKETING');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'ENGENHARIA DA COMPUTAÇÃO');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'ENGENHARIA DE SISTEMAS');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'ENGENHARIA DA INFORMAÇÃO');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'DIREITO');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'DESIGN GRÁFICO');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'DESIGN DE MULTIMIDIA');
INSERT INTO tb_curso (cod, nome_curso) VALUES (NULL, 'ENGENHARIA SOCIAL');

/*Insert em tb_setor.*/

INSERT INTO tb_setor (cod, cod_diretor, nome) VALUES (NULL, 1, upper('FINANÇAS'));
INSERT INTO tb_setor (cod, cod_diretor, nome) VALUES (NULL, 2, upper('MARKETING'));
INSERT INTO tb_setor (cod, cod_diretor, nome) VALUES (NULL, 3, upper('TECNOLOGIA'));
INSERT INTO tb_setor (cod, cod_diretor, nome) VALUES (NULL, 4, upper('Normatividade'));
INSERT INTO tb_setor (cod, cod_diretor, nome) VALUES (NULL, 5, upper('Design'));

/*Insert em tb_tipo_empregado.*/

INSERT INTO tb_tipo_empregado (cod, tipo, salario, vale_transporte, porcentagem_bonus) VALUES (NULL, 'AUXILIAR', 1500.00, 350.00, 0);
INSERT INTO tb_tipo_empregado (cod, tipo, salario, vale_transporte, porcentagem_bonus) VALUES (NULL, 'TÉCNICO', 3000.00, 350.00, 0);
INSERT INTO tb_tipo_empregado (cod, tipo, salario, vale_transporte, porcentagem_bonus) VALUES (NULL, 'PROFISSIONAL', 6500.00, 0, 0);
INSERT INTO tb_tipo_empregado (cod, tipo, salario, vale_transporte, porcentagem_bonus) VALUES (NULL, 'DIRETOR DE SETOR', 9500.00, 0, 2);
INSERT INTO tb_tipo_empregado (cod, tipo, salario, vale_transporte, porcentagem_bonus) VALUES (NULL, 'DIRETOR DE OPERAÇÕES', 13000.00, 0, 2);
INSERT INTO tb_tipo_empregado (cod, tipo, salario, vale_transporte, porcentagem_bonus) VALUES (NULL, 'DIRETOR EXECUTIVO', 18000.00, 0, 2);

/*Insert em tb_empregado.*/

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000001, upper('Kuchiki Rukia'), 63, '94313634029', '1955-01-14');
INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000002, upper('Kurotsuchi Mayuri'), 54, '14458882031', '1964-03-30');
INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000003, upper('Zaraki Kenpachi'), 29, '67442841503', '1988-11-19');
INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000004, upper('Toushirou Hitsugaya'), 23, '64807136305', '1994-12-20');
INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000005, upper('Kuchiki Byakuya'), 68, '44975962578', '1950-01-31');
INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000006, upper('Kyouraku Shunsui'), 59, '24612136152', '1958-07-11');
INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (NULL, 3, 0000000007, upper('Soi Fong'), 46, '18621659557', '1972-02-11');


/*Insert em tb_curso_empregado.*/

INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 1, 4);
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 2, 5);
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 3, 6);
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 4, 9);
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 5, 11);

/*Insert em tb_vinculo_empregaticio.*/

INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 1, 4, 1, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 2, 4, 1, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 3, 4, 1, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 4, 4, 1, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 5, 4, 1, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, data_inicio) VALUES (NULL, 6, 6, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, data_inicio) VALUES (NULL, 7, 5, '2018-08-13');


-----------------------------------------------------------------------------------------------------------

/*Insert dos empregados dos setores.*/

/*Setor Finanças*/

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (8, 3, 0000000008, upper('Eliseu Padilha'), 46, '44246451932', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 8, 1);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 8, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (9, 3, 0000000009, upper('Gilberto Kassab'), 46, '82805429737', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 9, 1);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 9, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (10, 3, 0000000017, upper('Moreira Franco'), 46, '44431281827', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 10, 1);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 10, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (11, 3, 0000000107, upper('Roberto Freire'), 46, '33571218167', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 11, 2);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 11, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (12, 3, 0000010007, upper('Bruno Araújo'), 46, '26182861894', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 12, 2);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 12, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (13, 3, 0001000007, upper('Aloysio Nunes Ferreira'), 46, '12626344664', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 13, 2);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 13, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (14, 3, 0010000007, upper('Marcos Pereira'), 46, '29876265687', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 14, 4);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 14, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (15, 3, 0100000007, upper('Blairo Maggi'), 46, '85189634191', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 15, 4);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 15, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (16, 3, 1000000007, upper('Helder Barbalho'), 46, '44643426985', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 16, 4);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 16, 3, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (17, 2, 0000001007, upper('Romero Jucá Filho'), 46, '90840289456', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 17, 1, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (18, 2, 0000000027, upper('Aécio Neves da Cunha'), 46, '24672323951', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 18, 1, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (19, 4, 0000000037, upper('Renan Calheiros'), 46, '26000354355', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 19, 2, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (20, 4, 0000000047, upper('Fernando Bezerra Coelho'), 46, '52422552005', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 20, 2, 1, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (21, 4, 0000000057, upper('Paulo Rocha'), 46, '65541880963', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 21, 2, 1, '2018-08-13');

