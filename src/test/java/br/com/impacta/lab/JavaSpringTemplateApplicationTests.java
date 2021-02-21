package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveMontarResumoAsStaticMethod() {
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		String resumo = Produto.montarResumo(produto);
		
		assertEquals("codigo: 1, descricao: Camisa, valor: 70.00".toUpperCase(), resumo.toUpperCase());
		
	}

	@Test
	public void shouldMontarResumoWithNewProdutoCodigo15() {
		
		Produto produto = new Produto();
		produto.codigo = 15;
		produto.descricao = "Tenis";
		produto.valor = 200.00;
		
		String resumo = Produto.montarResumo(produto);
		
		assertEquals("codigo: 15, descricao: Tenis, valor: 200.00".toUpperCase(), resumo.toUpperCase());
		
	}
	
}
