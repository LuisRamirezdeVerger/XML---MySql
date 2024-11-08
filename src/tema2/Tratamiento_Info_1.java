package tema2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tratamiento_Info_1 {

	public static void main(String[] args) {
		try {
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\temp\\pruebas\\ficheroBinario.data"));
			int aByte = dataInputStream.read();
			int anInt = dataInputStream.readInt();
			float aFloat = dataInputStream.readFloat();
			double aDouble = dataInputStream.readDouble();
			dataInputStream.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}

}
