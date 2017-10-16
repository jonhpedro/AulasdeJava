package percistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {

	public ConnectionDAO() {
		// definir a biblioteca (oq vai comunicar com o banco de dados )
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			// se o arquivo nao estiver dentro da pasta lib oud em alguma parte sera gerado um erro informando que 
			// class nao foi encontradada, por isso o tratamendo "ClassNotFoundException"
			e.printStackTrace();// <- Ele amostra o erro
		}
		
	}
	// Java DataBase Connection = jdbc
	protected Connection getConnection() throws SQLException {
		// URL de conexao com bancos de dados 
		String url = "jdbc:mysql://localhost/projetobd";
		
		Connection conn = DriverManager.getConnection(url, "root","");
		return conn;
	}
	
	public static void main(String[] args) throws SQLException{
		ConnectionDAO db = new ConnectionDAO();
		Connection Conexao = db.getConnection();
		System.out.println((!Conexao.equals(null))?"Conexão Aberta":"Falha ao Conectar");
		
	}
	
	
}
