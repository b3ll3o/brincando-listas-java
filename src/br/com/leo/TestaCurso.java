package br.com.leo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominado as coleções java", "Leonardo Rocha Andreazzi");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImuataveis = curso.getAulas();
		System.out.println(aulasImuataveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImuataveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(curso.getTempoTotal());
		
		System.out.println(curso);
	}
}
