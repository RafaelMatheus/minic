#### MINIC

Trata-se da esrtutura lexica da linguagem de programação MINIC, uma linguagem proposta em sala de aula para aprendizagem na displicina de compiladores. 

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

* 1º Importe o projeto
* 2º Execute MiniCApp


#### Estrutura do projeto

| Classe | O que é |
| ------ | ------  |
| Minc.lex         | Especificações dos lexemas da linguagem de programação Minic |
| Programatext.txt | Especificações do programa de entrada que os lexemas deverá reconhecer |
| AnalisadorLexico | Classe java que o Jflex gera após ler a classe de especificação Minc.lex |
| Token            | Classe java com as especificações dos Tokens que deverão ser gerados |
| GeradorClassesJFlex | Classe java para gerar a classe AnalisadorLexico |

