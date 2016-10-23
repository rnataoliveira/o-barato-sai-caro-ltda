package mercado;

public class Caixa {
	double valorFaturado;
	private static final double CUSTO_OPERACIONAL = 300;
	
	public int atender(Pessoa pessoa){
		int tempoAtendimento = 0;
		for(Item i : pessoa.compra()){
			valorFaturado += i.preco();
			tempoAtendimento += 1;
		}
		double valorFaturadoFinal = valorFaturado - CUSTO_OPERACIONAL;
		return tempoAtendimento;
	}
}
