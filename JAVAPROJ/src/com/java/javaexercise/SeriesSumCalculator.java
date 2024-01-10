package com.java.javaexercise;

import java.util.Scanner;

public class SeriesSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of p: ");
        double p = scanner.nextDouble();

        if (p < 2.5) {
            System.out.println("Invalid input. Please enter a value greater than or equal to 2.5.");
        } else {
            double sum = 0;

            for (double i = 2.5; i <= p; i += 2) {
                sum += i;
            }

            System.out.println("Sum of the series up to term " + p + ": " + sum);
        }        scanner.close();
    }
}
