package main.groovy

class Menu {
    List<Candidato> candidatos
    List<Empresa> empresas

    Menu(List<Candidato> candidatos, List<Empresa> empresas) {
        this.candidatos = candidatos
        this.empresas = empresas
    }

    void exibir() {
        while (true) {
            println '\n--- MENU ---'
            println '1. Listar candidatos'
            println '2. Listar empresas'
            println '3. Cadastrar novo candidato'
            println '4. Cadastrar nova empresa'
            println '5. Sair'
            print 'Escolha uma opção: '
            def opcao = System.in.newReader().readLine()
            switch (opcao) {
                case '1': listarCandidatos(); break
                case '2': listarEmpresas(); break
                case '3': cadastrarCandidato(); break
                case '4': cadastrarEmpresa(); break
                case '5': println 'Saindo...'; return
                default: println 'Opção inválida.'
            }
        }
    }
    void cadastrarCandidato() {
        println '\n--- Cadastro de Candidato ---'
        print 'Nome: '
        String nome = new Scanner(System.in).nextLine()
        print 'E-mail: '
        String email = new Scanner(System.in).nextLine()
        print 'CPF: '
        String cpf = new Scanner(System.in).nextLine()
        print 'Idade: '
        int idade = Integer.parseInt(new Scanner(System.in).nextLine())
        print 'Estado: '
        String estado = new Scanner(System.in).nextLine()
        print 'CEP: '
        String cep = new Scanner(System.in).nextLine()
        print 'Descrição: '
        String descricao = new Scanner(System.in).nextLine()
        print 'Competências (separadas por vírgula): '
        List<String> competencias = new Scanner(System.in).nextLine().split(',').collect { it.trim() }
        candidatos << new Candidato(nome, email, cpf, idade, estado, cep, descricao, competencias)
        println 'main.groovy.Candidato cadastrado com sucesso!'
    }

    void cadastrarEmpresa() {
        println '\n--- Cadastro de Empresa ---'
        print 'Nome: '
        String nome = new Scanner(System.in).nextLine()
        print 'E-mail corporativo: '
        String email = new Scanner(System.in).nextLine()
        print 'CNPJ: '
        String cnpj = new Scanner(System.in).nextLine()
        print 'País: '
        String pais = new Scanner(System.in).nextLine()
        print "Estado: "
        String estado = new Scanner(System.in).nextLine()
        print 'CEP: '
        String cep = new Scanner(System.in).nextLine()
        print 'Descrição: '
        String descricao = new Scanner(System.in).nextLine()
        print 'Competências desejadas (separadas por vírgula): '
        List<String> competencias = new Scanner(System.in).nextLine().split(',').collect { it.trim() }
        empresas << new Empresa(nome, email, cnpj, pais, estado, cep, descricao, competencias)
        println 'main.groovy.Empresa cadastrada com sucesso!'
    }
    void listarCandidatos() {
        println '\nCandidatos:'
        candidatos.each {
            println it
        }
    }

    void listarEmpresas() {
        println '\nEmpresas:'
        empresas.each { e ->
            println "Nome: ${e.nome}, Email: ${e.emailCorporativo}, CNPJ: ${e.cnpj}, País: ${e.pais}, Estado: ${e.estado}, CEP: ${e.cep}, Descrição: ${e.descricao}, Competências: ${e.competencias.join(', ')}"
        }
    }
}