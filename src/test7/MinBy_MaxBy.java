package test7;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class MinBy_MaxBy {
	
	public static void main(String[] args) {
		
		BinaryOperator<Fruit> bio;
		Fruit fruit;
		
		bio = BinaryOperator.minBy( (f1, f2) -> Integer.compare(f1.price, f2.price) );
		fruit = bio.apply(
					new Fruit("strawberry", 6000),
					new Fruit("waterMelon", 7000)
				);
		
		System.out.println(fruit.name);
		
		bio = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.price, f2.price) );
		fruit = bio.apply(
					new Fruit("strawberry", 6000),
					new Fruit("waterMelon", 7000)
				);
		
		System.out.println(fruit.name);
		
	}
	
}

class Fruit{
	
	String name;
	int price;
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
}
