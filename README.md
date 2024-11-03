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


### Clone o repositório:

git clone https://github.com/seu_usuario/seu_repositorio.git
cd seu_repositorio

Testando a API
Endpoint para Criar Feedback
URL: http://localhost:8080/api/feedback

Método: POST

Corpo da Requisição (JSON):
{
  "comment": "Este é um comentário de teste.",
  "rating": 5
}


## Documentação do Projeto

A documentação completa do projeto inclui os seguintes elementos:

### 1. Diagramas de Event Storming
Os diagramas de Event Storming são utilizados para entender e mapear os eventos de domínio e as interações dentro do sistema. Eles ajudam a identificar as entidades, comandos e eventos relevantes para o sistema de feedback.

![Diagrama de Event Storming]([link_para_o_diagrama_event_storming](https://miro.com/app/board/uXjVLU36N-g=/))

### 2. Descrições dos Domínios e Agregados
Nesta seção, são descritos os domínios envolvidos no sistema, incluindo os agregados e suas responsabilidades.

#### Domínio: Feedback
- **Agregado**: Feedback
  - **Identificador**: `id`
  - **Atributos**:
    - `comment`: String - O comentário do usuário.
    - `rating`: int - A avaliação dada pelo usuário (1 a 5).

### 3. Resumo dos Modelos Conceituais
Os modelos conceituais representam as principais entidades e suas relações dentro do sistema.

- **Feedback**: Representa o feedback enviado pelos usuários. Está associado a um usuário e contém informações sobre o comentário e a avaliação.

### 4. Arquitetura do Sistema
A arquitetura do sistema é baseada em uma abordagem de microserviços e segue as melhores práticas de desenvolvimento, incluindo a separação de responsabilidades entre os pacotes `controller`, `service` e `repository`. A estrutura do projeto é a seguinte:
