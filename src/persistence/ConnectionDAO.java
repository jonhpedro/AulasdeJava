package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	//Responsavel por abrir a conexão com o banco
public class ConnectionDAO {
 
	public ConnectionDAO() {
		
		try {
	//Definir a biblioteca (API), que sera responsavel pela comunicação com o banco de dados
				
			Class.forName("com.mysql.jdbc.Driver");
		
		}catch(ClassNotFoundException e) {
		
			//Se caso o arquivo nao estver dentro da pasta /lib ou em alguma parte do projeto, sera gerado um erro informando 
			//que a classe nao foi encontrad, por isso o  tratamento "ClassNot FoundException"
				
				e.printStackTrace(); // <-- Detalha o erro ocorrido
		
		}		
	}
	protected Connection getConnection()  throws SQLException{
		//URL de conexão com o banco de dados
		String url = "jdbc:mysql://localhost/projetobd";
		
		return DriverManager.getConnection(url,"root","");
		
		
	}
	public static void main(String []args) throws Exception{	
		ConnectionDAO db = new ConnectionDAO();
		
		//testa conexao
		
		Connection conexao = db.getConnection();
		System.out.println((!conexao.equals(null))? "Conexã Aberta" : "Falha ao Conectar");
	}

}
