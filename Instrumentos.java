//Cada instrumento tiene un �nico m�todo: tocar, agregar comportamiento a este m�todo para cada instrumento.
 
public class Instrumentos {

	private String nombre;

	public void tocar(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
