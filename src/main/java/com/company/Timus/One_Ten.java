package com.company.Timus;

import java.util.Scanner;

public class One_Ten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int str_count = scanner.nextInt();
        long [] post = new long[str_count];

        for (int i = 0; i < str_count; i++) post[i] = scanner.nextLong();

        for (long position : post) {
            if (isTriangular(position - 1)) System.out.println(1);
            else System.out.println(0);
        }
    }
    private static boolean isTriangular(long position){
        if (position == 0) return true;
        return Math.ceil(Math.sqrt(8 * (position) + 1)) / Math.sqrt(8 * (position) + 1) == 1;
    }
}

