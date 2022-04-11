package com.company.laba6;

import java.util.Arrays;

public class Meat3 {
    public static int numMax(int...nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
    public static  int numMin(int...nums){
        Arrays.sort(nums);
        return nums[0];
    }
    public static int numMid(int...nums){
        int sum = 0;
        for(int x : nums ){
            sum += x;
        }
        return sum / nums.length;
    }
}
