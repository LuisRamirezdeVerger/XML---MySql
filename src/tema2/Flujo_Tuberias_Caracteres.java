package tema2;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Flujo_Tuberias_Caracteres {

    public static void main(String[] args) {
        final PipedWriter writer = new PipedWriter();
        final PipedReader reader;
        try {
            reader = new PipedReader(writer);
        } catch (IOException e) {
            e.printStackTrace();
            return; // Finaliza si hay un error al conectar el lector y el escritor
        }

        Thread writerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    writer.write("Hola por aqui");
                    writer.close(); // Cierra el escritor para señalar que la escritura ha terminado
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread readerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = reader.read(); // Lee el primer caracter
                    while (data != -1) {
                        System.out.print((char) data); // Imprime el caracter leído
                        data = reader.read(); // Continúa leyendo
                    }
                    reader.close(); // Cierra el lector después de leer todos los datos
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        writerThread.start(); // Inicia el hilo escritor
        readerThread.start(); // Inicia el hilo lector
    }
}