import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> list = List.of(11,22,3,3,4,5,5);
    list.stream()
        .distinct()
        .forEach(System.out::println);

    //remove duplicates using collector method
    list.stream()
        .collect(Collectors.toSet())
        .forEach(System.out::println);

  }
}
