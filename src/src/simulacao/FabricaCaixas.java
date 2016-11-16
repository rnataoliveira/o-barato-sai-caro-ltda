package simulacao;

import java.util.ArrayList;

import mercado.Caixa;

public class FabricaCaixas {
	
	public static ArrayList<Caixa> gerarCaixas(int numeroCaixas) {
		
		ArrayList<Caixa> listaGerada = new ArrayList<Caixa>();
		
		for (int i = 0; i < numeroCaixas; i++) {
			
			Caixa novoCaixa = new Caixa(Caixa.CUSTO_OPERACIONAL);
			listaGerada.add(novoCaixa);
		}
		
		return listaGerada;
	}
}
