package mercado;

public class Pessoa {
	private Compra _compra;
	
	public Pessoa(Compra compra){
		_compra = compra;
	}
	
	public Compra compra() {
		return _compra;
	}
}
