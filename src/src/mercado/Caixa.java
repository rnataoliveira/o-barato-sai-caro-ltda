package mercado;

import java.awt.dnd.InvalidDnDOperationException;

/*
 * Representação de um caixa em um supermercado
 * */
public class Caixa {
	
	private double _valorFaturado;
	private double _custoOperacional;
	public static final double CUSTO_OPERACIONAL = 300;
	
	private Cliente _clienteAtual;
	private Compra _compraProcessada;
	
	public Caixa(double custoOperacional) {
		_custoOperacional = custoOperacional;
	}
	
	/*
	 * @param valor que um caixa fatura
	 * @param preço fixo do custo operacional por caixa
	 * */
	
	public boolean estaLivre(){
		return _clienteAtual == null;
	}
	
	public void iniciarAtendimento(Cliente pessoa) {
		_clienteAtual = pessoa;
		_compraProcessada = new Compra();
		
		processarItemCompra();
	}
	
	public boolean processarItemCompra() {
		if(estaLivre())
			throw new InvalidDnDOperationException("Se o caixa está livre não tem como processar um item da compra.");
		if(_clienteAtual.compra().isEmpty())
			return false;
		
		Item item = _clienteAtual.compra().pop();
		_compraProcessada.push(item);
		
		return true;
	}
	
	public Cliente finalizarAtendimento() {
		if(estaLivre())
			throw new IllegalStateException("Se o caixa está livre não tem como finalizar um atendimento.");
		
		Cliente clienteAtendido = _clienteAtual;
		_clienteAtual = null;
		
		_valorFaturado += _compraProcessada.valorTotal();
		clienteAtendido.compraProcessada(_compraProcessada);
		_compraProcessada = null;
		
		return clienteAtendido;
	}

	/*
	 * @return valor faturado de um caixa
	 * */
	public double valorFaturado() {
		return _valorFaturado;
	}
	
	public double lucroObtido() {
		return _valorFaturado - _custoOperacional;
	}
	
	public double custoOperacional() {
		return _custoOperacional;
	}

}


