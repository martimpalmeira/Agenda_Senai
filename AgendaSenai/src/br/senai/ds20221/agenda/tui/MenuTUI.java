package br.senai.ds20221.agenda.tui;

import java.util.Scanner;

public class MenuTUI {

	public static void executarMenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("****** MENU ******");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Sair");

		int resposta = sc.nextInt();
		sc.nextLine();
		switch (resposta) {
		case 1:
			executarMenuCadastro();
			break;
		case 2:
			executarMenuListagem();
			break;
		case 3:
			executarMenuExclusao();
			break;
		case 4:
			executarSaida();
			break;
		default:
			System.out.println("Opção inválida, tente novamente");
			executarMenuPrincipal();
		}
	}

	public static void executarMenuCadastro() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("****** MENU DE CADASTRO ******");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - Cadastrar professor");
		System.out.println("3 - Cadastrar turma");
		System.out.println("4 - Cadastrar laboratório");
		System.out.println("5 - Voltar pra o menu principal");
		int resposta = sc.nextInt();
		sc.nextLine();
		switch(resposta) {
		case 1:
			AlunoTUI.cadastrarAluno();
			break;
		case 2:
			ProfessorTUI.cadastrarProfessor();
		break;
		case 3:
			TurmaTUI.cadastrarTurma();
			break;
		case 4:
			LaboratorioTUI.cadastrarLaboratorio();
			break;
		case 5:
			executarMenuPrincipal();
			break;
		default:
			System.out.println("Opção Inválida, tente novamente");
			executarMenuCadastro();
		}
	}

	public static void executarMenuListagem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****** MENU DE LISTAGEM ******");
		System.out.println("1 - Listar alunos");
		System.out.println("2 - Listar professores");
		System.out.println("3 - Listar turmas");
		System.out.println("4 - Listar laboratórios");
		System.out.println("5 - Voltar pra o menu principal");
		int resposta = sc.nextInt();
		sc.nextLine();
		switch(resposta) {
		case 1:
			AlunoTUI.listarAluno();
			break;
		case 2:
			ProfessorTUI.listarProfessor();
		break;
		case 3:
			TurmaTUI.listarTurma();
			break;
		case 4:
			LaboratorioTUI.listarLaboratorio();
			break;
		case 5:
			executarMenuPrincipal();
			break;
		default:
			System.out.println("Opção Inválida, tente novamente");
			executarMenuListagem();
		}
	}

	public static void executarMenuExclusao() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****** MENU DE EXCLUSÃO ******");
		System.out.println("1 - Excluir aluno");
		System.out.println("2 - Excluir professor");
		System.out.println("3 - Excluir turma");
		System.out.println("4 - Excluir laboratório");
		System.out.println("5 - Voltar pra o menu principal");
		int resposta = sc.nextInt();
		sc.nextLine();
		switch(resposta) {
		case 1:
			AlunoTUI.excluirAluno();
			break;
		case 2:
			ProfessorTUI.excluirProfessor();
		break;
		case 3:
			TurmaTUI.excluirTurma();
			break;
		case 4:
			LaboratorioTUI.excluirLaboratorio();
			break;
		case 5:
			executarMenuPrincipal();
			break;
		default:
			System.out.println("Opção Inválida, tente novamente");
			executarMenuExclusao();
		}
	}

	public static void executarSaida() {
		System.out.println("Finalizando programa");
	}

}
