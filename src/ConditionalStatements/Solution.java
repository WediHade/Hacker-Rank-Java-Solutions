package ConditionalStatements;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number % 2 == 1) {
            System.out.println("Weird");
        }

        if (number % 2 == 0 ) {
            if (number >= 2 && number <= 5) {
                System.out.println("Small but Not Weird");
            }
            else if(number >= 6 && number <= 20) {
                System.out.println("Medium but Weird");
            }
            else {
                System.out.println("Big but Not Weird");
            }
        }
    }
}
