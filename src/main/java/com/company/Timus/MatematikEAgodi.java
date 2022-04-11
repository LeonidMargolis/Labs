package com.company.Timus;

import java.util.Scanner;

public class MatematikEAgodi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String korz1 = in.nextLine();
        String korz2 = in.nextLine();
        String korz3 = in.nextLine();
        String[] korz1_M = korz1.split(" ");
        String[] korz2_M = korz2.split(" ");
        String[] korz3_M = korz3.split(" ");
        int a, b, c, d;
        a = Integer.parseInt(korz1_M[0]);
        b = Integer.parseInt(korz1_M[1]);
        c = Integer.parseInt(korz2_M[1]);
        d = Integer.parseInt(korz3_M[0]);
        System.out.println((a - d) + " " + (b - c));

    }
}
