package Aula14;

import java.util.Scanner;

public class ExemploVetor {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int a[] =  new int[5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um valor " + i + "..:");
			a[i] = ler.nextInt();
		}
		
		for (int x = 0; x < 5; x++) {
			System.out.println(a[x]);
		}
		
		ler.close();
	}

}
