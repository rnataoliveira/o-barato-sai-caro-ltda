package simulacao;

import java.util.ArrayList;

import mercado.Caixa;

public class FabricaConfiguracao {
	
	/*
	 * Comportamento da fabrica de configurações.
	 * Gera configuração passando a lista de horarios, a quantidade minima e maxima;
	 * */
	public static ArrayList<Configuracao> gerarConfiguracoes(Iterable<Horario> horarios,int qtdMinima, int qtdMaxima){
		ArrayList<Configuracao> configuracoes = new ArrayList<Configuracao>();
		
		for (Horario horario : horarios) {
			for (int qtdCaixas = qtdMinima; qtdCaixas <= qtdMaxima; qtdCaixas++) {
				ArrayList<Caixa> listaDeCaixas = FabricaCaixas.gerarCaixas(qtdCaixas);
				
				Configuracao configuracao = new Configuracao(horario, listaDeCaixas);
				configuracoes.add(configuracao);
			}
		}
		
		return configuracoes;
	}
	
	public static ArrayList<Configuracao> gerarConfiguracoes (Horario horario, int qtdMinima, int qtdMaxima) {
		return gerarConfiguracoes(horario, qtdMinima, qtdMaxima);
	}
}
