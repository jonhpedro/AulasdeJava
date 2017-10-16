package Aplicativo;

import Entidade.Endereco;
import Entidade.Pessoa;


public class Teste {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		Endereco e = new Endereco();

		System.out.println("==============================Imprimindo por Pessoa=============================== ");
		
		p.setId(1);
		p.setNome("Matheus");
		p.setEmail("teteuss@gmail.com");
		
		e.setId(100);
		e.setLogradouro("Rua dos Bobos, n° 0, 24111-124");
		
		p.setEndereco(e);
		e.setPessoa(p);
		
		//Impressao dos Dados pelo Objeto de Pessoa
		
		System.out.println("ID: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Email: " + p.getEmail());
		
		//Impressao dos Dados pel Objeto de Pessoa
		
		System.out.println("Logradouro: " + p.getEndereco().getLogradouro());
	
		System.out.println("==============================Imprimindo por Endereço============================= ");
		
		
			//Impressao dos Dados pelo Objeto de Endereço
		
			System.out.println("ID: " + e.getId());
			System.out.println("Logradouro: " + e.getLogradouro());
					
		//Impressao dos Dados de Pessoa pelo objeto de Endereco
			
			System.out.println("id: " + e.getId());
			System.out.println("Nome: " + e.getPessoa().getNome());
			System.out.println("Email: " + p.getEmail());
	}
	
	
	

}
