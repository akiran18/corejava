package com.java.javaexercise;

import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double totalCharge = 0;

        if (units <= 100) {
            totalCharge = units * 2.00;
        } else if (units <= 300) {
            totalCharge = 100 * 2.00 + (units - 100) * 3.00;
        } else {
            totalCharge = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            totalCharge += totalCharge * 0.025; // Surcharge of 2.5%
        }

        System.out.println("Total charge to be paid: Rs " + totalCharge);

        scanner.close();
    }
}
