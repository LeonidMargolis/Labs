package com.company.Timus;

import java.util.Scanner;

public class UralskieBifhtekse {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    String [] m_str = str.split(" ");
    int Bifhteks = Integer.parseInt(m_str[0]);
    int griddle_power = Integer.parseInt(m_str[1]);

    if (Bifhteks <= griddle_power) System.out.println(2);
    else {
        int per_one_min = Bifhteks / griddle_power;
        if (Bifhteks % griddle_power == 0) System.out.println(per_one_min * 2);
        else if (Bifhteks % griddle_power > (griddle_power / 2)) System.out.println(per_one_min * 2 + 2);
        else System.out.println(per_one_min * 2 + 1);
     }
    }
}

