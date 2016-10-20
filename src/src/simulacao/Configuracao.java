package simulacao;

import mercado.Caixa;

public class Configuracao {
	
	private Horario _horario;
	private Iterable<Caixa> _caixasAtivos;
	
	public Configuracao(Horario horario, Iterable<Caixa> caixasAtivos) {
		_horario = horario;
		_caixasAtivos = caixasAtivos;
	}
	
	public Iterable<Caixa> caixasAtivos() {
		return _caixasAtivos;
	} 
	
	public Horario horario() {
		return _horario;
	}
}
