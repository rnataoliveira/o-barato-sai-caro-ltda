package oBaratoSaiCaroLtda;

import java.util.Random;

public class Cliente {
	Pilha produtos = new Pilha();
	
	
	public Cliente() {
		
	}
	
	public double preco() {
		Random gerarPreco  = new Random();
		double preco = 0;
		for (int i = 0; i < quantidade(); i++) {
			double aux1 = gerarPreco.nextDouble();
			int aux2 = gerarPreco.nextInt(46)+5;
			//arrumar linha 19 para jogar os valores na pilha
			preco = aux1+aux2;
			
		}
		return preco; 
	}
	
	public int quantidade() {
		Random gerarQuantide  = new Random();
		int quantidade = gerarQuantide.nextInt(36)+5;
		return quantidade; 
	}
	
	
}
