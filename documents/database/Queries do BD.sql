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
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 2, 4, 2, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 3, 4, 3, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 4, 4, 4, '2018-08-13');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 5, 4, 5, '2018-08-13');
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

/*Setor Marketing*/

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (22, 3, 0000000038, upper('Humberto Sérgio Costa Lima'), 46, '19608337313', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 22, 1);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 22, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (23, 3, 0000000039, upper('Edison Lobão'), 46, '76253787217', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 23, 1);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 23, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (24, 3, 0000003037, upper('Cássio Cunha Lima'), 46, '50653171609', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 24, 1);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 24, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (25, 3, 0000000137, upper('Jorge Viana'), 46, '70064173925', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 25, 3);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 25, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (26, 3, 0000010037, upper('Lidice da Mata'), 46, '73483580395', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 26, 3);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 26, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (27, 3, 0001000037, upper('José Agripino Maia'), 46, '15918744088', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 27, 3);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 27, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (28, 3, 0010000037, upper('Marta Suplicy'), 46, '21733797980', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 28, 5);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 28, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (29, 3, 0100000037, upper('Ciro Nogueira'), 46, '94997429210', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 29, 5);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 29, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (30, 3, 1000000037, upper('Dalírio José Beber'), 46, '79981872806', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 30, 5);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 30, 3, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (31, 2, 0000001037, upper('Ivo Cassol'), 46, '31902903269', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 31, 1, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (32, 2, 0000000327, upper('Lindbergh Farias'), 46, '83148060130', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 32, 1, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (33, 4, 0000000337, upper('Vanessa Grazziotin'), 46, '55831306950', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 33, 2, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (34, 4, 0000000347, upper('Kátia Regina de Abreu'), 46, '19370694196', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 34, 2, 2, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (35, 4, 0000000357, upper('Fernando Afonso Collor de Mello'), 46, '34548581006', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 35, 2, 2, '2018-08-13');

/*Setor Tecnologia*/

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (36, 3, 0000000438, upper('José Serra'), 46, '83292634016', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 36, 6);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 36, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (37, 3, 0000000439, upper('Eduardo Braga'), 46, '71199285200', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 37, 6);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 37, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (38, 3, 0000003437, upper('Omar Aziz'), 46, '78424990714', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 38, 6);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 38, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (39, 3, 0000004137, upper('Valdir Raupp'), 46, '21585335525', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 39, 7);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 39, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (40, 3, 0000010437, upper('Eunício Oliveira'), 46, '71828407151', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 40, 7);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 40, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (41, 3, 0001000437, upper('Eduardo Amorim'), 46, '67774887237', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 41, 7);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 41, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (42, 3, 0010000437, upper('Maria do Carmo Alves'), 46, '17014830686', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 42, 8);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 42, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (43, 3, 0100000437, upper('Garibaldi Alves Filho'), 46, '24783571511', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 43, 8);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 43, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (44, 3, 1000000437, upper('Ricardo Ferraço'), 46, '49681402235', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 44, 8);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 44, 3, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (45, 2, 0000041037, upper('Antônio Anastasia'), 46, '57952725823', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 45, 1, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (46, 2, 0000004327, upper('Paulinho da Força'), 46, '69911008460', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 46, 1, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (47, 4, 0000004337, upper('Ricardo Queiroz de Alencastro Graça'), 46, '46205323982', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 47, 2, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (48, 4, 0000004347, upper('Marco Maia'), 46, '12651777676', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 48, 2, 3, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (49, 4, 0000040357, upper('Carlos Zarattini'), 46, '39877389282', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 49, 2, 3, '2018-08-13');

/*Setor Normatividade*/

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (50, 3, 0000005438, upper('Rodrigo Maia'), 60, '34310915477', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 50, 9);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 50, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (51, 3, 0000005439, upper('João Carlos Bacelar'), 60, '45984690640', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 51, 9);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 51, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (52, 3, 0000053437, upper('Milton Monti'), 60, '88485702085', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 52, 9);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 52, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (53, 3, 0000054137, upper('José Carlos Aleluia'), 60, '20415312744', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 53, 3);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 53, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (54, 3, 0000510437, upper('Daniel Almeida'), 60, '16022684528', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 54, 3);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 54, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (55, 3, 0051000437, upper('Mário Negromonte Jr.'), 60, '90140481141', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 55, 3);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 55, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (56, 3, 0510000437, upper('Nelson Pellegrino'), 60, '95322712798', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 56, 2);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 56, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (57, 3, 5100000437, upper('Jutahy Júnior'), 60, '82134407654', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 57, 2);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 57, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (58, 3, 1000005437, upper('MARIA DO ROSÁRIO'), 60, '90022611797', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 58, 2);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 58, 3, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (59, 2, 0000541037, upper('Felipe Maia'), 60, '29469593251', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 59, 1, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (60, 2, 0000504327, upper('Ônix Lorenzoni'), 60, '46281996208', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 60, 1, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (61, 4, 0000054337, upper('Jarbas de Andrade Vasconcelos'), 60, '92406956130', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 61, 2, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (62, 4, 0000054347, upper('Vicente Paulo da Silva'), 60, '86466520927', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 62, 2, 4, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (63, 4, 0000540357, upper('Arthur Oliveira Maia'), 60, '58611254902', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 63, 2, 4, '2018-08-13');

/*Setor Design*/

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (64, 3, 0000065438, upper('Yeda Crusius'), 60, '27394512029', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 64, 10);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 64, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (65, 3, 0000065439, upper('Paulo Henrique Lustosa'), 60, '38636736625', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 65, 11);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 65, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (66, 3, 0000653437, upper('José Reinaldo'), 60, '53801975908', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 66, 12);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 66, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (67, 3, 0000654137, upper('João Paulo Papa'), 60, '58119799160', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 67, 10);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 67, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (68, 3, 0006510437, upper('Vander Loubet'), 60, '99475495851', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 68, 11);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 68, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (69, 3, 0651000437, upper('Rodrigo Garcia'), 60, '73825629996', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 69, 12);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 69, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (70, 3, 6510000437, upper('Cacá Leão'), 60, '98301256370', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 70, 10);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 70, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (71, 3, 5100006437, upper('Celso Russomano'), 60, '96774969720', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 71, 11);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 71, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (72, 3, 1000065437, upper('Dimas Fabiano Toledo'), 60, '16471834136', '1972-02-11');
INSERT INTO tb_curso_empregado (cod, cod_empregado, cod_curso) VALUES (NULL, 72, 12);
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 72, 3, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (73, 2, 0006541037, upper('Pedro Paulo'), 60, '58615176655', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 73, 1, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (74, 2, 0006504327, upper('Lúcio Vieira Lima'), 60, '31687154503', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 74, 1, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (75, 4, 0006054337, upper('Paes Landim'), 60, '40783925808', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 75, 2, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (76, 4, 0000654347, upper('Daniel Vilela'), 60, '92103954254', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 76, 2, 5, '2018-08-13');

INSERT INTO tb_empregado (cod, cod_nivel_formacao, identificador_empresa, nome, idade, cpf, data_nascimento) VALUES (77, 4, 0006540357, upper('Alfredo Nascimento'), 60, '23494606811', '1972-02-11');
INSERT INTO tb_vinculo_empregaticio (cod, cod_empregado, cod_tipo_empregado, cod_setor, data_inicio) VALUES (NULL, 77, 2, 5, '2018-08-13');