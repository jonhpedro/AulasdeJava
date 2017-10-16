package aplicativo;

import entidade.Cliente;
import entidade.Funcionario;
import persistence.FuncionarioDAO;
import java.sql.SQLException;


public class TestaHeranca {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(1L);
		cliente.setNome("José");
		cliente.setEmail("jonhTI@awardspaces.com.br");
		cliente.setSexo("M");
		cliente.setCpf("800.555.666-85");
		cliente.setTppagamento("Debito");
		
		
	Funcionario fun = new Funcionario();	
		
		fun.setLogin("vendedor01");
		fun.setSenha(25556598);
		fun.setSalario(1.568);
		fun.setMatricula("123568");
		fun.setId(1L);
		fun.setNome("José");
		fun.setEmail("jonhTI@awardspaces.com.br");
		fun.setSexo("M");
		fun.setCpf("800.555.666-85");
		
		
		FuncionarioDAO fd = new FuncionarioDAO();
		
		try {
			fd.salvar(fun);
			System.out.println("Funcionario Salvo com Sucesso");
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println("Erro ao Gravar no Banco");
		}

			
	}

}
