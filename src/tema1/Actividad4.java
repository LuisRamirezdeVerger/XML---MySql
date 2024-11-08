package tema1;

import java.io.*;

public class Actividad4 {

	public static void main(String[] args) {
		// Leer un archivo de texto línea por línea:
		// Utiliza la clase BufferedReader para leer un archivo de texto línea por línea y mostrar su
		//contenido en consola
		
		String ruta = "C:\\Users\\.Wito\\eclipse-workspace\\Trimestre1-AcessoDatos\\src\\tema1\\prueba.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea;
			
			while((linea = br.readLine()) != null ) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
