import java.util.List;
//Represents a question in the poll
public class Question {
    private String questionText;// The text of the question
    private List<String> candidateAnswers;// List of candidate answers
    private boolean isSingleChoice;// Indicates if it's a single-choice question
   
    // Constructor for creating a question
    public Question(String questionText, List<String> candidateAnswers, boolean isSingleChoice) {
        this.questionText = questionText;
        this.candidateAnswers = candidateAnswers;
        this.isSingleChoice = isSingleChoice;
    }

    // Getter for the question text
    public String getQuestionText() {
        return questionText;
    }

    // Getter for candidate answers
    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }

    // Indicates if it's a single-choice question
    public boolean isSingleChoice() {
        return isSingleChoice;
    }
}
