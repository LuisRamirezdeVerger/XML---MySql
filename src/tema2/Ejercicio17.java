package tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		/*Implementa un método que cuente cuántas frases completas (delimitadas por un punto .) hay 
en un texto. */
		
		String input = "Esta es la primera frase. Esta es la segunda frase. Y aquí viene la tercera.";
        StringReader stringReader = new StringReader(input);
        BufferedReader reader = new BufferedReader(stringReader);

        int sentenceCount = 0;
        try {
            int c;
            boolean inSentence = false; // Track whether we are currently inside a sentence

            while ((c = reader.read()) != -1) {
                char character = (char) c;
                // Check if the character is not a space and we are not currently in a sentence
                if (character != ' ' && !inSentence) {
                    inSentence = true; // We are starting a new sentence
                }
                // Check if the character is a period
                if (character == '.') {
                    if (inSentence) { // Only count as a sentence if we were actually in one
                        sentenceCount++;
                        inSentence = false; // Reset for the next possible sentence
                    }
                }
            }
            System.out.println("Total de frases completas: " + sentenceCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
