package tema2;

import java.io.*;

public class Ejercicio8 {

    public static void main(String[] args) {
    	
    	//Ejercicio 8
    	//Implementar un método que lea un array de caracteres y retroceda un carácter en la lectura
    	//cada vez que encuentre un espacio en blanco (' '), volviendo a leer dicho carácter
    	
        // Creamos un CharArrayWriter y escribimos una frase
        CharArrayWriter arrayEscrito = new CharArrayWriter();

        try {
            arrayEscrito.write("Java is love ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertimos el contenido de CharArrayWriter en un array de caracteres
        char[] datosArray = arrayEscrito.toCharArray();

        // Usamos un String para almacenar el resultado
        String resultado = "";

        // Iteramos a través del array
        for (int i = 0; i < datosArray.length; i++) {
            // Concatenamos el carácter actual al resultado
            resultado += datosArray[i];

            // Si encontramos un espacio en blanco, retrocedemos un carácter
            if (datosArray[i] == ' ' && i > 0) {
                // Retrocedemos un carácter y leemos nuevamente
                resultado += datosArray[i - 1];
            }
        }

        // Imprimimos el resultado final
        System.out.println("Resultado de la lectura con retroceso: " + resultado);
    }
}
