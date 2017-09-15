package Aplicativo;

import Modelo.Disciplina;

public class Aplicativo {

	public static void main(String[] args) {
		
		/* Usandro Construtor Vazio */
		
		Disciplina a = new Disciplina();
		
		a.setDisciplina("Ensino Fundamental");
		a.setEmenta("Matemática,Português,História e Geografia");
		a.setCargaHoraria(1250);
		a.setDiaSemana("Segunda,Terça,Quarta,Quinta,Sexta");
		a.setalunosInscritos(200);
		
		
		System.out.println(a);
		
		
		
		
		/* Usando Construtor Cheio*/
	
		Disciplina b = new Disciplina("Ensino Fundamental" ,  "Matemática, Portguês, História e Geografia" , 1250 , "Segunda, Terça, Quarta, Quinta, Sexta", 200);
			
		System.out.println(b);
	}

}
