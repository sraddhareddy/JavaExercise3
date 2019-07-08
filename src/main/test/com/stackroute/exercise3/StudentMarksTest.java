package com.stackroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks object;
    @Before
    public void setUp(){
        object=new StudentMarks();
    }
    @After
    public void tearDown(){
        object=null;
    }
    @Test
    public void testGivenStudentInfoReturnMsg(){
        String res=object.checkGrades(4,new int[]{-1,20,80,100});
        assertEquals("student not passed",res);
    }
    @Test
    public void testGivenStudentGradesReturnMsg(){
        String res=object.checkGrades(4,new int[]{-1,-1,-1,-1});
        assertEquals("student not passed",res);
    }
    @Test
    public void testGivenGradesReturnMsg(){
        String res=object.checkGrades(5,new int[]{100,20,80,'A',100});
        assertEquals("student not passed",res);
    }
    @Test
    public void testGivenStudentGradeInfoReturnMsg(){
        String res=object.checkGrades(4,new int[]{20,20,80,99});
        assertEquals("student passed",res);
    }


}