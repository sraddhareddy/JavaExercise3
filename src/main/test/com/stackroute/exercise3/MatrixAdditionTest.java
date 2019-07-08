package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition object;

    @Before
    public void setUp() {
        object = new MatrixAddition();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void addition() {
        int[][] result = object.addingMatrices(3, 2, new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[][]{{9, 8}, {7, 6}, {5, 4}});
        assertArrayEquals(new int[][]{{10, 10}, {10, 10}, {10, 10}}, result);
    }

    @Test
    public void testaddition() {
        int[][] result = object.addingMatrices(3, 3, new int[][]{{1, 2, -1}, {3, 4, 0}, {5, 6, -22}}, new int[][]{{9, 8, 0}, {7, 6, 3}, {5, 4, 1}});
        assertArrayEquals(new int[][]{{10, 10, -1}, {10, 10, 3}, {10, 10, -21}}, result);
    }

    @Test
    public void testZeroaddition() {          //all numbers are 0
        int[][] result = object.addingMatrices(2, 2, new int[][]{{0, 0}, {0, 0}}, new int[][]{{0, 0}, {0, 0}});
        assertArrayEquals(new int[][]{{0, 0}, {0, 0}}, result);
    }
}