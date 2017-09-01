package exercicio1;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		String nomeCompleto;
		Integer idade;
		Double peso;
		String sexo;
		Boolean maiorIdade = false;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o nome Completo");
		nomeCompleto = teclado.nextLine();
		System.out.print("Informe a Idade");
		idade = teclado.nextInt();
		System.out.print("Informe o Peso");
		peso = teclado.nextDouble();
		System.out.print("Informe o Sexo");
		sexo = teclado.next();
		teclado.close();
		
		if(idade >= 18)
			maiorIdade = true;
		
		System.out.println("O nome informado foi:" + nomeCompleto + 
						   "\nA idade infomada foi:" + idade +
						   "\nO peso informado foi:" + peso +
						   "\nO sexo informado foi:" + sexo +
						   "\nCom os dados informados foi definido que a pessoa é:" +
						   (maiorIdade ? "maior" : "menor") + "de Idade");
	}

}
