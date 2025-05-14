package Aula15;

import java.util.ArrayList;
import java.util.Scanner;

public class LendoESomando {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<> (4);
		int numero = 0;
		int soma = 0;
		
		for(int i = 0; i <= 4; i++) {
		
		System.out.println("Digite um numero inteiro: ");
		numero = ler.nextInt();	
		
		soma += numero;
		numeros.add(numero);
		
	}
		System.out.println("A soma dos numeros inteiros é " + soma);
		
		ler.close();
}
}