package tema2;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio15 {

	public static void main(String[] args) {

		
		/*Implementar un método que lea un texto y sume todos los números que aparezcan en él, 
mostrando el total al final. */
		
		StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader("Code is Love, not 404"));
		
		int suma = 0;
		
		try {
			while (streamTokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
				if(streamTokenizer.ttype==StreamTokenizer.TT_NUMBER) {
					
					suma+=streamTokenizer.nval;
					
				}
				
			}
			
			System.out.println("El total es: " + suma);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
				
				

	}

}
