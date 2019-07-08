package com.stackroute.exercise3;

public class MatrixAddition {
    public int[][] addingMatrices(int rows,int columns,int[][] matrix1,int[][] matrix2){
        int result[][]=new int[rows][columns];  //new matrix declaration

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }  //inner loop
        }   //outer-loop
        return result;
    }
}
