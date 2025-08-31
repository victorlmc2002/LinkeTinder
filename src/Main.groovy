class Main {
    static void main(String[] args) {

        List<Candidato> candidatos = [
                new Candidato('Ana', 'ana@email.com', '12345678901', 28, 'SP', '01000-000', 'Desenvolvedora backend', ['Java', 'Spring Framework']),
                new Candidato('Bruno', 'bruno@email.com', '23456789012', 32, 'RJ', '20000-000', 'Fullstack', ['Python', 'Angular']),
                new Candidato('Carla', 'carla@email.com', '34567890123', 25, 'MG', '30000-000', 'DevOps', ['Groovy', 'Docker']),
                new Candidato('Daniel', 'daniel@email.com', '45678901234', 30, 'RS', '90000-000', 'Frontend', ['JavaScript', 'React']),
                new Candidato('Eduarda', 'eduarda@email.com', '56789012345', 27, 'BA', '40000-000', 'QA', ['Selenium', 'JUnit'])
        ]
        List<Empresa> empresas = [
                new Empresa('Arroz-Gostoso', 'contato@arroz.com', '12345678000199', 'Brasil', 'SP', '01001-000', 'Empresa de alimentos', ['Java', 'Spring Framework']),
                new Empresa('Império do Boliche', 'contato@boliche.com', '23456789000188', 'Brasil', 'RJ', '20001-000', 'Entretenimento', ['Python', 'Angular']),
                new Empresa('Tech Solutions', 'contato@tech.com', '34567890000177', 'Brasil', 'MG', '30001-000', 'TI', ['Groovy', 'Docker']),
                new Empresa('Saúde+','contato@saude.com','45678900000166','Brasil','RS','90001-000','Saúde',['JavaScript, React']),
                new Empresa('EducaMais','contato@educa.com','56789000000155','Brasil','BA','40001-000','Educação',['Selenium, JUnit'])
        ]
        Menu menu = new Menu(candidatos, empresas)
        menu.exibir()
    }
}