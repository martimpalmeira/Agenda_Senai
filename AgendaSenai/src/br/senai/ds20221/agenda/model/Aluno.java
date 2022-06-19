package br.senai.ds20221.agenda.model;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	private String numeroDeMatricula;

	private Turma turma;
	
	private static ArrayList<Aluno> alunos;

	public Aluno(String nome, int idade, String cpf, String numeroDeMatricula) {
		super(nome, idade, cpf);
		this.numeroDeMatricula = numeroDeMatricula;
		
	}

	public String getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(String numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public static ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(ArrayList<Aluno> alunos) {
		Aluno.alunos = alunos;
	}
	
	
	
	

}
