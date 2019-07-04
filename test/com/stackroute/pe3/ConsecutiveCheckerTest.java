package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveCheckerTest {
  ConsecutiveChecker obj;

  @Before
  public void setUp() throws Exception {
    obj= new ConsecutiveChecker();
  }

  @After
  public void tearDown() throws Exception {
    obj=null;
  }

  @Test
  public void givennonconsecutiveIntegerIsCheckedNumberbyNumberandStringisReturnesWithMessage() {
    String res = obj.consecutiveChecker(8643);
    assertEquals("doesn't contains consecutive numbers", res);
  }

  @Test
  public void givenconsecutiveIntegerIsCheckedNumberbyNumberandStringisReturnesWithMessage() {
    String res = obj.consecutiveChecker(12345);
    assertEquals("contains consecutive numbers", res);
  }
  @Test
  public void givenZerovalueisCheckesNumberbyNumbersandMessageisReturned() {
    String res = obj.consecutiveChecker(0);
    assertEquals("invalid data", res);
  }
  @Test
  public void givennNegativeIntegerisCheckesNumberbyNumbersandMessageisReturned() {
    String res = obj.consecutiveChecker(-34);
    assertNotEquals("data", res);
  }
}
