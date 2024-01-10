package com.java.javaexercise;

import java.util.Scanner;

public class LeafCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSamplesCollected = 0;
        int rounds = 0;

        System.out.println("Asif has gone for a walk in the park.");

        while (true) {
            System.out.print("Enter the number of leaf samples collected during this round (or 0 to finish): ");
            int samplesInRound = scanner.nextInt();

            if (samplesInRound == 0) {
                break;
            }

            totalSamplesCollected += samplesInRound;
            rounds++;
            
            if (totalSamplesCollected >= 30) {
                break;
            }
        }

        System.out.println("\nAsif completed " + rounds + " rounds in the park.");
        System.out.println("Total leaf samples collected: " + totalSamplesCollected);

        scanner.close();
    }
}

