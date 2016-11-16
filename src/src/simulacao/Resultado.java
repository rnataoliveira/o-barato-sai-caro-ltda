package simulacao;

import java.util.ArrayList;

import mercado.Caixa;
import mercado.Cliente;

/*
 * Representa o resultado de uma simulação
 * */
public class Resultado {
	
	private Configuracao _configuracao;
	private ArrayList<Cliente> _clientesAtendidos;
	private Cliente _clienteMaxEspera;	
	
	public Resultado(Configuracao configuracao) {
		_configuracao = configuracao;
		_clientesAtendidos = new ArrayList<Cliente>();
	}
	
	public boolean ehSatisfatorio() {
		for (Cliente cliente : _clientesAtendidos) {
			if(cliente.tempoEspera() > 10)
				return false;
		}
		return true;
	}
	
	public void adicionarClienteAtendido(Cliente cliente) {
		_clientesAtendidos.add(cliente);
		
		if(_clienteMaxEspera == null || _clienteMaxEspera.tempoEspera() < cliente.tempoEspera())
			_clienteMaxEspera = cliente;
	}
	
	public double valorFaturadoTotal() {
		double valorFaturadoTotal = 0;
		for (Caixa caixa : _configuracao.caixasAtivos()) {
			valorFaturadoTotal += caixa.valorFaturado();
		}
		return valorFaturadoTotal;
	}
	
	public double lucroObtido() {
		double lucroObtido = 0;
		for (Caixa caixa : _configuracao.caixasAtivos()) {
			lucroObtido += caixa.lucroObtido();
		}
		return lucroObtido;
	}
	
	public double custoOperacionalTotal() {
		double custoOperacionalTotal = 0;
		for(Caixa caixa : _configuracao.caixasAtivos()) {
			custoOperacionalTotal += caixa.custoOperacional();
		}
		return custoOperacionalTotal;
	}
	
	public Cliente clienteMaxEspera() {
		return _clienteMaxEspera;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(_configuracao.toString());
		sb.append("");
		
		if(ehSatisfatorio())
			sb.append("\nResultado Satisfatório.\n");
		else
			sb.append("\nResultado Insatisfatório.\n");
		
		sb.append("Valor Faturado Total: " + valorFaturadoTotal() + "\n");
		sb.append("Custo Operacional Total: " + custoOperacionalTotal() + "\n");
		sb.append("Lucro Obtido: " + lucroObtido() + "\n");
		
		if(_clientesAtendidos.size() > 0) {
			sb.append("Clientes atendidos: " + _clientesAtendidos.size() + "\n");
			sb.append("Maior Tempo de Espera: " + _clienteMaxEspera.tempoEspera() + " minutos \n");
			
		}
		return sb.toString();
	}
}
