package simulacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import mercado.Caixa;
import mercado.Pessoa;

public class Simulador {
	public static void main(String[] args) {
		List<Horario> horarios = new ArrayList<Horario> () {
			{
				add(new Horario(8,10));
				add(new Horario(10, 12));
				add(new Horario(12, 14));
				add(new Horario(14, 16));
				add(new Horario(16, 18));
				add(new Horario(18, 20));
			}
		};
		
		List<Configuracao> aSimular = FabricaConfiguracao.gerarConfiguracoes(horarios, 5, 20);
		
	}
	
	public Resultado simular(Configuracao configuracao){
		Queue<Pessoa> fila = FabricaFila.gerarFila(configuracao.horario());
		
		int tempoOperacional = 0;
		
		do {
			int tempoEspera = 0;
			for (Caixa caixa : configuracao.caixasAtivos()) {
				tempoEspera += caixa.atender(fila.poll());
			}
		} while (!fila.isEmpty());
		
	}
}
