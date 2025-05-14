package Aula15;

public class UsandoForEach {
	
	public static void main(String[] args) {
		
		String[] names = new String[3];
		names[0] = "Kauany";
		names[1] = "Leonardo";
		names[2] = "Gustavo";
		
		for(String name : names) {
			System.out.print(name + ", ");
		}
		
	}

}
