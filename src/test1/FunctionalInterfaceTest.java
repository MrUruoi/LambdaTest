package test1;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		
		FunctionalInterface1 fi1;
		FunctionalInterface1 fi2;
		
		fi1 = new FunctionalInterface1() {
			
			@Override
			public void method() {
				System.out.println("method call0");
			}
		};
		fi1.method();
		
		
		fi2 = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		fi2.method();
		
		fi2 = () -> {								
			System.out.println("method call2");	
		};											
		fi2.method();
		
		fi2 = () -> System.out.println("method call3");
		fi2.method();
		
	}

}
