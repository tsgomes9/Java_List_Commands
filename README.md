# ArrayList Manipulation in Java

Este é um programa simples em Java criado para fins de estudo, demonstrando como trabalhar com a classe `ArrayList` e a API de Streams do Java para manipular e filtrar dados.

## Funcionalidades

- Criação e manipulação de um `ArrayList` contendo nomes.
- Impressão do tamanho e dos elementos do `ArrayList`.
- Remoção de elementos por índice, por valor ou com base em uma condição.
- Uso da API de Streams para filtrar e buscar elementos no `ArrayList`.

## Estrutura do Código

1. **Criação de um ArrayList de Nomes:**
   - Inicializa um `ArrayList<String>` com alguns nomes.
   - Adiciona elementos ao ArrayList.
   - Imprime os elementos e o tamanho do ArrayList.

2. **Remoção de Elementos:**
   - Remove um elemento pelo índice.
   - Remove um elemento pelo valor (caso não exista, não gera erro).
   - Remove elementos com base em uma condição (neste caso, nomes que começam com a letra 'C').

3. **Filtragem com Streams:**
   - Filtra os elementos que começam com uma letra específica e cria uma nova lista.
   - Busca o primeiro elemento que começa com uma letra específica e retorna `null` se não encontrado.
     
## Pré-requisitos

- Java 8 ou superior (devido ao uso da API de Streams).
- IDE ou terminal configurado para executar programas Java.

## Como Executar

1. Clone o repositório ou copie o código para seu ambiente local.
2. Compile o código com:
  javac application/Main.java3.
3. Execute o programa com:
  java application.Main
