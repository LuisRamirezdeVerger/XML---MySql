package tema2;

import java.io.CharArrayWriter;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Ejercicio 5
		//Implementar un método que reciba un array de caracteres e imprima por consola los caracteres
		//en mayúsculas

		CharArrayWriter arrayEscrito = new CharArrayWriter();

		try {
			//Escribimos la cadena en el objeto de la clase CharArrayWriter
			arrayEscrito.write("MedaCastle");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Convertimos el contenido de CharArrayWriter en un array de caracteres
		char[] datosChar = arrayEscrito.toCharArray();

		System.out.println("Array en mayúsculas: ");
		for (int i = 0; i < datosChar.length; i++) {
			System.out.println(Character.toUpperCase(datosChar[i]));
		}
	}

}
