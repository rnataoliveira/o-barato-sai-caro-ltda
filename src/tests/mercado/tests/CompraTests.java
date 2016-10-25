package mercado.tests;

import mercado.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class CompraTests {

	@Test
	public void valorTotalDeveRetornarASomaDosItems() {
		Compra compra = new Compra();
		compra.add(new Item(100));
		compra.add(new Item(50));
		
		double valorTotal = compra.valorTotal();
		
		assertEquals(150, valorTotal, 0);
	}

}
