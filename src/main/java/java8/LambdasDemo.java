package java8;

import java.util.Arrays;
import java.util.List;

public class LambdasDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sas", "Alice", "John", "Philips");

        System.out.println("Using traditional loop:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nUsing lambda expression:");
        names.forEach(n -> System.out.println(n));

        System.out.println("\nUsing method reference:");
        names.forEach(System.out::println);
    }
}