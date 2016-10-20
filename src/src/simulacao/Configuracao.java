package simulacao;

import mercado.Caixa;

/*
 * Representa uma configuração de atendimento do mercado para um determinado horario
 * com uma determinada quantidade de caixas operacionais
 * */
public class Configuracao {

	private Horario _horario;
	private Iterable<Caixa> _caixasAtivos;
	
	/*
	 * @param horario O horario a ser simulado
	 * @param caixasAtivos Lista de caixas ativos para a simulação desta configuração
	 * */
	public Configuracao(Horario horario, Iterable<Caixa> caixasAtivos) {
		_horario = horario;
		_caixasAtivos = caixasAtivos;
	}
	
	/*
	 * @return Lista de caixas ativos para esta configuração
	 * */
	public Iterable<Caixa> caixasAtivos() {
		return _caixasAtivos;
	} 
	
	/*
	 * @return horario para esta configuração
	 * */
	public Horario horario() {
		return _horario;
	}
}
