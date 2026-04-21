package java8;

interface Automobile {
  default void start() {
    System.out.println("Vehicle is starting...");
  }
}

class Car implements Automobile {}

public class DefaultMethodsDemo {
  public static void main(String[] args) {
    Car car = new Car();
    car.start(); // Uses default method
  }
}
