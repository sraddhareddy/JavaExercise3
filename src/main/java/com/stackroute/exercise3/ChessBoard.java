package com.stackroute.exercise3;

public class ChessBoard {
    public String[][] boardDisplay(int row, int column) {

        String output[][] = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (((i + j) % 2) == 0) {       //even index or odd index
                    output[i][j] = "WW";   //for even index
                } else {
                    output[i][j] = "BB";    //for odd index
                }

            }
                   }
        return output;
    } //method closing

}

