package tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		/*Implementar un método que lea un código fuente simplificado y detecte comentarios de una 
línea (comenzando con //), mostrándolos por consola. Ejemplo de entrada: "int x = 10; // Esta 
es una variable". */
		
		String input = "int x = 10; // Esta es una variable\nint y = 20; // Otra variable\nSystem.out.println(x + y); // Mostrar suma";
        BufferedReader reader = new BufferedReader(new StringReader(input));
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                int commentIndex = line.indexOf("//");
                if (commentIndex != -1) {
                    // Extraer y mostrar el comentario
                    String comment = line.substring(commentIndex);
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
