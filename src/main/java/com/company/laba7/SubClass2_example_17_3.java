package com.company.laba7;

public class SubClass2_example_17_3 extends SubClass1_example_17_3 {
    public String str;

    SubClass2_example_17_3() {

    }

    SubClass2_example_17_3(int x, char simba, String str) {
        number = x;
        symbol = simba;
        this.str = str;
    }

    public void setField(int x, char simba, String str) {
        number = x;
        symbol = simba;
        this.str = str;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + number + " " + symbol + " " + str;
    }
}