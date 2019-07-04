package com.stackroute.pe3;
public class RemoveVowels {
  public static String[] removeVowels(String[] a) {
    int i = 0;
    String[] result = new String[2];
    if (a.length <= 0) {
// String[] result1 = new String[2];
      result[i] +="length should be graterthan 1";

      return result ;
    }
    else{

      for (i = 0; i <= a.length-1; i++) {
        String str = a[i];
        for (int b = 0; b < str.length(); b++) {
          if(str==""){
            result[i] +="given string is null";
            return result;
          }
          char c = str.charAt(b);

          if (str.charAt(b) == 'a' || str.charAt(b) == 'e' || str.charAt(b) == 'i' || str.charAt(b) == 'o' || str.charAt(b) == 'u') {
            result[i] = str.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
          }


        }
      }



    }
    return result;
  }
}
