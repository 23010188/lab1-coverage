public class NumberUtilsStatementTest {package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsStatementTest {

    private final NumberUtils utils = new NumberUtils();

    @Test
    void testStatementCoverage() {
        // Bao phủ nhánh mảng null
        assertEquals(0, utils.countPositiveEvens(null));

        // Bao phủ các dòng trong vòng for và dòng count++
        int[] arr = {2, 4};
        assertEquals(2, utils.countPositiveEvens(arr));
    }
}
    
}

import main.java.com.example.NumberUtils;

