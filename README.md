
# Linketinder - ZG-Hero Project

## Sobre o projeto

Este projeto é um MVP de sistema de contratação inspirado no Linkedin e Tinder, desenvolvido em Groovy para o ZG-Hero Project. O objetivo é implementar um backend simples que simula o processo de recrutamento, combinando funcionalidades de listagem e competências de candidatos e empresas.

## Funcionalidades

- Listar candidatos e empresas cadastrados
- Visualizar detalhes de cada candidato (nome, e-mail, CPF, idade, estado, CEP, descrição, competências)
- Visualizar detalhes de cada empresa (nome, e-mail corporativo, CNPJ, país, estado, CEP, descrição, competências)
- Menu interativo no terminal
- Estrutura orientada a objetos (POO)

## Requisitos dos candidatos

Cada candidato possui:
- Nome
- E-mail
- CPF
- Idade
- Estado
- CEP
- Descrição pessoal
- Competências (array de skills)

## Requisitos das empresas

Cada empresa possui:
- Nome
- E-mail corporativo
- CNPJ
- País
- Estado
- CEP
- Descrição da empresa
- Competências desejadas (array de skills)

## Estrutura do projeto

```
Linketinder/
├── src/
│   ├── Main.groovy
│   ├── Menu.groovy
│   ├── Pessoa.groovy
│   ├── Candidato.groovy
│   └── Empresa.groovy
└── README.md
```

## Tecnologias utilizadas

- Groovy (sem frameworks)
- Terminal/Console para interação

## Autor

- Victor Loureiro Maior Coutinho

## Observações

- O projeto não utiliza persistência de dados (por enquanto).
- O MVP foca em funcionalidades básicas e pode ser expandido futuramente.
