package simulacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mercado.Caixa;
import mercado.Cliente;

public class Simulador {
	public static void main(String[] args) {
		/*
		 * Hor�rios para simular
		 * */
		ArrayList<Horario> horariosASimular = new ArrayList<Horario> () {
			{
				add(new Horario(8,10));
				add(new Horario(10, 12));
				add(new Horario(12, 14));
				add(new Horario(14, 16));
				add(new Horario(16, 18));
				add(new Horario(18, 20));
			}
		};
		
		List<Configuracao> configuracoesASimular = FabricaConfiguracao.gerarConfiguracoes(horariosASimular, 5, 20);
		
		File file = new File("OBaratoSaiCaroLtda.txt");
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			/*
			 * Simula as configura��es
			 * */
			for (Configuracao configuracao : configuracoesASimular) {
				System.out.println("Iniciando simula��o de configura��o...");
				System.out.println("");
				
				Resultado resultado = Simulador.simular(configuracao);
				
				System.out.println(resultado);
				/*
				 * Salva as simula��es que foram satisfat�rias
				 * */
				if(resultado.ehSatisfatorio()) {
					writer.write(resultado.toString());
					System.out.println(" ");
				}
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * @return resultado de configura��o
	 * */
	public static Resultado simular(Configuracao configuracao){
		FilaDeClientes fila = new FilaDeClientes(configuracao.horario());
		
		Resultado resultado = new Resultado(configuracao);
		
		for (int i = 0; i <= configuracao.horario().minutosTotais(); i++) {
			for (Caixa caixa : configuracao.caixasOcupados()) {
				if(caixa.processarItemCompra())
					continue;
				Cliente clienteAtendido = caixa.finalizarAtendimento();
				resultado.adicionarClienteAtendido(clienteAtendido);
			}
			for (Caixa caixa : configuracao.caixasLivres()) {
				if(fila.size() > 0)
					caixa.iniciarAtendimento(fila.poll());
				else break;
			}
			fila.aumentarTempoEspera();
		}
		return resultado;
	}
}
