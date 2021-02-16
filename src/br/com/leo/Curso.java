package br.com.leo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAlunos = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "{Curso: " + nome + ", tempo total: " + getTempoTotal() + " minutos, aulas: " + aulas + "}";
	}
	
	public void matricula(Aluno aluno) {
		alunos.add(aluno);
		matriculaParaAlunos.put(aluno.getMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatricula(Aluno aluno) {
		return alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int matricula) {	
		if(!matriculaParaAlunos.containsKey(matricula))
			throw new NoSuchElementException("Matricula não encontrada");
		
		return matriculaParaAlunos.get(matricula);
	}
}
