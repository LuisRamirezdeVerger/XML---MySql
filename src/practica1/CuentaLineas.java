package practica1;
import java.io.File;
import java.util.Scanner;

	public class CuentaLineas {
	  public static void main(String[] args) {
		 //Creamos la variable para contar las líneas
	    int lineas = 0;

	    try {
	    	//Creamos el archivo
	      File archivo = new File("C:\\Users\\.Wito\\Desktop\\Medac\\Acceso a Datos\\Práctica\\conteoLineas.txt");

	      Scanner sc = new Scanner(archivo);

	      while (sc.hasNextLine()) {
	        sc.nextLine();
	        lineas++;
	      }
	      System.out.println("El archivo tiene " + lineas + " líneas totales. ");

	      sc.close();
	      //Manejo de errores
	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
	}

