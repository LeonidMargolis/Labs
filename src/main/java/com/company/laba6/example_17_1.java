package com.company.laba6;

import java.util.Scanner;

public class example_17_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OverloadMethod sim = new OverloadMethod();
        sim.set('S');
        sim.set("Hello world");
        sim.get();
        char[]text={'A','B','C'};
        sim.set(text);
        sim.get();
    }
}
