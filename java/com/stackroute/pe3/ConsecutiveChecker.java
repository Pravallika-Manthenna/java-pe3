package com.stackroute.pe3;

public class ConsecutiveChecker {

  public String consecutiveChecker(int input) {
    String string = Integer.toString(input);
    //Split the string by considering space
    String[] arraystring = string.split("");
    int i;
    //Check input is greater than zero or not
    if (input>0) {
      for (i = 0; i < arraystring.length - 1; i++) {
        //subtract the current value to the next value
        if (Math.abs(arraystring[i].charAt(0) - arraystring[i + 1].charAt(0)) == 1) {
          continue;

        } else
          break;
      }
      if (i == arraystring.length - 1)
        return "contains consecutive numbers";
      else

        return "doesn't contains consecutive numbers";
    }
    else
      return "invalid data";


  }
}
