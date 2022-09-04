import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingWithStream {
  public static void main(String[] args) {

    // Stream  from array and filter
    Integer[] arr = {20, 90, 0, 2, 3};
    Arrays.stream(arr)
        .filter(x -> x < 20)
        .sorted()
        .forEach(x -> System.out.println(x));

    //Get minimum number using stream
    List<Integer> list = List.of(2,34,56,788,1,6,0);
    int min = list.stream()
        .min(Comparator.naturalOrder()).get();
    System.out.println(min);

    //Get the maximum number using stream
    List<Integer> list1 = List.of(2,34,56,788,1,6,0);
    int max = list.stream()
        .max(Comparator.naturalOrder()).get();
    System.out.println(max);

    //Get the second largest number using stream
    List<Integer> list2 = List.of(2,34,56,788,1,6,0);
    int max2 = list.stream().sorted(Comparator.reverseOrder()).skip(1)
        .findFirst().get();
    System.out.println(max2);

    //Stream.of Examples
    //Sort the list
    Stream.of("hello", "world", "hello world", "test")
        .sorted()
        .forEach(s -> System.out.println(s));

    //Sort the list and print first element
    Stream.of("xlsx", "class", "copyright")
        .sorted()
        .findFirst()
        .ifPresent(System.out::println);
  }
}
