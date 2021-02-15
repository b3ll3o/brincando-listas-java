package br.com.leo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Leonardo");
		alunos.add("Pedro");
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Leandro");
		alunos.add("Kaique");
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		boolean alunoMatriculado = alunos.contains("Vitor");
		
		System.out.println(alunoMatriculado);
		
		List<String> listaAlunos = new ArrayList<>(alunos);
		
		Collections.sort(listaAlunos);
		
		System.out.println(listaAlunos);
	}
}
