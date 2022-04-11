package com.company.Timus;

import java.util.Scanner;

public class GarriandLarri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = a + b -1;
        System.out.printf("%d %d", c - a, c - b);
    }
}
