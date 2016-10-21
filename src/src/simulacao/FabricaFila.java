package simulacao;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import mercado.Compra;
import mercado.Pessoa;

public class FabricaFila {
	
	public static final Map<Integer, Double> probabilidades = new Hashtable<Integer, Double>() {
		{
			put(8, 0.3);
			put(10,0.4);
			put(12,0.5);
			put(14,0.7);
			put(16,0.9);
			put(18,0.8);
			put(20,0.6);
		}
	};
	
	
	public static Queue<Pessoa> gerarFila(Horario horario) {
		Queue<Pessoa> fila = new LinkedList<Pessoa>();
		
		int tamanhoDaFila = calcularTamanhoFila(horario);
		
		for (int i = 0; i < tamanhoDaFila; i++) {
			Compra compraAleatoria = FabricaCompras.gerarCompraAleatoria();
			
			Pessoa pessoaAleatoria = new Pessoa(compraAleatoria);
			
			fila.add(pessoaAleatoria);
		}
		
		return fila;
	}
	
	private static int calcularTamanhoFila(Horario horario){
		double probabilidade = probabilidades.get(horario.de());
		
		int tamanho = 0;
		
		for (int i = 0; i < horario.minutosTotais(); i++) {
			boolean deveEntrar =  Math.random() >= 1.0 - probabilidade;
			
			if(deveEntrar)
				tamanho += 1;
		}
		
		return tamanho;
	}
}
