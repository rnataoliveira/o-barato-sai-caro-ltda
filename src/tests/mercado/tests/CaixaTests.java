package mercado.tests;

import static org.junit.Assert.*;
import mercado.Caixa;
import mercado.Compra;
import mercado.Item;
import mercado.Pessoa;

import org.junit.Test;

public class CaixaTests {

	@Test
	public void tempoDeAtendimentoDeveSerIgualAQuantidadeDeItemsDaCompra() {
		Caixa caixa = new Caixa(300);
		
		Compra compra = new Compra();
		compra.add(new Item(100));
		compra.add(new Item(50));
		compra.add(new Item(100));
		
		Pessoa pessoa = new Pessoa(compra);
		
		int tempoAtendimento = caixa.atender(pessoa);
		
	    assertEquals(3, tempoAtendimento);
	}
	
	@Test
	public void valorFaturadoDeveSerASomaDoValorDeCadaCompraAtendidaMenosCusto() {
		Caixa caixa = new Caixa(100);
		
		Compra compra = new Compra();
		compra.add(new Item(100));
		Pessoa cliente = new Pessoa(compra);
		
		caixa.atender(cliente);
		
		Compra compra2 = new Compra();
		compra2.add(new Item(50));
		Pessoa cliente2 = new Pessoa(compra2);
		
		caixa.atender(cliente2);
		
		Compra compra3 = new Compra();
		compra3.add(new Item(100));
		Pessoa cliente3 = new Pessoa(compra3);
		
		caixa.atender(cliente3);
		
		assertEquals(150, caixa.valorFaturado(), 0);
	}

}
