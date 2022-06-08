package com.company.Timus;

import java.util.Scanner;

public class Donald_Postman {
    private static int position = 1;
    private final static String LOCKER1 = "APOR";
    private final static String LOCKER2 = "BMS";
    private final static String LOCKER3 = "DGJKTW";
    private static int steps = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int letters_count = scanner.nextInt();
        String [] names = new String[letters_count];

        for (int i = 0; i < letters_count; i++) names[i] = scanner.next();

        for (int i = 0; i < letters_count; i++){
            if (LOCKER1.contains(names[i].charAt(0) + "")){
                if (position != 1) {steps += (position-1);}
                position = 1;
            }
            else if (LOCKER2.contains(names[i].charAt(0) + "")){
                if (position != 2) {steps++;}
                position = 2;
            }
            else if (LOCKER3.contains(names[i].charAt(0) + "")){
                if (position != 3) {steps += (3 - position);}
                position = 3;
            }
        }
        System.out.println(steps);
    }

}

