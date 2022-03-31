
public class MouseOptico implements Mouse {
	
	private int x = 0;
	private  int y = 0;
	private String rueda;
	private boolean luz;
	
	@Override
	public void mover(int x,int y) {
		
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void SchollDown() {
		
		if((this.x < 0 || x >0) && this.y < 0){
		
			this.rueda = "abajo";
		}
	}
	
	public boolean luz() {
		
		return true;
	}

	@Override
	public void SchollUp() {
		
		if((this.x > 0 || x < 0)&& this.y > 0){
			
			this.rueda = "arriba";
		}
	}
	
	@Override
	public void clickDerecho() {
	
		System.out.println("ventana de herramientas");
	}
	
	@Override
	public void clickIzquierdo() {

		System.out.println("Acepta la opcion");
	}	
	
}