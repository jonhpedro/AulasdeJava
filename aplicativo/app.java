package aplicativo;

import java.sql.SQLException;

import entidade.Produto;
import percistencia.ProdutoDAO;

public class app {

	public static void main(String[] args) {
	
		Produto produto = new Produto();
		produto.setnmProduto("Controle");
		produto.setDescprod("Controle para Datashow Epson");
		produto.setPreco(137.70);
		produto.setQtd(200);
		/** banco de dados */
		
		ProdutoDAO pd = new ProdutoDAO(); 
		try {
		pd.salvar(produto);
		System.out.println("Produto salvo com Sucesso");
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}

}
