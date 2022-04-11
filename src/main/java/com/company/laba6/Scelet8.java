package com.company.laba6;

public class Scelet8 {
    public static int massivSceleta8(int[] massivInt) {
        int result=0;
        for(int x: massivInt) result += x;
        return result/massivInt.length;
    }
}