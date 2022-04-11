package com.company.laba8.progect3;


import java.util.Scanner;

public class example_17_3 {
    static int [] massiv ;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0;
        System.out.print("Введите целое число ");
        do {
            x = scanner.nextInt();
        }while (!( x > 0));
        massiv = new int[x];
        i(x - 1);
        System.out.println(vevod(x - 1));
    }
    public static int []i(int x){
        if (x == 0){

            massiv[x]= scanner.nextInt();
            return massiv;
        }
        i(x - 1);
        massiv [x] = scanner.nextInt();
        return massiv;
    }
    public static String vevod(int x){
        if (x == 0){
            return "" + massiv[x] ;
        }
        return vevod (x - 1) + " " + massiv [x] ;
    }
}
