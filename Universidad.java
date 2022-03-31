/*
 * - Universidad, con nombre, pais, ciudad, direccion y sitio web.
 */

public class Universidad {
	
	private String nombre;
	private String  direccion;
	private String pais;
	private String ciudad;
	private String sitioWeb;

	public Universidad (String nombre){
		
		this.nombre = nombre;	
	}
	
	public String obtenerNombre(){
		
		return nombre;	
	}
	
	public void cambiarLugar(String ciudad,String pais, String direccion){
		
		this.pais = pais;
		this.ciudad = ciudad;	
		this.direccion = direccion;
	}
	
	public String obtenerPais(){
		
		return pais;
	}
	
	public String obtenerCiudad(){
		
		return ciudad;
	}
	
	public String obtenerDireccion(){
		
		return this.direccion ;
	}
	public void Sitio(String sitioWeb){
		
		this.sitioWeb = sitioWeb;
		
	}
	
	public String obtenerSitioWeb(){
		
		return sitioWeb;	
	}
	

}
