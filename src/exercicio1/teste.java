package exercicio1;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		int senha = 123;
		int senhaDigitada;
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Informe a Senha:");
		senhaDigitada = scan.nextInt();*/
		
		do {
			
			System.out.println("Informe a Senha:");
			senhaDigitada = scan.nextInt();
		
		} while (senha != senhaDigitada); 
			
			//fecha o buffer
		System.out.println("Está Logado!");
		scan.close();
		
	}		

}
	