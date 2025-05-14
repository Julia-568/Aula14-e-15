package Aula15;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExemplo2 {
	
	public static void main(String[] args) {
		
		String[] disciplinas = {"matematica", "filosofia", "historia", "sociologia"};
		
		ArrayList<String> novaLista = new ArrayList<String> (Arrays.asList(disciplinas));
		
		novaLista.add("ingles");
		novaLista.add("arte");
		
		for (String i : novaLista) {
			System.out.println("Disciplina: " + i);
		}
		
	}

}
