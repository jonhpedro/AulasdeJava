package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidade.Funcionario;




public class FuncionarioDAO extends ConnectionDAO {
	
	private Connection conn;
	
		public FuncionarioDAO() {
			try {
			conn = getConnection();
			}catch(SQLException e){
			e.printStackTrace();
			}
		}	
	
	public void salvar(Funcionario fun) throws SQLException{
			
			/**Prepara a (instrução/transação) para o banco (organiza tudo no banco)*/
			PreparedStatement stmt = null;
			
			try {
			/**?(parameter ou coringa) - são usados para represnetar os valores que seram passados*/
			
			stmt = conn.prepareStatement("insert into funcionario values (null,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1, fun.getNome());
			stmt.setString(2, fun.getEmail());
			stmt.setString(3, fun.getSexo());
			stmt.setString(4, fun.getCpf());
			stmt.setString(5, fun.getLogin());
			stmt.setInt	  (6,fun.getSenha());
			stmt.setDouble(7,fun.getSalario());
			stmt.setString(8, fun.getMatricula());
			
			/*
			 * execute(0 - dispara a instrução para o banco
			retorna um booleano (true| false)
			*/
			boolean flag = stmt.execute();
			
			
			//gera um SQLException caso de algum erro ao inserir 
			if(flag) {
				throw new SQLException("Erro ao inserir o Funcionário");
		}
			
		}finally {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		
	}
		
}
