# 📚 BuscaLivros

Aplicação desenvolvida em Java para pesquisar livros utilizando a **Google Books API**, realizar o consumo de dados externos e converter respostas JSON em objetos Java utilizando a biblioteca Gson.

O projeto tem como objetivo praticar conceitos de programação Java, consumo de APIs, requisições HTTP e desserialização de dados.

## 🚀 Tecnologias utilizadas

- **Java 17** – Linguagem de programação.
- **Gson** – Biblioteca para conversão de JSON em objetos Java.
- **Google Books API** – API utilizada para consultar informações sobre livros.
- **Java HttpClient** – Realização de requisições HTTP.
- **Scanner** – Entrada de dados pelo terminal.

## ⚙️ Funcionalidades

- Pesquisa de livros através da Google Books API.
- Consumo de dados externos utilizando requisições HTTP.
- Conversão de respostas JSON em objetos Java.
- Organização dos dados recebidos em classes específicas.
- Exibição das informações dos livros no terminal.

## 🏗️ Estrutura do projeto

```text
br.com.deveduardo.buscalivros
│
├── modelos
│   ├── Capa.java
│   ├── RespostaAPI.java
│   ├── ItemAPI.java
│   └── VolumeInfo.java
│
└── principal
    └── Classe principal da aplicação
```

## 🔄 Funcionamento

O funcionamento da aplicação segue o seguinte fluxo:

1. O usuário informa o livro que deseja pesquisar.
2. A aplicação realiza uma requisição HTTP para a Google Books API.
3. A API retorna os dados do livro em formato JSON.
4. A biblioteca Gson realiza a desserialização dos dados.
5. As informações são organizadas em objetos Java.
6. Os resultados são apresentados no terminal.

## 📖 Conceitos praticados

- Programação Orientada a Objetos (POO).
- Consumo de APIs REST.
- Requisições HTTP.
- Manipulação de JSON.
- Desserialização com Gson.
- Utilização de Records.
- Organização de pacotes e classes.
- Manipulação de listas e coleções.

## ▶️ Como executar

1. Clone este repositório:

```bash
git clone https://github.com/DevEduardoCardosoo/BuscaLivros.git
```

2. Abra o projeto em sua IDE Java.
3. Verifique se a dependência Gson está configurada.
4. Execute a classe principal localizada no pacote `principal`.
5. Utilize o terminal para realizar as pesquisas.

## 🎯 Objetivo do projeto

Este projeto faz parte da minha jornada de aprendizado em Engenharia de Software, com foco no desenvolvimento Backend utilizando Java.

A proposta é sair da teoria e colocar em prática conceitos importantes para o desenvolvimento de aplicações que se comunicam com serviços externos.

---

**Desenvolvido por Eduardo Cardoso** 💻

[GitHub](https://github.com/DevEduardoCardosoo)