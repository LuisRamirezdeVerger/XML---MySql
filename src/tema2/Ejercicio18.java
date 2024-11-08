package tema2;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementar un método que lea una declaración SQL sencilla y analice sus componentes, 
como palabras clave, nombres de columnas, y operadores.*/
		
		String sql = "SELECT name, age FROM users WHERE age > 30 AND name = 'John';";
        StringReader stringReader = new StringReader(sql);
        StreamTokenizer tokenizer = new StreamTokenizer(stringReader);

        // Configurar el tokenizer para SQL
        tokenizer.wordChars('_', '_');
        tokenizer.wordChars('\'', '\''); // Considerar apóstrofes como parte de palabras (para strings en SQL)
        tokenizer.ordinaryChars('0', '9'); // Dígitos no formarán palabras
        tokenizer.wordChars('0', '9'); // Permitir dígitos en nombres (e.g., column1)
        tokenizer.whitespaceChars(',', ','); // Coma como separador
        tokenizer.ordinaryChar('.'); // Punto como caracter ordinario (para calificar columnas)
        tokenizer.lowerCaseMode(false); // No modificar el case de tokens

        System.out.println("Analizando la declaración SQL:");
        try {
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                switch (tokenizer.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Palabra/Nombre: " + tokenizer.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Número: " + tokenizer.nval);
                        break;
                    case '\'':
                        // Asumiendo que los strings están bien formados y cerrados correctamente
                        tokenizer.nextToken(); // Leer hasta el próximo apóstrofe
                        System.out.println("String: '" + tokenizer.sval + "'");
                        tokenizer.nextToken(); // Consumir el apóstrofe de cierre
                        break;
                    default:
                        // Imprimir operadores y puntuación
                        if (!Character.isWhitespace((char) tokenizer.ttype)) {
                            System.out.println("Operador/Puntuación: " + (char) tokenizer.ttype);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
