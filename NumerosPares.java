package Aula15;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<> (4);
		int numero = 0;
		
		
		for (int i = 0; i <= 4; i++) {
			
		System.out.println("Digite um numero inteiro: ");
		numero = ler.nextInt();
		numeros.add(numero);
		}
		
		for (int i = 0; i <= 4; i++) {
		if (numeros.get(i) % 2 == 0) {
			System.out.println(numeros.get(1) + " é par");	
		} else {
			System.out.println(numeros.get(i) + " é impar");
		}
	}
		
		ler.close();
		
	}
}
