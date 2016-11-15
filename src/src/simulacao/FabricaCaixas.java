package simulacao;

import java.util.ArrayList;
import java.util.List;

import mercado.Caixa;

public class FabricaCaixas {
	
	public static List<Caixa> gerarCaixas(int numeroCaixas) {
		List<Caixa> listaGerada = new ArrayList<Caixa>();
		for (int i = 0; i < numeroCaixas; i++) {
			Caixa novoCaixa = new Caixa(Caixa.CUSTO_OPERACIONAL);
			listaGerada.add(novoCaixa);
		}
		
		return listaGerada;
	}
}
