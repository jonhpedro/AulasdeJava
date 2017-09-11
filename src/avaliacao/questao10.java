package avaliacao;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Integer a;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Idade: ");
		a = teclado.nextInt();
		teclado.close();
		
		
		if(a <= 10){
			System.out.println("Infantil");
		}else if(a <= 17) {
			System.out.println("Juvenil");
		}else if (a > 17){
			System.out.println("Sênior");
		}
	}
}

