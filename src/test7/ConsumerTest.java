package test7;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "1");
		consumer.accept("test");	
	
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("test", "2");
	}

}
