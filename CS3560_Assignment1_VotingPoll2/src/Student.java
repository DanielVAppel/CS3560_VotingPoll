
// Represents a student participating in the poll

public class Student {
    private String id;  // Unique student ID
    private String chosenAnswer;// The chosen answer by the student
    // Constructor for creating a student with specific studentId and chosenAnswer
    public Student(String studentId, String chosenAnswer) {
        this.id = studentId;
        this.chosenAnswer = chosenAnswer;
    }
    // Getter for student's ID
	public String getId() {
        return id;
    }
    // Getter for the chosen answer
    public String getChosenAnswer() {
        return chosenAnswer;
    }
}

