package com.company.laba11;
import java.io.*;
public class example_17_6 {
    public static void main(String[] args) throws IOException {

        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("C:\\tmp\\text.txt");
            out = new FileWriter("C:\\tmp\\textOut.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1){
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {System.out.println("Ошибка!");
        } finally {
            in.close();
            out.close();
        }
    }

}
