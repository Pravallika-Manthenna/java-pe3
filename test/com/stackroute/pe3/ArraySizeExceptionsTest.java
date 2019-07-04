package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.ArraySizeExceptions.arrayhandling;
import static org.junit.Assert.*;

public class ArraySizeExceptionsTest {

  public ArraySizeExceptions exception;
  @Before
  public void setUp()
  {
    exception=new ArraySizeExceptions();

  }
  @After
  public void tearDown()
  {
    exception=null;
  }
  @Test
  public void givenArraySizeShouldReturnException(){
    int[] array={1,2,3,4,5};
    String result=arrayhandling(-4,array,exception);
    assertEquals("This is NegativeArraySizeException",result);
  }
  @Test
  public void givenArraySizeShouldReturnIndexException(){
    int[] array={1,2,3,4,5};
    String result=arrayhandling(3,array,exception);
    assertEquals("This is IndexOutOfBoundsException",result);
  }
  @Test
  public void givenArraySizeShouldReturnNullException(){
    int[] array={1,2,3,4,5};
    exception=null;
    String result=arrayhandling(5,array,exception);
    assertEquals("This is NullPointerException",result);
  }
  @Test
  public void givenArraySizeShouldNotReturnError(){
    int[] array={1,2,3,4,5};
    String result=arrayhandling(5,array,exception);
    assertEquals("",result);
  }
}
