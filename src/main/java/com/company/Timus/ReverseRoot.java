package com.company.Timus;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class ReverseRoot {
    static Scanner scanner = new Scanner(System.in);
    static Stack<Double> stack = new Stack<>();

    public static void main(String[] args) {
        while(scanner.hasNext()) {
            try {
                stack.push(scanner.nextDouble());
            } catch (InputMismatchException ignored){}
        }
        while(!stack.empty()) {
            System.out.printf("%.4f\n", Math.sqrt(stack.pop()));
        }
    }
}

