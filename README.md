## 📌 Descrição

Este repositório contém a implementação de um programa em Java que demonstra os conceitos de Herança e Polimorfismo, utilizando os princípios da Programação Orientada a Objetos (POO).

O projeto utiliza uma classe base chamada Pessoa, da qual derivam as classes PessoaFisica e PessoaJuridica. Cada uma possui atributos específicos, como CPF e RG para pessoa física e CNPJ e Inscrição Estadual para pessoa jurídica.

O programa cria objetos dessas classes, atribui valores aos seus atributos e utiliza uma classe chamada MostrarDados para exibir as informações, demonstrando o uso de polimorfismo ao tratar diferentes tipos de objetos através de uma mesma referência.

---

## 🛠 Recursos Utilizados

Linguagem: Java

IDE: NetBeans

Paradigma: Programação Orientada a Objetos (POO)

Conceitos aplicados: Herança e Polimorfismo

Controle de versão: Git

Plataforma de hospedagem: GitHub

---

## 📋 Estrutura do Código

O programa foi organizado seguindo os seguintes critérios:

A classe Pessoa representa a classe base do sistema, contendo atributos e métodos comuns a todos os tipos de pessoa.

As classes PessoaFisica e PessoaJuridica herdam da classe Pessoa, adicionando atributos específicos para cada tipo.

A classe MostrarDados é responsável por receber objetos do tipo Pessoa e exibir suas informações.

O método main realiza:

a criação de objetos das classes PessoaFisica e PessoaJuridica

a atribuição de valores aos seus atributos

a chamada do método da classe MostrarDados para exibir os dados

Essa estrutura demonstra o uso de herança para reutilização de código e polimorfismo ao tratar objetos diferentes como um mesmo tipo base.

---

## ▶️ Funcionamento do Programa

O programa cria um objeto do tipo PessoaFisica e define seus dados (nome, RG e CPF).

Em seguida, cria um objeto do tipo PessoaJuridica e define seus dados (nome, inscrição estadual e CNPJ).

Os objetos são enviados para a classe MostrarDados, que recebe os objetos através de um parâmetro do tipo Pessoa.

O método então exibe os dados no console, demonstrando o uso do polimorfismo.

---

## 👨‍💻 Autor

Marcos Antonio
Curso: Análise e Desenvolvimento de Sistemas
Disciplina: Programação Orientada a Objetos I
