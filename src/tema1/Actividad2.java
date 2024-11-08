package tema1;

import java.io.File;

public class Actividad2 {

	public static void main(String[] args) {
		//2.- Listar los archivos en un directorio:
				//	 Escribe un programa que muestre todos los archivos y directorios dentro de una carpeta
				//	especificada.
				
					File archivo2 = new File("C:\\Users\\.Wito\\eclipse-workspace\\Trimestre1\\src\\tema1");
					if (archivo2.isDirectory()){
						System.out.println(archivo2.getName());					
						
						} else {
 
						System.out.println("Directorio no encontrado. ");
					}
				
	}

}
