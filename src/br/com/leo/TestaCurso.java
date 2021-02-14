package br.com.leo;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominado as coleções java", "Leonardo Rocha Andreazzi");
		
		List<Aula> aulas = curso.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
		System.out.println(curso.getAulas());
		
		curso.adiciona(new Aula("Dominando colleções", 15));
		curso.adiciona(new Aula("Dominando colleções 2", 15));
		curso.adiciona(new Aula("Dominando colleções 3", 15));
		
		System.out.println(curso.getAulas());
	}
}
