package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers cns;
    @Before
    public void setUp(){
        cns=new ConsecutiveNumbers();
    }
    @After
    public void tearDown(){
        cns=null;
    }
    @Test
    public void testNumberSeriesReturnMessage(){
        String result=cns.numCheck("23,24,25");
        assertEquals("consecutive numbers",result);   //given consecutive numbers
    }

    @Test
    public void testNumberSeriesReturnNonConsecutiveAsMessage(){
        String result=cns.numCheck("21,24,25");
        assertEquals("non consecutive numbers",result);     //non-consecutive
    }

    @Test
    public void testNumberSeriesZeroReturnMessage(){
        String result=cns.numCheck("0,-1,-1");                  //equal numbers
        assertEquals("non consecutive numbers",result);
    }

}