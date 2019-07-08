package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsCheckTest {

    VowelsCheck object;
    @Before
    public void setUp(){
        object=new VowelsCheck();
    }
    @After
    public void tearDown(){
        object=null;
    }

    @Test
    public void removeVowels() {
        String[] result=object.removeVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"});
        assertArrayEquals("String array after removing vowels",new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},result);
    }
    @Test
    public void testGivenNullInput() {
        String[] result=object.removeVowels(new String[]{"India","United States","Germany","Egypt",null});
        assertArrayEquals("null value not allowed",new String[]{"Ind","Untd Stts","Grmny","Egypt",},result);
    }
    @Test
    public void testRemoveVowels() {
        String[] result=object.removeVowels(new String[]{"a"});  //single character
        assertArrayEquals(new String[]{"a"},result);
    }

    @Test
    public void testNullRemoveVowels() {
        String[] result=object.removeVowels(new String[]{" "});   //space as input
        assertArrayEquals(new String[]{" "},result);
    }
}