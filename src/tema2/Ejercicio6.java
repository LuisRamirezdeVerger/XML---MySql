package tema2;

import java.io.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Ejercicio 6
		// Implementar un método que reciba un array de caracteres e imprima por consola si contiene
		// algún carácter especial (@, #, $)

		CharArrayWriter arrayEscrito = new CharArrayWriter();
		
		try {
			arrayEscrito.write("MedaC@stle");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		char[] datosChar = arrayEscrito.toCharArray();
		
		
	}

}
