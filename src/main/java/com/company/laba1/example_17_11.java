package com.company.laba1;

import java.util.Scanner;
public class example_17_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name of the month: ");
        String name = in.nextLine();
        System.out.print("Input day: ");
        int day = in.nextInt();
        System.out.printf("Name of the month: %s Day: %d " , name, day);
        in.close();
    }
}
