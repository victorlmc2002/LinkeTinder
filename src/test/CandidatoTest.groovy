package test

import main.groovy.Candidato
import org.junit.jupiter.api.*
import static org.junit.jupiter.api.Assertions.*

class CandidatoTest {
    private Candidato candidato
    private List<String> competenciasEsperadas

    @BeforeEach
    void setUp() {
        competenciasEsperadas = ['Java', 'Spring Framework', 'MySQL']
        candidato = new Candidato(
                'João Silva',
                'joao.silva@email.com',
                '12345678901',
                30,
                'SP',
                '01000-000',
                'Desenvolvedor Backend Sênior',
                competenciasEsperadas
        )
    }
    @Test
    void criarCandidatoCorretamente(){
        // Assert
        assertEquals('João Silva', candidato.nome)
        assertEquals('joao.silva@email.com', candidato.email)
        assertEquals('12345678901', candidato.cpf)
        assertEquals(30, candidato.idade)
        assertEquals('SP', candidato.estado)
        assertEquals('01000-000', candidato.cep)
        assertEquals('Desenvolvedor Backend Sênior', candidato.descricao)
        assertEquals(competenciasEsperadas, candidato.competencias)
    }
    @Test
    void deveRetornarToStringFormatado() {
        // Act
        String resultadoEsperado = "Candidato: João Silva | Email: joao.silva@email.com " +
                "| CPF: 12345678901 | Idade: 30 | Estado: " +
                "SP | CEP: 01000-000 | Descrição: Desenvolvedor Backend Sênior " +
                "| Competências: [Java, Spring Framework, MySQL]"

        // Assert
        assertEquals(resultadoEsperado, candidato.toString())
    }
    @Test
    void deveAceitarListaCompetenciasVazia() {
        // Act
        candidato.competencias =[]

        // Assert
        assertNotNull(candidato.competencias)
        assertTrue(candidato.competencias.isEmpty())
    }
}