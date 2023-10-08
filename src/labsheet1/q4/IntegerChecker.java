package labsheet1.q4;

import java.util.Scanner;

public class IntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String number = scanner.nextLine();
        try {
            int parsed = Integer.parseInt(number);
            System.out.println("The number " + parsed + " is integer");
            System.out.println("The square is " + parsed * parsed);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " -> The number is not integer");
        } finally {
            scanner.close();
        }
    }
}

