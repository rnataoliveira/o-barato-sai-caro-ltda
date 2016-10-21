package mercado;

import java.util.Stack;

public class Compra extends Stack<Item> {
	
	public double valorTotal() {
		double valorTotal = 0;
		for (Item i : this){
			valorTotal += i.preco();
		}
		return valorTotal;
	}
}
