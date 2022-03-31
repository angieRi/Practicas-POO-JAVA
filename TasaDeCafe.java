/**
 * 6.Se pide modelar para una cadena de cafeterías una aplicación que permita a los clientes
 *  armar a su gusto las tazas de café que la cafetería vende; 
 *  
 *  para ello modelar el concepto de taza de café, la misma tiene un método que devuelve el costo de la misma,
 *   el cual se calcula a partir de sus ingredientes.
 *  Los ingredientes pueden ser: café, azúcar, leche, canela. Cada ingrediente 
 *   tiene un costo por cada 100 unidades (gramos o cm3). 
 *   Además debe existir el concepto de Stock, el cual maneja mediante un mapa (HashMap)
 *    las cantidades de cada ingrediente, no pudiendo agregarse a una taza un ingrediente que no tenga stock
 * 
 */
public class TasaDeCafe {

	private double costo;
	private Ingredientes ingredientes;
	private double precioXTasa;

	public TasaDeCafe (Ingredientes ingredientes, double precioXTasa){
	
		this.ingredientes = ingredientes;
		this.precioXTasa = precioXTasa;
	}

	public void setCosto(double costo){
		
		this.costo = costo;
	}
	
	public double getCosto() {
		
		return costo;
	}
	
	public void ingredientes(double cafe, double azucar,double canela,double leche){
		
		if(this.ingredientes.getAzucar() >= azucar && this.ingredientes.getCafe() >= cafe && 
				this.ingredientes.getCanela() >= canela && this.ingredientes.getLeche() >= leche){
			
			double ingredientes = azucar + leche + canela + cafe;
			
			if(ingredientes >= 100 || ingredientes < 100){
				
				this.costo = (ingredientes / 100)* this.precioXTasa;
			}
		}
		
	}
}
