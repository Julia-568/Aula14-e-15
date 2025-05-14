package Aula14;

import java.util.Scanner;

public class JuntandoVetores {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos começar pelo vetor A!");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero " + i + " para o vetor A..:");
			a[i] = ler.nextInt();
		}
		System.out.println();
		System.out.println("Agora vamos para o vetor B!");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero " + i + " para o vetor B..:");
			b[i] = ler.nextInt();
	}
		for (int i = 0; i < 5; i++) {
            c[i] = a[i];
            c[i + 5] = b[i];
        }
		
		System.out.println("Vetor A:");
        for (int valor : a) {
            System.out.println(valor + " ");
        }
        
        System.out.println("Vetor B:");
        for (int valor : b) {
            System.out.println(valor + " ");
        }
        
        System.out.println("Vetor C:");
        for (int valor : c) {
            System.out.println(valor + " ");
        }
		
		ler.close();

   }
}
