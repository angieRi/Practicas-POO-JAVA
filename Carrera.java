/*
 * - Carrera, que deber� tener nombre, la universidad donde se dicta (de tipo 
 * Universidad), la duraci�n en a�os de programa y el t�tulo que se obtiene 
 * (de tipo Titulo).
 */

public class Carrera {
	
	private String nombre;
	private Universidad universidad;
	private int a�osDeEstudio;
	private Titulo titulo;

	public Carrera(String nombre, int a�osDeEstudio){
		
		this.nombre = nombre;
		this.a�osDeEstudio = a�osDeEstudio;
	}
	
	public String obtenerNombre(){
	
		return nombre;
	}
	
	public void cambiarUniversidad(Universidad universidad){
		
		this.universidad = universidad;
	}
	
	public String ObtenerUniversidad(){
		
		return this.universidad.obtenerNombre();
	}
	
	public int A�osDeEstudio(){
		
		return this.a�osDeEstudio;
	}
	
	public Titulo titulo(){
		return titulo;
		
	}
}
