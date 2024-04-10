# Exemplo de CRUD com Swing em Java

Este repositório contém um projeto de exemplo que demonstra como implementar operações básicas de CRUD (Create, Read, Update, Delete) utilizando a biblioteca Swing do Java. O objetivo deste projeto é fornecer uma referência clara e simples para desenvolvedores que desejam criar interfaces gráficas para aplicações Java que interagem com um banco de dados.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **src/**: Contém todo o código-fonte do projeto.
  - **com.mycompany.bd**
    - **Arquivos**
      - **MemoryDatabase.java**: Classe que representa o "banco de dados" da aplicação. Contém a referência a um ArrayList estático que será acessado para realizar as operações do crud, ou seja, **inserir**, **alterar**, **deletar** ou **listar**.
  - **com.mycompany.outros**
    - **Arquivos**
      - **Formularios.java**: Classe que contém variáveis de referência aos formulários que serão utilizados durante a execução do programa. Essas variáveis servem para guardar instâncias, ou seja, objetos das telas que foram abertas.
      - **Temp.java**: Classe que contém uma variável de referencia que servirá para guardar um objeto que será manipulado, isto é, alterado ou deletado.
  - **com.mycompany.produto**
    - **Arquivos**
      - **Produto.java**: Representa o modelo de um produto, objeto principal da aplicação. Nessa classe estão contidas as propriedades (privadas) bem como os métodos *gettes* e *setters*; *equals* e *hashCode*; e *toString*.
  - **com.mycompany.telas**
    - **Arquivos**
      - **cadProduto.java**: Classe que representará a tela de cadastro.
      - **ListProduto.java**: Classe que representará a tela de listagem/pesquisa.
      - **MenuPrincipal.java**: Classe que representará o menu principal da aplicação.
  
## Funcionalidades

Este projeto exemplifica as seguintes funcionalidades:

- **Create**: Adicionar novos registros ao banco de dados.
- **Read**: Recuperar e exibir registros do banco de dados.
- **Update**: Atualizar registros existentes no banco de dados.
- **Delete**: Excluir registros do banco de dados.

- Obs: este projeto não utiliza um banco de dados convencional e sim uma estrutura de ArrayList em memória que simula o comportamendo de um banco de dados.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter o seguinte instalado:

- NetBeans IDE v18 ou +
- JDK (Java Development Kit) 8 ou superior.
