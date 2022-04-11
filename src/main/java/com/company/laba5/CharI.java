package com.company.laba5;

public class CharI {
    private char Char1;
    private int int1;

    CharI(int i, char c) {
        this.Char1 = c;
        this.int1 = i;
        int length = (int) (Math.log10(int1) + 1);
        double result = (double) Char1 + (double) int1 * 1 / Math.pow(10, length);
        System.out.println("result1 = " + result + "; Char1 = " + (double) Char1 + "; int = " + length + "\n");
    }

    CharI(double d) {

        char Char1 = (char) d;
        int1 = (int) ((d - (int) d) * 100);
        System.out.println("Char1 = " + Char1 + "; int = " + int1 + "\n");
    }
}