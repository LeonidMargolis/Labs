package com.company.Timus;

import java.util.Scanner;

public class RuinsoftheTitansHiddenEntrance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wall_sectors = scanner.nextInt();
        int [] powers = new int[wall_sectors];
        int max_power_sum = 0;
        int mid_segment_num = 0;

        for (int i = 0; i < wall_sectors; i++){
            powers[i] = scanner.nextInt();
        }

        for (int i = 1; i < powers.length-1; i++){
            if (max_power_sum < (powers[i-1] + powers[i] + powers[i+1])){
                max_power_sum = powers[i-1] + powers[i] + powers[i+1];
                mid_segment_num = i+1;
            }
        }
        System.out.printf("%d %d", max_power_sum, mid_segment_num);
    }

}
