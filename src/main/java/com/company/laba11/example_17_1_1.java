package com.company.laba11;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class example_17_1_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintWriter printWriter;
        BufferedReader bufferedReader;

        try {
            File f1 = new File("inText.txt");
            File f2 = new File("outText.txt");
            f1.createNewFile();
            f2.createNewFile();
            if (f1.exists()) System.out.println("Файл создан, путь к файлу: " + f1.getAbsolutePath());
            if (f2.exists()) System.out.println("Файл создан, путь к файлу: " + f2.getAbsolutePath());

            System.out.println("Введите 2 строки по очереди");
            printWriter = new PrintWriter(f1.getAbsolutePath(), "UTF8");
            String s;
            for (int k = 0; k < 2; k++){
                s = scan.nextLine();
                printWriter.println(s);
            }

            System.out.println("По очереди введите 5 чисел типа double");
            for (int i = 0; i < 5; i++) {
                printWriter.println(scan.nextDouble());
            }
            printWriter.flush();
            printWriter.close();

            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f1.getAbsolutePath()), "UTF8"));
            printWriter = new PrintWriter(f2.getAbsolutePath(), "UTF8");

            for (int k = 0; k < 2; k++){
                s = bufferedReader.readLine();
                if (k == 1){
                    printWriter.println(s);
                }
            }
            for (int k = 0; k < 5; k++){
                double n = Double.parseDouble(bufferedReader.readLine());
                if (n >= 0) printWriter.println(n);
            }
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();

        } catch (IOException e){
            System.out.println("Ошибка " + e);
        }
    }

}
