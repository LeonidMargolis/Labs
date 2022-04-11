package com.company.Timus;

import java.util.Scanner;

public class OdinVPoleVoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vhod = in.nextInt();
        String[] massivStroc =new String[vhod];
        char[] massivSimovls = new char[vhod];
        int[] massivCifr = new int [vhod];
        for (int k = 0; k < vhod; k++){
            massivStroc[k]=in.next();
            massivSimovls[k]=massivStroc[k].charAt(0);
            massivCifr[k]=massivStroc[k].charAt(1);
        }
        for(int i = 0; i < vhod; i++){
         int result = 0;
         if (massivCifr[i] -2 >= '1'){
             if (massivSimovls[i] + 1 <= 'h') result++;
             if (massivSimovls[i] - 1 >= 'a') result++;
         }
         if (massivSimovls[i] + 2 <= 'h'){
             if(massivCifr[i] + 1 <= '8')result++;
             if(massivCifr[i] - 1 >= '1')result++;
         }
         if(massivCifr[i] + 2 <= '8'){
             if(massivSimovls[i] + 1 <= 'h')result++;
             if(massivSimovls[i] - 1 >= 'a')result++;
         }
         if(massivSimovls[i] - 2 >= 'a'){
             if(massivCifr[i] + 1 <= '8')result++;
             if(massivCifr[i] - 1 >= '1')result++;
         }
            System.out.println(result);
        }
    }
}
