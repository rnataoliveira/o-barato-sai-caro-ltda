package simulacao;

import mercado.Caixa;

/*
 * Representa uma configura��o de atendimento do mercado para um determinado horario
 * com uma determinada quantidade de caixas operacionais
 * */
public class Configuracao {

	private Horario _horario;
	private Iterable<Caixa> _caixasAtivos;
	
	/*
	 * @param horario O horario a ser simulado
	 * @param caixasAtivos Lista de caixas ativos para a simula��o desta configura��o
	 * */
	public Configuracao(Horario horario, Iterable<Caixa> caixasAtivos) {
		_horario = horario;
		_caixasAtivos = caixasAtivos;
	}
	
	/*
	 * @return Lista de caixas ativos para esta configura��o
	 * */
	public Iterable<Caixa> caixasAtivos() {
		return _caixasAtivos;
	} 
	
	/*
	 * @return horario para esta configura��o
	 * */
	public Horario horario() {
		return _horario;
	}
}
