package percistencia;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import entidade.Produto;
public class ProdutoDAO extends ConnectionDAO{

	private Connection conn;
	
	public ProdutoDAO() {
		try {
			conn = getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void salvar(Produto p) throws SQLException{
		
		// prepara a Intrução para a requisição
		PreparedStatement stmt = null;
		try {
		stmt = conn.prepareStatement("insert into produto values(null,?,?,?,?)");
		//definição de valores
				stmt.setString(1,p.getnmProduto());
				stmt.setString(2, p.getDescpord());
				stmt.setDouble(3, p.getPreco());
				stmt.setInt(4,p.getQtd());
				/*execute() didpara a intrução para o banco e retorna um boleano (true|false)
				 * */
				boolean flag = stmt.execute();
				// gera um SQLException caso de algum erro ao inserir
				if(flag) {
					throw new SQLException("Erro ao inserir o Produto");
				}}finally {
					if (stmt != null) {
						stmt.close();
					}
					if (conn !=null) {
						conn.close();
					}
				}
		
				
	}
}
