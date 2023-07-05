package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        return indexInRange(data, el, 0, data.length - 1);
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
