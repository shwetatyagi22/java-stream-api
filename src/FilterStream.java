import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

  //Filter takes a predicate. Predicate is an expression that evaluates to true or false
  public static void main(String[] args) {

    // Filter List and Print

    List<String> countries =
        Arrays.asList("India", "USA", "UAE", "Pakistan");

    countries.stream()
        .map(String::toLowerCase)
        .filter(country -> country.startsWith("u"))
        .forEach(System.out::println);

    //Filter Persons that belongs to London
    List<Person> personList = getPersonList()
    .stream()
        .filter(person -> person.getAddress().contains("London"))
        .collect(Collectors.toList());
    personList.forEach(person -> System.out.println(person.getAddress()));

    //Map - Simply transform from one data type to another

    List<Employee> employees =  personList.stream()
        .map(Employee::map).collect(Collectors.toList());
    employees.forEach(person -> System.out.println(person));
  }

  private static List<Person> getPersonList() {
    List<Person> personList = new ArrayList<Person>();
    personList.add(new Person("John", "111, London", 14));
    personList.add(new Person("John1", "111, London", 14));
    personList.add(new Person("John2", "111, Dubai", 14));
    personList.add(new Person("John3", "111, London", 14));
    return personList;
  }

}
