package ArthmeticOperators;

import java.util.Scanner;

public class Solution {

    public static double totalCost(double mealCost, int tipPercentage, int taxPercentage) {

        //create a function to calculate the total cost of a meal
        double mealPrice;
        double tip = (mealCost / 100) * tipPercentage;
        double tax = ( (double)taxPercentage / 100) * mealCost;

        mealPrice = mealCost + tip + tax;

        return mealPrice;
    }

    public static void main(String[] args) {

        //input the meal cost and tip, tax percentage
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cost of the meal");
        double mealCost = scan.nextDouble();

        System.out.println("Enter the tip percentage");
        int tip = scan.nextInt();

        System.out.println("Enter the tax percentage");
        int tax = scan.nextInt();

        //method call
        double result = totalCost(mealCost, tip, tax);

        //print out the total cost of the meal
        System.out.println("Total cost of the meal is " + Math.round(result));

    }

}
