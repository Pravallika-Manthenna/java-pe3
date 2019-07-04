package com.stackroute.pe3;
public class ChessBoard {
  public static String[][] display(int rows, int cols) {
    {
      String output[][] = new String[rows][cols];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          if (((i + j) % 2) == 0) {
            output[i][j] = "WW";
            return output;
          } else {
            output[i][j] = "BB";
            return output;
          }
        }
      }
      return output;
    }
  }

}
