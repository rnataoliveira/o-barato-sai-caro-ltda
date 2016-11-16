package simulacao;

import mercado.Cliente;
import mercado.Compra;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class FilaDeClientes extends LinkedList<Cliente> {
	
	private Horario _horario;
	
	public FilaDeClientes(Horario horario) {
		_horario = horario;
		aumentarTempoEspera();
	}
	
	public void aumentarTempoEspera() {
		for (Cliente cliente : this) {
			cliente.esperar(1);
		}
		if(deveEntrarNovoCliente()) {
			Compra compra = FabricaCompras.gerarCompraAleatoria();
			Cliente novoCliente = new Cliente(compra);
			
			this.push(novoCliente);
		}
	}
	
	private boolean deveEntrarNovoCliente() {
		double probabilidade = PROBABILIDADES.get(_horario.de());
		
		return Math.random() >= 1.0 - probabilidade;
	}
	
	private static final Map<Integer, Double> PROBABILIDADES = new Hashtable<Integer, Double>() {
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
	
}
