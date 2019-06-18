package test8;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferences {

	public static void main(String[] args) {
		
		ToIntBiFunction<String, String> function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		myPrint(function.applyAsInt("java8", "JAVA8"));
		
		function = String::compareToIgnoreCase;
		myPrint(function.applyAsInt("java8", "JAVA8"));
		
	}
	
	public static void myPrint(int order) {
		if(order<0)
			System.out.println("Dictionary Order");
		else if(order ==0)
			System.out.println("Same String");
		else
			System.out.println("Reverse Dictionary Order");
	}
	
}
