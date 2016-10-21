package mercado;

/*
 * Representa o produto de uma compra.
 * */
public class Item {
	private double _preco;
	/*
	 * @param preço do produto
	 * */
	public Item(double preco) {
		_preco = preco;
	}
	
	/*
	 * @return preço do item
	 * */
	public double preco() {
		return _preco;
	}
}
