package com.company.Timus;

import java.util.Scanner;

public class Fourlittledevils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();

        if ((nums*(nums+1)/2) % 2 == 0) System.out.println("black");
        else System.out.println("grimy");
    }
}