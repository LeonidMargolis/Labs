package com.company.laba6;

import java.util.Arrays;

public class Scelet10 {
    public static int [] massivSceleta10(int...massivInt ){
        Arrays.sort(massivInt);
        int[] minMax = new int[2];
        minMax[0] = massivInt[0];
        minMax[1] = massivInt[massivInt.length-1];
        return minMax;
    }
}
