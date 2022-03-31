/*
 * - Carrera, que deberá tener nombre, la universidad donde se dicta (de tipo 
 * Universidad), la duración en años de programa y el título que se obtiene 
 * (de tipo Titulo).
 */

public class Carrera {
	
	private String nombre;
	private Universidad universidad;
	private int añosDeEstudio;
	private Titulo titulo;

	public Carrera(String nombre, int añosDeEstudio){
		
		this.nombre = nombre;
		this.añosDeEstudio = añosDeEstudio;
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
	
	public int AñosDeEstudio(){
		
		return this.añosDeEstudio;
	}
	
	public Titulo titulo(){
		return titulo;
		
	}
}
