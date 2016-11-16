package mercado.tests;

import java.util.ArrayList;
import java.util.List;

import mercado.Caixa;
import mercado.Compra;
import mercado.Item;
import mercado.Mercado;
import mercado.Cliente;

import org.junit.Assert;
import org.junit.Test;

public class MercadoTests {

	@Test
	public void mercadoDeverRetornarOFaturamentoTotal() {
		List<Caixa> caixas = new ArrayList<Caixa>(300);
		Caixa caixa = new Caixa(0);
		caixas.add(caixa);
		Compra compra = new Compra();
		compra.add(new Item(100));
		compra.add(new Item(50));
		compra.add(new Item(150));
		compra.add(new Item(200));

		Cliente pessoa = new Cliente(compra);
		caixa.atender(pessoa);
		
		Caixa caixa2 = new Caixa(0); 
		caixas.add(caixa2);
		Compra compra2 = new Compra();
		compra2.add(new Item(100));
		compra2.add(new Item(50));
		compra2.add(new Item(150));
		compra2.add(new Item(200));
		
		Cliente pessoa2 = new Cliente(compra2);
		caixa2.atender(pessoa2);
		
		Mercado mercado = new Mercado(caixas);
		
		Assert.assertEquals(1000, mercado.faturamentoTotal(), 0);
		
	}
	
	@Test
	public void mercadoDeveRetornarUmaListaDeCaixas() {
		List<Caixa> caixas = new ArrayList<Caixa>();
		Caixa caixa1 = new Caixa(300);
		Caixa caixa2 = new Caixa(300);
		Caixa caixa3 = new Caixa(300);
		caixas.add(caixa1);
		caixas.add(caixa2);
		caixas.add(caixa3);
		
		Assert.assertEquals(3, caixas.size());
		
	}

}
