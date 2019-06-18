package test5;

public class UsingLocalVariable {
	
	void method(int arg) {		//final int arg
		int localVar = 40;		//final int localVar
		
		// arg = 31;
		// localVar = 41;
		
		FunctionalInterface5 fi = () -> {
			System.out.println("arg: "+ arg);
			System.out.println("localVar:" + localVar);
		};
		fi.method();
		
	}
	
}
