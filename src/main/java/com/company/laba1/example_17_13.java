package com.company.laba1;

import java.util.Scanner;

public class example_17_13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Year of birth: ");
        int age = in.nextInt();
        System.out.printf("Age: %d Name: %s " , getAge(age) , name);
    }

    private static int getAge(int year) {
        return 2021 - year;
    }
}