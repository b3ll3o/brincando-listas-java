package br.com.leo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return new ArrayList<>(aulas);
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
}
