package simulacao;

import java.util.Random;
import mercado.Compra;
import mercado.Item;

public class FabricaCompras {
	/*
	 * @param n�mero m�nimo de itens
	 * @param n�mero m�ximo de itens
	 * */
	private static final int MIN_ITENS = 5;
	private static final int MAX_ITENS = 40;
	
	/*
	 * @param pre�o m�nimo
	 * @param pre�o m�ximo
	 * */
	private static final double MIN_PRECO = 5;
	private static final double MAX_PRECO = 50;
	
	/*
	 * @return uma compra aleat�ria
	 * */
	public static Compra gerarCompraAleatoria() {
		
		Random rnd = new Random();
		int quantidadeItens = rnd.nextInt((MAX_ITENS - MIN_ITENS) + 1) + MIN_ITENS;
		
		Compra compraAleatoria = new Compra();
		
		for (int i = 0; i < quantidadeItens; i++) {
			
			double precoAleatorio = gerarPrecoAleatorio(MIN_PRECO, MAX_PRECO);
			
			Item itemAleatorio = new Item(precoAleatorio);
			
			compraAleatoria.add(itemAleatorio);
		}
		return compraAleatoria;
	}
	
	/*
	 * @return um pre�o aleat�rio
	 * */
	private static double gerarPrecoAleatorio(double min, double max){
		Random rnd = new Random();
		
		double preco = min + (max - min) * rnd.nextDouble();
		
		return preco;
	}
}
