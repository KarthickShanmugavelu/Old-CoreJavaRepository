package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsHandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(1,10).forEach(System.out::print);
		
		System.out.println();
		
		IntStream.range(1,10).skip(5).forEach(x->System.out.print(x));
		
		System.out.println();
		
		System.out.println(IntStream.range(1,10).sum());
		
		Stream.of("Zeff","Bob","Jim","Adam").sorted().findFirst().ifPresent(System.out::print);

	}

}
