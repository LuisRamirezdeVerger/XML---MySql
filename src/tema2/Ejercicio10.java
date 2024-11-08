package tema2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		String frase;
		System.out.println("Introduce una frase");
		frase=entrada.readLine();
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)=='#') {
				System.out.println(frase.charAt(i-1));
				System.out.println(frase.charAt(i-2));
			}else {
				System.out.println(frase.charAt(i));
			}
			
		}
		
	}
}
