package com.company.laba12;
import java.io.*;
import java.util.Scanner;
class FilmInfo implements Serializable{

    String filmName, filmCountre, filmGenret;
    int filmYears, rentalPrice;
}

public class example_17_1_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        File f1 = new File("D:\\JavaLessens1\\src\\main\\java\\com\\company\\laba12\\films\\Фильмы.txt");           //
        File f2 = new File("D:\\JavaLessens1\\src\\main\\java\\com\\company\\laba12\\films\\Русские_фильмы.txt");
        if (!f1.exists()) f1.createNewFile();
        if (!f2.exists()) f2.createNewFile();

        FileOutputStream fos = new FileOutputStream(f1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FilmInfo filmInfo = new FilmInfo();
        System.out.println("Сколько фильмов записать в файл? => ");
        int kollihestvo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите информцию о фильмах");
        for (int i = 0; i < kollihestvo; i++){
            System.out.println("Введите название " + (i+1) + " фильма => ");
            filmInfo.filmName = scanner.nextLine();

            System.out.println("Введите страну выпуска фильма => ");
            filmInfo.filmCountre = scanner.nextLine();

            System.out.println("Введите жанр фильма =>");
            filmInfo.filmGenret = scanner.nextLine();

            System.out.println("Введите год выпуска фильма => ");
            filmInfo.filmYears = scanner.nextInt();

            System.out.println("Введите стоимость проката => ");
            filmInfo.rentalPrice = scanner.nextInt();

            oos.writeObject(filmInfo);

            scanner.nextLine();
        }
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(f1);
        ObjectInputStream ois = new ObjectInputStream(fis);
        fos = new FileOutputStream(f2);
        oos = new ObjectOutputStream(fos);

        for (int i = 0; i < kollihestvo; i++){

            filmInfo = (FilmInfo) ois.readObject();

            if      (filmInfo.filmCountre.equals("Россия") ||
                    filmInfo.filmCountre.equals("РФ")      ||
                    filmInfo.filmCountre.equals("россия")  ){

                System.out.println("======== Следующий фильм записан в файл ========");
                System.out.println("Название: " + filmInfo.filmName);
                System.out.println("Страна выпуска фильма: " + filmInfo.filmCountre);
                System.out.println("Жанр фильма: " + filmInfo.filmGenret);
                System.out.println("Год выпуска фильма: " + filmInfo.filmYears);
                System.out.println("Стоимость проката фильма: " + filmInfo.rentalPrice);
                System.out.println();
                oos.writeObject(filmInfo);
            }
        }
        oos.flush();
        oos.close();
        ois.close();
    }
}
