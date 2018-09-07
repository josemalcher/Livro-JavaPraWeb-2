package br.com.javaparaweb.capitulo3.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
	public static void main(String[] args) {
		Connection conexao = null;
		try {
			// Registrando a classe JDBC, e os par�metros de conex�o em tempo de execu��o
			String url = "jdbc:mysql://localhost/agenda";
			String usuario = "root";
			String senha = "root";

			conexao = DriverManager.getConnection(url, usuario, senha); //(_1_)
			System.out.println("Conectou!");
			conexao.close();
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao criar a conex�o. Erro: " + e.getMessage());
		}
	}
} 
