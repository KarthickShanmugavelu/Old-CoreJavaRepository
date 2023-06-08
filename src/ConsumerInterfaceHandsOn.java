import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConsumerInterfaceHandsOn {
	
	public static void main(String[] args) {
		System.out.println("================Consumer==================");
		Consumer<Integer> consumer = (t)->System.out.println("Value: "+t);
		Stream.of(1,2,3,4).forEach(consumer);
		consumer.accept(99);
		System.out.println("============================================");
		System.out.println();
		System.out.println("================Printing only even using Predicate==================");
		Predicate<Integer> predicate = t -> t%2==0;
		Stream.of(1,2,3,4,5,6,7,8).filter(predicate).forEach(consumer);
		System.out.println("============================================");
		System.out.println("================Supplier==================");
		Supplier<String> supplier = () -> "No data satisfying current condition is found";
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(supplier));
		System.out.println("============================================");
	}

}
