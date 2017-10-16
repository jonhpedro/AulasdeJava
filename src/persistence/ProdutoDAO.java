package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidade.Produto;

//DAO - Data Access Object
//extends � o conectivo de heran�a
public class ProdutoDAO extends ConnectionDAO {
	
	private Connection conn;
	
	public ProdutoDAO() {
		try {
			conn = getConnection();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void salvar(Produto p) throws SQLException{
		
		/**Prepara a (instru��o/transa��o) para o banco (organiza tudo no banco)*/
		PreparedStatement stmt = null;
		
		try {
		/**?(parameter ou coringa) - s�o usados para representar os valores que ser�o passados*/
		
		stmt = conn.prepareStatement("insert into produto values (null,?,?,?,?)");
		
		stmt.setString(1, p.getNmProduto());
		stmt.setString(2, p.getDescProduto());
		stmt.setDouble(3,p.getPreco());
		stmt.setInt(4, p.getQuantidade());
		
		/*
		 * execute(0 - dispara a instru��o para o banco
		retorna um booleano (true| false)
		*/
		boolean flag = stmt.execute();
		
		
		//gera um SQLException caso de algum erro ao inserir 
		if(flag) {
			throw new SQLException("Erro ao inserir o Produto");
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
