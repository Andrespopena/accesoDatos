package leerContactos;
import java.io.FileReader;

public class lecturaDatos {

	public static void main(String[] args) {
		try {
			FileReader archivo = new FileReader("/accesoDatos/src/leerContactos/contactos.csv");
			documento.LADatos(archivo);
		} catch (Exception e) {
			System.err.println("Documento no encontrado");
		} 
		
		System.out.println(documento.toText());
	}

}
