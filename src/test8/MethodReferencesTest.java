package test8;

import java.util.function.IntBinaryOperator;

public class MethodReferencesTest {
	
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//static
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("test1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;
		System.out.println("test2: " + operator.applyAsInt(1, 2));
		
		System.out.println("-------------------------------------");
		
		//instance
		Calculator cal = new Calculator();
		operator = (x,y) -> cal.instanceMethod(x, y);
		System.out.println("test3: " + operator.applyAsInt(2, 5));
		
		operator = cal::instanceMethod;
		System.out.println("test4: " + operator.applyAsInt(2, 5));
		
	}
	
}
