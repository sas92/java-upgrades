package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    List<Integer> result =
        numbers.stream()
            .filter(n -> n % 2 == 0) // Filter even numbers
            .map(n -> n * n) // Square each number
            .collect(Collectors.toList()); // Collect as a list
    //      .toList();                         // Can also be replaced with

    System.out.println("Squares of even numbers: " + result);
  }
}
