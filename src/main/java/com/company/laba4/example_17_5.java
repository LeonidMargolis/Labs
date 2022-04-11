package com.company.laba4;

import java.util.Random;
import java.util.Scanner;

public class example_17_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of lines of the array: ");
        int A = in.nextInt();
        System.out.print("Input the number of columns of the array: ");
        int B = in.nextInt();

        int nums[][] = new int [B][A];
        int numsTarget[][] = new int[A][B];

        System.out.println("\n First massive before being sorted: ");
        Random random = new Random();
        for(int i = 0; i < B; i++){
            for(int j = 0; j< A; j++){
                nums [i][j] = random.nextInt(100);
                System.out.print( + i + " |  " + j + " = " + nums [i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("\n Massive is sorted: ");

        for(int i = 0, n = 0; i <B ; i++, n++){
            for(int k = 0, j=0; k < A; k++, j++){
                numsTarget [j][n] = nums[i][k];
            }
        }

        for(int i=0; i < A; i++){
            for(int j=0; j<B; j++){
                System.out.println( + i + " |  " + j + " = " + numsTarget [i][j] + "|");;
            }
        }
        System.out.println();

    }
}