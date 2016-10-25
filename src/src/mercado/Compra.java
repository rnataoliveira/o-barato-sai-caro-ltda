package mercado;

import java.util.Stack;
/*
 * A compra é uma pilha de itens
 * */
public class Compra extends Stack<Item> {
	/*
	 * @return valor total da compra
	 * */
	public double valorTotal() {
		double valorTotal = 0;
		
		for (Item i : this) {
			valorTotal += i.preco();
		}
		
		return valorTotal;
	}
}
