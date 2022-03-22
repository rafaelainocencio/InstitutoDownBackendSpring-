INSERT INTO usuario(nome, telefone, email, cidade, estado) VALUES ('Rafaela', '999999999', 'rafa@gmail.com', 'São Bernardo do Campo', 'São Paulo');
INSERT INTO usuario(nome, telefone, email, cidade, estado) VALUES ('Thiago', '999999999', 'thiago@gmail.com', 'São Bernardo do Campo', 'São Paulo');
INSERT INTO usuario(nome, telefone, email, cidade, estado) VALUES ('Lorena', '999999999', 'lorena@gmail.com', 'Belo Horizonte', 'Minas Gerais');

INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Cida Doces', '111111111111','Limeira', 'São Paulo', 'Confeitaria');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Padaria dos Vianas', '111111111111','Florianópolis', 'São Paulo', 'Padaria');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Joaquim Contabilidade', '111111111111','Fortaleza', 'Ceará', 'Contabilidade');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Mercado Luvipa', '111111111111','São Bernado do Campo', 'São Paulo', 'Varejo');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Dr. Nelson', '111111111111','Fortaleza', 'Ceará', 'Dentista');
INSERT INTO empresa(nome, cnpj, cidade, estado, ramo) VALUES ('Hotel Estrela', '111111111111','Fortaleza', 'Ceará', 'Hospedagem');

INSERT INTO livro(nome, descricao, imagem) VALUES ('Recepcionista',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/Secretaria.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Repositor de mercadorias',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/Repositor.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Mensageiro',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/Mensageiro.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Auxiliar de cozinha',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/AuxiliarDeCozinha.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Auxiliar de Limpeza',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/AuxiliarDeLimpeza.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Camareiro(a)',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/Camareira.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Ajudante De Produção',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/AjudanteDeProducao.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Telefonista',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/Telefonista.png');
INSERT INTO livro(nome, descricao, imagem) VALUES ('Ajudante De Produção',' Aut impedit quisquam hic voluptas quia ea nulla voluptas sit atque consequuntur.', 'http://alandavid-001-site1.htempurl.com/lib/Imagens/AjudanteDeProducao.png');

INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Repositor','Recebimento, Conferência e Reposição de mercadorias no estoque e na loja, vindas de fornecedores, depósito central ou outras lojas.', '1000.0', '30 Horas semanais', 4);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Camareiro','Arrumar os apartamentos, realizar a limpeza em áreas sociais.', '1000.0', '30 Horas semanais', 6);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Porteiro','Realizar controle de acesso em uma portaria residencial; Controlar o acesso de pessoas e veículos Receber, separar e entregar correspondências aos respectivos destinatários; Atuar de forma a cumprir normas e procedimentos internos do local de trabalho e da empresa.', '1000.0', '30 Horas semanais', 6);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Auxiliar de Limpeza','Limpar o prédio do setor comercial/logística e diretorias; Limpar as áreas ao redor do prédio; Limpeza de banheiros e vestiário.', '1000.0', '30 Horas semanais', 2);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Secretario','Apoiar na comunicação externa recebendo, distribuindo e enviando correspondências; Apoiar na comunicação interna com atendimento e registros de chamados; Atendimento ao cliente, fornecedor; Recepcionar o cliente e fornecedor', '1000.0', '30 Horas semanais', 3);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Auxiliar de Cozinha','Prestar serviços na cozinha, colaborando na confecção dos alimentos; Manter a limpeza da cozinha e áreas afins.', '1000.0', '30 Horas semanais', 6);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Vila Postal','Realizar distribuição de correspondências; Coletar assinaturas e registros de entrega; Realizar distribuição de correspondências; Coletar assinaturas e registros de entrega; Encaminhar aos setores responsáveis solicitações de materiais.', '1000.0', '30 Horas semanais', 3);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Telefonista','Realizar o atendimento telefônico receptivo e prestar esclarecimento de dúvidas dos clientes.', '1000.0', '30 Horas semanais', 5);
INSERT INTO vaga(nome, descricao, salario, carga_horaria, empresa_id) VALUES ('Ajudante de Produção','Realizar atividades nas fábricas, atuando como operador de produção; Inspeção de peças, separação e embalagem.', '1000.0', '30 Horas semanais', 1);

INSERT INTO candidatura(usuario_id, vaga_id) VALUES (1, 2);