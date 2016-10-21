package simulacao;
/*
 * Representa o resultado de uma simulação
 * */
public class Resultado {
	
	private double _tempoEspera;
	
	/*
	 * @param tempo de espera
	 * */
	public Resultado(double tempoEspera) {
		_tempoEspera = tempoEspera;
	}
	
	public boolean ehSatisfatorio() {
		return _tempoEspera <= 10 ? true : false;
	}
	
	/*
	 * @return tempo de espera
	 * */
	
	public double tempoEspera() {
		return _tempoEspera;
	}
}
