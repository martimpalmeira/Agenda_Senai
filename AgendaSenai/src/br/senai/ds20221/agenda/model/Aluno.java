package br.senai.ds20221.agenda.model;

import java.util.Date;

public class Aluno extends Pessoa {

	private String numeroDeMatricula;

	private Turma turma;

	public Aluno(String nome, Date dataDeNascimento, String cpf, String numeroDeMatricula) {
		super(nome, dataDeNascimento, cpf);
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

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
