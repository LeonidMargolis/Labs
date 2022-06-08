package com.company.Timus;

import java.util.Scanner;

public class Chocolate_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m, n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        if (m * n % 2 == 0) System.out.println("[:=[first]");
        else System.out.println("[second]=:]");

    }
}

