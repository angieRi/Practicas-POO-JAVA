/**
 * 4.	Se pretende modelar una librer�a y la forma de manejar alquileres de Libros,
 *  para ellos crear la clase Librer�a, la misma posee una colecci�n de alquileres. 
 *  
 *  Adem�s de proveer un m�todo para agregar un Alquiler a la colecci�n, debe proveer dos m�todos:
 *  
	buscarAlquiler, el cual recibe un libro y devuelve el Alquiler que lo contiene.
	
	listarAlquileres, lista los alquileres (titulo del libro y fecha de alquiler)
	
	Debe existir una �nica instancia de Librer�a y la misma puede ser accesible desde cualquier
 	punto de la aplicaci�n, investigar si existe alg�n mecanismo para manejar este comportamiento.
	
	Crear la clase Alquiler, el cual tiene el libro alquilado, y las fechas de alquiler y devoluci�n.
	
	Crear el concepto de Libro, que tiene una editorial y un titulo (ambos String) y modelar con un simple 
	Boolean el hecho de estar alquilado o no. El libro solo tiene dos m�todos: alquilar y devolver, ambos
	Crear una app que cree dos libros y los alquile y que luego valide que estos libros est�n alquilados 
	(validar que se incremento la cantidad de alquileres sin devolver y que existan los alquileres correspondientes a los libros alquilados)
	Luego se debe devolver uno de los libros y testear que se modifico la cantidad de alquileres sin devolver.
 	sin par�metros, resolver como manejar toda la l�gica de alquileres con estos m�todos
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
