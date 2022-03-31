/**
 * Crear la clase Alquiler, el cual tiene el libro alquilado, y las fechas de alquiler y devoluci�n.
	
	Crear el concepto de Libro, que tiene una editorial y un titulo (ambos String) y modelar con un simple 
	Boolean el hecho de estar alquilado o no.
	
	El libro solo tiene dos m�todos: alquilar y devolver, ambos
	
	Crear una app que cree dos libros y los alquile y que luego valide que estos libros est�n alquilados 
	(validar que se incremento la cantidad de alquileres sin devolver y que existan los alquileres correspondientes a los libros alquilados)
	Luego se debe devolver uno de los libros y testear que se modifico la cantidad de alquileres sin devolver.
 	sin par�metros, resolver como manejar toda la l�gica de alquileres con estos m�todos
 */

import java.util.Date;

public class Alquiler {
	
	private String editorial;
	private String titulo;
	private boolean alquilado;
	private Libro libro;
	private Date fechaDeAlquiler;
	private Date fechaDeDevolucion;

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public void setFechaDeAlquiler(Date fechaDeAlquiler) {
		
		this.fechaDeAlquiler = fechaDeAlquiler;
	}

	public Date getFechaDeAlquiler() {
		
		return fechaDeAlquiler;
	}

	public void setFechaDeDevolucion(Date fechaDeDevolucion) {
		this.fechaDeDevolucion = fechaDeDevolucion;
	}

	public Date getFechaDeDevolucion() {
		return fechaDeDevolucion;
	}
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public boolean alquilado(){
		
		if(this.libro.isAlquilar() == true){
		
		this.alquilado = this.libro.isAlquilar();
		}
		return alquilado;
	}
	
	public int alquilerDeLibro(){
		
		int cantidad = 0;
		if (libro.isAlquilar()== true) {
			
			cantidad ++ ;
			
		}if(libro.isDevolver()== true){
			
			cantidad--;
		}
		return cantidad;
		
	}
}
