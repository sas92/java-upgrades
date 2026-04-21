package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Sas", "Alice", "John", "Philip", "Harry", "Sas");

    // Grouping
    Map<String, Long> frequency =
        names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
    System.out.println("Name frequency: " + frequency);

    // Joining
    String joined = names.stream().collect(Collectors.joining(", "));
    // String joined = String.join(", ", names);     // Can also be replaced with
    System.out.println("Joined names: " + joined);

    // Partitioning example #1
    Map<Boolean, List<String>> partition =
        names.stream().collect(Collectors.partitioningBy(name -> name.startsWith("S")));
    System.out.println("Does start with 'S'? : " + partition);

    // Partitioning example #2
    Map<Boolean, List<Integer>> evenAndOdd =
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .collect(Collectors.partitioningBy(num -> num % 2 == 0));
    System.out.println("Even numbers: " + evenAndOdd.get(true));
    System.out.println("Odd numbers: " + evenAndOdd.get(false));
  }
}
