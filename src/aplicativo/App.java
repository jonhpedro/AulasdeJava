package aplicativo;

import java.sql.SQLException;
import entidade.Produto;
import persistence.ProdutoDAO;

public class App {

	public static void main(String [] args) {
		
		//Declaração das Variaveis
		Produto produto = new Produto();
		
		//Atribuição dos valores
		
		produto.setNmProduto("Comida");
		produto.setDescProduto("O povo esta com fome");
		produto.setPreco(135.70);
		produto.setQuantidade(200);
		
		
		/**Banco de Dados*/
		
		ProdutoDAO pd = new ProdutoDAO();
		
		try {
			pd.salvar(produto);
			System.out.println("Produto Salvo com Sucesso! "); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}	
	
}
