package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApiDemo {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDateTime now = LocalDateTime.now();

    System.out.println("Today's date: " + today);
    System.out.println("Current date & time: " + now);

    String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    String formattedDateAndTime = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    System.out.println("Formatted date: " + formattedDate);
    System.out.println("Formatted date & time: " + formattedDateAndTime);
  }
}
