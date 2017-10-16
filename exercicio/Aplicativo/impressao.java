package Aplicativo;

import Entidade.Aluno;
import Entidade.Disciplina;

public class impressao {

	public static void main(String[]args) {
		
		Aluno a = new Aluno();
		
			
		
System.out.println("==============================Imprimindo por Pessoa=============================== ");
		
		a.setNome("Matheus");
		a.setCpf(1234321312-48);
		a.setMatricula(1234);
		a.setNota1(5.2);
		a.setNota2(8.5);
		
		
		a.setDisciplina(new Disciplina());
		
		a.getDisciplina().setNome("Matemática");
		a.getDisciplina().setEmenta("Desenvolver habilidades Matemáticas no Aluno");
		
		
		//Impressao dos Dados pelo Objeto de Pessoa
		
		System.out.println("Nome: " + a.getNome());
		System.out.println("CPF: " + a.getCpf());
		System.out.println("Matricula: " + a.getMatricula());
		System.out.println("Nota1: " + a.getNota1());
		System.out.println("Nota2: " + a.getNota2());
		
	
	}
	
	
}
