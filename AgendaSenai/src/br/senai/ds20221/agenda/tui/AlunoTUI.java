package br.senai.ds20221.agenda.tui;

import java.util.Scanner;

import br.senai.ds20221.agenda.model.Aluno;

public class AlunoTUI {

	public static void cadastrarAluno() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Cpf: ");
		String cpf = sc.nextLine();

		System.out.print("numeroDeMatricula: ");
		String numDeMatricula = sc.nextLine();
		
		Aluno aluno = new Aluno(nome,idade,cpf,numDeMatricula);

		
		
		
	}

	public static void listarAluno() {
		
	}

	public static void excluirAluno() {

	}

}
