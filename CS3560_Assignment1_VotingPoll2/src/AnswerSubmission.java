 // Represents a submission of an answer by a student
public class AnswerSubmission {
    private String studentId;// ID of the student submitting the answer
    private String chosenAnswer;// The chosen answer

    // Constructor for creating an answer submission
    public AnswerSubmission(String studentId, String chosenAnswer) {
        this.studentId = studentId;
        this.chosenAnswer = chosenAnswer;
    }
    
    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }
    // Getter for the chosen answer
    public String getChosenAnswer() {
        return chosenAnswer;
    }
}
