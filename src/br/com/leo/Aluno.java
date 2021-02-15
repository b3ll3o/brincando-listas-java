package br.com.leo;

public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		
		if(nome == null)
			throw new NullPointerException("Nome não pode ser null.");
		
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "{Aluno: " + nome + ", matricula: " + matricula + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		if(!(obj instanceof Aluno))
			return false;
		
		Aluno aluno = (Aluno) obj;
		
		return aluno.nome.equals(nome);
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
}
