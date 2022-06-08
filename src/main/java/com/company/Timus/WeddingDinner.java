package com.company.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeddingDinner {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(console.readLine());
        String plus = "+one";
        int result = 2;

        for(int i = 0; i < N; i++) {
            result += console.readLine().contains(plus) ? 2 : 1;
        }

        if(result == 13) {
            System.out.print(1400);
        } else {
            System.out.print(result * 100);
        }
    }
}

