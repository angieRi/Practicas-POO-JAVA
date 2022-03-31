/**
 * 3.Implemente la clase Moneda que contenga 
 * dos atributos: uno de tipo BigDecimal llamada cantidad y otro de tipo int llamada moneda. 
 * Esta clase debe recibir por constructor ambos valores a setear en las variables miembro
 *  y debe tener sus respectivos getters. Estos atributos son inmutables.
 *  Agregue el método sumar a la clase Moneda que recibe un objeto de tipo Moneda y que en caso 
 *  de tener el mismo tipo de moneda devuelva una nueva instancia de Moneda creada con la suma de
 *   ambas monedas. Evalúe cómo manejar el caso donde no coincidan las monedas y explique dentro del 
 *   código la implementación desarrollada.
	Agregar otro método sumar que reciba como parámetro un String y efectúe nuevamente una suma, 
	devolviendo una nueva instancia de Moneda utilizando el tipo de moneda del mismo objeto.
 */

public class Moneda {

	private static double cantidad;
	private static int moneda;
	private String tipo;
	private Moneda nuevaMoneda;
	
	public Moneda(double cantidad,int moneda) {
		
		this.cantidad = cantidad;
		this.moneda = moneda;
		
	}
	public double getCantidad() {
		return cantidad;
	}
	
	public int getMoneda() {
		
		return this.moneda;
	}
	
	public int sumar(Moneda nuevaMoneda){
		
		this.nuevaMoneda = nuevaMoneda;
		
		if(nuevaMoneda == this){
			
			this.moneda += nuevaMoneda.getMoneda();
		
		}else{
			//	Error moneda = new Error();
			//throw moneda;
			
			System.out.println("No es el mismo tipo Moneda ,imposible sumar");
			}
		
		return this.moneda;
	}

	public void setTipo(String tipo) {
		
		 this.tipo = tipo;
	}
	
	public int sumarMoneda(String tipo){
		
     if( tipo == this.tipo){
			
    	 this.moneda += this.nuevaMoneda.getMoneda() ;
     }
		
		return this.getMoneda();
	}
	public String getTipo() {
		
		return tipo;
	}
}
