/**
 * - Titulo, con un nombre y la universidad que lo otorga (de tipo Universidad).
 */

public class Titulo {
	
	private String nombre;
	private Universidad universidad;

	public Titulo(String nombre,Universidad universidad){
		
		this.nombre = nombre;
		this.universidad = universidad;	
	}

	public String getNombre() {
		return nombre;
	}

	public Universidad getUniversidad() {
		
		return universidad;
	}
	
}
