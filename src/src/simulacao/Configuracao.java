package simulacao;

import java.util.ArrayList;

import mercado.Caixa;

/*
 * Representa uma configura��o de atendimento do mercado para um determinado hor�rio
 * com uma determinada quantidade de caixas operacionais
 * */
public class Configuracao {
	private Horario _horario;
	private ArrayList<Caixa> _caixasAtivos;
	
	/*
	 * @param horario O horario a ser simulado
	 * @param caixasAtivos Lista de caixas ativos para a simula��o desta configura��o
	 * */
	public Configuracao(Horario horario, ArrayList<Caixa> listaDeCaixas) {
		_horario = horario;
		_caixasAtivos = listaDeCaixas;
	}
	
	/*
	 * @return Lista de caixas ativos para esta configura��o
	 * */
	public ArrayList<Caixa> caixasAtivos() {
		return _caixasAtivos;
	} 
	
	/*
	 * @return horario para esta configura��o
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
		return "Configura��o: "+ _horario.de() +" - "+ _horario.ate() +" | Caixas: " + _caixasAtivos.size();
	}
}
