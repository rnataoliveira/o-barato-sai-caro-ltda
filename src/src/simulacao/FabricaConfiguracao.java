package simulacao;

import java.util.ArrayList;
import java.util.List;

import mercado.Caixa;

public class FabricaConfiguracao {
	
	/*
	 * Comportamento da fabrica de configurações.
	 * Gera configuração passando a lista de horarios, a quantidade minima e maxima;
	 * */
	public static List<Configuracao> gerarConfiguracoes(List<Horario> horarios,int qtdMinima, int qtdMaxima){
		List<Configuracao> configuracoes = new ArrayList<Configuracao>();
		
		for (Horario horario : horarios) {
			for (int qtdCaixas = qtdMinima; qtdCaixas <= qtdMaxima; qtdCaixas++) {
				List<Caixa> listaDeCaixas = FabricaCaixas.gerarCaixas(qtdCaixas);
				
				Configuracao configuracao = new Configuracao(horario, listaDeCaixas);
				configuracoes.add(configuracao);
			}
		}
		
		return configuracoes;
	}
}
