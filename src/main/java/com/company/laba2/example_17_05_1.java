package com.company.laba2;

import java.util.Scanner;

public class example_17_05_1 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = consoleIn.nextInt();

        int result = number / 1000;

        System.out.print(result);
    }
}