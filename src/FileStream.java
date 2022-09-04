import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {
  public static void main(String[] args) throws IOException {
    Stream<String> file =      Files.lines(Paths.get("/Users/shweta.tyagi/Workspace/Git-Workspace/Java Streams/src/Test.txt"));
    file.map(row-> String.format("%s %s", row, "Test"))
        .forEach(System.out::println);
    file.close();
    //Stream rows from file, filter data
    Stream<String> file1 = Files.lines(Paths.get("/Users/shweta.tyagi/Workspace/Git-Workspace/Java Streams/src/TestData.csv"));
    file1
        .skip(1)
        .map(row -> row.split(","))
        .filter(row -> row.length > 2)
        .filter(row -> !row[2].contains("5"))
        .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

  }
}
