# Plataforma de Feedback Contínuo de Sistemas

## Descrição

Este projeto é uma plataforma para coletar feedback contínuo sobre sistemas, permitindo que os usuários enviem comentários e avaliações. O sistema utiliza Spring Boot para a construção da API REST e Hibernate para a persistência dos dados em um banco de dados relacional.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Hibernate (JPA)**
- **Banco de Dados**: MySQL / PostgreSQL / outro de sua escolha
- **Lombok**: Para simplificar o código Java
- **Validação**: Jakarta Bean Validation

## Estrutura do Projeto

CSF_Solutions ├── src │ ├── main │ │ ├── java │ │ │ └── CSF_Solutions │ │ │ ├── CSF_SolutionsApplication.java │ │ │ ├── controller │ │ │ │ └── FeedbackController.java │ │ │ ├── service │ │ │ │ └── FeedbackService.java │ │ │ ├── repository │ │ │ │ └── FeedbackRepository.java │ │ │ └── domain │ │ │ └── model │ │ │ └── Feedback.java │ │ └── resources │ │ ├── application.properties │ │ └── ... │ └── test │ └── ... └── pom.xml

## Configuração do Ambiente

### Pré-requisitos

- Java 17
- Maven
- MySQL / PostgreSQL ou outro banco de dados

### Configuração do Banco de Dados

1. Crie um banco de dados no seu sistema de gerenciamento de banco de dados.
2. Configure as credenciais de acesso e o URL do banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
