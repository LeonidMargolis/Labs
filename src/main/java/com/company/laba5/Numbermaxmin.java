package com.company.laba5;

class Numbermaxmin {
    private int min;
    private int max;

    public void setMinMax(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            this.min = secondNumber;
            this.max = firstNumber;
        } else {
            this.min = firstNumber;
            this.max = secondNumber;
        }
    }

    public void setNum(int anyNum) {
        if (anyNum < this.max && anyNum > this.min) {
            this.min = anyNum;
        } else {
            this.min = this.max;
            this.max = anyNum;
        }
    }

    Numbermaxmin(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            this.min = secondNumber;
            this.max = firstNumber;
        } else {
            this.min = firstNumber;
            this.max = secondNumber;
        }
    }

    Numbermaxmin(int anyNumber) {
        if (anyNumber > this.min) anyNumber = this.max;
        else {
            this.min = this.max;
            this.min = anyNumber;
        }
    }

    Numbermaxmin() {
    }

    public void consoleOut() {
        System.out.printf("Minimal number is equal to: %d, and maximum number is equal to: %d", this.min, this.max);
    }
}