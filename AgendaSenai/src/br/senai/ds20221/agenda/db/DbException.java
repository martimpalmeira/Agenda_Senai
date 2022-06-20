package br.senai.ds20221.agenda.db;

public class DbException extends RuntimeException{
	
	private static final long serialVersionUID = 1;
	
	public DbException(String msg) {
		super(msg);
	}
}
