package simulacao;

import java.util.Random;
import java.util.Stack;

import mercado.Compra;
import mercado.Item;

public class FabricaCompras {
	
	private static final int MIN_ITENS = 5;
	private static final int MAX_ITENS = 40;
	
	private static final double MIN_PRECO = 5;
	private static final double MAX_PRECO = 50;
	
	public static Compra gerarCompraAleatoria() {
		
		Random rnd = new Random();
		int quantidadeItens = rnd.nextInt((MAX_ITENS - MIN_ITENS) + 1) + MIN_ITENS;
		
		Compra compraAleat�ria = new Compra();
		
		for (int i = 0; i < quantidadeItens; i++) {
			double precoAleatorio = gerarPrecoAleatorio(MIN_PRECO, MAX_PRECO);
			
			Item itemAleatorio = new Item(precoAleatorio);
			
			compraAleat�ria.add(itemAleatorio);
		}
		
		return compraAleat�ria;
	}
	
	private static double gerarPrecoAleatorio(double min, double max){
		Random rnd = new Random();
		double preco = min + (max - min) * rnd.nextDouble();
		
		return preco;
	}
}
