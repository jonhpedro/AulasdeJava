package avaliacao;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		
		Double i = (double) 0.;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Digite um Numero: ");
		i = teclado.nextDouble();
		teclado.close();
		
		
			if(i < 4) {
			System.out.println("0, 0.25, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25, 2.5, 2.75, 3.0, 3.25, 3.5, 3.75,4.0");
		}else {
			System.out.println("");
		}
	}

}
