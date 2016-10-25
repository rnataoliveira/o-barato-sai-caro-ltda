package simulacao.tests;

import static org.junit.Assert.*;
import mercado.Compra;
import mercado.Item;

import org.junit.Test;

import simulacao.FabricaCompras;

public class FabricaComprasTests {

	@Test
	public void gerarCompraAleatoriaDeveRetonarCompraComNoMax40ItensEMin5() {
		
		Compra compraAleatoria = FabricaCompras.gerarCompraAleatoria();
		
		assertTrue(compraAleatoria.size() <= 40);
		assertTrue(compraAleatoria.size() >= 5);
	}
	
	@Test
	public void precoDosItensDaCompraDeveSerNoMax50EMin5(){
		Compra compraAleatoria = FabricaCompras.gerarCompraAleatoria();
		
		for (Item item : compraAleatoria) {
			assertTrue(item.preco() <= 50);
			assertTrue(item.preco() >= 5);
		}
	}

}
