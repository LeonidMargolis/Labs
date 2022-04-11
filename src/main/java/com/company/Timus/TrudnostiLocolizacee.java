package com.company.Timus;

import java.util.Scanner;

public class TrudnostiLocolizacee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a <= 4)
            System.out.println("few");
        else if (a <= 9)
            System.out.println("several");
        else if(a <= 19)
            System.out.println("pack");
        else if (a <= 49)
            System.out.println("lots");
        else if (a <= 99)
            System.out.println("horde");
        else if (a <= 249)
            System.out.println("throng");
        else if (a <= 499)
            System.out.println("swarm");
        else if (a <= 999)
            System.out.println("zounds");
        else if (a >= 1000)
            System.out.println("legion");

    }
}
