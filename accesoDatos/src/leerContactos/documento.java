package leerContactos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class documento {
	// Para usar en los metodos
	String SEPARATOR = ";";
	// atributps de la clase.
	ArrayList<String> Nombre = new ArrayList<String>();
	ArrayList<String> Apellidos = new ArrayList<String>();
	ArrayList<String> tlf = new ArrayList<String>();
	ArrayList<String> correoElectronico = new ArrayList<String>();

	// Constructores
	public documento() {
	}

	// metodo principal
	public void LADatos(FileReader archivo) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(archivo);
			String line = br.readLine();
			while (null != line) {
				String[] linea = line.split(SEPARATOR);
				Nombre.add(linea[0]);
				Apellidos.add(linea[1]);
				tlf.add(linea[2]);
				correoElectronico.add(linea[3]);
				line = br.readLine();
			}

		} catch (Exception e) {
			System.err.println("Alguno de los datos es incorrecto");
		} finally {
			if (null != br) {
				br.close();
			}

		}
	}

	@Override
	public String toString() {
		String palabra = new String();
		palabra = "";
		for (int i = 0; i < Nombre.size(); i++) {
			palabra += "Contacto [" + (i + 1) + "] { Nombre: " + Nombre.get(i) + ", Apellido: " + Apellidos.get(i)
					+ ", Tlf: " + tlf.get(i) + ", Correo: " + correoElectronico.get(i) + "}."
					+ System.getProperty("line.separator");
		}
		return palabra;
	}

}
