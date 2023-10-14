package Strings;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Enter the String bellow:");
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        //String words = "2";
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            if (i % 2 == 0) {
                even.append(words.charAt(i));
            }
            else {
                odd.append(words.charAt(i));
            }
        }
        System.out.print(even + " " + odd);
    }
}
