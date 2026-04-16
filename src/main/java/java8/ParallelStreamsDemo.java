package java8;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamsDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Sequential stream
    System.out.println("---- Sequential Stream ----");
    numbers.stream().forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));

    // Parallel stream
    System.out.println("\n---- Parallel Stream ----");
    numbers.parallelStream()
        .forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));
  }
}
