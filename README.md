<h2>Digital Innovation: Expert class - Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

Sistema para gerenciamento de pessoas de uma empresa através de um API REST, criada com o Spring Boot.

Foi abordado os seguintes tópicos:
* Setup inicial de projeto com o Spring Boot Initialzr.
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados.
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST.
* Desenvolvimento de testes unitários para validação das funcionalidades.
* Implantação do sistema na nuvem através do Heroku.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```
