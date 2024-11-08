package practica1;

import java.io.*;

public class Escritura {

	public void escritura() {
		//Declaramos la ruta
		String ruta = "C:\\Users\\.Wito\\Desktop\\Medac\\Acceso a Datos\\Práctica\\cancionHexadecimal.txt";
        try {
        	//Instanciamos los métodos
        	FileWriter fileStream = new FileWriter(ruta);
        	BufferedWriter writer = new BufferedWriter(fileStream);

        	writer.write(("C:\\Users\\.Wito\\Desktop\\Medac\\Acceso a Datos\\Práctica\\cancion.mp3"));

    		
    		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
    			String linea;
    			//Lee hasta que no queden más carácteres
    			while((linea = br.readLine()) != null ) {
    				System.out.println(linea);
    			}
    			//Cerramos BufferedReader para evitar posibles errores de más
    			br.close();
    			//Manejo de errores
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		//Cerramos "BufferedWriter" para evitar posibles errores de más
        	writer.close();

        } catch (Exception e1) {
        	e1.printStackTrace();
        } 
	}
}
