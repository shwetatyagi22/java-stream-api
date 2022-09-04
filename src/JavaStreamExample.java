import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class JavaStreamExample {
  public static void main(String[] args) throws Exception {
    // print number 0 to 10
    IntStream
        .range(0,10)
    .forEach(num -> System.out.println(num));

    //print number 0 to 20 and skip first 8 elements
    IntStream
        .range(0, 20)
        .skip(8)
        .forEach(num -> System.out.println(num));

    // print number 0 to 20 inclusive 20
    IntStream
        .rangeClosed(0, 20)
        .forEach(num -> System.out.println(num));

    //sum of first 10 numbers

    int sum = IntStream
        .rangeClosed(0, 10)
        .sum();
    System.out.println(sum);

    //average of integer array

    IntStream.of(new int[]{1,2,3,4,5})
            .average()
                .ifPresent(System.out::println);

    // print even numbers upto 20 using stream
    IntStream.iterate(0, x->x+1)
            .limit(20)
                .filter(x -> x%2 == 0)
                    .forEach(System.out::println);

    //Stream rows from file, sort and add index to the rows

    //Reduce
    int total = IntStream.of(7,12,13,4,5,6)
        .reduce(0, (int x, int y) -> x+y);
    System.out.println(total);

    // Summary Statistics
    IntSummaryStatistics summary = IntStream.of(1,2,3,4,5)
        .summaryStatistics();
    System.out.println(summary);

  }
}
