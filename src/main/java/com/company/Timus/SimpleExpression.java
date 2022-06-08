package com.company.Timus;
import java.util.Scanner;
import java.util.Arrays;
public class SimpleExpression {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            int [] numbers = {number1, number2, number3};
            Arrays.sort(numbers);
            int a = numbers[0] - numbers[1] - numbers[2];
            int b = numbers[0] - numbers[1] * numbers[2];
            System.out.println(Math.min(a, b));
        }
    }
