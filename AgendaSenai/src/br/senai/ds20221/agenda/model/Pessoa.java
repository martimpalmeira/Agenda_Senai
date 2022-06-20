package br.senai.ds20221.agenda.model;

import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	
	private Date dataDeNascimento;
	
	private String cpf;
	

	public Pessoa(String nome, Date dataDeNascimento, String cpf) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
	
}
