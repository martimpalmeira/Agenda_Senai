package br.senai.ds20221.agenda.tui;

import java.util.Scanner;

import br.senai.ds20221.agenda.model.Admin;

public class LoginTUI {

	public static void realizarLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Usuário: ");
		String login = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		if(!login.equals(Admin.getLogin()) || (!senha.equals(Admin.getPassword()))) {
			System.out.println("Dados incorretos");
			realizarLogin();
		}else {
			MenuTUI.executarMenuPrincipal();
		}
	}
}
