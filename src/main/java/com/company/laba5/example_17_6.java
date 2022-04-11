package com.company.laba5;

import java.util.Scanner;

public class example_17_6 {
    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("If you want to enter two numbers at once enter '1', and if you want to enter one number at a time enter '2'");
        int choice = inCmd.nextInt();
        Numbermaxmin compare = new Numbermaxmin();
        if (choice == 1) {
            System.out.println("Enter two numbers to check minimal and maximum value");
            compare.setMinMax(inCmd.nextInt(), inCmd.nextInt());
            compare.consoleOut();
        }
        else if (choice == 2) {
            System.out.println("Enter first number to check it's value");
            compare.setNum(inCmd.nextInt());
            System.out.println("Enter the second number");
            compare.setNum(inCmd.nextInt());
            compare.consoleOut();
        }
        else {
            System.out.println("Seems like inputted value doesn't match the requisites above, try again");
        }
    }
}

