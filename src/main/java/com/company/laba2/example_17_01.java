package com.company.laba2;

import  java.util.Scanner;

public class example_17_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inConsole = scanner.nextInt();

        if (inConsole % 3 == 0 ) {
            System.out.println("Число делится на три");
        }
        else {
            System.out.println("Число не делится на три");
        }

    }
}
