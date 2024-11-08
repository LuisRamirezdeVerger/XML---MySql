package tema2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tratamiento_Info_2 {

	public static void main(String[] args) {
		try {
				DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\temp\\pruebas\\data.bin"));
				dataOutputStream.writeInt(123);
				dataOutputStream.writeFloat(123.45F);
				dataOutputStream.writeLong(789);
				dataOutputStream.close();
				DataInputStream dataInputStream =new DataInputStream(new FileInputStream("C:\\temp\\pruebas\\data.bin"));
				int entero = dataInputStream.readInt();
				float numeroFloat = dataInputStream.readFloat();
				long numeroLong = dataInputStream.readLong();
				dataInputStream.close();
				System.out.println("El numero entero es: " + entero);
				System.out.println("El objeto de tipo float es: " + numeroFloat);
				System.out.println("El objeto long es: " + numeroLong);
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			}

	}

}
