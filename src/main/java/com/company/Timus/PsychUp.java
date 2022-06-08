package com.company.Timus;

import java.util.*;

public class PsychUp {
    public static void main(String[] args) {

        int nums_count = 0;
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;

        n1 = scanner.nextInt();
        List <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n1; i++) arrayList.add(scanner.nextInt());
        n2 = scanner.nextInt();
        for (int i = 0; i < n2; i++) arrayList.add(scanner.nextInt());
        n3 = scanner.nextInt();
        for (int i = 0; i < n3; i++) arrayList.add(scanner.nextInt());

        Collections.sort(arrayList);

        for (int i = 0, k = 1; i < (n1+n2+n3)-1; i++){
            if (Objects.equals(arrayList.get(i), arrayList.get(i + 1))){
                k += 1;
            }
            else k = 1;
            if (k == 3){
                nums_count++;
                k = 1;
            }

        }
        System.out.println(nums_count);
    }
}

