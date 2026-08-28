package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsStatementTest {

    private final NumberUtils utils = new NumberUtils();

    @Test
    void testStatementCoverage() {
        // Bao phu nhanh null (chay qua return 0)
        assertEquals(0, utils.countPositiveEvens(null));

        // Bao phu toan bo vong lap va count++
        int[] arr = {2, 4};
        assertEquals(2, utils.countPositiveEvens(arr));
    }
}