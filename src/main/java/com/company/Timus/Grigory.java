package com.company.Timus;

import java.util.Scanner;

public class Grigory {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = 240;
        int c;
        c = 12 - a;
        if (b > c * 45)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
