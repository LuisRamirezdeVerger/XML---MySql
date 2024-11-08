package tema2;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Flujo_Tuberias_Bytes {

	public static void main(String[] args) {
        final PipedOutputStream salida = new PipedOutputStream();
        final PipedInputStream entrada;
        try {
            entrada = new PipedInputStream(salida);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    salida.write("Hola mundo".getBytes());
                    salida.close(); // Cierra el stream para señalar que la escritura ha terminado
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int unByte = entrada.read();
                    while (unByte != -1) {
                        System.out.print((char) unByte);
                        unByte = entrada.read();
                    }
                    entrada.close(); // Cierra el stream después de leer todos los datos
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
 
	}

}
