package test7;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () ->{
			int num = (int)(Math.random()*6) + 1;
			return num;
		};
		int num1 = supplier.get();
		System.out.println(num1);
		
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6) + 1;
			return num;
		};
		int num2 = intSupplier.getAsInt();
		System.out.println(num2);
		
	}

}
