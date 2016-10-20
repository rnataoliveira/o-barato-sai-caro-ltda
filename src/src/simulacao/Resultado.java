package simulacao;

public class Resultado {
	
	private double _tempoEspera;
	
	public Resultado(double tempoEspera) {
		_tempoEspera = tempoEspera;
	}
	
	public boolean ehSatisfatorio() {
		return _tempoEspera <= 10 ? true : false;
	}
	
	public double tempoEspera() {
		return _tempoEspera;
	}
}
