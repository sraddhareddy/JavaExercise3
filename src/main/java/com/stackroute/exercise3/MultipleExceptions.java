package com.stackroute.exercise3;

public class MultipleExceptions {
    public static void main(String[] args){
        //try-catch blocks for each exception
        try{
            throw new NegativeArraySizeException("Array size is neagitive value");
        }
        catch (NegativeArraySizeException nase){
            System.out.println("Neagitive size exception is caught");
        }
        try{
            throw new IndexOutOfBoundsException("Index value is greater than size of array");
        }
        catch (IndexOutOfBoundsException ioe){
            System.out.println("Index out of bound exception caught");
        }
        try{
            throw new NullPointerException("Null value");
        }
        catch (NullPointerException ne){
            System.out.println("Null pointer exception is caught");
        }
        finally{
            System.out.println("All items are caught");  //finally after all the try-catch
        }
    }
}
