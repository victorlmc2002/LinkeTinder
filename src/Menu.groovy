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
            println '3. Sair'
            print 'Escolha uma opção: '
            def opcao = System.in.newReader().readLine()
            switch (opcao) {
                case '1': listarCandidatos(); break
                case '2': listarEmpresas(); break
                case '3': println 'Saindo...'; return
                default: println 'Opção inválida.'
            }
        }
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