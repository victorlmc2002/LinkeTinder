package test

import main.groovy.Empresa
import org.junit.jupiter.api.*
import static org.junit.jupiter.api.Assertions.*

class EmpresaTest {
    private Empresa empresa
    private List<String> competenciasEsperadas

    @BeforeEach
    void setUp() {
        competenciasEsperadas = ['Java', 'Spring Boot', 'Microservices']
        empresa = new Empresa(
                'Umbrella Corporations',
                'umbrella@commercial.com',
                '12345678000199',
                'USA',
                'Rackooon City',
                '01001-000',
                'Empresa de melhorias genéticas',
                competenciasEsperadas
        )
    }
    @Test
    void criarEmpresaCorretamente(){
        // Assert
        assertEquals('Umbrella Corporations', empresa.nome)
        assertEquals('umbrella@commercial.com', empresa.emailCorporativo)
        assertEquals('12345678000199', empresa.cnpj)
        assertEquals('USA', empresa.pais)
        assertEquals('Rackooon City', empresa.estado)
        assertEquals('01001-000', empresa.cep)
        assertEquals('Empresa de melhorias genéticas', empresa.descricao)
        assertEquals(competenciasEsperadas, empresa.competencias)
    }
    @Test
    void deveRetornarToStringFormatado() {
        // Act
        String resultadoEsperado = "Empresa: Umbrella Corporations | Email: umbrella@commercial.com " +
                "| CNPJ: 12345678000199 | País: USA | Estado: " +
                "Rackooon City | CEP: 01001-000 | Descrição: Empresa de melhorias genéticas " +
                "| Competências: [Java, Spring Boot, Microservices]"

        // Assert
        assertEquals(resultadoEsperado, empresa.toString())
    }
    @Test
    void deveAceitarListaCompetenciasVazia() {
        // Act
        empresa.competencias =[]

        // Assert
        assertNotNull(empresa.competencias)
        assertTrue(empresa.competencias.isEmpty())
    }
}