# Projeto BancoGenérico

Banco Generico

Este é um projeto de software para simulação de um sistema bancário genérico, desenvolvido em Java com interface gráfica usando Swing.

## Funcionalidades Principais

- Cadastro de contas bancárias.
- Realização de saques, depósitos e transferências.
- Geração de extratos bancários.
- Interface gráfica amigável.

## Funcionalidades desejadas e que não foram implementadas (ToDo)

- Subclasses da clase conta (conta_corrente, conta_poupanca).
- Interface de administrador que ira manipular todos os dados do sistema.
- Realizacao de tranferencia bancaria entre as contas do Banco de Dados.

## Requisitos do Sistema

- Java Development Kit (JDK) versão 8 ou superior.
- Apache Maven para compilação e gerenciamento de dependências.
- Banco de dados MySQL para persistência de dados.

## Configuração do Projeto

1. Clone o repositório do projeto.
2. Importe o projeto para o Apache NetBeans ou sua IDE preferida.
3. Certifique-se de ter configurado corretamente o arquivo `pom.xml` com as dependências necessárias.
4. Configure a conexão com o banco de dados MySQL conforme necessário no arquivo `bancoDados.java`.

## Como Executar o Projeto

1. Compile o projeto usando o Maven: `mvn clean install`.
2. Execute a classe principal `com.mycompany.entidades.Executa` para iniciar a aplicação.