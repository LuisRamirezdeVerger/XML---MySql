package tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.StringReader;

public class Ejercicio12 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca el texto:");
            String entrada = br.readLine();
            buscarPalabraJava(entrada);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buscarPalabraJava(String texto) throws IOException {
        PushbackReader pr = new PushbackReader(new StringReader(texto));
        StringBuilder resultado = new StringBuilder();
        String palabraBuscada = "Java";
        StringBuilder palabraLeida = new StringBuilder();
        int c;

        while ((c = pr.read()) != -1) {
            char letra = (char) c;
            palabraLeida.append(letra); // Acumula el carácter leído

            // Comprobamos si hemos leído suficientes caracteres
            if (palabraLeida.length() == palabraBuscada.length()) {
                // Comparamos si la palabra leída es "Java"
                if (palabraLeida.toString().equals(palabraBuscada)) {
                    System.out.println("Se ha encontrado la palabra buscada: " + palabraBuscada);
                    // Retrocedemos los caracteres de "Java"
                    for (int i = palabraBuscada.length() - 1; i >= 0; i--) {
                        pr.unread(palabraBuscada.charAt(i));
                    }
                } 
                // Limpiamos el acumulador para seguir buscando
                palabraLeida.setLength(0);
            }

            // Agregamos el carácter actual al resultado
            resultado.append(letra);
        }

        // Mostrar el texto completo leído
        System.out.println("Texto leído: " + resultado.toString());
    }
}
