package mercado;

import java.awt.dnd.InvalidDnDOperationException;

/*
 * Representação do cliente
 * */
public class Cliente {
	private Compra _compra;
	private int _tempoDeEspera;
	
	/*
	 * @param uma pessoa possui uma 
	 * compra do tipo Compra
	 * */
	
	public Cliente(Compra compra){
		_compra = compra;
	}
	
	public int tempoEspera() {
		return _tempoDeEspera;
	}
	
	public void esperar(int tempo) {
		_tempoDeEspera += tempo;
	}
	
	/*
	 * @return compra
	 * */
	public Compra compra() {
		return _compra;
	}
	
	public void compraProcessada(Compra compra) {
		if(_compra.size() != 0)
			throw new InvalidDnDOperationException();
		
		_compra = compra;
		
	}
}
