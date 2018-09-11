package br.com.javaweb.capitulo3.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
	public static void main(String[] args) {
		Connection conexao = null;
		try {
			String url = "jdbc:mysql://localhost/javaweb_agenda";
			String usuario = "root";
			String senha = "";

			conexao = DriverManager.getConnection(url, usuario, senha); 
			System.out.println("Conectou!");
			conexao.close();
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao criar a conexção. Erro: " + e.getMessage());
		}
	}

}

 

