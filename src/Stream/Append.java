package Stream;

import java.util.stream.Stream;

public class Append {

	public static void main(String[] args) {
		
		// Append
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		Stream<Integer> appenededStream = Stream.concat(stream, Stream.of(5, 6));
		appenededStream.forEach(p ->System.out.print(p + "\t"));
		System.out.println();
		
		// Prepend
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);
		Stream<Integer> prependedStream = Stream.concat(Stream.of(0), stream2);
		prependedStream.forEach(p ->System.out.print(p + "\t"));

	}

}
