package javaTAU;

import java.util.Map;

public class FinalGrades {

    /*
    What I would like you to do is make another class, and then you're going to make a call to these methods to get these Maps.
    Then I want you to go through these Maps in your code and determine the final grade based on which one of these are higher.
     */

    public static void main(String args[]){
        Map <String, Integer> firstGrades = TestResults.getOriginalGrades();
        Map <String, Integer> secondGrades = TestResults.getMakeUpGrades();

        for (var student : firstGrades.entrySet()){
            Integer firstGrade = firstGrades.get(student.getKey());
            Integer secondGrade = secondGrades.get(student.getKey());

           if (firstGrade > secondGrade ) {
               secondGrades.put(student.getKey(), firstGrade);
           }
        }
        secondGrades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));

    }
}
