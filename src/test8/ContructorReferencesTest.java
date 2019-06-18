package test8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ContructorReferencesTest {

	public static void main(String[] args) {
		
		Function<String, Member> fun1 = Member::new;
		Member member1 = fun1.apply("testId");
		
		BiFunction<String, String, Member> fun2 = Member::new;
		Member member2 = fun2.apply("testName", "testId");
	}
	
}
