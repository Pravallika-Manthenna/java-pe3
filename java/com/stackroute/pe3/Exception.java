package com.stackroute.pe3;


public class Exception extends Throwable {
  public Exception(String exception_thrown) {
  }

  public String exceptionThrow() {
    String result = "";
    try {
      throw new Exception("Exception thrown");
    }
    catch (Exception e){
      result += "Caught the exception with message: " +e.getMessage() ;
    }
    finally {
      result += "\nIn finally!";
    }
    return result;
  }
}
