# 📝 TodoAPI

[![Java](https://img.shields.io/badge/Java-17-blue.svg?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen?logo=spring-boot)](https://spring.io/projects/spring-boot)
[![Build](https://img.shields.io/badge/build-passing-brightgreen.svg)]()
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

> Uma API REST simples de tarefas (ToDo) criada com **Java**, **Spring Boot**, **Spring Data JPA** e banco **H2** em memória.

---

## 🚀 Tecnologias utilizadas

- ✅ Java 17+
- ✅ Spring Boot 3
- ✅ Spring Web
- ✅ Spring Data JPA
- ✅ H2 Database
- ✅ Maven

---

## ⚙️ Como rodar o projeto

### 📦 Pré-requisitos

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- [IntelliJ IDEA Community](https://www.jetbrains.com/idea/)

### 🛠️ Clonando e executando
'''bash
git clone https://github.com/thales32k0/todoapi.git
cd todoapi
./mvnw spring-boot:run

Ou via IntelliJ:

Abra o projeto

Navegue até TodoapiApplication.java

Clique com o botão direito > Run

---

## 📬API Endpoints

### 📍Base URL: http://localhost:8080/tasks

| Método | Endpoint       | Descrição                |
|--------|----------------|--------------------------|
| GET    | `/tasks`       | Listar todas as tarefas  |
| POST   | `/tasks`       | Criar uma nova tarefa    |
| PUT    | `/tasks/{id}`  | Atualizar uma tarefa     |
| DELETE | `/tasks/{id}`  | Remover uma tarefa       |

### 📌Exemplo de payload JSON para POST ou PUT:

{
  "title": "Estudar Spring",
  
  "description": "Fazer API REST usando Spring Boot",
  
  "completed": false
}

---

## 🧪 Testando com Postman
1.Baixe o Postman

2.Crie uma Collection chamada Todo API

3.Adicione as requisições:

  - GET → http://localhost:8080/tasks

  - POST → com JSON no body

  - PUT → http://localhost:8080/tasks/1 (exemplo)

  - DELETE → http://localhost:8080/tasks/1
    
---

## 🗃️ Banco de Dados H2
Para visualizar as tabelas no banco H2:

- URL: http://localhost:8080/h2-console

- JDBC URL: jdbc:h2:mem:testdb

- User: sa

- Password: (deixe em branco)

---

## 👨‍💻 Autor
Feito com ❤️ por Thales
🔗 [GitHub](https://github.com/thales32k0)



