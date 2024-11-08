package tema2;
import java.io.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejercicio 3
		//Implementar un método que reciba un array de caracteres. Leer el array pero omitir los 3
		//primeros caracteres utilizando el método skip() de CharArrayReader.

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
		
		try {
			arrayLeido.skip(3);
			int datosLeidos = arrayLeido.read();
			while (datosLeidos != -1) {
			System.out.println((char) datosLeidos);
			datosLeidos = arrayLeido.read();
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			arrayLeido.close();
		}
	}

}
