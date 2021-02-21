package br.com.impacta.lab;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme as duas tabelas (produto e tipo de pagamento) em duas classes separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  
		 *  Tabela de produto
		 *  
		 *  CodigoProduto	descrição do Produto		Valor do Produto
		 * 	1				Camisa						70.00
		 * 	2				Shorts						57.50
		 * 	3				Meia						9.99
		 * 	4				Toca						35.00
		 * 	5				Luvas						19.50
		 * 
		 * -----------------------------------------------------------------
		 * 
		 * Tabela de condição de pagamento
		 * 
		 * 	CodTipoPagamento		descrição da condição de pagamento
		 * 	1						A vista no dinheiro com 10% de desconto
		 * 	2						A vista no cartão de crédito  com 5% de desconto
		 * 	3						Em duas parcelas sem nenhum desconto
		 * 	4						Em três vezes com 10% de juros
		 * 
		 * 
		 * 
		 * Em seguida crie um método estatico na classe Produto onde o mesmo tenho o nome de montarResumo
		 * Exemplo de um método estatico:
		 * public static String falar(String palavra) {
		 * 	System.out.println(palavra);
		 * }
		 * 
		 * receba como parametro um Produto e devolva uma String
		 * 
		 * O retorno deve ser no seguinte formato
		 * 
		 * "codigo: <produto.codigo>, descricao: <produto.descricao>, valor: <produto.valor>"
		 * 
		 * 
		 */
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		String resumo = Produto.montarResumo(produto);
		
		System.out.println(resumo);
	}

}
