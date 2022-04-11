package com.company.laba4;

import java.util.Scanner;

public class example_17_9 {
    private static final int Q_CODE = 'Q';
    private static final int M_CODE = 'M';
    private static final int a_CODE = 'a';
    private static final int z_CODE = 'z';

    private static final char[] alphabet = "abcdefghijklmnopqrstuvwxszQWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
    private static final int lengthAlphabet = alphabet.length;;
    private static int key;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = console.nextLine();

        System.out.println("Введите ключ шифрования: ");

        key = console.nextInt() % lengthAlphabet;
        char[] newText = new char[text.length()];

        for(int i = 0; i < text.length(); i++) {
            newText[i] = getSymbol(text.charAt(i));
        }

        System.out.printf("Текст после преобразования: %s\n\n", String.valueOf(newText));
        char response;
        boolean isValidResponse;

        do{
            System.out.println("Выполнить обратное преобразование? (y/n): ");

            response = console.next().charAt(0);
            isValidResponse = response == 'y' || response == 'n';

            if(!isValidResponse) {
                System.out.println("Введите корректный ответ");
            }
        }while(!isValidResponse);

        if(response == 'y') {
            System.out.println(text);
        } else {
            System.out.println("До свидания!");
        }
    }

    private static char getSymbol(int current) {
        if(current >= Q_CODE && current <= M_CODE) {
            current -= M_CODE;
        } else if(current >= a_CODE && current <= z_CODE) {
            current -= z_CODE;
        } else {
            return (char) current;
        }

        char result;
        int next = current + key;

        if(next > lengthAlphabet) {
            result = alphabet[next - lengthAlphabet];
        }else if(next < 0) {
            result = alphabet[next + lengthAlphabet];
        }else {
            result = alphabet[next];
        }

        return result;
    }
}
