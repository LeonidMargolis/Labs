package com.company.laba7;

public class SuperClassExample_17_3 {
    public int number;
    SuperClassExample_17_3(){

    }
    SuperClassExample_17_3(int x) {
        number = x;
    }
    public void setField(int x) {
        number = x;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + number;
    }

}
