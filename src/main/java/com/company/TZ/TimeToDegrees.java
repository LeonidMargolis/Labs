package com.company.TZ;

public class TimeToDegrees {
    public static int timeToDegree(int hours, int minutes) {
        int degree;
        if((hours > 23 || hours < 0) || ( minutes > 60 || minutes < 0)){
            System.out.println("Вы ввели неврные значения");
            return 0;
        }
        if (hours > 11){
            hours -= 12;
        }
        if ( minutes == 60 ) minutes = 0;
        int hoursToMins = hours * 5;
        degree = (Math.max(hoursToMins, minutes) - Math.min(hoursToMins, minutes)) * 6;
        return degree;
    }

    public static void main(String[] args) {
        int degree;
        degree = TimeToDegrees.timeToDegree(25,60);
        System.out.println(degree);
    }
}

