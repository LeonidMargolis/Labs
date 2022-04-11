package com.company.laba1;

import java.util.Scanner;
public class example_17_10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input current day of the week: ");
        int cdotw = in.nextInt();
        System.out.print("Input date: ");
        int date = in.nextInt();
        System.out.print("Input name of the month: ");
        String notm = in.nextLine();
        System.out.printf("current day of the week: %d date: %d name of the month: %s  " , cdotw,date, notm);
        in.close();
    }
}
