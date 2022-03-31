/*
 * Crear la clase Estudiante que tenga los atributos atributos: dni, nombre, 
 * apellido, fecha de nacimiento y el sexo representado como valor de verdad
 *  para masculino (los tres primeros atributos deben especificarse por constructor
 *   mientras que los otros dos podr�n ser asignados mediante setters), 
	carrera (de tipo Carrera) y el promedio general actual (Integer, tambien 
	por constructor) 
 */

public class Estudiante {
	
	private int dni;
	private String nombre;
	private String apellidos;
	private int a�oDeNacimiento;
	private String sexo ;
	private Carrera carrera;
	private int promedioGrl ;

	public Estudiante(int dni,String nombre,String apellidos,int promedioGrl){
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos ;
		this.promedioGrl = promedioGrl;
		
	}
	
	public int getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}
	
	public int getPromedioGrl() {
		
		return promedioGrl;
	}
	
	public void setFechaDeNacimiento(int a�oDeNacimiento) {
		
		this.a�oDeNacimiento = a�oDeNacimiento;
	}

	public int getFechaDeNacimiento() {
		
		return this.a�oDeNacimiento;
	}

	public void cambiarSexo(String sexo){
		
		this.sexo = sexo;	
	}

	public String sexo(){
		
		return sexo;
	}
	
	public void cambiarCarrera(Carrera carrera){
		
		this.carrera = carrera;
	}
	
	public Carrera obtenerNombreCarrera(){
		
		return carrera;	
	}


}
