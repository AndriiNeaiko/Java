package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    int[]array = new int[]{-77,5,-38,95,-57};

    public void testMultipl() {
        int expected = -77;
        int actual = Main.Multipl(array);

        assertEquals(expected, actual);
    }

    public void testSumel() {
        int expected = 5;
        int actual = Main.sumel(array);

        assertEquals(expected, actual);
    }
}