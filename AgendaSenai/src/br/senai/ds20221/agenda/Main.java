package br.senai.ds20221.agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.senai.ds20221.agenda.db.DB;

public class Main {
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO aluno"
					+"(cpf, nome) "
					+"VALUES "
					+"(?,?)");
				st.setString(1, "07277968522");
				st.setString(2, "Martim Palmeira");
//				st.setDate(3, new java.sql.Date(sdf.parse("05/01/1999").getTime()));
				
				
				int rowsAffected = st.executeUpdate();
				
				System.out.println("Done! Rows affected: "+rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			DB.closeConnection();
		}
	}
}
