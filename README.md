# 📋 Lista de Tarefas

Um sistema simples de gerenciamento de tarefas (To-Do List), desenvolvido com **Spring Boot**, **Java 21** e **MySQL**. Este projeto tem como objetivo demonstrar a estrutura de uma aplicação web utilizando o padrão MVC.

## 🔧 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Thymeleaf


## 🚀 Como Executar o Projeto

### Pré-requisitos

- Java 21 instalado
- MySQL rodando
- Maven 3.9+ instalado

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/JoaoPaes14/Lista-De-Tarefas.git
   cd Lista-De-Tarefas
````

2. Configure o banco de dados no arquivo `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/lista_tarefas
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Execute a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse no navegador:

   ```
   http://localhost:8080
   ```

## 📝 Funcionalidades

* ✅ Cadastro de tarefas
* ✅ Listagem de tarefas
* ✅ Marcar tarefas como concluídas
* ✅ Editar e excluir tarefas

## 🗃️ Estrutura do Projeto

```
src/
├── controller/
│   └── TarefaController.java
├── model/
│   └── Tarefa.java
├── repository/
│   └── TarefaRepository.java
     └── UsuarioRepository.java
├── templates/
│   ├── nova-tarefa.html
│   └── tarefa.html
└── application.properties
```

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.



Desenvolvido por [João Paes](https://github.com/JoaoPaes14) 💻


