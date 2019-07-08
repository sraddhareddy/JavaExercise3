package com.stackroute.exercise3;

public class StudentMarks {

    public String checkGrades(int number,int[] Grades){
        String output="";
        for(int i=0; i<number; i++){
            if(Grades[i]>0 && Grades[i]<100){         //grades should be >0 and <100
                output="student passed";
            }
            else{
                output="student not passed";
            }
        }
        return output;
    }
}
