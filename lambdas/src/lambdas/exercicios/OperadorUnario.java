package lambdas.exercicios;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		
		System.out.println(maisDois.apply(5));
	}

}
