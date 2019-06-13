package com.battlecodes.kata.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to check work of {@link DescendingOrder} class
 */
class DescendingOrderTest {

    /**
     * Input array
     */
    private final int[] inputArray = {21445, 145263, 125485723};

    /**
     * Output array
     */
    private final int[] outputArray = {54421, 654321, 875543221};

    /**
     * Tests array implementation
     */
    @Test
    void sortDescArray() {
        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(outputArray[i], DescendingOrder.sortDescArray(inputArray[i]));
        }
    }

    /**
     * Tests stream implementation
     */
    @Test
    void sortDescStream() {
        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(outputArray[i], DescendingOrder.sortDescStream(inputArray[i]));
        }
    }
}