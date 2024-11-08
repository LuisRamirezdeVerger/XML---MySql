package tema2;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class Flujo_Arrays {
    public static void main(String[] args) {
        // Crear CharArrayWriter para escribir datos en un arreglo de caracteres
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        
        // Escribir una cadena en el CharArrayWriter
        try {
			charArrayWriter.write("hola amigo");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // Convertir el contenido del CharArrayWriter a un arreglo de caracteres
        char[] charData = charArrayWriter.toCharArray();

        // Crear CharArrayReader para leer el arreglo de caracteres
        CharArrayReader charArrayReader = new CharArrayReader(charData);

        try {
            int data = charArrayReader.read(); // Leer el primer carácter
            while (data != -1) {
                // Realizar operaciones con el carácter leído
                System.out.println((char) data); // Imprimir el carácter
                data = charArrayReader.read(); // Leer el siguiente carácter
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir cualquier excepción que ocurra durante la lectura
        } finally {
            charArrayReader.close(); // Asegurarse de cerrar el reader en el bloque finally
        }
    }
}
