package mercado;
/*
 * Representação do cliente
 * */
public class Pessoa {
	private Compra _compra;
	/*
	 * @param uma pessoa possui uma 
	 * compra do tipo Compra
	 * */
	public Pessoa(Compra compra){
		_compra = compra;
	}
	/*
	 * @return compra
	 * */
	public Compra compra() {
		return _compra;
	}
}
