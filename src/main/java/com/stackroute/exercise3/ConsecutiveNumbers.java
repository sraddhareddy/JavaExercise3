package com.stackroute.exercise3;

public class ConsecutiveNumbers {
    public String numCheck(String input){
        String result=null;
        String[] array=input.split(",");
        for(int i=0;i<array.length-1;i++){
            int diff=Integer.parseInt(array[i+1])- Integer.parseInt(array[i]);  //difference of consecutive numbers
            if(diff==-1 || diff==1){   // diff should be equal to 1 or -1
                result="consecutive numbers";
            }
            else{
                result="non consecutive numbers";
                break;
            }
        }  // for-loop closing
        return result;
    }
}
