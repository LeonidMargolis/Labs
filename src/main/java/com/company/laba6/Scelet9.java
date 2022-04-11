package com.company.laba6;

public class Scelet9 {
    public static char[] massivSceleta9(char[] simvols) {
        char[] massivChar = new char[simvols.length];
        for (int k=0, x=simvols.length-1; k < simvols.length; k++, x--) massivChar[k]=simvols[x];
        return massivChar;
    }
}