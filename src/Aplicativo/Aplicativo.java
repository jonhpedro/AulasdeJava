package Aplicativo;

import Modelo.Disciplina;

public class Aplicativo {

	public static void main(String[] args) {
		
		/* Usandro Construtor Vazio */
		
		Disciplina a = new Disciplina();
		
		a.setDisciplina("Ensino Fundamental");
		a.setEmenta("Matem�tica,Portugu�s,Hist�ria e Geografia");
		a.setCargaHoraria(1250);
		a.setDiaSemana("Segunda,Ter�a,Quarta,Quinta,Sexta");
		a.setalunosInscritos(200);
		
		
		System.out.println(a);
		
		
		
		
		/* Usando Construtor Cheio*/
	
		Disciplina b = new Disciplina("Ensino Fundamental" ,  "Matem�tica, Portgu�s, Hist�ria e Geografia" , 1250 , "Segunda, Ter�a, Quarta, Quinta, Sexta", 200);
			
		System.out.println(b);
	}

}
