package com.java.javaexercise;

import java.util.Scanner;

public class CommunityReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        String message = switch (score) {
            case 0, 1, 2, 3 -> "When can we meet you to explain the roles and responsibilities of a resident?";
            case 4, 5, 6, 7 -> "You have taken a step in the right direction!";
            case 8, 9, 10 -> "Thank you for going the extra mile! Would you be interested in training others?";
            default -> "Invalid score. Please enter a score between 0 and 10.";
        };

        System.out.println(message);

        scanner.close();
    }
}

