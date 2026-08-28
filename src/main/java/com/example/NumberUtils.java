package com.example;

public class NumberUtils {
    public int countPositiveEvens(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int count = 0;
        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}