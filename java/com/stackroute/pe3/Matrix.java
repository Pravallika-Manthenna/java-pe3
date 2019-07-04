package com.stackroute.pe3;

public class Matrix {

  public static int[][] SumOfMatrixElements(int[][] a, int[][] b) {
    int[][] c = new int[3][2];
    int i = 0, j = 0;
    if (a.length - 1 <= 0 || b.length - 1 <= 0) {
      int[][] d = new int[0][0];
      return d;

    } else {
      for (i = 0; i <3; i++) {
        for (j = 0; j <2; j++) {
          c[i][j] = a[i][j] + b[i][j];

        }
      }

      return c;
    }
  }

}
