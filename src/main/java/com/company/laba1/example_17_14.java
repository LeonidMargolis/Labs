package com.company.laba1;

import java.util.Scanner;

public class example_17_14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.println("Year of birth: " + getAge(age));
    }

    private static int getAge(int age) {
        return 2021 - age;
    }
}