package practica1;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			//Usamos PushbackReader para el análisis de datos
			PushbackReader pushbackReader = new PushbackReader(
			new FileReader("C:\\Users\\.Wito\\Desktop\\Medac\\Acceso a Datos\\Práctica\\cancion.mp3"));
			//Creamos la variable para leer
			int data = pushbackReader.read();
			//Parseamos a carácteres
			System.out.println((char)data);
			pushbackReader.unread(data);
			//Leemos
			data = pushbackReader.read();
			//Escribimos
			System.out.println((char)data);
			pushbackReader.close();
			//Manejo de errores
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

}
