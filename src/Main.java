import java.util.Calendar;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calendar currentDate = Calendar.getInstance();
    int year = -1;
    while(year == -1) {
      System.out.println("What is your birth year?");
      year = scanner.nextInt();
      // If year is greater than current year
      if(year > currentDate.get(Calendar.YEAR)) {
        System.out.println("False input.");
        year = -1;
      }
    }

    int month = -1;
    while(month == -1) {
      System.out.println("What is your birth month?");
      month = scanner.nextInt();
      if(month > 12 || month < 0) {
        System.out.println("False input.");
        month = -1;
      }
    }

    int day = -1;
    while(day == -1) {
      System.out.println("What is your birth day?");
      day = scanner.nextInt();
      if(day > 31 || day < 1) {
        System.out.println("False input.");
        day = -1;
      }
    }

    Calendar dateOfBirth = Calendar.getInstance();
    dateOfBirth.set(year, month - 1, day, 0, 0, 0);
    System.out.println("Age: " + getAge(dateOfBirth));

    scanner.close();
  }

  private static int getAge(Calendar dateOfBirth) {
    Calendar currentDate = Calendar.getInstance();
    return currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
  }
}
