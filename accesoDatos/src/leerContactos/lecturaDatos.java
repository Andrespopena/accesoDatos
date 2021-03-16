package leerContactos;
import java.io.FileReader;

public class lecturaDatos {

	public static void main(String[] args) {
		
		documento doc = new documento();
		try {
			FileReader archivo = new FileReader("C:\\Users\\Andrés\\OneDrive\\Escritorio\\contactos.csv");
			doc.LADatos(archivo);
		} catch (Exception e) {
			System.err.println("Documento no encontrado");
		} 
		
		System.out.println(doc.toString());
	}

}
