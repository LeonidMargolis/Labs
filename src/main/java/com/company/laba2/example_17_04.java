package com.company.laba2;

import java.util.Scanner;

public class example_17_04 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = consoleIn.nextInt();

        if (number <= 10 || number >= 5 ) {
            System.out.print("Success");
        } else {
            System.out.print("Fail");
        }
    }
}
