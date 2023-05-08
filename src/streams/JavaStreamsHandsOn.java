package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsHandsOn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		IntStream.range(1,10).forEach(System.out::print);
		
		System.out.println();
		
		IntStream.range(1,10).skip(5).forEach(x->System.out.print(x));
		
		System.out.println();
		
		System.out.println(IntStream.range(1,10).sum());
		
		Stream.of("Zeff","Bob","Jim","Adam").sorted().findFirst().ifPresent(System.out::print);
		
		String[] name = {"Zeff","Bob","Jim","Adam","Jammy","John","Joseph"};
		Arrays.stream(name).filter(x->x.startsWith("J")).sorted().forEach(System.out::println);
		
		//avg of sqaures
		int[] num = {1,2,3,4,5};
		Arrays.stream(num).map(x->x*x).average().ifPresent(System.out::println);
		
		List<String> strings=Arrays.asList("","Jim","","","Tammy","","Bob","Shawn");
		long count=strings.stream().filter(x->x.isEmpty()).count();
		System.out.println("Count of empty strings: "+count);
		List<String> strings2=Arrays.asList("Thamizh","Pugazh","Dinesh","Karthick","Kathir");
		strings2.stream().limit(3).forEach(System.out::println);
		
		//sorting
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		//parallel stream
		List<String> strings3=Arrays.asList("","Jim","","","Tammy","","Bob","Shawn");
		long count2=strings3.stream().filter(x->x.isEmpty()).count();
		System.out.println("Count of empty strings: "+count2);
		
		//Collectors
		List<String> stringList = Arrays.asList("Ram","Rithish","Ravi","Guna","Senthil","Anbu","Rajan");
		List<String> filteredStringList = stringList.stream().filter(x->x.startsWith("R")).collect(Collectors.toList());
		System.out.println(filteredStringList);
		String filteredStringList2=stringList.stream().filter(x->(x.length()==4)).collect(Collectors.joining(", "));
		System.out.println(filteredStringList2);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		IntSummaryStatistics obj = numbers.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("Maximum: "+obj.getMax());
		System.out.println("Minimum: "+obj.getMin());
		
		List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer b= numbers2.get(0)*numbers2.get(1);
		int d=numbers2.get(1).intValue();
		
		List<String> people = Arrays.asList("amanda","muthu","aaron","nallasivam","adam","arunachalam");
	    people.stream().map(String::toUpperCase).filter(x->x.startsWith("A")).forEach(x->System.out.print(x+" "));
	    
	    System.out.println();
	    Stream<String> bands = Files.lines(Paths.get("bands.txt"));
	    bands.sorted().filter(x->x.length()>13).forEach(x->System.out.print(x+" "));
	    bands.close();
	    
	    System.out.println();
	    Stream<String> data = Files.lines(Paths.get("data.txt"));
	    data.map(x->x.split(",")).filter(x->x.length==1).forEach(x->System.out.print(x[0]));
	    
	    System.out.println();
	    Stream<String> ds = Files.lines(Paths.get("data.txt"));
	    long count3 = ds.map(x->x.split(",")).filter(x->x.length>=3).filter(x-> Integer.parseInt(x[1])>15).count();
	    System.out.println(count);

	}

}
