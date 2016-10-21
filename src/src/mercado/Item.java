package mercado;

/*
 * Representa o produto de uma compra.
 * */
public class Item {
	private double _preco;
	/*
	 * @param pre�o do produto
	 * */
	public Item(double preco) {
		_preco = preco;
	}
	
	/*
	 * @return pre�o do item
	 * */
	public double preco() {
		return _preco;
	}
}
