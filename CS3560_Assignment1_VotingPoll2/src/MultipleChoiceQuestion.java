import java.util.List;
//Represents a multiple-choice question
public class MultipleChoiceQuestion {
    private Question question;
    // Constructor for creating a multiple-choice question with a specific question text and candidate answers
    public MultipleChoiceQuestion(String questionText, List<String> candidateAnswers, List<String> correctAnswers) {
        this.question = new Question(questionText, candidateAnswers, false);
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
