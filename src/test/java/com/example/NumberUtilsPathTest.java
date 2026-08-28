package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsPathTest {

    private final NumberUtils utils = new NumberUtils();

    @Test
    void testPathNull() {
        assertEquals(0, utils.countPositiveEvens(null));
    }

    @Test
    void testPathEmpty() {
        assertEquals(0, utils.countPositiveEvens(new int[]{}));
    }

    @Test
    void testPathNegativeAndZero() {
        assertEquals(0, utils.countPositiveEvens(new int[]{-4, -2, 0}));
    }

    @Test
    void testPathPositiveOdd() {
        assertEquals(0, utils.countPositiveEvens(new int[]{1, 3, 5}));
    }

    @Test
    void testPathPositiveEvenAndMixed() {
        assertEquals(2, utils.countPositiveEvens(new int[]{-1, 3, 4, 6}));
    }
}