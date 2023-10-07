package DataType;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Hacker Rank";
        //scanner to receive input
        Scanner scan = new Scanner(System.in);

        int i1;
        double d1;
        String s1;

        System.out.println("Enter the integer");
        i1 = scan.nextInt();

        System.out.println("Enter the double");
        d1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter the string");
        s1 = scan.nextLine();

        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + " " + s1);
    }
}
