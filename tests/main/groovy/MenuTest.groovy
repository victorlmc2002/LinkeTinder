package main.groovy

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MenuTest {
    private Menu menu
    private List<Candidato> candidatos
    private List<Empresa> empresas

    @BeforeEach
    void setUp() {
        candidatos = [
                new Candidato('Ana', 'ana@email.com', '12345678901', 28, 'SP', '01000-000', 'Dev Backend', ['Java', 'Spring']),
                new Candidato('Bruno', 'bruno@email.com', '23456789012', 32, 'RJ', '20000-000', 'Fullstack', ['Python', 'Angular'])
        ]

        empresas = [
                new Empresa('Google', 'google@gmail.com', '12345678000199', 'Brasil', 'SP', '01001-000', 'Empresa de TI', ['Java', 'Spring']),
                new Empresa('Rockstar', 'rockstar@hotmail.com', '23456789000188', 'Brasil', 'RJ', '20001-000', 'Análise de dados', ['Python', 'R'])
        ]

        menu = new Menu(candidatos, empresas)
    }

    @Test
    void deveAdicionarNovoCandidato() {
        // Arrange
        int tamanhoInicial = menu.candidatos.size()
        Candidato novoCandidato = new Candidato(
                'Victor Loureiro',
                'victorlmc2001@gmail.com',
                '34567890123',
                233,
                'RJ',
                '30000-000',
                'Estudante',
                ['Java', 'Groovy', 'Python']
        )

        // Act
        menu.candidatos << novoCandidato

        // Assert
        assertEquals(tamanhoInicial + 1, menu.candidatos.size())
        assertTrue(menu.candidatos.contains(novoCandidato))
        assertEquals('Victor Loureiro', menu.candidatos.last().nome)
    }

    @Test
    void deveAdicionarNovaEmpresa() {
        // Arrange
        int tamanhoInicial = menu.empresas.size()
        Empresa novaEmpresa = new Empresa(
                'Google',
                'google@fmail.com',
                '34567890000177',
                'Brasil',
                'RJ',
                '30001-000',
                'Tecnologia',
                ['AWS', 'Azure', 'Docker']
        )

        // Act
        menu.empresas << novaEmpresa

        // Assert
        assertEquals(tamanhoInicial + 1, menu.empresas.size())
        assertTrue(menu.empresas.contains(novaEmpresa))
        assertEquals('Google', menu.empresas.last().nome)
    }
}