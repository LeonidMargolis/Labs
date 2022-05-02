package com.company.laba10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example_17_1_1 {
    public static void main(String[] args) {

        int polog_sum = 0;
        int polog_length = 0;
        int sred_num = 0;

        Scanner scan = new Scanner(System.in);
        int[] nums = new int [10];
        try {
            for (int i = 0; i < nums.length; i++) nums[i] = scan.nextInt();

            for (int x : nums) {
                if (x > 0) {
                    polog_sum += x;
                    polog_length++;
                }
            }

            sred_num = polog_sum / polog_length;
        } catch (InputMismatchException e){
            System.out.println("Вы ввели другой тип данных отличный от числа");
        } catch (ArithmeticException e){
            System.out.println("Нет положительных элемент в массиве");
        }
        System.out.println("Среднее значение положительных чисел в массиве равно: " + sred_num);
    }

}
