package javaTAU;

public class FinalGrades {

    /*
    What I would like you to do is make another class, and then you're going to make a call to these methods to get these Maps.
    Then I want you to go through these Maps in your code and determine the final grade based on which one of these are higher.
     */

    public static void main(String args[]){
        Map <String, Integer> firstGrades = TestResults.getOriginalGrades();
        Map <String, Integer> finalGrades = TestResults.getMakeUpGrades();

        for (var student : firstGrades.entrySet()){
            Integer firstGrade = firstGrades.get(student.getKey());
        }

    }
}
