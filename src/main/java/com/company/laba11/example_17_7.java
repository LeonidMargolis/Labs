package com.company.laba11;
import java.io.*;
public class example_17_7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter out = null;

        try{
            br = new BufferedReader(new FileReader("C:\\tmp\\text.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\tmp\\textOut.txt"));

            int lineCount = 0;
            String s;
            while((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){
            System.out.println("Ошибка!");
        }finally {
            br.close();
            out.flush();
            out.close();
        }
    }

}
