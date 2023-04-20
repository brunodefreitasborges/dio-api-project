# Projeto ClientesAPI
API para cadastro de clientes com nome e CEP. O CEP é pesquisado na API do ViaCep, retornando os dados do endereço do cliente para então persistir o objeto completo no banco.

Este projeto foi feito pela plataforma DIO, com o objetivo de praticar Spring Data JPA em Java.

Tecnologias utilizadas:

- Java
- Spring Boot
- Maven
- DataJPA
- H2

Para melhorar o desacoplamento das services, foi utilizado um facade separada, que se encarrega de resolver toda a lógica relacionada aos endereços para só então passar os dados para o serviço de clientes.

Instruções para rodar o projeto:

1. Faça clone do projeto para sua máquina
2. Utilize o comando "mvn clean install" na raiz do projeto para baixar as dependências e realizar o build
3. Utilize o comando "mvn spring-boot:run" para iniciar a aplicação
4. Acesse o endereço http://localhost:8080 para acessar a API
Observação: Certifique-se de ter uma conexão com a internet para que o projeto possa acessar a API do ViaCep.
