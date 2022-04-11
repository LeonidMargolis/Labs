package com.company.laba8.progect1;

public class example_17_1 {
    public static void main(String[] args) {
        int x = 7;
        m(x);
        int y =8;
        n(y);
        int o = 10;
        w(o);
        int p = 77;
        fact(p);
        int u = 5;
        f(u);
        System.out.println(f(u));

    }

    public static void m(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }

    public static void n(int x) {
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        System.out.println("x=" + x);
    }
    private static int step=0;
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");

        }
    }

    public static void w(int x) {
        space();
        System.out.println(""+x+"-> ");
        step++;
        if ((2*x+1) <20) {
            m(2*x+1);
        }
        step --;
        space();
        System.out.println(""+x+ " <-");
    }
    public static int fact(int n){
        int result;
        if (n==1)
            return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }
    public static int f(int n){
        System.out.println("я внутри f("+n +")");
        if (n==0){
            return 0;
        }else
        if (n==1){
            return 1;
        } else {
            return f(n-1)+f(n-2);
        }
    }
}