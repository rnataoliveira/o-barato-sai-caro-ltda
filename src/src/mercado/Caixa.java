package mercado;
/*
 * Representa��o de um caixa em um supermercado
 * */
public class Caixa {
	
	private double _valorFaturado;
	private double _custoOperacional;
	
	public static final double CUSTO_OPERACIONAL = 300;
	
	public Caixa(double custoOperacional) {
		_custoOperacional = custoOperacional;
	}
	
	/*
	 * @param valor que um caixa fatura
	 * @param pre�o fixo do custo operacional por caixa
	 * */
	
	/*
	 * @return tempo de dura��o de um atendimento
	 * Tempo de atendimento = quantidade de itens de uma compra.
	 * */
	public int atender(Pessoa pessoa){
		int tempoAtendimento = 0;
		for(Item i : pessoa.compra()) {
			_valorFaturado += i.preco();
			
			tempoAtendimento += 1;
		}
		return tempoAtendimento;
	}

	/*
	 * @return valor faturado de um caixa
	 * */
	public double valorFaturado() {
		return _valorFaturado - _custoOperacional;
	}

}


