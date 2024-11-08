package tema2;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class Analisis_Flujo3 {

	public static void main(String[] args) {
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("C:\\temp\\pruebas\\pruebas2.txt"));
            String line = lineNumberReader.readLine();
            while (line != null) {
                System.out.println("Contenido de la línea número: " + lineNumberReader.getLineNumber());
                System.out.println(line);
                line = lineNumberReader.readLine();
            }
            lineNumberReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
