package br.com.leo;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominado as coleções java", "Leonardo Rocha Andreazzi");

		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Leonardo", 123);
		Aluno a2 = new Aluno("João", 456);
		Aluno a3 = new Aluno("Maria", 789);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		curso.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		Aluno leo = new Aluno("Leonardo", 123);
		
		System.out.println("O aluno esta matriculado: " + curso.estaMatricula(leo));
	}
}
