package leerContactos;

import java.util.ArrayList;

public class documento {
	//Para usar en los metodos
	String SEPARATOR=";";
	//atributps de la clase.
	ArrayList<String> Nombre = new ArrayList<String>();
	ArrayList<String> Apellidos = new ArrayList<String>();
	ArrayList<String> tlf = new ArrayList<String>();
	ArrayList<String> correoElectronico = new ArrayList<String>();
	//Constructores
	public documento() {
	}
	//metodo principal
	public void LADatos(String line) {
		try {
			String[] linea = line.split(SEPARATOR);
			Nombre.add(linea[0]);
			Apellidos.add(linea[1]);
			tlf.add(linea[2]);
			correoElectronico.add(linea[3]);
			
		} catch (Exception e) {
			System.err.println("Alguno de los datos es incorrecto");
		}
	}
	
	
	@Override
	public String toString() {
		return "documento [Nombre=" + Nombre.toString() + ", Apellidos=" + Apellidos.toString() + ", tlf=" + tlf.toString() + ", correoElectronico="
				+ correoElectronico.toString() + "]";
	}
	
	
	
	
}
