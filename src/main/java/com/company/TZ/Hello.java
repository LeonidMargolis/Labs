package com.company.TZ;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String povtor = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String slovo = scanner.nextLine();
        for(int i = 0; i < slovo.length() -1; i++){
            for(int k = i+1; k<slovo.length(); k++){
                if (povtor.contains("" + slovo.charAt(i))){
                    continue;
                } else if (slovo.charAt(i) == slovo.charAt(k)){
                    povtor += slovo.charAt(i);
                    break;
                }
            }
        }
        System.out.println(povtor);
    }
}
