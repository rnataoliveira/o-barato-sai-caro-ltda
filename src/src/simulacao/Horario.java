package simulacao;
/*
 * Representa o horário de uma configuração
 * */
public class Horario {
	
	private int _de;
	private int _ate;
	/*
	 * @param horário de  (inicial)
	 * @param horário até (final)
	 * */
	public Horario(int de, int ate) {
		_de = de;
		_ate = ate;
	}
	
	/*
	 * @return horario que inicia a configuração 
	 * */
	public int de(){
		return _de;
	}
	
	/*
	 * @return horario que finaliza a configuração 
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
