package Aula14;

import java.util.Scanner;

public class SomaComVetores {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int vetor[] = new int[5];
		int soma = 30;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero " + i + "..:");
			vetor[i] = ler.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
	}
		soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
		
		if(soma > 30) {
			System.out.println("A soma é igual a " + soma);
		}
		
		else {
			System.out.println("A soma é menor que 30");
		}
		
		ler.close();
	}
}
