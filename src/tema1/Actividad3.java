package tema1;

import java.io.*;

public class Actividad3 {

	public static void main(String[] args) {
		//3.- Mover un archivo a otro directorio:
		//	 Implementa un programa que mueva un archivo de un directorio a otro utilizando el
		//	método renameTo() de la clase File.
		
		String origen = "C:\\Users\\.Wito\\eclipse-workspace\\Trimestre1-AcessoDatos\\src\\tema1\\tema1.Directorio";
		String destino = "C:\\Users\\.Wito\\eclipse-workspace\\Trimestre1-AcessoDatos\\src\\tema1\\prueba.txt";
		
		File archivoOrigen = new File(origen);
		File archivoDestino = new File(destino);
		
		boolean movido = archivoOrigen.renameTo(archivoDestino);
		
		if(movido) {
			System.out.println("Archivo movido con éxito. ");
		} else {
			System.out.println("Error: El archivo no ha podido moverse. ");
		}

	}

}
