package practicaXML;

import java.io.File;
import java.sql.SQLException;

public class Metodos {
	
	private ConexionMySQL conexion;

    public Metodos(ConexionMySQL conexion) {
        this.conexion = conexion;
    }
    
    
    public void crearTabla(String nombreTabla) throws SQLException {
		String createTable = "CREATE TABLE IF NOT EXISTS " + nombreTabla + " ("
				+ "nombre VARCHAR(50), "
				+ "dorsal INT, "
				+ "demarcacion VARCHAR(50), "
				+ "nacionalidad VARCHAR(50), "
				+ "nacimiento DATE, "
				+ "altura INT, "
				+ "peso INT";
		conexion.ejecutarInsertDeleteUpdate(createTable);
		
	}
	
	public void recorrerDirectorios(String rutaDirectorio) {
		
		File directorio = new File(rutaDirectorio);
		//Obtenemos el XML del directorio
		// -> Es una expresión Lambda que implementa "FilenameFilter" que toma 2 parámetros
		//dir: carpeta en la que se encuentra el archivo -- name: Nombre del archivo dentro del directorio
		//La expresión lambda name.endsWith(".xml") devuelve true si el nombre del archivo termina con .xml y false si no es así.
		//Esto filtra solo los archivos que terminan con la extensión .xml.
		File[] archivosXML = directorio.listFiles((d, name) -> name.endsWith(".xml"));
		
		//Verificamos si existe el directorio y es válido
		
			
			
			if (archivosXML != null) {
				//Recorremos cada archivo XML
				for (File archivoXML : archivosXML) {
					String nombreTabla = archivoXML.getName().replace(".xml", "");
				
					try {
						//Creamos la tabla
						crearTabla(nombreTabla);
						System.out.println("Tabla creada para el equipo: " + nombreTabla);
					} catch (Exception e) {
						System.out.println("Error creando la tabla " + nombreTabla + ": " + e.getMessage());
					}
				}
			} else {
			System.out.println("No se han encontrado archivos XML en el directorio en concreto");
			}
		} 
	}
	
	

