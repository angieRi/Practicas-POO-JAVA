/**
 * 4.	Se pretende modelar una librería y la forma de manejar alquileres de Libros,
 *  para ellos crear la clase Librería, la misma posee una colección de alquileres. 
 *  
 *  Además de proveer un método para agregar un Alquiler a la colección, debe proveer dos métodos:
 *  
	buscarAlquiler, el cual recibe un libro y devuelve el Alquiler que lo contiene.
	
	listarAlquileres, lista los alquileres (titulo del libro y fecha de alquiler)
	
	Debe existir una única instancia de Librería y la misma puede ser accesible desde cualquier
 	punto de la aplicación, investigar si existe algún mecanismo para manejar este comportamiento.
	
	Crear la clase Alquiler, el cual tiene el libro alquilado, y las fechas de alquiler y devolución.
	
	Crear el concepto de Libro, que tiene una editorial y un titulo (ambos String) y modelar con un simple 
	Boolean el hecho de estar alquilado o no. El libro solo tiene dos métodos: alquilar y devolver, ambos
	Crear una app que cree dos libros y los alquile y que luego valide que estos libros están alquilados 
	(validar que se incremento la cantidad de alquileres sin devolver y que existan los alquileres correspondientes a los libros alquilados)
	Luego se debe devolver uno de los libros y testear que se modifico la cantidad de alquileres sin devolver.
 	sin parámetros, resolver como manejar toda la lógica de alquileres con estos métodos
 *
 */

public class Libreria {
	
	private Alquiler[] coleccionDeAlquileres;
	
	public Libreria (Alquiler[] coleccionDeAlquiler){
		
			
			this.coleccionDeAlquileres = coleccionDeAlquiler;
	}
	
	public void agregarAlquiler(Alquiler alquiler){
		
		for (int i = 0; i < this.coleccionDeAlquileres.length; i++) {
			
			if(this.coleccionDeAlquileres[i] == null){
				
				this.coleccionDeAlquileres[i] = alquiler;
			}
		}	
	}

	public Alquiler buscarLibro(String nombreLibro){
		
		Alquiler libro = null;
	
		for (int i = 0; i < this.coleccionDeAlquileres.length; i++){
			
			if(this.coleccionDeAlquileres[i].getTitulo() == nombreLibro){
		
				libro = this.coleccionDeAlquileres[i];
			}
		}
		return libro;
	}
		
	public void ListaDeLibros(){
		
		for (int i = 0; i < this.coleccionDeAlquileres.length; i++) {
			
			System.out.println("Lista de libros en alquiler son : "
					+ this.coleccionDeAlquileres[i].getTitulo() +
					this.coleccionDeAlquileres[i].getFechaDeAlquiler());
		}
	}
	
}
