package tema2;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		/*Implementar un método que lea un flujo de texto y cuente cuántas palabras y cuántos 
números contiene.*/
		
		StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader("Code is Love, not 404"));
		
		int contadorPalabras= 0;
		int contadorNumeros= 0;
		
		try {
			while (streamTokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
				if(streamTokenizer.ttype==StreamTokenizer.TT_WORD) {
					contadorPalabras++;
					
				}
				else if (streamTokenizer.ttype==StreamTokenizer.TT_NUMBER) {
					contadorNumeros++;
				}
			}
			System.out.println("Palabras " + contadorPalabras);
			System.out.println("Números " + contadorNumeros);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
