package tema2;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Analisis_Flujo2 {

	public static void main(String[] args) {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader("Hola mi edad es 45"));
        
        try {
            while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println(streamTokenizer.sval);
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println((int) streamTokenizer.nval); // Cast to int for better readability if expecting integers
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
