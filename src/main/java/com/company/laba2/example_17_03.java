package com.company.laba2;

import java.util.Scanner;

public class example_17_03 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = consoleIn.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.print("Число попадает под условие!");
        } else {
            System.out.print("Число попадает под условие!");
        }
    }
}
