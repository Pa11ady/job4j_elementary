package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float ruble = 120;
        float dollar = Converter.rubleToDollar(ruble);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.printf("%.2f rubles are %.2f dollar.%n", ruble, dollar);
    }
}