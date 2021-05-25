package exercises;

import java.util.stream.Collectors;

public class Streams {

	public static void name() {
		new Collections();
		Collections.hundreds.stream().map(n -> n * 10).collect(Collectors.toList()).forEach(n -> System.out.println(n));
		}
}
