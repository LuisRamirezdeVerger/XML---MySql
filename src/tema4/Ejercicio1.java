package tema4;

import java.sql.SQLException;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Conexión a la BBDD
		ConexionMySQL Persona = new ConexionMySQL("root", " ", "instituto");
		
		try {
			//Conectamos a la BBDD
			Persona.conectar();
			System.out.println("Conectado a la BBDD. ");
			String sentencia = "INSERT INTO estudiantes (Nombre, Edad, DNI) values ('Wito', 32, '53353961X')";
			Persona.ejecutarInsertDeleteUpdate(sentencia);
			System.out.println("Sentencia insertada con éxito! ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//Desconectamos de la BBDD
				Persona.desconectar();
				System.out.println("Desconectado de la BBDD. ");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
