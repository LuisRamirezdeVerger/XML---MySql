package tema2;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Iterator;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Ejercicio 7
		// Implementar un método que reciba un array de caracteres detectar si contiene una palabra
		// clave como "Java" o "programación"
		
		CharArrayWriter arrayEscrito = new CharArrayWriter();
		
		try {
			arrayEscrito.write("Java is love");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		char[] datosArray = arrayEscrito.toCharArray();
		String texto = new String(datosArray);
		
		
		if (texto.contains("Java") && datosArray != null) {
			System.out.println("Contiene Java");
		} else {
			System.out.println("No contiene");
		}
	}

}
