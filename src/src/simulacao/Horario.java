package simulacao;
/*
 * Representa o hor�rio de uma configura��o
 * */
public class Horario {
	
	private int _de;
	private int _ate;
	/*
	 * @param hor�rio de  (inicial)
	 * @param hor�rio at� (final)
	 * */
	public Horario(int de, int ate) {
		_de = de;
		_ate = ate;
	}
	
	/*
	 * @return horario que inicia a configura��o 
	 * */
	public int de(){
		return _de;
	}
	
	/*
	 * @return horario que finaliza a configura��o 
	 * */
	public int ate(){
		return _ate;
	}
	
	/*
	 * @return o intervalo de tempo em minutos
	 * */
	public int minutosTotais(){
		int intervalo = _ate - _de;
		return intervalo * 60;
	}
}
