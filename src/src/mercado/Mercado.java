package mercado;

import java.util.List;

public class Mercado {
	private List<Caixa> _caixas;
	
	public Mercado(List<Caixa> caixas){
		_caixas = caixas;
	}
	
	public double faturamentoTotal() {
		double faturamentoTotal = 0;
		for (Caixa caixa : _caixas){
			faturamentoTotal += caixa.valorFaturado();
		}
		return faturamentoTotal;
	}

	public List<Caixa> caixas() {
		return _caixas;
	}

}