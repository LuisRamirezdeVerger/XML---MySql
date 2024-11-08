package tema4;

import java.sql.SQLException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionMySQL Persona = new ConexionMySQL("root", "", "instituto");
		
		try {
			Persona.conectar();
			System.out.println("Conectado a la BBDD. ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
