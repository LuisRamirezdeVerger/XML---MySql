package tema2;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio 4
		//Implementar un método que reciba un array de caracteres. Leer el array desde la mitad hasta
		//el final, imprimiendo los caracteres por consola.
		
		CharArrayWriter arrayEscrito = new CharArrayWriter();

		try {
			//Escribimos la cadena en el objeto de la clase CharArrayWriter
			arrayEscrito.write("MedaCastle");
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		//Convertimos el contenido de CharArrayWriter en un array de caracteres
		char[] datosChar = arrayEscrito.toCharArray();
		
		//Creamos un objeto de la clase CharArrayReader para leer el array
		CharArrayReader arrayLeido = new CharArrayReader(datosChar);
		
		//Partimos el array a la mitad
		int medioArray = datosChar.length / 2;

		//Imprimimos
		
		System.out.println("La mitad del array es: ");
		for (int i = medioArray; i < datosChar.length; i++) {
			System.out.println(datosChar[i]);
		}
	}

}
