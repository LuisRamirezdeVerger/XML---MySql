package tema2;

import java.io.*;

public class Ejercicio9 {

    public static void main(String[] args) {
    	//Ejercicio 9
    	//Implementar un método que lea un flujo de caracteres y cada vez que encuentres una vocal,
    	//retrocede el carácter y reemplázalo por el carácter '_' al leerlo nuevamente.
    	
        // Creamos un CharArrayWriter y escribimos una frase
        CharArrayWriter arrayEscrito = new CharArrayWriter();

        try {
            arrayEscrito.write("Java is love!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertimos el contenido de CharArrayWriter en un array de caracteres
        char[] datosArray = arrayEscrito.toCharArray();

        // Creamos un CharArrayReader para leer el array de caracteres
        CharArrayReader lector = new CharArrayReader(datosArray);
        
        // Usamos un StringBuilder para almacenar el resultado
        StringBuilder resultado = new StringBuilder();
        int caracter;

        try {
            // Leemos el flujo de caracteres
            while ((caracter = lector.read()) != -1) {
                char c = (char) caracter; // Convertimos el entero a char

                // Verificamos si el carácter es una vocal
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    // Si es vocal, agregamos un '_' al resultado
                    resultado.append('_');
                } else {
                    // Si no es vocal, agregamos el carácter original al resultado
                    resultado.append(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimimos el resultado final
        System.out.println("Resultado con vocales reemplazadas: " + resultado.toString());
    }
}
