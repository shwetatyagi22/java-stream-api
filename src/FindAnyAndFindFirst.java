import java.util.Arrays;
import java.util.function.Predicate;

public class FindAnyAndFindFirst {
  static final Predicate<Integer> predicate = n -> n < 10 && n > 5;
  public static void main(String[] args) {
    Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    //simply find any element that satifies any condition
    Integer any = Arrays.stream(numbers)
        .filter(predicate)
        .findAny().get();
    System.out.println(any);

    //Find first element that satifies given condition

    Integer first = Arrays.stream(numbers)
        .filter(predicate)
        .findFirst()
        .get();
    System.out.println(first);
  }
  //difference between findAny and findFirst

}
