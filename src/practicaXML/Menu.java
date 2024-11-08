package practicaXML;
import java.sql.SQLException;
import java.util.*;

public class Menu {
	private ConexionMySQL conexion;
	private Metodos metodos;
	private Scanner sc;
	
	public Menu() {
		
		conexion = new ConexionMySQL("root", "", "equipos");
		metodos = new Metodos(conexion);
		sc = new Scanner(System.in);
	}
	
	public void mostrarMenu() {
		
		try {
			conexion.conectar();
			System.out.println("Conectado. ");
			
			int opcion;
				
		do {
			System.out.println("\n-------- MENÚ --------");
			System.out.println("1.- Recorrer directorio para crear las tablas.");
			System.out.println("2.- Rellenar datos en tablas. ");
			System.out.println("3.- Mostrar equipo. ");
			System.out.println("4.- Eliminar tablas. ");
			System.out.println("5.- Salir. ");
			System.out.println("Elija una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); //Salto de línea
			
			switch(opcion) {
				case 1: 
					System.out.println("Ingrese la ruta del directorio .XML");
					metodos.recorrerDirectorios("Equipos");
					break;
				case 5: 
			
			default:
				break;
		
			}
		} while (opcion != 5);
			sc.close();
			conexion.desconectar();
			System.out.println("Desconectado de la BBDD. ");
			 } catch (Exception e) {
				e.printStackTrace();
		}
	}
}
