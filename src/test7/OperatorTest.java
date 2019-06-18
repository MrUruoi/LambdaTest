package test7;

import java.util.function.IntBinaryOperator;

public class OperatorTest {
	
	private static int[] scores = {92, 99, 90};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(result, score);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		//max
		int max = maxOrMin(
				(a, b) -> {
					if(a>=b) return a;
					else return b;
				}
		);
		System.out.println("max: " + max);
		
		//min
		int min = maxOrMin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
				}
		);
		System.out.println("min: "+ min);
	}
	
	
}
