
public class Ingredientes {

	private double cafe;
	private double azucar;
	private double canela;
	private double leche;
	
	public Ingredientes(double cafe, double azucar,double canela,double leche){
		
		this.cafe = cafe;
		this.azucar =  azucar;
		this.canela = canela;
		this.leche =  leche;
		
	}
	
	public double getCafe() {
		return cafe;
	}
	
	public void stockCafe(double cafe) {
		this.cafe = cafe;
	}
	
	public double getAzucar() {
		return azucar;
	}
	
	public void stockAzucar(double azucar) {
		this.azucar = azucar;
	}
	
	public double getCanela() {
		return canela;
	}
	
	public void stockCanela(double canela) {
		this.canela = canela;
	}
	
	public double getLeche() {
		return leche;
	}
	
	public void stockLeche(double leche) {
		this.leche = leche;
	}

}
