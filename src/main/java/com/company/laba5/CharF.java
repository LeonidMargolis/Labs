package com.company.laba5;

class CharF {
    private char cf;
    public void Set(char cf1) {
        this.cf = cf1;
    }
    public int getCodeSymbol() {
        return (int) cf;
    }
    public void viewCode() {
        System.out.println("cf1 = " + cf);
        System.out.println("cf1 = " + getCodeSymbol()+"\n");
    }
}
