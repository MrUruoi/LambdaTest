package test7;

import java.util.function.IntPredicate;

public class And_Or_Negate {
	
	public static void main(String[] args) {
		
		IntPredicate preA = a -> a%2 == 0;
		
		IntPredicate preB = a -> a%3 == 0;
		
		IntPredicate preAB;
		boolean result;
		
		
		preAB = preA.and(preB);
		result = preAB.test(9);
		System.out.println(result);
		result = preAB.test(6);
		System.out.println(result);
		System.out.println("----------------");
		
		preAB = preA.or(preB);
		result = preAB.test(9);
		System.out.println(result);
		result = preAB.test(6);
		System.out.println(result);
		System.out.println("----------------");
		
		preAB = preA.negate();
		result = preAB.test(9);
		System.out.println(result);
		result = preAB.test(6);
		System.out.println(result);
		System.out.println("----------------");
	}
	
}
