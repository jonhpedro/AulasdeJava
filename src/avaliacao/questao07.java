package avaliacao;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		
		Double a;
		Double cotacao;
		Double total;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos Dolares quer converter: ");
		a = teclado.nextDouble();
		teclado.close();
		
		cotacao = (3.094);
		
		total = (a*cotacao);
		
		System.out.println("Voce tinha " + a + " em Dólares" + " a cotação do Dólar esta em " + cotacao + " e " + " Agora tem " + total + " em Reais ");
		

	}

}
