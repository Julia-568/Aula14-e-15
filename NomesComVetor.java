package Aula14;

import java.util.Scanner;

public class NomesComVetor {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		String vetor[] =  new String [5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um nome " + i + "..:");
			vetor[i] = ler.next();
	}
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
		
		ler.close();
	}
}

