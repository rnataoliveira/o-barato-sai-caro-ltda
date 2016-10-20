package simulacao;

public class Horario {
	
	private int _de;
	private int _ate;
	
	public Horario(int de, int ate) {
		_de = de;
		_ate = ate;
	}
	
	public int de(){
		return _de;
	}
	
	public int ate(){
		return _ate;
	}
}
