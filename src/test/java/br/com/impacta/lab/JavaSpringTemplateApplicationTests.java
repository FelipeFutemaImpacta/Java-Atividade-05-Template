package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import br.com.impacta.models.*;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldMontarResumoWithNewProdutoCodigo1() {
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		String resumo = produto.montarResumo(produto);
		
		assertEquals("codigo: 1, descricao: Camisa, valor: 70.0".toUpperCase(), resumo.toUpperCase());
		
	}

	@Test
	public void shouldMontarResumoWithNewProdutoCodigo15() {
		
		Produto produto = new Produto();
		produto.codigo = 15;
		produto.descricao = "Tenis";
		produto.valor = 200.00;
		
		String resumo = produto.montarResumo(produto);
		
		assertEquals("codigo: 15, descricao: Tenis, valor: 200.0".toUpperCase(), resumo.toUpperCase());
		
	}
	
}
