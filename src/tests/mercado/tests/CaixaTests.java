package mercado.tests;

import static org.junit.Assert.*;
import mercado.Caixa;
import mercado.Compra;
import mercado.Item;
import mercado.Cliente;

import org.junit.Test;

public class CaixaTests {

	@Test
	public void tempoDeAtendimentoDeveSerIgualAQuantidadeDeItemsDaCompra() {
		Caixa caixa = new Caixa(300);
		
		Compra compra = new Compra();
		compra.add(new Item(100));
		compra.add(new Item(50));
		compra.add(new Item(100));
		
		Cliente pessoa = new Cliente(compra);
		
		int tempoAtendimento = caixa.atender(pessoa);
		
	    assertEquals(3, tempoAtendimento);
	}
	
	@Test
	public void valorFaturadoDeveSerASomaDoValorDeCadaCompraAtendidaMenosCusto() {
		Caixa caixa = new Caixa(100);
		
		Compra compra = new Compra();
		compra.add(new Item(100));
		Cliente cliente = new Cliente(compra);
		
		caixa.atender(cliente);
		
		Compra compra2 = new Compra();
		compra2.add(new Item(50));
		Cliente cliente2 = new Cliente(compra2);
		
		caixa.atender(cliente2);
		
		Compra compra3 = new Compra();
		compra3.add(new Item(100));
		Cliente cliente3 = new Cliente(compra3);
		
		caixa.atender(cliente3);
		
		assertEquals(150, caixa.valorFaturado(), 0);
	}

}
