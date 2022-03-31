/**
 * 5.	Crear diferentes instrumentos musicales (generalice el concepto de instrumento en una superclase)
 *  los cuales pueden conformar distintos tipos de orquesta;
 *  
 *   para ellos crear la clase orquesta que tendr� una agrupaci�n de instrumentos.
 *   
	La creaci�n de las orquestas queda delegada a una clase llamada OrquestaFactory, la misma tiene m�todos para
 	crear una banda de rock, una orquesta de cuerdas y un grupo de flamenco.
 	
	Cada instrumento tiene un �nico m�todo: tocar, agregar comportamiento a este m�todo para cada instrumento.
 *
 */
public class Orquesta {

	private Instrumentos[] instrumentos;

	public void setInstrumentos(Instrumentos[] instrumentos) {
		this.instrumentos = instrumentos;
	}

	public Instrumentos[] getInstrumentos() {
		
		return instrumentos;
	}
	
}
