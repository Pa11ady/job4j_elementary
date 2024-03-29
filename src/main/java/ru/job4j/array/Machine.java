package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int balance = money - price;
        int size = 0;
        for (int coin : coins) {
            while (balance - coin >= 0) {
                rsl[size++] = coin;
                balance -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
