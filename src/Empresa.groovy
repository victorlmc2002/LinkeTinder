class Empresa implements Pessoa {
    String nome, emailCorporativo, cnpj, pais, estado, cep, descricao
    List<String> competencias

    Empresa(nome, emailCorporativo, cnpj, pais, estado, cep, descricao, competencias) {
        this.nome = nome
        this.emailCorporativo = emailCorporativo
        this.cnpj = cnpj
        this.pais = pais
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }

    String getNome() { nome }
    String getEmail() { emailCorporativo }
    List<String> getCompetencias() { competencias }

    @Override
    public String toString() {
        return "Candidato{Nome: ${nome} | Email: ${emailCorporativo} " +
                "| CNPJ: ${cnpj} | País: ${pais} | Estado: " +
                "${estado} | CEP: ${cep} | Descrição: ${descricao} " +
                "| Competências: ${competencias}"
    }
}