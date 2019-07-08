package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard object;
    @Before
    public void setUp(){
    object = new ChessBoard();
    }
    @After
    public void tearDown(){
        object = null;
    }
    @Test
    public void method(){
     String[][] result=object.boardDisplay(2,2);
     assertArrayEquals(new String[][]{{"WW","BB"},{"BB","WW"}},result);
    }

    @Test
    public void testMethod(){
        String[][] result=object.boardDisplay(2,8);
        assertArrayEquals(new String[][]{{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}},result);
    }

    @Test
    public void testMethodWithZeros(){
        String[][] result=object.boardDisplay(0,0);      //0 rows and 0 columns
        assertArrayEquals(new String[][]{},result);
    }
    @Test
    public void testMethodWithNeagitiveValues(){
        String[][] result=object.boardDisplay(1,1);
        assertArrayEquals(new String[][]{{"WW"}},result);
    }

}