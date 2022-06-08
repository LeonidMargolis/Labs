package com.company.laba12;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class example_17_1_2 {
    public static void main(String[] args) {
        try {
            File f1 = new File("D:\\JavaLessens1\\src\\main\\java\\com\\company\\laba12\\films\\Фильмы.txt");
            if (!f1.exists()) f1.createNewFile();
            File f2 = new File("D:\\JavaLessens1\\src\\main\\java\\com\\company\\laba12\\films\\Русские_фильмы.txt");
            if (!f2.exists()) f2.createNewFile();

            Scanner scanner = new Scanner(System.in);

            RandomAccessFile fileReader = new RandomAccessFile(f1, "rw"); //
            RandomAccessFile fileWriter = new RandomAccessFile(f2, "rw"); //

            System.out.print("Введите количество фильмов для записи в файл => ");
            int kollihestvo = scanner.nextInt();
            System.out.println();
            scanner.nextLine();

            String filmName, filmCountre, filmGenret;
            int filmYears, rentalPrice;

            for (int i = 0; i < kollihestvo; i++){
                System.out.print("Введите название " + (i+1) + " фильма => ");
                filmName = scanner.nextLine();
                System.out.println();
                fileReader.seek(fileReader.length());
                fileReader.writeUTF(filmName);
                for (int j = 0; j < 30 - filmName.length(); j++) fileReader.writeByte(1);

                System.out.print("Введите страну выпуска фильма => ");
                filmCountre = scanner.nextLine();
                System.out.println();
                fileReader.writeUTF(filmCountre);
                for (int j = 0; j < 30 - filmCountre.length(); j++) fileReader.writeByte(1);

                System.out.print("Введите жанр фильма => ");
                filmGenret = scanner.nextLine();
                System.out.println();
                fileReader.writeUTF(filmGenret);
                for (int j = 0; j < 30 - filmGenret.length(); j++) fileReader.writeByte(1);

                System.out.print("Введите год выпуска фильма => ");
                filmYears = scanner.nextInt();
                System.out.println();
                fileReader.writeInt(filmYears);

                System.out.print("Введите стоимость проката фильма => ");
                rentalPrice = scanner.nextInt();
                System.out.println();
                scanner.nextLine();
                fileReader.writeInt(rentalPrice);
            }
            fileReader.close();

            fileReader = new RandomAccessFile(f1, "r");

            fileReader.seek(0);

            for (int i = 0; i < kollihestvo; i++){
                filmName = fileReader.readUTF();
                for (int j = 0; j < 30 - filmName.length(); j++) fileReader.readByte();

                filmCountre = fileReader.readUTF();
                for (int j = 0; j < 30 - filmCountre.length(); j++) fileReader.readByte();

                filmGenret = fileReader.readUTF();
                for (int j = 0; j < 30 - filmGenret.length(); j++) fileReader.readByte();

                filmYears = fileReader.readInt();
                rentalPrice = fileReader.readInt();

                if (filmCountre.equals("Россия") || filmCountre.equals("РФ")
                        || filmCountre.equals("россия")){

                    System.out.println("======== Следующий фильм записан в файл ========");
                    fileWriter.seek(fileWriter.length());
                    System.out.println("Название фильма: " + filmName);
                    fileWriter.writeUTF(filmName);
                    for (int k = 0; k < 30 - filmName.length(); k++) fileWriter.writeByte(1);

                    System.out.println("Наименование страны выпуска фильма: " + filmCountre);
                    fileWriter.writeUTF(filmCountre);
                    for (int k = 0; k < 30 - filmCountre.length(); k++) fileWriter.writeByte(1);

                    System.out.println("Жанр фильма: " + filmGenret);
                    fileWriter.writeUTF(filmGenret);
                    for (int k = 0; k < 30 - filmGenret.length(); k++)fileWriter.writeByte(1);

                    System.out.println("Год выпуска фильма: " + filmYears);
                    fileWriter.writeInt(filmYears);

                    System.out.println("Стоимость проката фильма: " + rentalPrice);
                    fileWriter.writeInt(rentalPrice);
                    System.out.println();
                }

            }
            fileReader.close();
            fileWriter.close();

        }catch (IOException e){
            System.out.println("Ошибка" + e.getMessage());
        }
    }
}
