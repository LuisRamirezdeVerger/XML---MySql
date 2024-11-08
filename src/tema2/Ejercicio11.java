package tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.StringReader;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		/*Implementar un método que lea un flujo de caracteres y cuando encuentres una secuencia 
específica como "abc", retrocede los tres caracteres y reemplázalos con la secuencia "xyz". 
Luego, continúa la lectura normal. */
		try {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca el texto");
		
		String entrada = br.readLine();
		
		String resultado = remplazarSecuencia(entrada);
		
		System.out.println(resultado);
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String remplazarSecuencia (String texto) throws IOException {
		
		PushbackReader pr = new PushbackReader(new StringReader(texto));
		
		StringBuilder resultado = new StringBuilder();
		
		int c;
		
		while ((c = pr.read())!=-1) {
			char letra = (char)c; //convertimos a char el unicode
			
			if ("abc".indexOf(letra)!=-1) {
				resultado.append("xys");
			}
			
			else {
				resultado.append(letra);
			}
			
		}
		return resultado.toString();
		
	}
	
}
