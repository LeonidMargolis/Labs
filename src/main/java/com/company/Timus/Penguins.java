package com.company.Timus;

import java.util.Scanner;

public class Penguins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num_records = Integer.parseInt(scanner.nextLine());
        int Es = 0, Ms = 0, Ls = 0;

        for (int i = 0; i < num_records; i++){
            switch (scanner.nextLine().charAt(0)) {
                case 'E': Es++; break;
                case 'M': Ms++; break;
                case 'L': Ls++; break;
            }
        }
        int max = Math.max(Math.max(Ms, Ls), Es);
        if (max == Ms) System.out.println("Macaroni Penguin");
        else if (max == Ls) System.out.println("Little Penguin");
        else System.out.println("Emperor Penguin");
    }
}


