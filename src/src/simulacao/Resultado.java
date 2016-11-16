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
	/*
	 * @param configuração
	 * @param clientes atendidos
	 * */
	public Resultado(Configuracao configuracao) {
		_configuracao = configuracao;
		_clientesAtendidos = new ArrayList<Cliente>();
	}
	/*
	 * @return se é satisfatório
	 * */
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
	
	/*
	 * @return valor total faturado
	 * */
	public double valorFaturadoTotal() {
		double valorFaturadoTotal = 0;
		for (Caixa caixa : _configuracao.caixasAtivos()) {
			valorFaturadoTotal += caixa.valorFaturado();
		}
		return valorFaturadoTotal;
	}
	
	/*
	 * @return lucro obtido
	 * */
	public double lucroObtido() {
		double lucroObtido = 0;
		for (Caixa caixa : _configuracao.caixasAtivos()) {
			lucroObtido += caixa.lucroObtido();
		}
		return lucroObtido;
	}
	
	/*
	 * @return custo operacional
	 * */
	public double custoOperacionalTotal() {
		double custoOperacionalTotal = 0;
		for(Caixa caixa : _configuracao.caixasAtivos()) {
			custoOperacionalTotal += caixa.custoOperacional();
		}
		return custoOperacionalTotal;
	}
	
	/*
	 * @return cliente com mais tempo de espera
	 * */
	public Cliente clienteMaxEspera() {
		return _clienteMaxEspera;
	}
	
	/*
	 * @return resultados
	 * */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(_configuracao.toString());
		sb.append("\r\n...:::RESULTADO ");
		
		if(ehSatisfatorio())
			sb.append("SATISFATÓRIO:::...\r\n");
		else
			sb.append("INSATISFATÓRIO:::...\r\n");
		
		sb.append("Valor Faturado Total: R$ " + valorFaturadoTotal());
		sb.append("\r\n");
		sb.append("Custo Operacional Total: R$ " + custoOperacionalTotal());
		sb.append("\r\n");
		sb.append("Lucro Obtido: R$ " + lucroObtido());
		sb.append("\r\n");
		
		if(_clientesAtendidos.size() > 0) {
			sb.append("Clientes atendidos: " + _clientesAtendidos.size() + " Clientes");
			sb.append("\r\n");
			sb.append("Maior Tempo de Espera: " + _clienteMaxEspera.tempoEspera() + " minutos ");
			sb.append("\r\n------------------------------------------\r\n");
			
		}
		return sb.toString();
	}
}
