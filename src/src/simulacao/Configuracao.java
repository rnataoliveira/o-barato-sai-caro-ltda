package simulacao;

import java.util.ArrayList;

import mercado.Caixa;

/*
 * Representa uma configuração de atendimento do mercado para um determinado horário
 * com uma determinada quantidade de caixas operacionais
 * */
public class Configuracao {
	private Horario _horario;
	private ArrayList<Caixa> _caixasAtivos;
	
	/*
	 * @param horario O horario a ser simulado
	 * @param caixasAtivos Lista de caixas ativos para a simulação desta configuração
	 * */
	public Configuracao(Horario horario, ArrayList<Caixa> listaDeCaixas) {
		_horario = horario;
		_caixasAtivos = listaDeCaixas;
	}
	
	/*
	 * @return Lista de caixas ativos para esta configuração
	 * */
	public ArrayList<Caixa> caixasAtivos() {
		return _caixasAtivos;
	} 
	
	/*
	 * @return horario para esta configuração
	 * */
	public Horario horario() {
		return _horario;
	}
	
	public ArrayList<Caixa> caixasOcupados() {
		ArrayList<Caixa> _caixasOcupados = new ArrayList<Caixa>();
		for(Caixa caixa : _caixasAtivos){
			if(!caixa.estaLivre()){
				_caixasOcupados.add(caixa);
			}
		}
		return _caixasOcupados;
	}
	
	public ArrayList<Caixa> caixasLivres() {
		ArrayList<Caixa> _caixasLivres = new ArrayList<Caixa>();
		for (Caixa caixa : _caixasAtivos) {
			if(caixa.estaLivre()){
				_caixasLivres.add(caixa);
			}
		}
		return _caixasLivres;
	}
	
	@Override
	public String toString() {
		return "Configuração: "+ _horario.de() +" - "+ _horario.ate() +" | Caixas: " + _caixasAtivos.size();
	}
}
