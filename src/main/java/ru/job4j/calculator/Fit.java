package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.printf("Man %d is %.2f\n", height, man);
        height = 170;
        double woman = Fit.womanWeight(height);
        System.out.printf("Woman %d is %.2f\n", height, woman);
    }
}
