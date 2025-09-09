
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
├── main/groovy/
│   ├── Pessoa.groovy
│   ├── Candidato.groovy
│   ├── Empresa.groovy
│   ├── Menu.groovy
│   └── Main.groovy
└── test/groovy/
    ├── CandidatoTest.groovy
    ├── EmpresaTest.groovy
    └── MenuTest.groovy
```
## 🧪 Testes

O projeto implementa testes unitários abrangentes usando JUnit 5:

- **CandidatoTest**: Testa criação, validação e métodos da classe Candidato
- **EmpresaTest**: Testa criação, validação e métodos da classe Empresa  
- **MenuTest**: Testa funcionalidades de cadastro e gerenciamento de listas
  
## Tecnologias utilizadas

- Groovy (sem frameworks)
- Junit 5
- Terminal/Console para interação

## Autor

- Victor Loureiro Maior Coutinho

## Observações

- O projeto não utiliza persistência de dados (por enquanto).
- O MVP foca em funcionalidades básicas e pode ser expandido futuramente.

