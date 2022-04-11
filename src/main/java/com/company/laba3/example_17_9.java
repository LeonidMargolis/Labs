package com.company.laba3;

import java.util.Random;
import java.util.Scanner;

public class example_17_9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();

        System.out.println("Размер массива равен " + Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        int minElement = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < minElement) {
                minElement = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == minElement) {
                System.out.printf("\nМинимальный элемент nums[%d] = %d%s", i, nums[i], "\n");
            }
        }

    }
}