package test7;

import java.util.function.Predicate;

public class IsEqual {
	
	public static void main(String[] args) {
		
		Predicate<String> pre;
		
		pre = Predicate.isEqual(null);
		System.out.println("null, null: " + pre.test(null));
		
		pre = Predicate.isEqual("Java8");
		System.out.println("Java8, null: " + pre.test(null));
		
		pre = Predicate.isEqual(null);
		System.out.println("null, Java8: " + pre.test("Java8"));
		
		pre = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: " + pre.test("Java8"));
		
	}

}
