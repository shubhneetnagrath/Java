//Student Marks Management System (1D Array)

/*
Scenario:>

A teacher stores marks of 10 students and wants:

>Average marks
>Highest mark
>Number of students who passed
*/

public class Student_Marks_Management_System {
    public static void main(String[] args) {
      int[] marks = {74,98,79,39,21,73,42,38,90,81};
      double sum = 0;
      int passed =0;
      int HighestMarks = marks[0];
            for(int i = 0;i< marks.length;i++){
         sum = sum + marks[i];
         if(marks[i]>=40){
            passed++;
         if(HighestMarks<marks[i]){
     HighestMarks = marks[i];}
        }
        }
    System.out.println( "The Average Marks are "+ (sum/(marks.length)));
    System.out.println("Highest Marks = " + HighestMarks);
    System.out.println("No. of Students Passed are " + passed);
  } 
}

/*
Concepts Used
Array traversal
Searching
Aggregation
Conditions inside loops

This pattern appears in reporting systems and analytics.
 */