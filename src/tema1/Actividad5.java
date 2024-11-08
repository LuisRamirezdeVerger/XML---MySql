package tema1;

import java.io.*;

public class Actividad5 {

	public static void main(String[] args) {
		// Escribir en un archivo:
		//  Crea un programa que escriba varias líneas de texto en un archivo usando la clase
		// FileWriter
		
		String ruta = "C:\\Users\\.Wito\\eclipse-workspace\\Trimestre1-AcessoDatos\\src\\tema1\\prueba.txt";
		
		 try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
			bw.write("Linea 1");
			
			bw.write("Linea 2");
			
			bw.write("Linea 3");
			 System.out.println("Archivo escrito correctamente. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		

	}

}
