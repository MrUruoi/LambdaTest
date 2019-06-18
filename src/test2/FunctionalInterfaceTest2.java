package test2;


public class FunctionalInterfaceTest2 {
	
	public static void main(String[] args) {
		FunctionalInterface2 fi;
		
		fi = (x) -> {
			int result = x*2;
			System.out.println(result);
		};
		fi.method(3);
		
		fi = x -> System.out.println(x*2);
		fi.method(3);
		
	}
	
}
