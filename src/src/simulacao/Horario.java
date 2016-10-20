package simulacao;

import java.sql.Time;

public class Horario {
	
	private Time _de;
	private Time _ate;
	
	public Horario(Time de, Time ate) {
		_de = de;
		_ate = ate;
	}
	
	public Time de(){
		return _de;
	}
	
	public Time ate(){
		return _ate;
	}
}
