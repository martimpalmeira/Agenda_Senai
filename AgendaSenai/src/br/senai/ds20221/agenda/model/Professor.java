package br.senai.ds20221.agenda.model;

import java.util.ArrayList;

public class Professor extends Pessoa {
	
	private ArrayList<String> disciplinas;
	
	private String formacao;

	public Professor(String nome, int idade, String cpf, String formacao) {
		super(nome, idade, cpf);
		this.formacao = formacao;
	}
	
	
	
}
