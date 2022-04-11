package com.company.Timus;

import java.util.Scanner;

public class PovorotNaMegu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String povoroVNikuda1 = in.nextLine();
        String povoroVNikuda2 = in.nextLine();
        String[] povoroVNikuda1_M = povoroVNikuda1.split(" ");
        String[] povoroVNikuda2_M = povoroVNikuda2.split(" ");
        int [] massivMahin;
        int cars_min, minuts, r = 0;
        minuts = Integer.parseInt(povoroVNikuda1_M[1]);
        massivMahin = new int[minuts];
        cars_min = Integer.parseInt(povoroVNikuda1_M[0]);
        for (int i=0; i < minuts; i++){
            massivMahin [i] = Integer.parseInt(povoroVNikuda2_M[i]) + r;
            r = Math.max(0,massivMahin[i]-cars_min);
        }
        if (massivMahin[massivMahin.length - 1] > cars_min) System.out.println(massivMahin[massivMahin.length - 1] - cars_min);
        else System.out.println(0);
    }
}
