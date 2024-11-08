package tema2;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementar un método que lea un texto y filtre solo las palabras que tengan más de 4 
caracteres, mostrándolas en la consola. */
		
		String input = "Vamos a cambiar la frase para que me diga solo las de cuatro";
        StringReader stringReader = new StringReader(input);
        StreamTokenizer tokenizer = new StreamTokenizer(stringReader);

        // Configuración para que el tokenizer no divida las palabras en los apóstrofes o guiones
        tokenizer.wordChars('_', '_');
        tokenizer.wordChars('\'', '\'');
        tokenizer.wordChars('0', '9'); // Si consideras números como parte de las palabras

        try {
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD && tokenizer.sval.length()  == 4) {
                    System.out.println(tokenizer.sval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	}


