package java8;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    Optional<String> value = Optional.of("Java 8");

    // Safe access
    value.ifPresent(v -> System.out.println("Value is: " + v));

    // Default value
    String result = value.orElse("Default");
    System.out.println("Result: " + result);

    // Empty optional
    Optional<String> empty = Optional.empty();
    System.out.println("Empty present? " + empty.isPresent());
  }
}
