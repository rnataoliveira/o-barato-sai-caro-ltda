package mercado.tests;

import mercado.Compra;
import mercado.Item;

import org.junit.Assert;
import org.junit.Test;

public class ItemTests {

	@Test
	public void itemDeveRetornarUmPreco() {
		Item item = new Item(100);
		
		Assert.assertEquals(100, item.preco(), 0);
	}

}
