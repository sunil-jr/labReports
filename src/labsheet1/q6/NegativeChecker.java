package labsheet1.q6;

import java.util.Scanner;

public class NegativeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        try{
            if(num>0){
                System.out.println("The number is: " + num);
            }
            else{
                throw new NegativeValueException("The Number is negative");
            }
        }catch (NegativeValueException e){
            System.out.println(e.getMessage() + " Please enter the positive number");
        }

    }
}
