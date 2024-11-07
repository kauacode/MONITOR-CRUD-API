## Sistema de Gerenciamento de Monitores - API em Spring Boot
Este projeto foi desenvolvido em Spring Boot para gerenciar monitores de forma simples e eficiente por meio de uma API RESTful. A aplicação oferece funcionalidades como cadastro, consulta, atualização e exclusão de monitores, com dados como nome, categoria, tamanho e preço armazenados em um banco de dados relacional. Além disso, a comunicação entre o front-end e a API é feita utilizando requisições HTTP com a API fetch, garantindo uma integração fluida e interativa.

## Funcionalidades Principais
Cadastro de Monitores: Permite a criação de novos monitores, com campos como nome, categoria, tamanho e preço. <br>
Consulta de Monitores Existentes: Permite a visualização dos monitores cadastrados, com a possibilidade de consultar todos ou um monitor específico. <br>
Edição de Monitores: Oferece a possibilidade de atualizar as informações de um monitor existente. <br>
Exclusão de Monitores: Permite remover monitores do sistema. <br>

## Estrutura do Sistema
A aplicação é composta pelas seguintes classes principais:

MonitorController
Responsável pelo gerenciamento das requisições HTTP. Ele processa as requisições para consulta, criação, atualização e exclusão de monitores, e utiliza o MonitorDao para persistir os dados no banco de dados.

Métodos principais:

listar(): Retorna todos os monitores cadastrados.<br>
obter(int id): Retorna um monitor específico com base no ID.<br>
incluir(Monitor monitor): Registra um novo monitor.<br>
atualizar(int id, Monitor monitorAtualizado): Atualiza um monitor existente.<br>
excluir(int id): Exclui um monitor do sistema.<br>

MonitorDao
Interface que gerencia as operações de persistência usando o JpaRepository. Ele facilita a interação com o banco de dados, com métodos como salvar, consultar e excluir monitores.

Métodos principais:

save(Monitor monitor): Persiste ou atualiza um monitor.
findById(int id): Consulta um monitor pelo ID.
findAll(): Retorna todos os monitores cadastrados.
deleteById(int id): Exclui um monitor pelo ID.
Monitor
Classe que representa o modelo de dados de um monitor, com atributos como ID, nome, categoria, tamanho e preço.

## Integração com o Front-End utilizando fetch
A parte do front-end do sistema foi construída para interagir com a API utilizando a função fetch, que permite realizar requisições HTTP assíncronas. Isso proporciona uma experiência de usuário mais dinâmica e eficiente, sem a necessidade de recarregar a página.

Listar Monitores: A função fetch é usada para fazer uma requisição GET para o endpoint /monitores para obter todos os monitores cadastrados. O retorno é então processado e exibido na interface do usuário.

Consultar Monitor Específico: Similar à listagem, mas passando o ID do monitor na URL para consultar um monitor específico.

Criar Novo Monitor: Quando o usuário envia o formulário para criar um novo monitor, o front-end utiliza fetch para fazer uma requisição POST para o endpoint /monitores, enviando os dados do monitor no corpo da requisição.

Atualizar Monitor: Para atualizar um monitor existente, a função fetch é usada com o método PUT. Os dados atualizados do monitor são enviados no corpo da requisição.

Excluir Monitor: Para remover um monitor, a requisição DELETE é feita para o endpoint /monitores/{id}.

## Requisitos do Projeto

Java Development Kit (JDK) 8 ou versão superior.
Spring Boot 2.x.
Banco de Dados: O sistema utiliza um banco de dados relacional (configurável via JPA).
Como Executar o Sistema
Configuração do Ambiente: Certifique-se de ter o JDK 8 ou superior instalado e o ambiente configurado corretamente. <br>
Executar a Aplicação: Ao rodar a aplicação, a API estará disponível no endpoint http://localhost:8081/monitores. <br>
Interagir com a API: <br>

Consultar Monitores: Envie um GET para /monitores para listar todos os monitores. <br>
Consultar Monitor por ID: Envie um GET para /monitores/{id} para obter informações sobre um monitor específico. <br>
Criar Novo Monitor: Envie um POST para /monitores com o corpo da requisição contendo os dados do monitor a ser criado.
Atualizar Monitor: Envie um PUT para /monitores/{id} com o corpo da requisição contendo os novos dados do monitor. <br>
Excluir Monitor: Envie um DELETE para /monitores/{id} para remover um monitor do sistema.

## Principais Tecnologias Utilizadas

Spring Boot: Framework para criação da API REST. <br>
Spring Data JPA: Para facilitar a persistência dos dados em um banco relacional. <br>
JpaRepository: Para interagir com o banco de dados de forma simples. <br>
Fetch API: Para realizar requisições HTTP assíncronas no front-end, garantindo uma interação dinâmica com a API.

## Imagens Projeto

![image](https://github.com/user-attachments/assets/e99c96df-72f2-467e-a96b-378c0705c1df)

![image](https://github.com/user-attachments/assets/c52410c8-6073-4710-943e-30a0490826f5)
