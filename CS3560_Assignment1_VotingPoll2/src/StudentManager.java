import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.UUID;
//Manages the creation of students
public class StudentManager {
	// Creates a student with a specific studentId and chosenAnswer
    public Student createStudent(String studentId, String chosenAnswer) {
        return new Student(studentId, chosenAnswer);
    }

    public Student createRandomStudent() {
        // Generate a unique student ID using UUID
        String studentId = UUID.randomUUID().toString();
        
     // List of candidate answers
        List<String> candidateAnswers = Arrays.asList("A", "B", "C", "D");
        
        // Generate a random index to select a random answer
        Random random = new Random();
        int randomIndex = random.nextInt(candidateAnswers.size());
        
        String randomAnswer = candidateAnswers.get(randomIndex);
        
        return new Student(studentId, randomAnswer);
        
       /* 
        //Generate default answers here if needed
        String randomAnswer = "A";
        return new Student(studentId, randomAnswer);*/
    }
}
