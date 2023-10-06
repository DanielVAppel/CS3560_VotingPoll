import java.util.List;
//Represents a single-choice question
public class SingleChoiceQuestion {
    private Question question;
    // Constructor for creating a single-choice question with a specific question text and candidate answers
    public SingleChoiceQuestion(String questionText, List<String> candidateAnswers, String correctAnswer) {
        this.question = new Question(questionText, candidateAnswers, true);
    }
    // Getter for the question text
    public String getQuestionText() {
        return question.getQuestionText();
    }
    // Getter for candidate answers
    public List<String> getCandidateAnswers() {
        return question.getCandidateAnswers();
    }
    // Indicates if it's a single-choice question
    public boolean isSingleChoice() {
        return question.isSingleChoice();
    }
}
