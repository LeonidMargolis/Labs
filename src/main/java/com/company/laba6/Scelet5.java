package com.company.laba6;

public class Scelet5 {

    public static int recursion(int number){
        if(number == 1) return number;
        int result;
        result = recursion(number - 1) + number * number;
        return result;

    }
    public static int notRecursion(int number){
        int result = 0;
        for(int k = 1; k <= number; k++) result += k*k;
        return result;

    }
}
