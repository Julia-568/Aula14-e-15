package Aula15;

import java.util.ArrayList;
import java.util.Random;

public class Exemplo4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<> ();
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt();
			numeros.add(numeroAleatorio);
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

}
