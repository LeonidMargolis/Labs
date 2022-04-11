package com.company.laba2;

import java.util.Scanner;

public class example_17_05 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = consoleIn.nextInt();

        System.out.printf("%.0f", Math.ceil(number / 1000));
    }
}