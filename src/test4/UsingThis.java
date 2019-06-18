package test4;

public class UsingThis {

	public int field = 10;
	
	class Inner{
		int field = 20;
		
		void method() {
			FunctionalInterface4 fi = () -> {
				System.out.println(UsingThis.this.field);
				System.out.println(field);
				System.out.println(this.field);
			};
			fi.method();
			
		}
	}
	
}
