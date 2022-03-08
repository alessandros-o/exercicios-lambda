package lambdas.exercicios;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		BinaryOperator<Double> precoReal = (preco, desconto) -> {
			Double precoComDesconto = preco * (1 - desconto);
			return precoComDesconto;
		};
		
		UnaryOperator<Double> impostoMunicipal = valor -> 
			valor >= 2500.00 ?  valor + (valor * 0.085) : valor;
			
		UnaryOperator<Double> frete = valor -> 
			valor >= 3000 ? valor + 100.00 : valor + 50.00;
		
		double valorFinal = precoReal.andThen(impostoMunicipal).andThen(frete).apply(p.preco, p.desconto);
		String valorFormatado = String.format("O preço final é R$ %.2f", valorFinal);
		System.out.println(valorFormatado);
		
	}

}
