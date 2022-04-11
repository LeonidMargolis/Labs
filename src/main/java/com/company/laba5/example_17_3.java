package com.company.laba5;

import java.util.Scanner;

public class example_17_3 {
    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        RandPass Peremn1 = new RandPass();
        System.out.println("Now lets pass one argument to the function");
        RandPass Peremen2 = new RandPass(inCmd.nextInt());
        System.out.println("Now lets pass two arguments to the function");
        RandPass Peremen3 = new RandPass(inCmd.nextInt(), inCmd.nextInt());

        System.out.println("There is no arguments passed to the object constructor " + Peremn1.firstNum );
        System.out.println("There is one argument passed to the object constructor, and it's value is: "+ Peremen2.firstNum);
        System.out.println("There is two arguments passed to the object constructor, and it's value is: "+ Peremen3.firstNum+", "+ Peremen3.secondNum);
    }
}

