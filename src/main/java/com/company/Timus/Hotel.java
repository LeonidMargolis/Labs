package com.company.Timus;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [][] matrix = new int[number][number];

        for(int i = 0; i < number; i++) matrix[i][number-1] = (i+1)*(i+2)/2;

        for (int i = 0; i < number-1; i++) {
            for (int k = number - 2; k >= i; k--) matrix[i][k] = matrix[i][k+1] + number - k + i-1;
        }
        for (int i = 1; i < number; i++){
            for (int k = i-1; k>=0; k--) matrix[i][k] = matrix[i][k+1] + number + k - i;
        }
        for (int i = 0; i < number; i++){
            for (int k = 0; k < number; k++) System.out.print(matrix[i][k] + " ");
            System.out.println();
        }
    }
}

