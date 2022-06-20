package br.senai.ds20221.agenda.controller;

import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;

import br.senai.ds20221.agenda.view.Login;

public class MenuController {
	
		public void actionPerformed(ActionEvent e) {
			Login login = new Login();
			login.setVisible(true);
		}
	
}
