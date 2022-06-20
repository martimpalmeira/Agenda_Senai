package br.senai.ds20221.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

	public Connection conectaDB() {
		Connection conn = null;

		try {
			String url = "jdbc:mysql://localhost:3306/senai_agenda?user=root&password=venha2021";
			conn = DriverManager.getConnection(url);
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "ConexãoDAO" + erro);
		}
		return conn;
	}
	
	
}
