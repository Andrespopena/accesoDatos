package leerContactos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lecturaDatos {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		documento doc = new documento();
		try {
			FileReader archivo = new FileReader("C:\\Users\\Andrés\\OneDrive\\Escritorio\\contactos.csv");
			br = new BufferedReader(archivo);
			String line = br.readLine();
			while (null != line) {
				doc.LADatos(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			System.err.println("Documento no encontrado");
		} finally {
			if (null != br) {
				br.close();
			}

		}
		
		System.out.println(doc.toString());
	}

}
