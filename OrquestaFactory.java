
/*
 * La creación de las orquestas queda delegada a una clase llamada OrquestaFactory, la misma tiene métodos para
 	crear una banda de rock, una orquesta de cuerdas y un grupo de flamenco.
 */

public class OrquestaFactory {

	
	private Orquesta bandaCuerda;
	private Orquesta bandaRock;
	private Orquesta bandaFlamenco;

	public void bandaRock(Orquesta orquesta){
		
		this.bandaRock = orquesta;
	}

	public void bandaCuerda (Orquesta cuerda){
		
		this.bandaCuerda = cuerda;
	}
	
	public void bandaFlamenco(Orquesta flamenco){
		
		this.bandaFlamenco = flamenco;
	}
}
