package com.stackroute.pe2;

import com.stackroute.pe3.Matrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
  Matrix matrix;
  @Before
  public void setUp() {
    matrix = new Matrix();

  }
  @After
  public void tearDown()
  {
    System.out.println("After");
  }
  @Test
  public void sumOfMatrixElements(){
    int[][] result=Matrix.SumOfMatrixElements(new int[][] {{1,3},{2,4},{3,4}},new int[][] {{1,3},{2,4},{1,2}});
    assertArrayEquals(new int[][] {{2,6},{4,8},{4,6}},result);


  }
  @Test
  public void sumOfMatrixElementsIf_a_MatrixLengthIsZeroReturnZero(){
    int[][] result=Matrix.SumOfMatrixElements(new int[][] {{}},new int[][] {{1,3},{2,4},{1,2}});
    assertArrayEquals(new int[][] {},result);


  }

}
