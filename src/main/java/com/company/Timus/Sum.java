package com.company.Timus;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();

        if (N > 0) System.out.println(N*(N+1)/2);
        else {
            int Abs_N = Math.abs(N);
            System.out.println(((Abs_N*(Abs_N+1)/2)-1)*-1);
        }
    }
}

