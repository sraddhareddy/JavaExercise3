package com.stackroute.exercise3;

public class ExceptionSample {
    public static void main(String[] args){
        try{
            throw new Exception("Exception Sample");   //creating new exception
        }
        catch (Exception e){
            System.out.println("Exception Sample is caught");   //catching that exception in catch block
        }
        finally {
            System.out.println("Exception caught successfully"); //executes irrespective of try and catch
        }
    }
}
