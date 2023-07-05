package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int wordIndex = word.length - post.length + i;
            if (word[wordIndex] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
