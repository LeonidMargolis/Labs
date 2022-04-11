package com.company.laba6;

public class Scelet6 {
    public static int[] massivSselka(int [] numbers, int number) {

        int [] new_numbers;
        if (numbers.length < number) new_numbers=numbers;
        else {
            new_numbers = new int[number];
            for (int k = 0; k < number; k++) new_numbers[k] = numbers[k];

        }
        return new_numbers;
    }
}
