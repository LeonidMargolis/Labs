package com.company.laba5;

class CodeTheRange {
    private char char1;
    private char char2;

    public void Setch(char char1, char char2) {
        this.char1 = char1;
        this.char2 = char2;
    }

    public void showCharArray() {
        int int1 = char1;
        int int2 = char2;
        if (char1 > char2) {
            int1 = char2;
            int2 = char1;
        }
        int schet = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println(schet + " symbol = " + (char) i);
            schet++;
        }
    }
}