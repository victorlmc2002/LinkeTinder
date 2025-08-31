class Candidato implements Pessoa {
    String nome, email, cpf, estado, cep, descricao
    int idade
    List<String> competencias

    Candidato(nome, email, cpf, idade, estado, cep, descricao, competencias) {
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.idade = idade
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competencias = competencias
    }


    String getNome() { nome }
    String getEmail() { email }
    List<String> getCompetencias() { competencias }

    @Override
    public String toString() {
        return "Candidato{Nome: ${nome} | Email: ${email} " +
                "| CPF: ${cpf} | Idade: ${idade} | Estado: " +
                "${estado} | CEP: ${cep} | Descrição: ${descricao} " +
                "| Competências: ${competencias}"
    }
}