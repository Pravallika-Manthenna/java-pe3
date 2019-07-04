package com.stackroute.pe3;
public class StudentMarks {
  String string;
  public String marks(int[] studentGrades,int numOfStudents) {
    if(studentGrades.length!=numOfStudents)
      string="error";
    else{
      for(int i=0;i<numOfStudents;i++){
        if(studentGrades[i]>=0&&studentGrades[i]<=100){
          string="success";
        }
        else{
          string="error";
          break;
        }
      }
    }

    return string;
  }
}
