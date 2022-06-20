package br.senai.ds20221.agenda.model;

import java.util.ArrayList;
import java.util.Date;

public class Professor extends Pessoa {
	
	private String formacao;

	public Professor(String nome, Date dataDeNascimento, String cpf, String formacao) {
		super(nome, dataDeNascimento, cpf);
		this.formacao = formacao;
	}
	
	
	
}
