package com.company.Timus;

import java.util.Scanner;

public class VelosipedeeKode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kod1 = in.next();
        String kod2 = in.next();
        int a, b;
        a = Integer.parseInt(kod1);
        b = Integer.parseInt(kod2);
        if (a % 2 == 1 && b % 2 == 0)
            System.out.println("no");
        else System.out.println("yes");
    }
}
