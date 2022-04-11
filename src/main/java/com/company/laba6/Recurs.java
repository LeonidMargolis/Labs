package com.company.laba6;

public class Recurs {
    public static int recursion(int num){
        int result;

        if(num == 1) return num;
        if(num == 2) return num;

        result = recursion(num -2) * num;
        return result;
    }

    public static int notRecursion(int num){

        if(num == 1) return num;
        if(num == 2) return num;

        if (num % 2 == 0){
            int mult = 2;
            int result = 1;
            do {
                result = result * mult;
                mult += 2;
            } while (mult <= num);
            return result;
        }
        else {
            int mult = 1;
            int result = 1;
            do{
                result = result * mult;
                mult += 2;
            } while (mult <= num);
            return result;
        }
    }
}
