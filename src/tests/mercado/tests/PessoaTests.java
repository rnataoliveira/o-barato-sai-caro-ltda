package mercado.tests;

import static org.junit.Assert.*;
import mercado.Compra;
import mercado.Item;

import org.junit.Test;

public class PessoaTests {

	@Test
	public void pessoaDeveRetornarUmaCompraDoTipoCompra() {
		Compra compra = new Compra();
		compra.add(new Item(100));
		compra.add(new Item(100));
		compra.add(new Item(100));
		
		assertEquals(300, compra.valorTotal(),0);
		
	}

}
