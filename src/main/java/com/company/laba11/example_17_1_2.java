package com.company.laba11;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class example_17_1_2 {
    public static void main(String[] args){

        String vowels = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнопрстфхцчшщ";
        String punctuation = "!.,?";
        String pathFile1 = "D:\\JavaLessens1\\src\\main\\java\\com\\company\\laba11\\Zadanie3\\stringsText.txt";
        String pathFile2 = "D:\\JavaLessens1\\src\\main\\java\\com\\company\\laba11\\Zadanie3\\stringsOut.txt";
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(pathFile1), "UTF8"));
            PrintWriter printWriter = new PrintWriter(pathFile2, "UTF8");

            int numberLines = 0;
            int wordsCounter;
            String s;
            String [] words;
            while ((s = bufferedReader.readLine()) != null){
                wordsCounter = 0;
                numberLines++;
                words = s.split(" ");
                for (String word : words) {

                    if (vowels.contains(Character.toString(word.charAt(0)))) { //
                        if (punctuation.contains(Character.toString(word.charAt(word.length()-1)))){
                            printWriter.println("Слово: '" + word.substring(0 , word.length()-1)
                                    + "' (Строка в исходном файле: #" + numberLines + ")");
                            wordsCounter++;
                        }
                        else {
                            printWriter.println("Слово: '" + word
                                    + "' (Строка в исходном файле: #" + numberLines + ")");
                            wordsCounter++;
                        }
                    }
                }
                printWriter.printf("В %d строке выбрано %d слов \n\n", numberLines, wordsCounter);
            }
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка!" + e);
        }
    }

}
