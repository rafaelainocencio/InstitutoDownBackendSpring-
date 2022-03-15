INSERT INTO usuario(nome, telefone, email, cidade, estado) VALUES ('Rafa', '999999999', 'rafa@gmail.com', 'São Bernardo do Campo', 'São Paulo');
INSERT INTO usuario(nome, telefone, email, cidade, estado) VALUES ('Thiago', '999999999', 'thiago@gmail.com', 'São Bernardo do Campo', 'São Paulo');
INSERT INTO usuario(nome, telefone, email, cidade, estado) VALUES ('Lorena', '999999999', 'lorena@gmail.com', 'Belo Horizonte', 'Minas Gerais');

INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Cida Doces', '111111111111','Limeira', 'São Paulo', 'Confeitaria');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Padaria dos Vianas', '111111111111','Florianópolis', 'São Paulo', 'Padaria');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Joaquim Contabilidade', '111111111111','Fortaleza', 'Ceará', 'Contabilidade');

INSERT INTO livro(nome, descricao, imagem) VALUES ('Recepcionista','kjdflkjdlkdjflkfjlkfj', 'Url Imagem');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Porteiro','kjdflkjdlkdjflkfjlkfj', 'Url Imagem');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Secretária','kjdflkjdlkdjflkfjlkfj', 'Url Imagem');

INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Entregador', 'oiuououoiuouio', '1000.0', '30 Horas semanais', 2);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Recepcionista', 'oiuououoiuouio', '1000.0', '30 Horas semanais', 1);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Repositor(a)', 'oiuououoiuouio', '1000.0', '30 Horas semanais', 3);

INSERT INTO candidatura(usuario_id, vaga_id) VALUES (1, 2);
