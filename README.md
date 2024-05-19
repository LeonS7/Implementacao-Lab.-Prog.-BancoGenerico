# Projeto Banco Genérico

Este é um projeto de software para simulação de um sistema bancário genérico, desenvolvido em Java com interface gráfica usando Swing.

## Funcionalidades Principais

- Cadastro de contas bancárias.
- Realização de saques, depósitos e transferências.
- Geração de extratos bancários.
- Interface gráfica amigável.

## Funcionalidades desejadas e que não foram implementadas (ToDo)

- Subclasses da clase conta (conta_corrente, conta_poupanca).
- Interface de administrador que ira manipular todos os dados do sistema.

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

1. Execute o MySQL ou o programa de sua preferencia.
2. Crie o banco de dados com os dados disponiveis na classe `com.mycompany.BD.bancoDados` ou crie seus proprios dados e depois
   modifique a classe `com.mycompany.BD.bancoDados` com os dados necessarios.
3. Execute o arquivo SQL `BancoGenerico` disponivel na pasta Banco de Dados.
4. Execute o arquivo .jar ou use as alternativas seguintes para executar o projeto.

*No Terminal ou Prompt de Comando*

Certifique-se de ter o Java instalado em seu sistema. Para compilar e executar o programa manualmente, siga os passos abaixo:

1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório onde o arquivo `BancoGenerico-1.0-SNAPSHOT.java` está localizado.
3. Compile o programa usando o comando `javac BancoGenerico-1.0-SNAPSHOT.java`.
4. Execute o programa com o comando `java BancoGenerico-1.0-SNAPSHOT`.

*No Apache NetBeans IDE*

1. Abra o Apache NetBeans IDE.
2. Compile o projeto usando o Maven: `mvn clean install`.
2. Execute a classe principal `com.mycompany.entidades.Executa` para iniciar a aplicação.

# Últimas Atualizações Adicionadas

1. Ação 'imprimir Extrato' agora utiliza a biblioteca iText e salva o arquivo no formato PDF.

2. Intercionalização do projeto.
- A pasta idiomas possui os arquivos no formato `.properties`.
- Disponibiliza a traducao da interface, PopUp's de menssagens, dados do usuario exibidos na interface e dos Extratos Bancarios.
- Idiomas disponíveis: Portugues pt_BR (padrão), Ingles en_US e Espanhol es_ES.
