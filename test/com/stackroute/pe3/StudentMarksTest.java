package com.stackroute.pe3;
  import org.junit.After;
  import org.junit.Before;
  import org.junit.Test;
  import static org.junit.Assert.*;

public class StudentMarksTest {
  StudentMarks studentMarks;
  @Before
  public void setUp(){
    studentMarks=new StudentMarks();
  }
  @After
  public void tearDown(){
    studentMarks=null;
  }
  @Test
  public void givenMarksShouldReturnSuccess(){
    String result =studentMarks.marks(new int[]{57,14,76,90},4);
    assertEquals("success",result);
  }
  @Test
  public void givenMarksShouldReturnNUll(){
    String result =studentMarks.marks(new int[]{67,22,900,75},4);
    assertEquals("error",result);
  }


}
