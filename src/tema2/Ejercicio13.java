package tema2;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementar un método que lea un texto y muestre cada token leído por la consola, indicando 
si es una palabra, un número, o un carácter especial. */
		
		StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader("Hola soy Mar y mi edad es 37 y soy @"));		
		//vamos a descartar algunos caracteres como especiales//
		
		streamTokenizer.ordinaryChar('.');
		streamTokenizer.ordinaryChar(',');
		streamTokenizer.ordinaryChar(';');
		streamTokenizer.ordinaryChar('@');
		

		
		
		try {
			while(streamTokenizer.nextToken()!=StreamTokenizer.TT_EOF) {
				switch(streamTokenizer.ttype) {
				case StreamTokenizer.TT_WORD:
					System.out.println("Palabra " + streamTokenizer.sval );
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println("Número: " + streamTokenizer.nval);
					break;
				case StreamTokenizer.TT_EOL:
					System.out.println("Fin de la líena");
					break;
				default:
					System.out.println("Token desconocido");
				
					
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}


	}

}
