# 📝 TodoAPI

[![Java](https://img.shields.io/badge/Java-17-blue.svg?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen?logo=spring-boot)](https://spring.io/projects/spring-boot)
[![Build](https://img.shields.io/badge/build-passing-brightgreen.svg)]()
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
![Last Commit](https://img.shields.io/github/last-commit/thales32k0/todoapi)

> Uma API RESTful simples de tarefas (ToDo) usando Spring Boot, Spring Data JPA e H2 Database.

---

## 🚀 Tecnologias utilizadas

- ☕ Java 17+
- 🌱 Spring Boot 3
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🛢️ H2 Database (em memória)
- ⚙️ Maven

---

## 🚀 Como rodar o projeto

### ✅ Pré-requisitos
- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou outro IDE

### 📥 Clonando o repositório
`` `bash

git clone https://github.com/thales32k0/todoapi.git

cd todoapi

./mvnw spring-boot:run

---

### 📡 **5. Endpoints da API**

| Método | Endpoint       | Descrição               |
|--------|----------------|-------------------------|
| GET    | `/tasks`       | Listar todas as tarefas |
| POST   | `/tasks`       | Criar uma nova tarefa   |
| PUT    | `/tasks/{id}`  | Atualizar uma tarefa    |
| DELETE | `/tasks/{id}`  | Remover uma tarefa      |


## 🧪 Testando com Postman
1.Baixe o Postman

2.Importe a [Todo API.postman_collection.json](https://github.com/thales32k0/ToDoAPI/blob/main/Todo%20API.postman_collection.json)

3.Execute os métodos `GET`, `POST`, `PUT`, `DELETE` com os seguintes endpoints:

 - GET → `http://localhost:8080/tasks`
- POST → `http://localhost:8080/tasks` (body JSON)
- PUT → `http://localhost:8080/tasks/1`
- DELETE → `http://localhost:8080/tasks/1`
    
---


## 🗃️ Banco de Dados H2

- 🌐 URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- 🧬 JDBC: `jdbc:h2:mem:testdb`
- 👤 Usuário: `sa`
- 🔑 Senha: (deixe em branco)
  
---

## 👨‍💻 Autor
<table>
  <tr>
    <td><img src="https://avatars.githubusercontent.com/u/89024257?v=4" width="100"/></td>
    <td>
      <b>Thales Eduardo</b><br/>
      Aprendiz de tecnologia focado em Java ☕<br/>
      <a href="https://github.com/thales32k0">GitHub</a>
    </td>
  </tr>
</table>

---

## 📄 Licença
Este projeto está sob a licença [MIT](LICENSE).


