package tema1;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// Lectura y escritura de archivos
		
		
		//1.- Crear un archivo y comprobar su existencia:
		//	 Crea un programa que instancie un objeto de la clase File, cree un archivo nuevo y
		// 	verifique si dicho archivo ha sido creado correctamente
		try {
		File archivo = new File("C:\\Users\\.Wito\\eclipse-workspace\\Trimestre1\\src\\tema1\\prueba.txt");

			if (archivo.exists()) {
				System.out.println("Archivo existente.");
			} else {
				archivo.createNewFile();
				System.out.println("Archivo creado. ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}	
}
