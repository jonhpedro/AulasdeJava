package avaliacao;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		
		Integer lados;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de Lados: ");
		lados = teclado.nextInt();
		teclado.close();
		
		if(lados == 3) {
			System.out.println("Triangulo Equil�tero");
		}else if(lados == 2){
			System.out.println("Tringulo Is�sceles");
	}else if(lados !=3) {
		System.out.println("Triangulo Escaleno");
	}
	}
}
