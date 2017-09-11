package avaliacao;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
			Double a;
			Double deposito;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o Valor: ");
		a = teclado.nextDouble();
		teclado.close();
		
		deposito = (a * 5 + (a * 0.70));
		
		System.out.println("O novo valor é: " + deposito);

	}

}
